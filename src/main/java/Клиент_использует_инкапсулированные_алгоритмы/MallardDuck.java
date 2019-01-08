package Клиент_использует_инкапсулированные_алгоритмы;

import Инкапсуляция_fly.FlyWithWings;
import Инкапсуляция_quack.Quack;

public class MallardDuck extends Duck {
	public MallardDuck() {
		quackBehaviour = new Quack();
		flyBehaviour = new FlyWithWings();
	}

	public void display() {
		System.out.println("I am real Mallard duck");
	}
}
