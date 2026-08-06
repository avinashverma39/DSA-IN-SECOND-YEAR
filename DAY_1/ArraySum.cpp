// SUM OF ARRAY ELEMENTs
#include <iostream>
using namespace std;

int main()
{
    system("cls");
    int arr[5] = {10, 20, 30, 40, 50};
    int sum = 0;
    for (int i = 0; i < 5; i++)
    {
        sum += arr[i];
    }
    cout << "Sum of array elements: " << sum << endl;
    return 0;
}
