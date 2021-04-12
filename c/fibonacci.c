#include <stdio.h>

int fibonacci();

int main(void)
{
    float index;

    printf("input an index: ");
    int scanfNumber = scanf("%f", &index);
    while (scanfNumber == 0 || index <= 0 || (index - (int)index) != 0)
    {
        if (scanfNumber == 0 || (index - (int)index) != 0)
        {
            if (scanfNumber == 0)
            {
                setbuf(stdin, NULL);
            }
            printf("index must be an integer.\n");
        }
        if (index <= 0)
        {
            printf("index must be greater than 0.\n");
        }
        printf("input an index: ");
        scanfNumber = scanf("%f", &index);
    }

    int value = fibonacci((int)index);
    printf("the value of index %i is %i\n", (int)index, value);
}

int fibonacci(int index)
{
    int value = 1;

    if (index <= 2)
    {
        return value;
    }

    value = fibonacci(index - 1) + fibonacci(index - 2);
    return value;
}