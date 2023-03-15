import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


public class Josephus{

	public static ArrayList<Integer> solve(int passes, int people){
		Integer startingPerson = Integer.valueOf(1);
		ArrayList<Integer> players = new ArrayList<Integer>();
		ArrayList<Integer> answer = new ArrayList<Integer>();

		for(int i = 0; i < people; i++){
			players.add(Integer.valueOf(i + 1));
		}
		int index = players.indexOf(startingPerson);


		while(players.size() > 1){
			int currentSize = players.size();
			// take a turn.
			index = (index + passes) % currentSize;
			if (index == currentSize){
				index = 0;
			} else if (index > currentSize){
				index = index - currentSize;
			}
			answer.add(players.get(index));
			players.remove(index);

		} 
		answer.add(players.get(0));
		return answer;
	}

}