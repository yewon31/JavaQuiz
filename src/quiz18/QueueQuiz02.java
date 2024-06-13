package quiz18;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class QueueQuiz02 {

	static String[] tiers = {"브론즈", "실버", "골딱이"};
	static Queue<Member> teamB = new LinkedList<>();
	static Queue<Member> teamS = new LinkedList<>();
	static Queue<Member> teamG = new LinkedList<>();
	static int idx = 1;
	
	public static void main(String[] args) {
		/*
		롤 큐 만들기
		 */
		Random random = new Random();

		Queue<Member> memberList = new LinkedList<>();
		for (int i = 0; i < 300; i++) {
			int id = memberList.hashCode(); // ID는 고유한 해시코드값
			String tier = tiers[random.nextInt(tiers.length)];
			memberList.add(new Member(id, tier));
		}
		
		System.out.println("========현재 게임을 신청한 순서=======");
		System.out.println(memberList);
		/*
		 * member큐에는 게임을 신청한 순서대로 값이 담기게 됩니다.
		 * 게임은 동일한 tier를 가지는 5명씩 한팀을 이루게 됩니다.
		 * 예를들어
		 * 실버, 골드, 골드, 골드, 브론즈, 골드, 골드 ... 로 신청되었다면
		 * 골드 5명이 먼저 한팀으로 먼저 소비 되어야 합니다.
		 * 실버, 골드, 골드, 골드, 브론즈, 골드, 골드, 실버, 실버, 브론즈, 실버, 실버 ... 로 신청되었다면
		 * 골드 5명 -> 실버 5명이 소비 되어야 합니다
		 * 랜덤한 member큐 가 주어질 때, 먼저 소비되어야 하는 팀별로 매칭 팀을 출력해주면 됩니다.
		 */
		
		while(memberList.isEmpty() == false) {
			memberCheck(memberList.poll());
		}
		System.out.println("———————————————————————————————————————————————");
		System.out.println("원본큐 : " + memberList);
		System.out.println("브론즈 큐 : " + teamB);
		System.out.println("실버 큐 : " + teamS);
		System.out.println("골드 큐 : " + teamG);
		
	}
	
	static void memberCheck(Member member) {
		String tier = member.getTier();
		if(tier.equals(tiers[0])) addTeamMember(teamB, member); //브론즈
		else if(tier.equals(tiers[1])) addTeamMember(teamS, member); //실버
		else if(tier.equals(tiers[2])) addTeamMember(teamG, member); //골드
	}
	
	static void addTeamMember(Queue<Member> team, Member member) {
		team.offer(member);
		if(team.size()==5) {
			System.out.println("———————————————————————————————————————————————");
			System.out.println((idx++) +"번째 팀 매칭");
			while(team.isEmpty() == false) {
				System.out.println(team.poll());
			}
		}
	}
}
