#include<stdio.h>
#include<fcntl.h>
#include<unistd.h>
#include<sys/types.h>

int main ()
{
    int gifts[10];
    int student[10];
    int i,j,temp1,temp2;
    printf("Enter the no of gifts Each student carrry\n");
    for( i=0;i<10;i++){
        printf("Enter no of gifts Student %d is having ",i+1);
        scanf("%d",&gifts[i]);
        printf("\n");
        
    }
    for(i=0;i<10;i++){
        student[i]=i+1;
    }
    for(i=0;i<10;i++){
        for(j=0;j<10-i;j++){
           if(gifts[j]>gifts[j+1]){
               temp1=gifts[j];
               gifts[j]=gifts[j+1];
               gifts[j+1]=temp1;

               temp2=student[j];
               student[j]=student[j+1];
               student[j+1]=temp2;
           }
        }
    }
    printf("\n\t\t|*****|Order of billing|*****|\n\n");
	printf("_________________________________________________________\n\n");

	printf("|\tStudent\t\t\t|\tNumber of Gifts\t|\n");
    printf("_________________________________________________________\n\n");
	for(i=10;i>0;i--)
	{
		printf("|\tStudent %d\t\t|\t\t%d\t|\n",student[i],gifts[i]);
		
	}
	printf("_________________________________________________________\n\n");
	
	
	
    


    
}