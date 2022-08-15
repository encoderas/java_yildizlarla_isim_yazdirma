
package deneme01;

import java.util.Scanner;



public class test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("sayi gir: ");
		int sayi = scan.nextInt();
		System.out.print("isim gir: ");
		scan.nextLine();
		String mtn = scan.nextLine();
		scan.close();
		for(int i=0;i<mtn.length();i++) {
		
			switch (mtn.charAt(i)) {
			case 'a': {
				
				a(sayi);
				break;			}
			case 'b': {
				
				b(sayi);
				break;
			}
			
			case 'c': {
				
				c(sayi);
				break;
			}
			
			case 'd': {
				
				d(sayi);
				break;
			}
			
			case 'e': {
				
				e(sayi);
				break;
			}
			case 'f': {
				
				f(sayi);
				break;
			}
			
			case 'g': {
				
				g(sayi);
				break;
			}
			
			case 'h': {
				
				h(sayi);
				break;
			}
			case 'i': {
				
				i(sayi);
				break;
			}
			case 'j': {
				
				j(sayi);
				break;
			}
			
			case 'k': {
				
				k(sayi);
				break;
			}
			
			case 'l': {
				
				l(sayi);
				break;
			}
			case 'm': {
				
				m(sayi);
				break;
			}
			case 'n': {
				
				n(sayi);
				break;
			}
			
			case 'o': {
				
				o(sayi);
				break;
			}
			
			case 'p': {
				
				p(sayi);
				break;
			}
			case 'q': {
				
				q(sayi);
				break;
			}
			case 'r': {
				
				r(sayi);
				break;
			}
			
			case 's': {
				
				s(sayi);
				break;
			}
			
			case 't': {
				
				t(sayi);
				break;
			}
			
			case 'u': {
				
				u(sayi);
				break;
			}
			case 'v': {
				
				v(sayi);
				break;
			}
			
			case 'x': {
				
				x(sayi);
				break;
			}
			
			case 'y': {
				
				y(sayi);
				break;
			}
			
			case 'z': {
				
				z(sayi);
				break;
			}
			
			default:
				for(int j=0;j<sayi/2;j++) {
					
					System.out.println();
				}
				
				break;
			}
			
			
		}
		
	
	}
		



    public static void a(int sayi)
    {
    	System.out.println();
    	System.out.println();
    	for(int i=0;i<sayi;i++) {
    		System.out.println();
    		for(int j=0;j<sayi;j++) {
    			if(i==0 || i==(sayi-1)/2 || j==0  || j==sayi-1) {
    			System.out.print("x");
    			
    		}
    			else {
    				System.out.print(" ");
    			}
    		
    	    }
    	}
    }


    public static void b(int sayi)
    {
    	System.out.println();
    	System.out.println();
    	for(int i=0;i<sayi;i++) {
    		System.out.println();
    		for(int j=0;j<sayi;j++) {
    			if(i==0 || i==(sayi-1)/2 || i==sayi-1 || j==0  || j==sayi-1) {
    			System.out.print("x");
    			
    		}
    			else {
    				System.out.print(" ");
    			}
    		
    	    }
    	}
    	
    }
    

    public static void c(int sayi)
    {
    	
    	System.out.println();
    	System.out.println();
    	for(int i=0;i<sayi;i++) {
    		System.out.println();
    		for(int j=0;j<sayi;j++) {
    			if(i==0 || i==sayi-1 || j==0) {
    			System.out.print("x");
    			
    		}
    			else {
    				System.out.print(" ");
    			}
    		
    	    }
    	}
    	 
    }


    public static void d(int sayi)
    {
    	System.out.println();
    	System.out.println();
    	for(int i=0;i<sayi;i++) {
    		System.out.println();
    		for(int j=0;j<sayi;j++) {
    			if(i==0 || i==sayi-1 || j==0  || j==sayi-1) {
    			System.out.print("x");
    			
    		}
    			else {
    				System.out.print(" ");
    			}
    		
    	    }
    	}
    	
    }


    public static void e(int sayi)
    {
    	System.out.println();
    	System.out.println();
    	for(int i=0;i<sayi;i++) {
    		System.out.println();
    		for(int j=0;j<sayi;j++) {
    			if(i==0 || i==(sayi-1)/2 || i==sayi-1 || j==0) {
    			System.out.print("x");
    			
    		}
    			else {
    				System.out.print(" ");
    			}
    		
    	    }
    	}
    }


    public static void f(int sayi)
    {
    	
    	System.out.println();
    	System.out.println();
    	for(int i=0;i<sayi;i++) {
    		System.out.println();
    		for(int j=0;j<sayi;j++) {
    			if(i==0 || i==(sayi-1)/2 || j==0) {
    			System.out.print("x");
    			
    		}
    			else {
    				System.out.print(" ");
    			}
    		
    	    }
    	}
    	
    }


    public static void g(int sayi)
    {
    	
    	System.out.println();
    	System.out.println();
    	for(int i=0;i<sayi;i++) {
    		System.out.println();
    		for(int j=0;j<sayi;j++) {
    			if(i==0 || (i==(sayi-1)/2)&&(j>(sayi-1)/2) || i==sayi-1 || j==0 || (i>(sayi-1)/2)&&(j==sayi-1)) {
    			System.out.print("x");
    			
    		}
    			else {
    				System.out.print(" ");
    			}
    		
    	    }
    	}
    	
    }


    public static void h(int sayi)
    {
    	System.out.println();
    	System.out.println();
    	for(int i=0;i<sayi;i++) {
    		System.out.println();
    		for(int j=0;j<sayi;j++) {
    			if(i==(sayi-1)/2 || j==0  || j==sayi-1) {
    			System.out.print("x");
    			
    		}
    			else {
    				System.out.print(" ");
    			}
    		
    	    }
    	}
    }


    public static void i(int sayi)
    {
    	
    	System.out.println();
    	System.out.println();
    	for(int i=0;i<sayi;i++) {
    		System.out.println();
    		for(int j=0;j<sayi;j++) {
    			if(j ==(sayi-1)/2) {
    			System.out.print("x");
    			
    		}
    			else {
    				System.out.print(" ");
    			}
    		
    	    }
    	}
    }


    public static void j(int sayi)
    {
    	
    	System.out.println();
    	System.out.println();
    	for(int i=0;i<sayi;i++) {
    		System.out.println();
    		for(int j=0;j<sayi;j++) {
    			if(i==sayi-1 || j==0 && i>sayi/2  || j==sayi-1) {
    			System.out.print("x");
    			
    		}
    			else {
    				System.out.print(" ");
    			}
    		
    	    }
    	}
    	
    }


    public static void k(int sayi)
    {

    	
    	
    	System.out.println();
    	System.out.println();
    	for(int i=0;i<sayi;i++) {
    		System.out.println();
    		for(int j=0;j<sayi;j++) {
    			if(j==0 || (sayi-1)/2<i && i==j+((sayi-1)/2) ||(sayi-1)/2>=i && i==((sayi-1)/2)-j) {
    			System.out.print("x ");
    			
    		}
    			else {
    				System.out.print("  ");
    			}
    		
    	    }
    	}

    }


    public static void l(int sayi)
    {

    	
    	System.out.println();
    	System.out.println();
    	for(int i=0;i<sayi;i++) {
    		System.out.println();
    		for(int j=0;j<sayi;j++) {
    			if(i==sayi-1 || j==0) {
    			System.out.print("x");
    			
    		}
    			else {
    				System.out.print(" ");
    			}
    		
    	    }
    	}
    }


    public static void m(int sayi)
    {
    	System.out.println();
    	System.out.println();
    	for(int i=0;i<sayi;i++) {
    		System.out.println();
    		for(int j=0;j<sayi;j++) {
    			if(j==0 || j==sayi-1 || j<(sayi-1)/2 && i==j  || j>(sayi-1)/2 && i==sayi-1-j) {
    			System.out.print("x");
    			
    		}
    			else {
    				System.out.print(" ");
    			}
    		
    	    }
    	}  
    }


    public static void n(int sayi)
    {
    	
    	System.out.println();
    	System.out.println();
    	for(int i=0;i<sayi;i++) {
    		System.out.println();
    		for(int j=0;j<sayi;j++) {
    			if(j==0 || j==sayi-1 || i==j) {
    			System.out.print("x");
    			
    		}
    			else {
    				System.out.print(" ");
    			}
    		
    	    }
    	}
    	
    }


    public static void o(int sayi)
    {
    	
    	System.out.println();
    	System.out.println();
    	for(int i=0;i<sayi;i++) {
    		System.out.println();
    		for(int j=0;j<sayi;j++) {
    			if(j==0 || j==sayi-1 || i==0 || i==sayi-1) {
    			System.out.print("x");
    			
    		}
    			else {
    				System.out.print(" ");
    			}
    		
    	    }
    	}
    	
    }


    public static void p(int sayi)
    {

    	
    	System.out.println();
    	System.out.println();
    	for(int i=0;i<sayi;i++) {
    		System.out.println();
    		for(int j=0;j<sayi;j++) {
    			if(j==0 || j==sayi-1  && i<(sayi-1)/2 || i==0 || i==(sayi-1)/2) {
    			System.out.print("x");
    			
    		}
    			else {
    				System.out.print(" ");
    			}
    		
    	    }
    	}
    	
    }


    public static void q(int sayi)
    {
    	
    	System.out.println();
    	System.out.println();
    	for(int i=0;i<sayi*6/5;i++) {
    		System.out.println();
    		for(int j=0;j<sayi*6/5;j++) {
    			if(j==0 && i<sayi || j==sayi-1 && i<sayi|| i==0 && j<sayi || i==sayi-1 && j<sayi || i>sayi/2 && j>sayi/2 && i==j) {
    			System.out.print("x");
    			
    		}
    			else {
    				System.out.print(" ");
    			}
    		
    	    }
    	}
    	
    }


    public static void r(int sayi)
    {

    	
    	
    	System.out.println();
    	System.out.println();
    	for(int i=0;i<sayi;i++) {
    		System.out.println();
    		for(int j=0;j<sayi;j++) {
    			if(j==0 || j==sayi-1  && i<(sayi-1)/2 || i==0 || i==(sayi-1)/2 || i>(sayi-1)/2  && i==j ) {
    			System.out.print("x");
    			
    		}
    			else {
    				System.out.print(" ");
    			}
    		
    	    }
    	}
    	
    }
    

    public static void s(int sayi)
    {
    	
    	
    	System.out.println();
    	System.out.println();
    	for(int i=0;i<sayi;i++) {
    		System.out.println();
    		for(int j=0;j<sayi;j++) {
    			if(j==0 && i<(sayi-1)/2 || i==sayi-1 || i==0 || i==(sayi-1)/2 || j==sayi-1 && i>(sayi-1)/2) {
    			System.out.print("x");
    			
    		}
    			else {
    				System.out.print(" ");
    			}
    		
    	    }
    	}
    	
    	
    }


    public static void t(int sayi)
    {

    	
    	System.out.println();
    	System.out.println();
    	for(int i=0;i<sayi;i++) {
    		System.out.println();
    		for(int j=0;j<sayi;j++) {
    			if(i==0  || j==(sayi-1)/2 ) {
    			System.out.print("x");
    			
    		}
    			else {
    				System.out.print(" ");
    			}
    		
    	    }
    	}
    }


    public static void u(int sayi)
    {
    	
    	
    	System.out.println();
    	System.out.println();
    	for(int i=0;i<sayi;i++) {
    		System.out.println();
    		for(int j=0;j<sayi;j++) {
    			if(i==sayi-1 || j==0  || j==sayi-1) {
    			System.out.print("x");
    			
    		}
    			else {
    				System.out.print(" ");
    			}
    		
    	    }
    	}
    	
    }


    public static void v(int sayi)
    {

    	
    	
    	System.out.println();
    	System.out.println();
    	for(int i=0;i<sayi;i++) {
    		System.out.println();
    		for(int j=0;j<sayi*2;j++) {
    			if(j<sayi && i==j  || j>sayi && i==2*sayi-j-1) {
    			System.out.print("x");
    			
    		}
    			else {
    				System.out.print(" ");
    			}
    		
    	    }
    	}
    	
    }


    public static void x(int sayi)
    {

    	
    	System.out.println();
    	System.out.println();
    	for(int i=0;i<sayi;i++) {
    		System.out.println();
    		for(int j=0;j<sayi;j++) {
    			if(i==j  || i==sayi-1-j  ) {
    			System.out.print("x");
    			
    		}
    			else {
    				System.out.print(" ");
    			}
    		
    	    }
    	}
    }


    public static void y(int sayi)
    {


    	
    	
    	System.out.println();
    	System.out.println();
    	for(int i=0;i<sayi;i++) {
    		System.out.println();
    		for(int j=0;j<sayi;j++) {
    			if(i>=(sayi-1)/2  && j==(sayi-1)/2  ||  i<(sayi-1)/2  && (( j<(sayi-1)/2  &&  i==j) || ( j>=(sayi-1)/2  &&  i==sayi-1-j))) {
    			System.out.print("x");
    			
    		}
    			else {
    				System.out.print(" ");
    			}
    		
    	    }
    	}
    }
    

    public static void z(int sayi)
    {
    	
    	System.out.println();
    	System.out.println();
    	for(int i=0;i<sayi;i++) {
    		System.out.println();
    		for(int j=0;j<sayi;j++) {
    			if(i==0 || i==sayi-1  || i==sayi-1-j ) {
    			System.out.print("x");
    			
    		}
    			else {
    				System.out.print(" ");
    			}
    		
    	    }
    	}
    	
    	
    }
    	
    }

    

   


