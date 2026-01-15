
public class Heart {
	int chambers;
	Heart(int chambers){
		super();
		this.chambers=chambers;
	}
	
	void pump() {
		System.out.println("hearts pumps blood by squeezing " + chambers +" chambers");
	}
}
