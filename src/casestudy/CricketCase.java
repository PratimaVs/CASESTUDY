package casestudy;

class cricketCal{
	
	int score;
	cricketCal()
	{
		score = 0;
	}
	
	void calSix(int num)
	{
		score+=(6*num);
	}
	
	void calFour(int num)
	{
		score+=(4*num);
	}
	
	void calSingle(int num)
	{
		score += (1*num);
	}
	
	void totalScore()
	{
		System.out.println("the score is "+score);
	}
}
public class CricketCase {

	public static void main(String[] args) {
	
		cricketCal score = new cricketCal();
		score.calFour(3);
		score.totalScore();
		
		score.calSingle(2);
		score.totalScore();
		
		score.calSix(3);
		score.totalScore();
		

	}

}
