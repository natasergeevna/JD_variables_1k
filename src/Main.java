public class Main {
    public static void main(String[] args) {
        //task 1.1
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();

        //task 2.1
        System.out.println(dog + 4);
        System.out.println(cat + 4);
        System.out.println(paper + 4);
        System.out.println();

        //task 3.1
        System.out.println(dog - 3.5);
        System.out.println(cat - 1.6);
        System.out.println(paper - 7639);
        System.out.println();

        //task 4.1
        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);
        System.out.println();

        //task 5.1
        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);
        System.out.println();

        //task 6.1,7.1
        var weightFirst = 78.2;
        var weightSecond = 82.7;
        System.out.println("Общий вес бойцов = " + (weightSecond + weightFirst));
        System.out.println("Разница в весе(делением) = " + weightSecond % weightFirst);
        System.out.println("Разница в весе(вычитанием) = " + (weightSecond - weightFirst) + "\n");

        //task 8.1
        var hours = 640;
        var hoursPeople = 8;
        var allPeoples = hours / hoursPeople;
        System.out.println("Всего в работников в компании - " + allPeoples + " человек");
        allPeoples += 94;
        System.out.println("Если в компании работает " + allPeoples + " человек, то всего " + allPeoples * hoursPeople + " часов работы может быть поделено между сотрудниками" + "\n");

        //task 1.2
        byte a = 5;
        short b = 200;
        int c = 100000;
        long d = 5000000L;
        float e = 3.2f;
        double f = 3.1456345;
        System.out.println("Значение переменной a с типом byte равно " + a);
        System.out.println("Значение переменной b с типом short равно " + b);
        System.out.println("Значение переменной c с типом int равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f + "\n");

        //task 2.2
        boolean q = false;
        long w = 987_678_965_549L;
        float r = 27.12f;
        double t = 2.768;
        short y = 569;
        short u = -159;
        int i = 27897;
        double o = 67.;

        //task 3.2
        int peopleAP = 23;
        int peopleAS = 27;
        int peopleEA = 30;
        int allPaper = 480;
        int onePaper = allPaper / (peopleAP + peopleAS + peopleEA);
        System.out.println("На каждого учиника рассчитано " + onePaper + " листов бумаги" + "\n");

        //task 4.2
        int botle = 16;
        int min = 2;
        int botleMin = botle / min;
        System.out.println("За 20 минут машина произвела " + botleMin * 20 + " штук бутылок");
        System.out.println("За 20 минут машина произвела " + botleMin * 24 * 60 + " штук бутылок");
        System.out.println("За 20 минут машина произвела " + botleMin * 3 * 24 * 60 + " штук бутылок");
        System.out.println("За 20 минут машина произвела " + botleMin * 31 * 24 * 60 + " штук бутылок" + "\n");

        //task 5.2
        int allBank = 120;
        int white = 2;
        int brown = 4;
        int oneClass = allBank / (white + brown);
        System.out.println("В школе, где " + oneClass + " классов, нужно " + oneClass * white + " банок белой красски и " + oneClass * brown + " банок коричневой красски" + "\n");

        //task 6.2
        int banana = 5;
        int bananaWeight = 80;
        int milk = 200;
        int milkWeight = 105;
        int iceCream = 2;
        int iceCreamWeight = 100;
        int egg = 4;
        int eggWeight = 70;
        int breakfast = banana * bananaWeight + milk * milkWeight + iceCream * iceCreamWeight + egg * eggWeight;
        System.out.println("Вес завтрака " + (double) breakfast / 1000 + "\n");

        //task 7.2
        int kg = 7;
        int grMin = 250;
        int grMax = 500;
        int gramm = 1000;
        int dayMax = kg * gramm / grMin;
        int dayMin = kg * gramm / grMax;
        System.out.println(dayMax + " " + dayMin + "\n");

        //task 8.2
        int procent = 10;
        int masha = 67_760;
        int denis = 83_960;
        int kristina = 76_230;
        int masha1 = masha + masha * procent / 100;
        int denis1 = denis + denis * procent / 100;
        int kristina1 = kristina + kristina * procent / 100;
        System.out.println("Маша теперь получает " + masha1 + " рублей. Годовой доход вырос на " + (masha1 - masha) + " рублей");
        System.out.println("Денис теперь получает " + denis1 + " рублей. Годовой доход вырос на " + (denis1 - denis) + " рублей");
        System.out.println("Кристина теперь получает " + kristina1 + " рублей. Годовой доход вырос на " + (kristina1 - kristina) + " рублей");

    }
}