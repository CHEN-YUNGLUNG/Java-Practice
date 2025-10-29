package Chapter13;

public class Wand {
    private String name;
    private double power;

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("名前がnullである。処理を中断。");
        }
        if (name.length() <= 1) {
            throw new IllegalArgumentException("名前が短すぎる。処理を中断。");
        }
        if (name.length() >= 8) {
            throw new IllegalArgumentException("名前が長すぎる。処理を中断。");
        }
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPower(double power) {
        this.power = Math.min(Math.max(power, 0.5), 100.0);
    }

    public double getPower() {
        return this.power;
    }
}
