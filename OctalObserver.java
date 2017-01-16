import java.util.Observable;

public class OctalObserver extends Observer implements java.util.Observer {
	
	public OctalObserver(Subject subject){
		this.subject = subject;
		this.subject.attach(this);
	}
	@Override
	public void update() {}
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		System.out.println("Octal String :" +Integer.toOctalString(subject.getState()));
	}

}
