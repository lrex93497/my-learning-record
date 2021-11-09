#include <stdio.h>
#include <stdlib.h>

double test1(double num)
{
    double result = num*num*num;
    return result;  
}


int main()
{

    printf("Answer: %f", test1(9.0));
    return 0;
}

