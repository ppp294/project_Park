package day15;
//RemoteControl 인터페이스를 구현한 RVRemotecontrol 구현 클래스
public class TvRemotecontrol implements RemoteControl{

	private boolean power;
	private int channel;
	private int volumn;
	private int MAX_CHANNEL;
	@Override
	public void poworOn() {   power = true;   }
	@Override
	public void poworOFF() { power = false;   }
 
	public void channelup() {
		if(!power) {
			return;
		}
		channel++;
		if(channel > MAX_CHANNEL) {
			channel = 1;
		}
	}
	public void channelDown() {
		channel--;
		if(channel < 1) {
			
		}
	}
	public void setchannel(int channel) {
		this.channel = MAX_CHANNEL;
		if(channel < 1 || channel > channel) {
			
		}
	}
}
