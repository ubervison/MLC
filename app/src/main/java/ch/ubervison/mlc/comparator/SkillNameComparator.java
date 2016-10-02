package ch.ubervison.mlc.comparator;

import ch.ubervison.mlc.model.Skill;

import java.util.Comparator;

public class SkillNameComparator implements Comparator<Skill> {

	@Override
	public int compare(Skill lhs, Skill rhs) {
		if(lhs.id > rhs.id){
			return 1;
		}
		else if(lhs.id < rhs.id){
			return -1;
		}
		else{
			return 0;
		}
	}

}
