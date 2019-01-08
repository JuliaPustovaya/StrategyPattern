package Клиент_использует_инкапсулированные_алгоритмы;

import Инкапсуляция_fly.FlyNoWay;
import Инкапсуляция_quack.Squeak;

public class ResinDuck extends Duck {
	public ResinDuck() {
		flyBehaviour = new FlyNoWay();
		quackBehaviour = new Squeak();
	}

	public void display() {
		System.out.println("Я резиновая утка");
	}
}
