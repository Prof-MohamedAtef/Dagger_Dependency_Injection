package mo.atef.dagger.daggerapp;

import dagger.Component;

@Component
public interface CarComponent {
    Car getCar();

    void inject(MainActivity mainActivity);
}
