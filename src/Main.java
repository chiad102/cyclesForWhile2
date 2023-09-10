public class Main {
    public static void main(String[] args) {
        int deposit = 15000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            total = total + deposit;
            i++;
            System.out.println("Месяц " + i + ", сумма накоплений " + total);
        }


        int x = 1;
        int y = 10;
        while (x <= 10) {
            System.out.print(x + " ");
            x++;
        }
        System.out.println();
        for (; y > 0; ) {
            System.out.print(y + " ");
            y--;
        }


        int Y = 12_000_000;
        int natalityPerYear = (Y / 1000) * 17;
        int mortalityPerYear = (Y / 1000) * 8;
        for (int year = 0; year <= 10; year++) {
            System.out.println("Год " + year + " численность населения составляет " + (Y + natalityPerYear - mortalityPerYear));
        }


        int depo = 15_000;
        int totalMoney = 0;
        for (int m = 1; totalMoney <= 12_000_000; m++) {
            totalMoney = totalMoney + totalMoney / 100 * 7 + depo;
            System.out.println("Месяц " + m + " сумма накоплений " + totalMoney);
        }


        int depoPerMonth = 15_000;
        int sum = 0;
        for (int month = 1; sum <= 12_000_000; month++) {
            sum = sum + sum / 100 * 7 + depoPerMonth;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма накоплений " + sum);
            }
        }


        int depositVasya = 15_000;
        int investingTime = 9 * 12; // 9 лет по 12 месяцев
        int allMoney = 0;
        for (int months = 1; months <= investingTime; months++) {
            allMoney = allMoney + allMoney / 100 * 7 + depositVasya;
            if (months % 6 == 0) {
                System.out.println("Месяц " + months + " сумма накоплений " + allMoney);
            }
        }


        int reportDay = 5;
        int allDaysInMonth = 31;
        do {
            System.out.println("Сегодня пятница, " + reportDay + "-е число. Необходимо подготовить отчет");
            reportDay = reportDay + 7;
        }
        while (reportDay <= allDaysInMonth);


        int cometYear = 79;
        int currentYear = 2023;
        int previousYears = currentYear - 200;
        int nextYears = currentYear + 100;
        for (int t = 0; t <= nextYears; t = t + cometYear) {
            if (t >= previousYears) {
                System.out.println(t);
            }
        }
    }
}