package TugasPertuamuan3.Settings;

public class Wait {

	public static void hardWait(int second) {
		try {
			Thread.sleep(1000 * second);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
