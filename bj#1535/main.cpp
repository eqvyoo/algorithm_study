#include <iostream>
#include<algorithm>

using namespace std;
int n;
int life[21];
int joy[21];

int hello(int i, int health, int happy) {
    if (health <= 0) {
        return 0;
    }
    else if ( i >= n ){
        return happy;
    }
    return max(hello(i+1,health, happy), hello(i+1, health - life[i],happy + joy[i]));
}


int main(){
    cin>>n;
    for(int i = 0; i < n;i++){
        cin>>life[i];
    }
    for(int i = 0; i < n; i++){
        cin>>joy[i];
    }

    cout<<hello(0,100,0);

}