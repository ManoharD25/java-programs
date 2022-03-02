package com.xworkz;

import com.xworkz.classAndObj.IplTeam;
public class IplTeamTester {

	public static void main (String [] args) {
		
	String ipl = IplTeam.teamName;
	
	IplTeam myfav = new IplTeam();
	
		String btngcoach =  myfav.battingCoach;
		System.out.println(btngcoach);
		String doc = myfav.directorOfCricket;
		System.out.println(doc);
		double hb = myfav.highestBid;
		System.out.println(hb);
		String hg = myfav.homeGround;
		System.out.println(hg);
		String scoach = myfav.scoutCoach;
		System.out.println(scoach);
		int nop = myfav.numOfPlayers;
		System.out.println(nop);
		int tf = myfav.teamFound;
		System.out.println(tf );
		int ttlplyr = myfav.totalPlayers;
		System.out.println(ttlplyr);
		myfav.craze();
		myfav.play();
		myfav.popularity();
		myfav.position();
		myfav.stay();
		
	}
	
}
