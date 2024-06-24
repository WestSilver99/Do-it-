import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/*
트리 구조는 비선형 자료구조이기 때문에 for문 한번으로 방문이 불가
모든 순회는 루트 노트에서 시작

전위 순회
현재 노드 방문
왼쪽 자식 노드 탐색
오른쪽 자식 노드 탐색
 */

//class Node {
//    int data;
//    Node left;
//    Node right;
//
//    public Node(int data) {
//        this.data = data;
//    }
//}

public class DS_tree {
    private static int[] inorder, postorder;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        inorder = new int[n + 1];
        postorder = new int[n + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i < n + 1; i++) {
            inorder[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i < n + 1; i++) {
            postorder[i] = Integer.parseInt(st.nextToken());
        }

        int i = calculateHeight(1, n, 1, n);
        System.out.println(i);
    }

    private static int calculateHeight(int inorderStart, int inorderEnd, int postorderStart, int postorderEnd) {
        if (inorderStart >= inorderEnd || postorderStart >= postorderEnd) {
            return 0;
        }
        // 중위 순회에서 루트 노드 인덱스 찾기 = rootIndex
        int rootValue = postorder[postorderEnd];
        int rootIndex = 0;
        for (int i = inorderStart; i <= inorderEnd; i++) {
            if (inorder[i] == rootValue) {
                rootIndex = i;
                break;
            }
        }
        // 1부터 개수(n)까지 반복문
        // 중위순회값 == 루트값이면 해당 인덱스값을 rootIndex에 넣고 반복문 종료

        int leftSubTreeSize = rootIndex - inorderStart;
        int rightSubTreeSize = inorderEnd - rootIndex;

        if (leftSubTreeSize > rightSubTreeSize) {
            return calculateHeight(inorderStart, rootIndex - 1, postorderStart, postorderStart + leftSubTreeSize - 1) + 1;
        } else {
            return calculateHeight(rootIndex + 1, inorderEnd, postorderEnd - rightSubTreeSize, postorderEnd - 1) + 1;
        }
    }

}
