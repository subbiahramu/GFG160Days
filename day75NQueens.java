class Solution {
    public ArrayList<ArrayList<Integer>> nQueen(int n) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        List<Integer> board = new ArrayList<>();
        backtrack(n, board, result);
        return result;
    }

    private static void backtrack(int n, List<Integer> board, ArrayList<ArrayList<Integer>> result) {
        if (board.size() == n) {
            result.add(new ArrayList<>(board));  // Found a valid solution
            return;
        }

        for (int row = 1; row <= n; row++) {
            if (isValid(board, row)) {
                board.add(row);  // Place the queen
                backtrack(n, board, result);
                board.remove(board.size() - 1);  // Backtrack
            }
        }
    }

    private static boolean isValid(List<Integer> board, int newRow) {
        int newCol = board.size();
        for (int col = 0; col < newCol; col++) {
            int row = board.get(col);
            // Check if another queen is in the same row or diagonal
            if (row == newRow || Math.abs(row - newRow) == Math.abs(col - newCol)) {
                return false;
            }
        }
        return true;
    }}