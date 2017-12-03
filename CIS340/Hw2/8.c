#include <stdio.h>
#include <string.h>

int main(){

	int *a;
	int asize;

	printf("Please input an array size\n");
	scanf("%d", &asize);	
	a = (int *) malloc(asize * sizeof(int));
	printf("Please input array values\n");
	
	for(int i = 0; i < asize; i++){
		int avalue;
		scanf("%d", &avalue);
		a[i] = avalue; 
	}
		
	
	printf("Sorting!\n");

	for(int i = 0; i < asize - 1; i++){
		for(int j = i+1; j < asize; j++){
			if(*(a+i) > *(a+j)){
				int temp = *(a+i);
				*(a+i) = *(a+j);
				*(a+j) = temp;
			}
		}
		printf("%d\n", *(a+i));
	}
	printf("%d\n", *(a+asize-1));
}