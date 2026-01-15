
	class Wheels{
	    int wheel;
	    Wheels(int wheel){
	        this.wheel=wheel;
	    }
	    void dispwheels() {
	        System.out.println("wheels: " + wheel + " wheels in a car which helps to move a car.");
	    }
	}
	class Engine{
	    String engine;
	    Engine(String engine){
	        this.engine = engine;
	    }
	    void dispEngine(){
	        System.out.println(engine +" is the version of the car");
	    }
	}
	class Car{
	    String color;
	    String modifications;
	    Wheels wheel;
	    Engine engine;
	    Car(String color, String modifications, int wheel, String engine){
	        this.color=color;
	        this.modifications=modifications;
	        this.wheel = new Wheels(wheel);
	        this.engine = new Engine(engine); 
	    }
	    void dispcar(){
	        System.out.println("car is in " + color + " color very hot and sexy.");
	    }
	    void dispshowcase(){
	        System.out.println("this is the display model we have with "+ modifications+ ".");
	    }
	}


	public class carsclass {
	    public static void main(String[] args) {
	      Wheels wheel = new Wheels(4);
	      Engine engine = new Engine("v.46.00");
	      Car car = new Car("black","company made",4,"v.46.00");
	      car.wheel.dispwheels();
	      car.engine.dispEngine();
	      car.dispcar();
	      car.dispshowcase(); 
	    }
	}