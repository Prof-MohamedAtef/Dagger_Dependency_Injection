package mo.atef.dagger.daggerapp;

import dagger.Component;

@Component (modules = WheelsModule.class)
public interface CarComponent {
    Car getCar();

    void inject(MainActivity mainActivity);
}
