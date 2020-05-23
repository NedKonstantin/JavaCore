package com.knedovesov.lesson_1;

public class Main {

    public static void main(String[] args) {
    	Members human = new Human("Вася", 500, 5);
    	Members cat = new Cat("Барсик", 150, 11);
    	Members bot = new Bot("Вертер", 1000, 25);

    	Barrier track_1 = new Track();
    	Barrier wall_1 = new Wall();
    	Barrier track_2 = new Track();
    	Barrier wall_2 = new Wall();

    	Members[] members = {human, cat, bot};
    	Barrier[] barriers = {track_1, wall_1, track_2, wall_2};

    	for (Members m: members) {
    		for (Barrier b: barriers){
				if(!m.getCheckWin()) break;
    			if(b.checkOvercome(m)) {
					System.out.println(m.getName() + " прошел препятствие!");
				} else {
					System.out.println(m.getName() + " выбыл из соревнований");
					m.checkWin(b.checkOvercome(m));
    			}
			}
		}
	}

}
