#include <stdio.h>
#include <math.h>

int main()
{
    int number;
    printf("Enter a number: ");
    scanf("%d", &number);

    int newNumber = 0;

    int i = 0;

    while (number != 0)
    {

        newNumber += (pow(10, i)) * (number % 10);
        number = number / 10;
        i += 1;
        
    }


    if (number == newNumber)
    {
        printf("Palindrome");
    }
    else
    {

        printf("Not a palindrome %d",newNumber);
    }
}