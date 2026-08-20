#include<iostream>
#include<string>
#include<vector>
using namespace std;

int main(){
 system("cls");
    
    return 0;
}
class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int left = 0;
        for(int right = 0; right<nums.size(); right++){
            if (nums[right] != 0){
                swap(nums[right], nums[left]);
                left++;
            }
        }        
    }
};