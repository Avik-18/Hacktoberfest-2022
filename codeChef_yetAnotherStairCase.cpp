#include<map>
#include<set>
#include<stack>
#include<queue>
#include<string>
#include<math.h>
#include<stdio.h>
#include<string.h>
#include<iostream>
#include<algorithm>
#define pb push_back
using namespace std;
const int mod=998244353;
const int maxn=1e6+5;
typedef long long ll;
const int inf=0x3f3f3f3f;
const int minn=0xc0c0c0c0;
ll k,n,l[maxn],r[maxn],dp[maxn],sum[maxn];
int main()
{
    
    
    scanf("%lld%lld",&n,&k);
	for(int i=1;i<=k;i++)
		scanf("%lld%lld",&l[i],&r[i]);
	sum[1]=1;
	for(int i=2;i<=n;i++)
	{
    
    
		for(int j=1;j<=k;j++)
			dp[i]=(dp[i]+sum[max((ll)0,i-l[j])]-sum[max((ll)0,i-r[j]-1)])%mod;
		sum[i]=(sum[i-1]+dp[i])%mod;
	}
	printf("%lld\n",(dp[n]+mod)%mod);
    return 0;
}
