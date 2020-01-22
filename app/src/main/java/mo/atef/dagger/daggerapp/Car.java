package mo.atef.dagger.daggerapp;

public class Car {
    Engine engine;
    Wheels wheels;

    Car(Engine engine, Wheels wheels){
        this.engine=engine;
        this.wheels=wheels;
    }

    void drive(){
        //Vroom...
    }
}
