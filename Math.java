package math;

import java.util.Random;

public class Math {
	String division(){
		int i=new Random().nextInt(100);
		int j=new Random().nextInt(19)+1;
		int r=i%j;
		while(i<j||r!=0){
		    i=new Random().nextInt(100);
			r=i%j;
		}
		return (i+"÷"+j);
	}
 
	public static void main(String[] args){
		String a;
		Math math=new Math();
		int k;
	    for(int n=0;n<30;n++){
	    	int a1=new Random().nextInt(100);
	    	int a2=new Random().nextInt(100);
	    	int a3=new Random().nextInt(100);
	    	int a4=new Random().nextInt(100);
	    	a=math.division();
	    	switch( new Random().nextInt(4)){
	    	//一个运算符
	    	case 0:
	    		k=new Random().nextInt(4);
	    		if(k==0)
	    			System.out.print(a1+"+"+a2+"="+"\n");
	    		else if(k==1)
	    			System.out.print(a1+"-"+a2+"="+"\n");
	    		else if(k==2)
	    			System.out.print(a1+"×"+a2+"="+"\n");
	    		else
	    			System.out.print(a+"="+"\n");
	    		break;
	    	//两个运算符
	    	case 1:
	    		k=new Random().nextInt(6);
	    		if(k==0)
	    			System.out.print(a1+"+"+a2+"-"+a3+"="+"\n");
	    		else if(k==1)
	    			System.out.print(a1+"+"+a2+"×"+a3+"="+"\n");
	    		else if(k==2)
	    			System.out.print(a1+"+"+a+"="+"\n");
	    		else if(k==3)
	    			System.out.print(a1+"-"+a2+"×"+a3+"="+"\n");
	    		else if(k==4)
	    			System.out.print(a1+"-"+a+"="+"\n");
	    		else 
	    			System.out.print(a+"×"+a1+"="+"\n");
	    		break;
	    	//三个运算符
	    	case 2:
	    		k=new Random().nextInt(4);
	    		if(k==0)
	    			System.out.print(a1+"+"+a2+"-"+a3+"×"+a4+"="+"\n");
	    		else if(k==1)
	    			System.out.print(a1+"+"+a2+"-"+a+"="+"\n");
	    		else if(k==2)
	    			System.out.print(a1+"+"+a+"×"+a2+"="+"\n");
	    		else
	    			System.out.print(a1+"-"+a+"×"+a2+"="+"\n");
	    		break;
	    	//四个运算符
	    	case 3:
	    			System.out.print(a1+"+"+a2+"-"+a+"×"+a3+"="+"\n");
	    		break;
	    	}
	    }
	}
}






