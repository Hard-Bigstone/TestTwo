package 算法实验二;
import java.util.*;
public class 实验2 {
	public static void qSort(int a[],int l,int r){
		int i=l,j=r,mid,temp;     //mid为基准元素
		Random rad =new Random();         //加入随机算法
		int rand=rad.nextInt(r-l+1)+l;
		mid=a[rand];
		do{
			while(a[i]<mid) i++;   //找到左边大于mid的数
			while(a[j]>mid) j--;   //找到右边小于mid的数
			if(i<=j){      //交换下标所在的数
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
				j--;
			}
		}while(i<=j);      //直到左游标大于右游标
		if(l<j) qSort(a,l,j);
		if(i<r) qSort(a,i,r);
	}
	
	public static void main(String[] args){
		int a[]={21,36,18,96,67,42,54};
		qSort(a,0,6);
		System.out.print("排序后:");
		for(int i=0;i<a.length;i++) {
			
		}

	}
}
