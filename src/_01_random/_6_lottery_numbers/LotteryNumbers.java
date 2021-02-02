package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
public static void main(String[] args) {
	
	Random ran = new Random();

	int randomNum;
	
	for (int i=0; i<6; i++) {
		randomNum = ran.nextInt(1001);
		System.out.println(randomNum);
	}

}
}