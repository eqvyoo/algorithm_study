#include <iostream>
using namespace std;
int n,m;
int list[1000001];

int getParent(int parent[], int x){
    if(parent[x] == x)
        return x;
    return parent[x] = getParent(parent, parent[x]);
}

void unionParent(int parent[], int a, int b){
    a = getParent(parent, a);
    b = getParent(parent, b);
    if(a < b)
        parent[b] = a;
    else
        parent[a] = b;
}

void findParent(int parent[], int a, int b){
    a = getParent(parent, a);
    b = getParent(parent, b);
    if(a == b)
        cout<<"YES"<<'\n';
    else
        cout<<"NO"<<'\n';
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(0);
    int num, a, b;
    cin>>n>>m;
    for(int i = 0; i <= n; i++){
        list[i] = i;
    }
    for(int i = 0; i < m; i++) {
        cin >> num >> a >> b;
        if(num == 0)
            unionParent(list,a,b);
        if(num == 1)
            findParent(list,a,b);
    }
    return 0;
}