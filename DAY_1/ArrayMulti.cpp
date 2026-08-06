#include <iostream>
#include <string>
using namespace std;

int main()
{
    system("cls");
    int arr[6] = {10, 20, 30, 40, 50};

    long int multi = 1;

    for (int i = 0; i < 5; i++)
    {
        multi *= arr[i];
    }
    cout << "Product of array elements: " << multi << endl;

    return 0;
}