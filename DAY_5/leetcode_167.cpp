
#include<iostream>
#include<string>
#include<vector>
using namespace std;

int main(){
 system("cls");
    
   int arr[] = {2,3,5,6,7,8,11,13};
   
    return 0;

}
class Solution
{
public:
    vector<int> twoSum(vector<int> &numbers, int target)
    {
        int start = 0;
        int end = numbers.size() - 1;
        while (start < end)
        {
            int sum = numbers[start] + numbers[end];
            if (sum == target)
            {
                return {start + 1, end + 1};
            }
            else if (sum < target)
            {
                start++;
            }
            else
            {
                end--;
            }
        }
        return {-1, -1};
    }
};