#include <stdio.h>
#include <stdlib.h>

int main()
{
    double num_1;
    double num_2;
    printf("type first number\n");
    scanf ("%lf", &num_1);
    printf("first number: %f, type second number\n", num_1);
    scanf ("%lf", &num_2);
    printf("first number: %f, second number: %d \n", num_1, num_2);
    printf("%f+%f=%f", num_1, num_2, num_1+num_2);

    return 0;
}
