package mo.atef.dagger.daggerapp;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import mo.atef.dagger.daggerapp.dublicates.Engine;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindEngine(PetrolEngine engine);
}
