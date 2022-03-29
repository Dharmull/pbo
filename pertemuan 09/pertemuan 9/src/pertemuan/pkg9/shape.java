package pertemuan.pkg9;


class shape {
void createTriangle(int a)
{
int b,c;
c=a;
for(int i=0;i<=c;i++)
{
for(int j=0;j<i+1;j++)
{
if (j==0)
System.out.print("*");
else if(j==i)
System.out.print("*");
else if(i==c)
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
}
}

void createRectangle(int a,int b)
{
for(int i=1;i<=a;i++){
for(int j=1;j<=b;j++){
if(i==1 || i==a || j==1 || j==b){
System.out.print("*");
}
else
{
System.out.print(" ");
}
}
System.out.println();
}
}
}