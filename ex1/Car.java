package nested.inner.ex1;

//Car에서만 사용
public class Car {
    private String model;
    private int chargeLvl;
    private Engine engine;

    public Car(String model, int chargeLvl) {
        this.model = model;
        this.chargeLvl = chargeLvl;
        this.engine = new Engine(this);
    }

    //엔진에서만 사용하는 메소드
    public String getModel() {
        return model;
    }

    //엔진에서만 사용하는 메소드
    public int getChargeLvl() {
        return chargeLvl;
    }

    public void start(){
        engine.start();
        System.out.println(model + "시작 완료!");
    }
}
