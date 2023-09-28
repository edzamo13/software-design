

interface BaseTypeCar {
    showTypeCost(): void
}

class MastodonTypeCar implements BaseTypeCar {
    showTypeCost(): void {
        console.log('Mastodon car cost: 3000,00 MXN');
    }


}

class RhinoTypeCar implements BaseTypeCar {
    showTypeCost(): void {
        console.log('Rhino car cost: 1000,00 MXN');
    }

}

interface CarTypeFactory {
    makeTypeCar(): BaseTypeCar;
}

class MastodonTypeFactory implements CarTypeFactory {
    makeTypeCar(): BaseTypeCar {
        return new MastodonTypeCar();
    }


}
class RhinoTypeFactory implements CarTypeFactory {
    makeTypeCar(): BaseTypeCar {
       return new RhinoTypeCar();
    }
  
}

function appTypeFactory(factory: CarTypeFactory) {
    const car:BaseTypeCar = factory.makeTypeCar();
    car.showTypeCost();
}

type FactoryTypes='mastodon'|'rhino'
function createTypeFactories(type: FactoryTypes) {
    console.log('type', type)
    const typFactories = {
        mastodon: MastodonTypeFactory,
        rhino: RhinoTypeFactory
    }

    const Factory = typFactories[type];
    return new Factory;

}

appTypeFactory(createTypeFactories('mastodon'));
appTypeFactory(createTypeFactories('rhino'));