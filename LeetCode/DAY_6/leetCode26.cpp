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
    int removeDuplicates(vector<int>& nums) {
        
        if(nums.size() == 0) return 0;
        int rev = 1;
        for(int i = 1; i < nums.size(); i++ ){
            if(nums[i] != nums[i-1]){
                nums[rev] = nums[i];
                rev++;
            }
        }
        return rev;
    }
};