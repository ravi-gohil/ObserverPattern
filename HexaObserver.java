import java.util.Observable;

public class HexaObserver extends Observer implements java.util.Observer {
	
	public HexaObserver(Subject subject){
		this.subject = subject;
		this.subject.attach(this);
	}
	@Override
	public void update() {	}
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		System.out.println("Hexa String :" +Integer.toHexString(subject.getState()));
	}

}
