package code;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Solution39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        int len = candidates.length;
        Arrays.sort(candidates);
        dfs(candidates, len, target, 0, new ArrayDeque<Integer>(), res);
        return res;
    }
    private void dfs(int[] candidates, int len, int residue, int begin, ArrayDeque<Integer> arrayDeque, List<List<Integer>> res) {
        if (residue == 0) {
            res.add(new ArrayList<Integer>(arrayDeque));
            return;
        }
        for (int i = begin; i < len; i++) {
            if (residue - candidates[i] < 0) {
                break;
            }
            arrayDeque.addLast(candidates[i]);
            dfs(candidates, len, residue - candidates[i], i, arrayDeque, res);
            arrayDeque.removeLast();
        }
    }
}
