#include<iostream>
#include<vector>
using namespace std;
int main(){
    int num;
    cin>> num;
    vector<int>vec;
    if(num < 100)
        cout<<num<<endl;

    else if( num >= 100 && num<= 1000){
        for(int i = 1; i < 100; i++){
            vec.push_back(i);
        }
        for (int i = 100; i <= num; i++){
            if ( ((i /100) - (i%100)/10) == ((i%100)/10 - i%10))
                vec.push_back(i);
        }
        cout<<vec.size()<<endl;
    }

}