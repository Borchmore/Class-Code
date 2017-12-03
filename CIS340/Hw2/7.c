#include <stdio.h>
#include <string.h>

void swap(int *x1, int *y2, int *z3){
	
	int temp;
	temp = *z3;
	*z3 = *y2;
	*y2 = *x1;
	*x1 = temp;

	return;
}

int main(){
	
	int e1, e2, e3;

	printf("Enter values of elements\n");
	scanf("%d", &e1);
	scanf("%d", &e2);
	scanf("%d", &e3);
	
	printf("The values before swapping are:\n");
	printf("Element 1 = %d\n", e1);
	printf("Element 2 = %d\n", e2);
	printf("Element 3 = %d\n", e3);

	swap(&e1, &e2, &e3);

	printf("The values after swapping are:\n");
	printf("Element 1 = %d\n", e1);
	printf("Element 2 = %d\n", e2);
	printf("Element 3 = %d\n", e3);
}