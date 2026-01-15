package encaps;

public class Rectangle {
 private int length;
 private int width;
 
 public void setLength(int a) {
	 length = (a >= 0) ? a : 0;
 }
 public void setWidth(int b) {
	 width = (b>=0) ?b:0;
 }
 public int getLength() {
	 return length;
 }
 public int getwidth() {
	 return width;
	
 }
 
 public void rectArea() {
	 System.out.println(length*width);
 }
}
