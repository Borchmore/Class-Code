#include <stdio.h>
#include <sys/types.h>
#include <dirent.h>

void lister(char []);

int main (int ac, char *av[]){
	
	if(ac == 1){
		lister(".");
	}
	else{
		while(--ac){
			printf("%s:\n", *++av);
			lister(*av);
		}
	}
	
	return(0);
}

void lister(char dirname[]){
	
	DIR			*dirptr;
	struct dirent	*direntptr;

	if((dirptr = opendir(dirname)) == NULL){
		fprintf(stderr, "Cannot open %s\n", dirname);
	}
	else{
		while((direntptr = readdir(dirptr)) != NULL){
			printf("%s\n", direntptr->d_name);
		}
		closedir(dirptr);
	}
}