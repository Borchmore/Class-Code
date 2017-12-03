#include <stdio.h>
#include <math.h>
#include <string.h>
int main(){
	char str[10][50];
	char temp[50];
	int i = 0;
	int j, k;

	while(i < 10){
		printf("Enter a string (50 characters or less): ");
		scanf("%s", str[i]);
		++i;
	}
	
	for (j = 0; j < 9 ; j++){
		for (k= j + 1; k < 10; k++) {
			if (strcmp(str[j], str[k]) > 0){
				strcpy(temp, str[j]);
				strcpy(str[j], str[k]);
				strcpy(str[k], temp);
			 }
		}
	}

	printf("%s\n",str[0]);
	printf("%s\n",str[1]);
	printf("%s\n",str[2]);
	printf("%s\n",str[3]);
	printf("%s\n",str[4]);
	printf("%s\n",str[5]);
	printf("%s\n",str[6]);
	printf("%s\n",str[7]);
	printf("%s\n",str[8]);
	printf("%s\n",str[9]);

	return 0;
}