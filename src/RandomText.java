import java.util.Random;
public class RandomText {
	
	//Very important. Do not expose
	private int index;
	private String[] texts;
	public RandomText(String[] texts){
		this.texts = texts;
	}
	
	public void shuffle(){
		index = new Random().nextInt(texts.length);
	}
	
	public String getCurrentText(){
		return texts[index];
	}
	
//	public int getIndex(){
//		return this.index;
//	}
//	
//	public void setIndex(int index){
//		this.index = index;
//	}
	
	public Memento saveState(){
		return new Memento(index);
	}
	
	public void restore(Memento m){
		this.index = m.index;
	}
	public static class Memento{
		private int index;
		private Memento(int index){
			this.index = index;
		}
	}
}
