package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import javafx.scene.control.Label;

import javafx.event.EventHandler;
import sample.edu.missouriwestern.cmcbane1.csc254.monsters.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class Main extends Application {
    public static int clickCount;
    public static Label message = new Label("Starting");
    public static Button playRound = new Button("Start Round");
    public static Button reset = new Button("Reset");
    public static Label playerA = new Label("Player A");
    public static Label playerB = new Label("Player B");
    public static Button humanA = new Button("Human");
    public static Button warriorA = new Button("Warrior");
    public static Button ninjaA = new Button("Ninja");
    public static Button batA = new Button("Bat");
    public static Button polarBearA = new Button("Polar Bear");
    public static Button horseA = new Button("Horse");
    public static Button roseA = new Button("Rose");
    public static Button sunflowerA = new Button("Sunflower");
    public static Button flyTrapA = new Button("Fly Trap");
    public static Button humanB = new Button("Human");
    public static Button warriorB = new Button("Warrior");
    public static Button ninjaB = new Button("Ninja");
    public static Button batB = new Button("Bat");
    public static Button polarBearB = new Button("Polar Bear");
    public static Button horseB = new Button("Horse");
    public static Button roseB = new Button("Rose");
    public static Button sunflowerB = new Button("Sunflower");
    public static Button flyTrapB = new Button("Fly Trap");
    public static TextField playerABox = new TextField("");
    public static TextField playerBBox = new TextField("");
    public static TextArea playByPlayBox = new TextArea("");
    public static Entity a = null;
    public static Entity b = null;

    @Override
    public void start(Stage primaryStage) throws Exception{
        GridPane root = new GridPane();
        root.setHgap(5.0);
        root.setVgap(5.0);
        root.add(message,1,0, 5, 1);
        message.setText("Select your players");
        root.add(playerA, 1, 1);
        root.add(humanA, 1, 2);
        root.add(warriorA, 1, 3);
        root.add(ninjaA, 1, 4);
        root.add(batA, 1, 5);
        root.add(polarBearA, 1, 6);
        root.add(horseA, 1, 7);
        root.add(roseA, 1, 8);
        root.add(sunflowerA, 1, 9);
        root.add(flyTrapA, 1, 10);
        root.add(playerB, 3,1);
        root.add(humanB, 3, 2);
        root.add(warriorB, 3, 3);
        root.add(ninjaB, 3, 4);
        root.add(batB, 3, 5);
        root.add(polarBearB, 3, 6);
        root.add(horseB, 3, 7);
        root.add(roseB, 3, 8);
        root.add(sunflowerB, 3, 9);
        root.add(flyTrapB, 3, 10);
        root.add(new Label(""),1,2);
        root.add(new Label(""), 1, 11);
        root.add(new Label("Player A"), 1, 12);
        root.add(playerABox, 2, 12, 3, 1);
        root.add(new Label(""), 1, 13);
        root.add(new Label("Player B"), 1, 14);
        root.add(playerBBox, 2,14, 3, 1);
        root.add(new Label(""), 1, 15);
        root.add(playByPlayBox, 1, 16, 4, 5);
        root.add(new Label(""), 1, 21);
        root.add(playRound, 1, 22);
        root.add(reset, 3, 22);

        //Adds an event Handler for all buttons

        humanA.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){

            @Override
            public void handle(MouseEvent event) {
                Button source = (Button) event.getSource();
                a = new Human();
                playerABox.setText(a.toString());
            }
        });

        warriorA.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){

            @Override
            public void handle(MouseEvent event) {
                Button source = (Button) event.getSource();
                a = new Warrior();
                playerABox.setText(a.toString());
            }
        });

        ninjaA.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){

            @Override
            public void handle(MouseEvent event) {
                Button source = (Button) event.getSource();
                a = new Ninja();
                playerABox.setText(a.toString());
            }
        });

        batA.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){

            @Override
            public void handle(MouseEvent event) {
                Button source = (Button) event.getSource();
                a = new Bat ();
                playerABox.setText(a.toString());
            }
        });

        polarBearA.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){

            @Override
            public void handle(MouseEvent event) {
                Button source = (Button) event.getSource();
                a = new PolarBear();
                playerABox.setText(a.toString());
            }
        });

        horseA.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){

            @Override
            public void handle(MouseEvent event) {
                Button source = (Button) event.getSource();
                a = new Horse();
                playerABox.setText(a.toString());
            }
        });

        roseA.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){

            @Override
            public void handle(MouseEvent event) {
                Button source = (Button) event.getSource();
                a = new Rose();
                playerABox.setText(a.toString());
            }
        });

        sunflowerA.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){

            @Override
            public void handle(MouseEvent event) {
                Button source = (Button) event.getSource();
                a = new Sunflower();
                playerABox.setText(a.toString());
            }
        });

        flyTrapA.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){

            @Override
            public void handle(MouseEvent event) {
                Button source = (Button) event.getSource();
                a = new FlyTrap();
                playerABox.setText(a.toString());
            }
        });

        humanB.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){

            @Override
            public void handle(MouseEvent event) {
                Button source = (Button) event.getSource();
                b = new Human();
                playerBBox.setText(b.toString());
            }
        });

        warriorB.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){

            @Override
            public void handle(MouseEvent event) {
                Button source = (Button) event.getSource();
                b = new Warrior();
                playerBBox.setText(b.toString());
            }
        });

        ninjaB.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){

            @Override
            public void handle(MouseEvent event) {
                Button source = (Button) event.getSource();
                b = new Ninja();
                playerBBox.setText(b.toString());
            }
        });

        batB.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){

            @Override
            public void handle(MouseEvent event) {
                Button source = (Button) event.getSource();
                b = new Bat();
                playerBBox.setText(b.toString());
            }
        });

        polarBearB.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){

            @Override
            public void handle(MouseEvent event) {
                Button source = (Button) event.getSource();
                b = new PolarBear();
                playerBBox.setText(b.toString());
            }
        });

        horseB.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){

            @Override
            public void handle(MouseEvent event) {
                Button source = (Button) event.getSource();
                b = new Horse();
                playerBBox.setText(b.toString());
            }
        });

        roseB.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){

            @Override
            public void handle(MouseEvent event) {
                Button source = (Button) event.getSource();
                b = new Rose();
                playerBBox.setText(b.toString());
            }
        });

        sunflowerB.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){

            @Override
            public void handle(MouseEvent event) {
                Button source = (Button) event.getSource();
                b = new Sunflower();
                playerBBox.setText(b.toString());
            }
        });

        flyTrapB.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){

            @Override
            public void handle(MouseEvent event) {
                Button source = (Button) event.getSource();
                b = new FlyTrap();
                playerBBox.setText(b.toString());
            }
        });

        playRound.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){

            @Override
            public void handle(MouseEvent event) {
                Button source = (Button) event.getSource();

                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                PrintStream ps = new PrintStream(baos);
                PrintStream old = System.out;
                System.setOut(ps);


                    int round = 1;
                    while(round <= 10 && !a.isDead() && !b.isDead()){
                        System.out.printf("\nRound %2d %s VS %s\n", round, a, b);
                        Attack.round(a,b,round);
                        round++;
                    }
                System.out.flush();
                    playByPlayBox.setText(baos.toString());

                    //Find the winner, if any
                    Entity winner = null;
                    if(a.isDead() && !b.isDead())
                        winner = b;
                    else if(!a.isDead() && b.isDead())
                        winner = a;


                    playByPlayBox.appendText("Postmortem: ");
                    playByPlayBox.appendText(String.format("%s %s\n", a.isDead()?"\uD83D\uDC80":"\uD83D\uDE03", a));
                    playByPlayBox.appendText(String.format("%s %s\n", b.isDead()?"\uD83D\uDC80":"\uD83D\uDE03", b));
                    if(!a.isDead() && !b.isDead()){
                        playByPlayBox.appendText("Both survived!");
                    }else{
                        playByPlayBox.appendText(String.format("%s, is the winner\n", winner));
                    }


                System.setOut(old);
            }
        });

        reset.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){

            @Override
            public void handle(MouseEvent event) {
                Button source = (Button) event.getSource();
                playByPlayBox.setText("");
                playerABox.setText("");
                playerBBox.setText("");
            }
        });


        primaryStage.setTitle("Monster Game");
        primaryStage.setScene(new Scene(root, 550, 700));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }


}