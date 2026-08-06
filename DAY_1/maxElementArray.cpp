#include <iostream>
#include <string>
using namespace std;

int main()
{
    system("cls");
    int arr[5] = {10, 30, 50, 70, 90};

    int max = arr[0];
    for (int i = 1; i < 5; i++)
    {
        if (arr[i] > max)
        {
            max = arr[i];
        }
    }

    cout << "Maximum element in the array: " << max << endl;
    return 0;
}