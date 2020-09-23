public class Task9{

	public static void main(String[] args){
		float x = Float.parseFloat(args[0]);
		float y = Float.parseFloat(args[1]);
		float r = Float.parseFloat(args[2]);
		float oX = Float.parseFloat(args[3]);
		float oY = Float.parseFloat(args[4]);
		if (args.length==5){
			if (r>=0){
				if (Math.pow((x-oX),2)+Math.pow((y-oY),2)<=Math.pow(r,2)){
					System.out.println("The point belongs to a circle");
				} else {
					System.out.println("The point does not belong to a circle");
				}
			} else {
				System.out.println("Error radius");
			}
		} else {
			System.out.println("List index out of range");
		}
	}
}