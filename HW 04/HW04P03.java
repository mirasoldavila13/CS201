public class HW04P03 {
	public static void main(String[] args) {
		
		
		for (int a = 0; a < 500; a++) { 
			for (int b = 0; b < 500; b++) {
				for(int c = 0; c < 500; c++) {
					boolean pythagoreanTriple = Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2);
					if(pythagoreanTriple) {
						System.out.println(pythagoreanTriple);
					}
				}
			}
		}	
	}
}