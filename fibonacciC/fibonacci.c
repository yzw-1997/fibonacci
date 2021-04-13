#include <stdio.h>

int fibonacci();

int main(void)
{
    float index;

    printf("input an index: ");
    int scanfNumber = scanf("%f", &index);
    while (scanfNumber == 0 || index < 0 || (index - (int)index) != 0)
    {
        if (scanfNumber == 0 || (index - (int)index) != 0)
        {
            if (scanfNumber == 0)
            {
                setbuf(stdin, NULL);
            }
            printf("invalid index.\n");
        }
        if (index < 0)
        {
            printf("index can't be less than 0.\n");
        }
        printf("input an index: ");
        scanfNumber = scanf("%f", &index);
    }

    int value = fibonacci((int)index);
    if (value == -1)
    {
        printf("index is too big.\n");
        return 0;
    }
    printf("the value of index %i is %i\n", (int)index, value);
}

int fibonacci(int index)
{
    if (index <= 1)
    {
        return index;
    }

    int value;
    int preOne = 1;
    int preTwo = 0;
    for (int i = 2; i <= index; i++)
    {
        value = preOne + preTwo;
        if (value < 0)
        {
            return -1;
        }
        preTwo = preOne;
        preOne = value;
    }
    return value;
}