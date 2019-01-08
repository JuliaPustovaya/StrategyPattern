package Клиент_использует_инкапсулированные_алгоритмы;

import Инкапсуляция_fly.FlyNoWay;
import Инкапсуляция_quack.Quack;

/*
Утка-приманка изначально летать не умеет
*/
public class ModelDuck extends Duck {
	public ModelDuck() {
		flyBehaviour = new FlyNoWay();
		quackBehaviour = new Quack();
	}

	public void display() {
		System.out.println("I ama model duck");
	}
}
