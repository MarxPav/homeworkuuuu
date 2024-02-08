public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog + 4 - 3.5);
        var cat = 3.6;
        System.out.println(cat + 4 - 1.6);
        var paper = 763789;
        System.out.println(paper + 4 - 7639);
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        var boxerOne = 78.2;
        var boxerTwo = 82.7;
        var boxersWeight = boxerOne + boxerTwo;
        System.out.println("Общий вес боксёров " + boxersWeight);
        var weightDif = (boxerTwo - boxerOne);
        System.out.println("разница в массе бойцов " + weightDif);
        var remainderDivisions = boxerTwo % boxerOne;
        System.out.println(remainderDivisions);
        var workTime = 640;
        var oneWorkerTime = 8;
        var quantityWorkers = workTime / oneWorkerTime;
        System.out.println("Всего работников в компании - " + quantityWorkers + " человек");
        var otherCompanyWorkers = quantityWorkers + 94;
        var otherWorkTime = otherCompanyWorkers * 8;
        System.out.println("Если в компании работает " + otherCompanyWorkers + " человек то всего " + otherWorkTime + " часов работы может быть поделено между сотрудниками");
    }
}