import java.util.*;

public class Main {
    public static void main(String[] args) {
        CarExample carExample = new CarExample("Porsche", 280);
        CarExample carExample2 = new CarExample("VW", 180);
        CarExample carExample3 = new CarExample("Mercedes", 220);
        CarExample carExample4 = new CarExample("Volvo", 200);
        List<CarExample> carList = new ArrayList<>();
        carList.add(carExample);
        carList.add(carExample2);
        carList.add(carExample3);
        carList.add(carExample4);
        System.out.println(carList);

        Map<CarExample, Integer> mapCars = new LinkedHashMap<>();

        for (CarExample example : carList) {
            if (mapCars.containsKey(example)){
                int value = mapCars.get(example);
                mapCars.put(example, ++value);
            } else {
                mapCars.put(example, 1);
            }
        }
        System.out.println(mapCars);

        for (Map.Entry<CarExample, Integer> entry : mapCars.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }



    }
}