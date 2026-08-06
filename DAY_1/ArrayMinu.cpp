// C++ program to find the minimum element in an array
#include <iostream>
#include <string>
using namespace std;

int main()
{
    system("cls");
    int arr[5] = {10, 30, 50, 70, 90};

    int min = arr[0];
    for (int i = 1; i < 5; i++)
    {
        if (arr[i] < min)
        {
            min = arr[i];
        }
    }

    cout << "Minimum element array: " << min << endl;
    return 0;
}