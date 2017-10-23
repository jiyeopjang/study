import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import suit.Mark2;
import suit.WarMachine;
import weapons.ExWife;
import weapons.GatlingGun;
import weapons.MachineGun;

public class Process {
	
	static public void main(String[] args){	
		
		System.out.println(" ----- 워머신 기본형 -----");		
		Mark2 warMachine = new WarMachine();
		warMachine.printStat();
		
		System.out.println(" ----- 타입0 -----");		
		Mark2 type0 = new GatlingGun(warMachine);
		type0.printStat();		
		
		System.out.println(" ----- 타입1 -----");
		Mark2 type1 = new MachineGun(warMachine);
		type1.printStat();
		
		System.out.println(" ----- 타입1에 엑스 와이프 추가 -----");
		type1 = new ExWife(type1);
		type1.printStat();
	}

}
