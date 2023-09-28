

class SingletonTS {

    private static instance: SingletonTS;
    private version:string;

    constructor(version:string) {
        this.version= version
    }
    static getInstance(version:string) {
        if (!this.instance) {
            SingletonTS.instance = new SingletonTS(version);

        }
        return SingletonTS.instance;
    }

}

function appSingletonTS() {
    const singletonTs1= SingletonTS.getInstance('versiona');
    const singletonTs2= SingletonTS.getInstance('versionb');
    console.log('singletonTs1',singletonTs1);
    console.log('singletonTs2',singletonTs2);

    
}

appSingletonTS();