class Recursion2 {
	
	static int show(int n){
		
		if(n==4)//base condition
		{
			return n;
		}
		else{
			return 2*show(n+1);
			
		}
		
	}
    public static void main(String[] args) {
		
       System.out.println(show(2));
    }
}


/*
Initial Call: show(2)

Since 2 != 4, it goes to the else block.

return 2 * show(3)

Recursive Call: show(3)

Since 3 != 4, it again goes to the else block.

return 2 * show(4)

Recursive Call: show(4)

Now n == 4, so it returns 4.

show(4) → returns 4

Back to: show(3)

2 * 4 = 8

show(3) → returns 8

Back to: show(2)

2 * 8 = 16

show(2) → returns 16

*/
