public class Main {
    public static void main(String[] args) {
        //Присвоил переменной "dog" значение 8.0
        var dog = 8.0;
        System.out.println(dog);

        //Присвоил переменной "cat" значение 3.6
        var cat = 3.6;
        System.out.println(cat);

        //Присвоил переменной "paper" значение 763789
        var paper = 763789;
        System.out.println(paper);

        //Увеличил значение каждой перечисленной в прошлой задаче переменной на 4
        var result = dog * 4;
        System.out.println(result);
        var result1 = cat * 4;
        System.out.println(result1);
        var result2 = paper * 4;
        System.out.println(result2);

        //Уменьшил значение каждой перечисленной в прошлой задаче переменной
        //dog на 3.5, cat на 1.6, paper на 7639
        var result3 = dog - 3.5;
        System.out.println(result3);
        var result4 = cat - 1.6;
        System.out.println(result4);
        var result5 = paper - 7639;
        System.out.println(result5);

        //Инициализирую переменную friend значением 19.
        //Увеличиваю значение переменной на 2, после чего делю значение на 7.
        var friend = 19;
        System.out.println(friend);
        var result6 = friend + 2;
        System.out.println(result6);
        var result7 = result6 / 7;
        System.out.println(result7);

        //Инициализируйте переменную frog значением 3.5.
        //Увеличьте переменную в 10 раз и поделите на 3.5.
        // Добавьте к последнему значению переменной 4.
        var frog = 3.5;
        System.out.println(frog);
        var result8 = frog * 10;
        System.out.println(result8);
        var result9 = result8 / 3.5;
        System.out.println(result9);
        var result10 = result9 + 4;
        System.out.println(result10);

        //Масса одного боксера — 78.2 кг. Масса второго боксера — 82.7 кг.
        //Считаю общую массу и разницу между двумя боксерами
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var boxer1Boxer2 = boxer1 + boxer2;
        System.out.println("Общая масса бойцов " + boxer1Boxer2 + " кг ");
        var result11 = boxer2 - boxer1;
        System.out.println( "Разница между бойцами " + result11 + " кг " );

        //Вычислите разницу масс спортсменов
        var difference = boxer2 - boxer1;
        System.out.println("Разница между бойцами " + difference + " кг " );
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var difference1 = weightBoxer2  % weightBoxer1 ;
        System.out.println("Разница между бойцами " + difference1 + " кг " );


        var allHours = 640;
        var workHours = 8;
        var staff = allHours / workHours;
        System.out.println("Всего в компании " + staff + " человек" );

        var moreStaff = staff + 94;
        var lessHours = 640 / moreStaff;
        System.out.println("Если в компании работает " + moreStaff + " человек, то между сотрудниками можно поделить " + lessHours + " часа(ов)" ) ;

    }

}