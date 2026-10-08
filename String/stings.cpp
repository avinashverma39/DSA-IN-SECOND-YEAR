#include <iostream>
#include <string>
#include <vector>
using namespace std;

int main()
{
    system("cls");
    // string str;

    // cout << "Enter Your name:";
    // cin >> str;

    // cout << "Your name is:" << str << endl;

    string str1;
    cout << "Enter to traversing index: ";
    cin >> str1;

    for (int i = 0; i <= str1.size(); i++)
    {
        cout<<str1[i];
    }

    cout<<endl;
    // cout << "Last element: " << "is :" << str1;
    return 0;
}