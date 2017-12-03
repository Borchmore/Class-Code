#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(int argc, char** argv){
	
	FILE *fptr;

	char str[100], c;
	int counter = 0;
	
	printf("Enter a one word string to find in file\n");
	scanf("%s", str);

	int len = (int) strlen(str);

	fptr = fopen(argv[1], "r");
	if(fptr == NULL){
		printf("Cannot open file\n");
		exit(0);
	}

	char buf[100];
	
	while(fscanf(fptr, "%s", buf)  != EOF ){
		if(strncmp(str, buf, len) == 0){
			printf("Match found: %s\n", buf);
		}
	}

	fclose(fptr);
	return(0);

}
		