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

    // string str1;
    // cout << "Enter to traversing index: ";
    // cin >> str1;

    // for (int i = 0; i <= str1.size(); i++)
    // {
    //     cout<<str1[i];
    // }

    // cout<<endl;
    // cout << "Last element: " << "is :" << str1;

    // string str2;
    // cout<<"Enter new string to travising using range based: ";
    // cin>>str2;

    // for(char ch: str2){
    //     cout<<ch;

    // }

    // Traversing using iterator
    //  string str3;
    // cout << "Using iterator: ";
    // for (auto it = str3.begin(); it != str3.end(); it++) {
    //     cout << *it ;
    // }
    // cout << endl;

    //     string str4 = "Hello, World!";
    //     string str5 = "Aman Verma";
    //      string str6 =  str4 + str5;
    //    cout<<" Concatenition "<<str6;

    string str6 = "Avinash";

    str6.push_back('g');

    cout << "Add Char in last index:" << str6;

    cout << endl;
    str6.pop_back();

    cout << "remove last element :" << str6;

    cout << endl;
    str6.insert(3, "f");
    cout << "Insert element in any positin of sting: " << str6;
    return 0;
}