#include <stdio.h>
#include <sys/stat.h>
#include <math.h>

int main(int argc, char *argv[]){

	struct stat		fileinfo;
	int i;
	
	if(argc != 2){
		printf("Usage: statfile filename\n");
		exit(0);
	}

	//new code starts here

	i = stat(argv[1], &fileinfo);
	if (i == -1){
		printf("Unable to stat %s\n", argv[1]);
		exit(0);
	}

	int perm = fileinfo.st_size;
	int power = (int) (log(perm)/log(2));

	while(perm >= 1024){
		perm = perm - ((int)(pow(2, power)));
		--power;
	}

	int counter = 0;
	int j = 512;
	char perm_str[10];
	
	while(counter < 10){
		if(perm >= j){
			perm_str[counter] = 49; //ascii value for 1
			perm = perm - j;
		}
		else{
			perm_str[counter]  = 48; //ascii value for 0
		}
		j = j / 2;
		++counter;
	}
	
	perm_str[10] = 0; //null pointer at the end of the string
	
	printf("size: %d\n", fileinfo.st_size);
	printf("permissions: %s\n", perm_str);
	printf("last modified: %d\n", fileinfo.st_mtime);

	return(0);
}