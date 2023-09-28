class Product {
    private _id: number;
    private _name: string;
    private _cost: number;

    constructor(id : number, name : string, cost : number) {
        this._id = id;
        this._name = name;
        this._cost = cost;
    }

    get id(): number {
        return this._id;
    }
    get name(): string {
        return this._name;
    }

    get cost(): number {
        return this._cost;
    }
}


class ShoppingCar {

    private static instance: ShoppingCar;
    private products: Product[]= [];

    constructor() {
     
      
    }
 

    public add(product : Product): void {
        this.products.push(product);
    }

    public deleteById(id : number): void {
        const pro = this.products.findIndex((product) => product.id === id);
        this.products.splice(pro, 1);
    }

    public getProducts(): Product[]{
        this.products.map(p=> console.log(p))
        return this.products;
    }

    public static getInstance(): ShoppingCar {
        if (! ShoppingCar.instance) {
            return ShoppingCar.instance = new ShoppingCar();
        }
        return ShoppingCar.instance;

    }
}

function clienteApp() {
    console.log('ssss')
    const shoppin1 = ShoppingCar.getInstance();

    const pro: Product = new Product(1, 'book', 4);
    const pro2: Product = new Product(3, 'pencil', 4);

    shoppin1.add(pro);
    shoppin1.add(pro2);

    console.log('shoppin1.getProducts' + shoppin1.deleteById(1));

    console.log('shoppin1.getProducts' + shoppin1.getProducts());
}

clienteApp();
