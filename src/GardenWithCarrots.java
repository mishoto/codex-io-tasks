public class GardenWithCarrots {

    public static int countIsCarrotGroup(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;
        int totalGroups = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 1) {
                    totalGroups++;
                    visitGroupDFS(matrix, i, j);
                }
            }
        }
        return totalGroups;
    }

    private static void visitGroupDFS(int[][] matrix, int x, int y) {
        if (x < 0 || x >= matrix.length || y < 0 || y >= matrix[0].length){
            return; // -> if it is not a valid cell
        }
        if (matrix[x][y] == 0){
            return; // -> if it is a carrot cell
        }

        matrix[x][y] = 0; // mark the cell visited by making it empty cell

        // recursively visit all neighboring cells (horizontally & vertically)
        visitGroupDFS(matrix, x + 1, y); // lower cell
        visitGroupDFS(matrix, x - 1, y); // upper cell
        visitGroupDFS(matrix, x, y + 1); // right cell
        visitGroupDFS(matrix, x, y - 1); // left cell
    }

    public static void main(String[] args) {
        System.out.println(GardenWithCarrots.countIsCarrotGroup(
                new int[][] {
                        { 0, 1, 1, 1, 0 },
                        { 0, 0, 0, 1, 1 },
                        { 0, 1, 1, 1, 0 },
                        { 0, 1, 1, 0, 0 },
                        { 0, 0, 0, 0, 0 }
                }));

        System.out.println(GardenWithCarrots.countIsCarrotGroup(
                new int[][] {
                        { 1, 1, 1, 0, 0 },
                        { 0, 1, 0, 0, 1 },
                        { 0, 0, 1, 1, 0 },
                        { 0, 0, 1, 0, 0 },
                        { 0, 0, 1, 0, 0 }
                }));
    }
}
