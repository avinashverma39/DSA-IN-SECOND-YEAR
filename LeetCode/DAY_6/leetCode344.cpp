#include<iostream>
#include<string>
#include<vector>
using namespace std;

int main(){
 system("cls");
    
 string str = "Hello World";
 vector<char> s(str.begin(), str.end());
    return 0;
}

class Solution {
public:
    void reverseString(vector<char>& s) {

        int start = 0;
        int end = s.size() - 1;

        while(start <= end){

            swap(s[start], s[end]);

            start++;
            end--;
        }
    }
};