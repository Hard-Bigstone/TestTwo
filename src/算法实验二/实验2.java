package �㷨ʵ���;
import java.util.*;
public class ʵ��2 {
	public static void qSort(int a[],int l,int r){
		int i=l,j=r,mid,temp;     //midΪ��׼Ԫ��
		Random rad =new Random();         //��������㷨
		int rand=rad.nextInt(r-l+1)+l;
		mid=a[rand];
		do{
			while(a[i]<mid) i++;   //�ҵ���ߴ���mid����
			while(a[j]>mid) j--;   //�ҵ��ұ�С��mid����
			if(i<=j){      //�����±����ڵ���
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
				j--;
			}
		}while(i<=j);      //ֱ�����α�������α�
		if(l<j) qSort(a,l,j);
		if(i<r) qSort(a,i,r);
	}
	
	public static void main(String[] args){
		int a[]={21,36,18,96,67,42,54};
		qSort(a,0,6);
		System.out.print("�����:");
		for(int i=0;i<a.length;i++) {
			
		}

	}
}
