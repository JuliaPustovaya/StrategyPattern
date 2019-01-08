package Клиент_использует_инкапсулированные_алгоритмы;

import Инкапсуляция_fly.FlyBehaviour;
import Инкапсуляция_quack.QuackBehaviour;

public abstract class Duck {
	FlyBehaviour flyBehaviour;
	QuackBehaviour quackBehaviour;

public 	void performQuack() {
		quackBehaviour.quack();
	}

	public	void performFly() {
		flyBehaviour.fly();
	}

	public void swim() {
		System.out.println("All ducks can swim");
	}

	public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}

		public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
		this.quackBehaviour = quackBehaviour;
	}

	public abstract void display();
}
