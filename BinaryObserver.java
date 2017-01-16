import java.util.Observable;

public class BinaryObserver extends Observer implements java.util.Observer {
	
	public BinaryObserver(Subject subject){
		this.subject = subject;
		this.subject.attach(this);
	}
	@Override
	public void update() {}
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		System.out.println("Binary String :" +Integer.toBinaryString(subject.getState()));
	}

}
