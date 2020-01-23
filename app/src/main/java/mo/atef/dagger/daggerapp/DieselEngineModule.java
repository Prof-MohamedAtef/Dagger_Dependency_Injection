package mo.atef.dagger.daggerapp;

import dagger.Binds;
import dagger.Module;
import mo.atef.dagger.daggerapp.dublicates.Engine;

@Module
public abstract class DieselEngineModule {

    @Binds
    abstract Engine bindEngine(DieselEngine engine);
}
