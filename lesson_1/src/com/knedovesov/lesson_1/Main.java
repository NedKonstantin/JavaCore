package com.knedovesov.lesson_1;

public class Main {

    public static void main(String[] args) {
	Human human = new Human("Вася");
	Cat cat = new Cat("Барсик");
	Bot bot = new Bot("Андроид");
	RunTrack runTrack = new RunTrack();
	Wall wall = new Wall();

	Object[] arrayTeam = {human, cat, bot};
	Object[] arrayHurdle = {runTrack, wall};

	System.out.println("Дистанция для бега " + runTrack.getLength());
	System.out.println("Высота для прыжка " + wall.getHeight());

		for (int i = 0; i < arrayTeam.length; i++) {
			for (int j = 0; j < arrayHurdle.length; j++) {
				if (arrayHurdle[j] instanceof RunTrack){
					if (arrayTeam[i] instanceof Human) {
						if (((Human) arrayTeam[i]).run((RunTrack) arrayHurdle[j])) {
							System.out.println(((Human) arrayTeam[i]).TYPE + " преодолен дистанцию");
						} else {
							System.out.println(((Human) arrayTeam[i]).TYPE + " сошел с дистанции");
							break;
						}
					} else if (arrayTeam[i] instanceof Cat) {
						if (((Cat) arrayTeam[i]).run((RunTrack) arrayHurdle[j])) {
							System.out.println(((Cat) arrayTeam[i]).TYPE + " преодолел дистанцию");
						} else {
							System.out.println(((Cat) arrayTeam[i]).TYPE + " сошел с дистанции");
							break;
						}
					} else if (arrayTeam[i] instanceof Bot) {
						if (((Bot) arrayTeam[i]).run((RunTrack) arrayHurdle[j])) {
							System.out.println(((Bot) arrayTeam[i]).TYPE + " преодолел дистанцию");
						} else {
							System.out.println(((Bot) arrayTeam[i]).TYPE + " сошел с дистанции");
							break;
						}
						}
					}
				 if (arrayHurdle[j] instanceof Wall) {
					if (arrayTeam[i] instanceof Human) {
						if (((Human) arrayTeam[i]).jump((Wall) arrayHurdle[j])) {
							System.out.println(((Human) arrayTeam[i]).TYPE + " прыгнул");
						} else {
							System.out.println(((Human) arrayTeam[i]).TYPE + " сошел с дистанции");
							break;
						}
					} else if (arrayTeam[i] instanceof Cat) {
						if (((Cat) arrayTeam[i]).jump((Wall) arrayHurdle[j])) {
							System.out.println(((Cat) arrayTeam[i]).TYPE + " прыгнул");
						} else {
							System.out.println(((Cat) arrayTeam[i]).TYPE + " сошел с дистанции");
							break;
						}
					} else if (arrayTeam[i] instanceof Bot) {
						if (((Bot) arrayTeam[i]).jump((Wall) arrayHurdle[j])) {
							System.out.println(((Bot) arrayTeam[i]).TYPE + " прыгнул");
						} else {
							System.out.println(((Bot) arrayTeam[i]).TYPE + " сошел с дистанции");
							break;}
					}
				}
				}

			}
		}
}
