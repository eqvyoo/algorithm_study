class Solution {
    public int[] solution(int n) {
        // 1. n*n 2차원 배열 선언
        int[][] triangle = new int[n][n];
        int v = 1; // v는 변수를 채워넣을 숫자. tri에 기록할때마다 1++
        // 2. 숫자를 채울 현재 위치를 0,0으로 선언
        int x = 0;//x,y는 위치 변수
        int y = 0;
        while(true){
            while(true){
            triangle[y][x] = v++;
            //  - 아래로 이동하면서 숫자 채우기 -> y 값이 증가
            if(y + 1 == n || triangle[y+1][x] != 0)
                break;
            y += 1;
        }   
        if(x + 1 == n || triangle[y][x+1] != 0)
            break;
        x += 1;
        //  - 오른쪽으로 이동하면서 숫자 채우기-> y는 같고 x만 증가
        while(true){
            triangle[y][x] = v++;
            if(x + 1 == n || triangle[y][x+1] != 0)
                break;
            x+= 1;
        }
        if(triangle[y-1][x-1] != 0)
            break;
        x -= 1;
        y -= 1;
            
        //  - 왼쪽 위로 이동하면서 숫자 채우기 -> x랑 y 둘다 1감소
        while(true){
            triangle[y][x] = v++;
            if(triangle[y-1][x-1] != 0)
                break;
            x -= 1;
            y -= 1;
        }
        if(y + 1 == n || triangle[y+1][x] != 0)
            break;
        y += 1;
        }
        // 4. 채워진 숫자를 차례대로 1차원 배열에 옮겨서 반환하기
        int[] result = new int[v-1];
        int idx = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                result[idx++] = triangle[i][j];
            }
        }
        // 3. 방향에 따라 이동할 수 없을 때까지 반복하면서 숫자 채우기
        return result;
    }
}