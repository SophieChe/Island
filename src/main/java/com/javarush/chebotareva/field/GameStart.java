package com.javarush.chebotareva.field;
public class GameStart {

    public static void main(String[] args) {

        GameField gameField = new GameField();
        gameField.initialize();
        gameField.showState();
        System.out.println("Заселено");
        gameField.allAnimalAmount();
        System.out.println("________________________");

        for (int i = 0; i < 10; i++) {
            gameField.move();
            gameField.multiply();
            gameField.eat();
            gameField.allAnimalAmount();
            gameField.showState();
            System.out.println("________________________");
        }

        //System.out.println(gameField.log);
    }
}
