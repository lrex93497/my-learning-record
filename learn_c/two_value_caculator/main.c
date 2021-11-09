#include <stdio.h>
#include <stdlib.h>

int main()
{
    double num1;
    double num2;

    char mode;
    printf("Enter n1 (n1 _ n2) \n");
    scanf("%lf", &num1);
    printf("Enter n2 (n1 _ n2) \n");
    scanf("%lf", &num2);
    printf("mode? (/ + * - choose one) (n1 _ n2) \n");
    scanf(" %c", &mode);       // the space before %c is a must

    if (mode == '+'){
        printf("%f", num1 + num2);
    }
    else if (mode == '-'){
        printf("%f", num1 - num2);
    }
    else if (mode == '*'){
        printf("%f", num1 * num2);
    }
    else if (mode == '/'){
        printf("%f", num1 / num2);
    }
    else {
        printf("Invalid! type accordingly !");
    }


    return 0;
}
