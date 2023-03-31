#include<iostream>
using namespace std;
int arr[41][2];
int num;

int main(){
    int time;
    cin>>time;
    arr[0][0] = 1;
    arr[0][1] = 0;
    arr[1][0] = 0;
    arr[1][1] = 1;
    for(int i = 2; i <= 40; i++){
        arr[i][0] = arr[i-1][0] + arr[i-2][0];
        arr[i][1] = arr[i-1][1] + arr[i-2][1];
    }
    for(int i = 0; i < time ; i++){
        cin>>num;
        cout<<arr[num][0]<<" "<<arr[num][1];
        cout<<endl;
    }
    return 0;
}
