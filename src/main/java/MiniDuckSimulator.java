import Инкапсуляция_fly.FlyRocketPowed;
import Клиент_использует_инкапсулированные_алгоритмы.Duck;
import Клиент_использует_инкапсулированные_алгоритмы.MallardDuck;
import Клиент_использует_инкапсулированные_алгоритмы.ModelDuck;
import Клиент_использует_инкапсулированные_алгоритмы.ResinDuck;

public class MiniDuckSimulator {
	public static void main(String[] args) {
		Duck mallDuck = new MallardDuck();
		mallDuck.performFly();
		mallDuck.performQuack();
		mallDuck.display();
		Duck resinDuck = new ResinDuck();
		resinDuck.performFly();
		resinDuck.performQuack();
		resinDuck.display();
		Duck modelDuck = new ModelDuck();
		modelDuck.setFlyBehaviour(new FlyRocketPowed());
		modelDuck.performFly();
		modelDuck.display();
	}
}
