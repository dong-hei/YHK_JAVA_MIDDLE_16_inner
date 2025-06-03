package nested.inner.ex2;

//Car에서만 사용
public class Car {
    private String model;
    private int chargeLvl;
    private Engine engine;

    public Car(String model, int chargeLvl) {
        this.model = model;
        this.chargeLvl = chargeLvl;
        this.engine = new Engine();
    }

    public void start(){
        engine.start();
        System.out.println(model + "시작 완료!");
    }

    private class Engine {

        public void start(){
            System.out.println("충전 레벨 확인 : " + chargeLvl);
            System.out.println(model + "의 엔진을 구동합니다.");
        }
    }

}
