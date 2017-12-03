#include <stdio.h>
#include <math.h>
int main(){
	char stri[50];
	int i = 0;

	printf("Enter a string (50 characters or less: ");
	scanf("%s", stri);
	while(i<sizeof(stri)){
		if((stri[i] >= 97) && (stri[i] <= 122)){
			stri[i] = stri[i] - 32;
		}
		else if((stri[i] >= 65) && (stri[i] <= 90)){
			stri[i] = stri[i] + 32;
		}
		++i;
	}
	printf("%s\n",stri);

	return 0;
}