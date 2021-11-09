#include <stdio.h>
#include <stdlib.h>
int num1;
int num2;
int num3;
int oil(int num1, int num2, int num3)
{
    int result;

    if(num1 >= num2 && num1>=num3){    // && is and  || is or,  == equal, != not equal 
            result = num1;

    }
    else if(num2>= num1 && num2>=num3){

        result = num2;
    }
    else{
        result = num3;
    }

    return result;


}

int main()
{
    printf("enter n1 \n");
    scanf ("%d", &num1);

    printf("enter n2 \n");
    scanf ("%d", &num2);

    printf("enter n3 \n");
    scanf ("%d", &num3);

    printf("%d is biggest \n", oil(num1, num2, num3));

    //if(!(3<2)){
    //
     //   printf("N");
    //}   // ! is mean opposite
    
     return 0;
}