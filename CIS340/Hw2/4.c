#include <stdio.h>
#include <string.h>

int main(){

	int vow = 0;
	char *str;
	char *vowels = "AEIOUaeiou";
	str = (char *) malloc(15);

	printf("Please input a string\n");
	scanf("%s", str);

	for(int i = 0; i<(strlen(str)); i++){
		for(int j = 0; j<(strlen(vowels)); j++){
			if(str[i] == vowels[j]){
				++vow;
			}
		}
	}

	int con = (strlen(str)) - vow;

	printf("Number of vowels: %d\n", vow);
	printf("Number of consonents: %d\n", con);

}