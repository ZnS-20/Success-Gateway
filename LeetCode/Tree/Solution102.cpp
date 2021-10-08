// 102. Binary Tree Level Order Traversal
// Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).

// Example 1:
// Input: root = [3,9,20,null,null,15,7]
// Output: [[3],[9,20],[15,7]]

// Example 2:
// Input: root = [1]
// Output: [[1]]

// Example 3:
// Input: root = []
// Output: []
 

// Constraints:
// The number of nodes in the tree is in the range [0, 2000].
// -1000 <= Node.val <= 1000

class Solution {
public:
    vector<vector<int>> levelOrder(TreeNode* root) {
        vector<vector<int>> vec;
        vector<int> vec1;
        if(!root)
            return vec;
        queue<TreeNode*> q;
        q.push(root);
        q.push(NULL);
        while(q.size() > 1){
            TreeNode* curr = q.front();
            q.pop();
            if(!curr){
                vec.push_back(vec1);
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
        vec.push_back(vec1);
        return vec;
    }
};