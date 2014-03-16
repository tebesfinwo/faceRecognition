/**
 * 
 */
package faceRecognition;

import java.util.Scanner;

/**
 * @author tebesfinwo
 *
 */
public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
//		File file = new File("data/all40.txt");
//		
//		if(file.exists()){
//			if(file.delete()){
//				file = new File("data/all40.txt");
//			}
//		}
//		
//		try {
//			PrintWriter writer = new PrintWriter(file);
//			
//			for(int i = 1; i <= 40; i++){
//				for(int j = 1; j <= 10; j++){
//					writer.println(i+" person"+i+" Cambridge_FaceDB/s"+i+"/"+j+".pgm");
//				}
//			}
//			
//			writer.close();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
		
		boolean con = false;
		
	    final FaceRecognition faceRecognition = new FaceRecognition();
	    
	    //Make the machine to learn all the images
	    faceRecognition.learn("data/all10.txt");
	    
	    /**
	     * 
	     * to check whether the machine recognizes the images in upper6.txt based on  all10.txt
	     * Result : the machine will recognize all the images.
	     * 
	     * */
	    faceRecognition.recognizeFileList("data/upper6.txt");
	    
	    System.out.println("Do you want to continue ? ( 1 : yes ; 0 : no )");
	    @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
	    int n = scanner.nextInt();
	    con = (n == 1) ? true : false;
	    
	    if(con){
		    /**
		     * 
		     * Note : mix with a stranger's images
		     * Result : able to detect the stranger  
		     * 
		     * */
		    faceRecognition.recognizeFileList("data/lower3.txt");	
	    }
				
	}

}
