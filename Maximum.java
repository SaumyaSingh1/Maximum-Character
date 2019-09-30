import java.util.*;

class Maximum{

public static void main(String args[]){
Scanner scan = new Scanner(System.in);
String str;
str = scan.nextLine();
char string[] = str.toCharArray();
int i,j,max;
char maxChar = str.charAt(0);
int[] freq = new int[str.length()];

for(i=0; i<str.length(); ++i){
freq[i]=1;
for(j=i+1; j<str.length(); ++j){
if(string[i]==string[j] && string[i] != ' ')
{freq[i] = freq[i] + 1;
//string[j]='0';
}
}
}
max=freq[0];
for(i=0;i<str.length();++i){
if(max<freq[i]){
max=freq[i];
maxChar= string[i];
}
} 
System.out.println("Maximum Ocurring Character:" + maxChar);
}
}