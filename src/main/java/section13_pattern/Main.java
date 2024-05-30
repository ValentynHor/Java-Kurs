package section13_pattern;

import section13_pattern.adapter.PrinterAdapter;
import section13_pattern.facade.CarFacade;
import section13_pattern.observer.Listener;
import section13_pattern.observer.Listener1;
import section13_pattern.observer.Listener2;
import section13_pattern.observer.Publisher;
import section13_pattern.state.FireState;
import section13_pattern.state.TransformerContext;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        TestSingleton.getInstance().print();
        TestSingleton.getInstance().print();
        TestSingleton.getInstance().print();
        */

        /*{
            System.out.println("ADAPTER");
            List<String> list = new ArrayList<>();

            list.add("AAAA");
            list.add("BBBB");
            list.add("CCCC");

            PrinterAdapter adapter = new PrinterAdapter();
            adapter.print(list);
        }*/

       /* {
            System.out.println("FACADE");
            CarFacade car = new CarFacade();
            car.go();
        }*/

       /* {
            Listener listener1 = new Listener1();
            Listener listener2 = new Listener2();
            Publisher publisher = new Publisher();
            publisher.addListener(listener1);
            publisher.addListener(listener2);
            publisher.createMessage("Hallo");
        }*/

        {
            TransformerContext context = new TransformerContext();
            context.setState(new FireState());
            context.action();
        }


    }
}
