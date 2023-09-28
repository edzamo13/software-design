class Singleton {

    static instance = undefined;

    constructor(version) {
        this.version= version
    }

    static getInstance(version) {
        if (! Singleton.instance) {
            Singleton.instance = new Singleton(version);
        }
        return Singleton.instance;
    }


}

function appSingleton() {
    
    const singleton1= Singleton.getInstance('version01')
    const singleton2= Singleton.getInstance('version02')
    console.log(singleton1);
    console.log(singleton2);
    console.log(singleton1=== singleton2);
}

appSingleton();

