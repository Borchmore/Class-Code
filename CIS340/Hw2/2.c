#include <stdio.h>
#include <string.h>

int main(){
	char name[50], first [25], last[25];
	printf("What is your name? ");
	scanf("%s", name);

	int counter = 0; //counts the number of capital letters
	int lastn; //array index of beginning of last name
	for(int i=0; i<50; i++){
		if(name[i] < 91){
			if(counter == 1){
				counter = 2;
				lastn = i;
			}				
			else if(counter == 0){
				counter = 1;
			}
		}
		if(counter == 2){
			last[i - lastn] = name[i];
		}
		else{		
			first[i] = name[i];
		}
	}

	printf("First = %s, Last = %s\n", first, last);
	return 0;
}