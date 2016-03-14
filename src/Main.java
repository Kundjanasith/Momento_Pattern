
public class Main {
	public static void main(String[] args){
		String[] texts = new String[]{
				"A","B","C","D","E","F","G","H","I"
		};
		RandomText rt = new RandomText(texts);
		
		rt.shuffle();
		System.out.println(rt.getCurrentText());
		
		
		//save
//		int saveState = rt.getIndex();
		RandomText.Memento m = rt.saveState();
		
		rt.shuffle();
		System.out.println(rt.getCurrentText());
		rt.shuffle();
		System.out.println(rt.getCurrentText());
		
		//restore
//		saveState = 10000000; --> IndexOutOfBoound
//		rt.setIndex(saveState);
		rt.restore(m);
		System.out.println("After restored");
		System.out.println(rt.getCurrentText());
	}
	
}
