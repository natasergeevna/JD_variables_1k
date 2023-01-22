public class Main {
    public static void main(String[] args) {
        //task 1
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();

        //task 2
        System.out.println(dog + 4);
        System.out.println(cat + 4);
        System.out.println(paper + 4);
        System.out.println();

        //task 3
        System.out.println(dog - 3.5);
        System.out.println(cat - 1.6);
        System.out.println(paper - 7639);
        System.out.println();

        //task 4
        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);
        System.out.println();

        //task 5
        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);
        System.out.println();

        //task 6,7
        var weightFirst = 78.2;
        var weightSecond = 82.7;
        System.out.println("Общий вес бойцов = " + (weightSecond + weightFirst));
        System.out.println("Разница в весе(делением) = " + weightSecond % weightFirst);
        System.out.println("Разница в весе(вычитанием) = " + (weightSecond - weightFirst) + "\n");

        //task 8
        var hours = 640;
        var hoursPeople = 8;
        var allPeoples = hours / hoursPeople;
        System.out.println("Всего в работников в компании - " + allPeoples + " человек");
        allPeoples += 94;
        System.out.println("Если в компании работает " + allPeoples + " человек, то всего " + allPeoples * hoursPeople + " часов работы может быть поделено между сотрудниками");
    }
}