package com.oy.ot.github.Exercises;
class isAmor{
    boolean amorphic(int num){
    	int squre=num*num;
    	while(num>0) {
    		if(num%10!=squre%10)
    			return false;
    		num=num/10;
    		squre=squre/10;
    	}
    	return true;
		
	}
}
public class Amorphic {
	public static void main(String[] args) {
		isAmor memory=new isAmor();
		System.out.println(memory.amorphic(9376)?"amorphic":"notamorphic"); 
		
	}

}
