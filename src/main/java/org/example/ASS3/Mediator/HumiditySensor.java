
// Сенсор влажности.
public class HumiditySensor implements Sensor {
    private HomeMediator mediator;
    private String data;

    @Override
    public void setMediator(HomeMediator mediator) {
        this.mediator = mediator;
        mediator.registerSensor(this);
    }

    @Override
    public void updateData() {
        // Пример получения данных влажности
        this.data = "60%";
        System.out.println("Сенсор влажности отправляет данные: " + data);
        mediator.setHumidityData(data);
    }

    @Override
    public String getData() {
        return data;
    }
}