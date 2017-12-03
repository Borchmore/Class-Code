#include <stdio.h>
#include <math.h>
#include <string.h>
int main(){
	char word[80];
	int i, j;

	printf("Enter any word: ");
	scanf("%s",word);
	i=0;
	while (word[i] != '\0'){
		if (word[i] == word[i + 1]){
			j=1;
			while (word[i] == word[i+j]){
				j++;
			}
			printf("%d consecutive %c\n",j,word[i]);
		}
		i++;
	}
}

//The problem is that i is only incremented by one after the "%d consecutive %c\n" 
//is printed
//This can be solved by incrementing i by j instead of by 1 