#include <stdio.h>
#include <string.h>

void main(int argc, char *argv[]){

	int matchlist[argc];

	for(int i=1; i<argc; i++){
		if(matchlist[i] != 1){
			for(int j = i+1; j<argc; j++){
				if((strcmp(argv[i], argv[j])) == 0){
					if(matchlist[j] != 1){
						printf("Argument %s appears at position %d and %d\n", argv[i], i, j);
						matchlist[j] = 1;
					}
				}
			}
		}
	}
}