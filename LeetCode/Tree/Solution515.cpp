// 515. Find Largest Value in Each Tree Row

// Given the root of a binary tree, return an array of the largest value in each row of the tree (0-indexed).

// Example 1:
// Input: root = [1,3,2,5,3,null,9]
// Output: [1,3,9]

// Example 2:
// Input: root = [1,2,3]
// Output: [1,3]

// Example 3:
// Input: root = [1]
// Output: [1]

// Example 4:
// Input: root = [1,null,2]
// Output: [1,2]

// Example 5:
// Input: root = []
// Output: []

// Constraints:
// The number of nodes in the tree will be in the range [0, 104].
// -231 <= Node.val <= 231 - 1

class Solution {
public:
    int max(vector<int> vec){
        int max = INT_MIN;
        for(int i=0;i < vec.size(); i++)
            if(max < vec[i])
                max = vec[i];
        return max;
    }
    vector<int> largestValues(TreeNode* root) {
        vector<int> vec;
        if(!root)
            return vec;
        queue<TreeNode*> q;
        q.push(root);
        q.push(NULL);
        vector<int> vec1;
        while(q.size() > 1){
            TreeNode* curr = q.front();
            q.pop();
            if(curr == NULL){   
                vec.push_back(max(vec1));
                q.push(NULL);
                vec1.clear();
                continue;
            }
            vec1.push_back(curr->val);
            if(curr->left)
                q.push(curr->left);
            if(curr->right)
                q.push(curr->right);
        }
        vec.push_back(max(vec1));
        return vec;
    }
};