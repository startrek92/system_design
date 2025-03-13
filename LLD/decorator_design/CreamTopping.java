public class CreamTopping extends BaseToppingElement {

    BaseToppingElement baseToppingElement;

    public CreamTopping(BaseToppingElement baseToppingElement) {
        this.baseToppingElement = baseToppingElement;
    }

    public getCost() {
        this.baseToppingElement.getCost() + 10;
    }
}