#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <math.h>

int main(){

	int msize;

	printf("Please enter matrix size\n");
	scanf("%d", &msize);

	int a[msize][msize];
	int b[msize][msize];
	
	for(int i=0; i<msize; i++){
		for(int j=0; j<msize; j++){
			printf("Please enter an integer value into array a[%d][%d]\n", i, j);
			scanf("%d", &a[i][j]);
			printf("\n");
		}
	}

	for(int i=0; i<msize; i++){
		for(int j=0; j<msize; j++){
			printf("Please enter an integer value into array b[%d][%d]\n", i, j);
			scanf("%d", &b[i][j]);
			printf("\n");
		}
	}

	int c[msize][msize];
	int d[msize][msize];
	int dterm;

	for(int i=0; i<msize; i++){
		for(int j=0; j<msize; j++){
			c[i][j] = a[i][j] + b[i][j];
			printf("c[%d][%d] = %d\n", i, j, c[i][j]);
			printf("\n");
		}
	}
	
	for(int i=0; i<msize; i++){
		for(int j=0; j<msize; j++){
			dterm = 0;		
			for(int k = 0; k<msize; k++){
				dterm = dterm + (a[i][k] * b[k][j]);
			}			
			printf("d[%d][%d] = %d\n", i, j, dterm);
			printf("\n");
		}
	}
}