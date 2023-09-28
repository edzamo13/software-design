

class BaseCar {
    showCost() {
        throw new Error('Method not implemented');
    }
}
// step 2
class MastodonCar extends BaseCar {
    showCost() {
        console.log('Mastodon car cost: 3000,00 MXN');
    }
}

class RhinoCar extends BaseCar {
    showCost() {
        console.log('Rhino car cost: 1000,00 MXN');
    }
}

// step 3

class CarFactory {
    makeCar() {
        throw new Error('Method not implemented');
    }
}

// step 4
class MastodonCarFactory extends CarFactory {

    makeCar() {
        return new MastodonCar();
    }
}
class RhinoCarFactory extends CarFactory {

    makeCar() {
        return new RhinoCar();
    }
}

function appFactory(factory) {

    const car = factory.makeCar();
    car.showCost();
}
function createFactories(type) {
    console.log('type', type)
    const typFactories = {
        mastodon: MastodonCarFactory,
        rhino: RhinoCarFactory
    }

    const Factory = typFactories[type];
    return new Factory;

}


// appFactory(new MastodonCarFactory());
// appFactory(new RhinoCarFactory());

appFactory(createFactories('mastodon'));
appFactory(createFactories('rhino'));
