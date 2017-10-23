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
		
		System.out.println(" ----- ���ӽ� �⺻�� -----");		
		Mark2 warMachine = new WarMachine();
		warMachine.printStat();
		
		System.out.println(" ----- Ÿ��0 -----");		
		Mark2 type0 = new GatlingGun(warMachine);
		type0.printStat();		
		
		System.out.println(" ----- Ÿ��1 -----");
		Mark2 type1 = new MachineGun(warMachine);
		type1.printStat();
		
		System.out.println(" ----- Ÿ��1�� ���� ������ �߰� -----");
		type1 = new ExWife(type1);
		type1.printStat();
	}

}
