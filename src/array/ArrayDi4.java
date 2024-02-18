package array;

public class ArrayDi4 {

    public static void main(String[] args) {
        // 2x3 2차원 배열을 만들고, 초기화한다.
        int[][] arr = new int[4][5];

        int i = 1;
        // 순서대로 i가 1씩 증가한다.
        for (int row = 0; row < arr.length; row++){
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] = i++;
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }
    }
}
