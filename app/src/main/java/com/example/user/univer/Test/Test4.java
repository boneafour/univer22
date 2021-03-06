package com.example.user.univer.Test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.user.univer.DatabaseHandler;
import com.example.user.univer.MarkData;
import com.example.user.univer.R;

import java.util.List;

/**
 * Created by user on 14.06.2016.
 */
public class Test4 extends Activity implements View.OnClickListener {

    private TextView txtTitle, question, testNumber;
    private ImageButton btnBack;
    private Button  txtTest1, txtTest2, txtTest3, txtTest4, txtTest5;
    private int count = 0, correct = 0;
    private String incorrect = "";

    String sName, sPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1);

        txtTitle = (TextView) findViewById(R.id.txtTitle);
        txtTitle.setText(getString(R.string.report));


        Intent intent3 = getIntent();
        sName = intent3.getStringExtra("sName");

        question = (TextView) findViewById(R.id.question);

        testNumber = (TextView) findViewById(R.id.testNumber);
        testNumber.setText("1/10");

        btnBack = (ImageButton) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(this);

        txtTest1 = (Button) findViewById(R.id.varA);
        txtTest1.setOnClickListener(this);
        txtTest2 = (Button) findViewById(R.id.varB);
        txtTest2.setOnClickListener(this);
        txtTest3 = (Button) findViewById(R.id.varC);
        txtTest3.setOnClickListener(this);
        txtTest4 = (Button) findViewById(R.id.varD);
        txtTest4.setOnClickListener(this);
        txtTest5 = (Button) findViewById(R.id.varE);
        txtTest5.setOnClickListener(this);
        question.setText("Алғашқы халық санақтары б.з.д ІІІ мың жылд қай елдерде жүргізілген?");
        txtTest1.setText("А) Австрия – Венгрия");
        txtTest2.setText("В) Скандинавия, АҚШ");
        txtTest3.setText("С) Үндістан, Ресей");
        txtTest4.setText("Д) Латын Америкасы елдері");
        txtTest5.setText("Е) Ежелгі Қытай, Египетте");
        testNumber.setText("1/10");




    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnBack:
                NavUtils.navigateUpFromSameTask(this);
                break;
            case R.id.varA:
                if(count==0){
                    question.setText("Алғашқы халық санақтары б.з.д ІІІ мың жылд қай елдерде жүргізілген?");
                    txtTest1.setText("А) Австрия – Венгрия");
                    txtTest2.setText("В) Скандинавия, АҚШ");
                    txtTest3.setText("С) Үндістан, Ресей");
                    txtTest4.setText("Д) Латын Америкасы елдері");
                    txtTest5.setText("Е) Ежелгі Қытай, Египетте");
                    testNumber.setText("1/10");
                }
                else if(count==1){
                    question.setText("Қазақстан тәуелсіздігін алғаннан кейінгі халық санағы қай жылы өткізілді?");
                    txtTest1.setText("А) 1999 ж");
                    txtTest2.setText("В) 2000 ж");
                    txtTest3.setText("С) 2006 ж");
                    txtTest4.setText("Д) 2009 ж");
                    txtTest5.setText("Е) 2011 ж");
                    testNumber.setText("2/10");
                }
                else if(count==2){
                    question.setText("Халық санының күрт өсу үдерісі қалай аталады?");
                    txtTest1.setText("А) антропология");
                    txtTest2.setText("В) демографиялық жарылыс");
                    txtTest3.setText("С) абсолюттік демографиялық көрсеткіш");
                    txtTest4.setText("Д) табиғи өсу");
                    txtTest5.setText("Е) механикалық өсу");
                    testNumber.setText("3/10");
                }
                else if(count==3){
                    question.setText("ҚР-да адамның өмір жасының орташа ұзақтығы қанша?");
                    txtTest1.setText("А) 68 жас");
                    txtTest2.setText("В) 72 жас");
                    txtTest3.setText("С) 46 жас");
                    txtTest4.setText("Д) 61 жас");
                    txtTest5.setText("Е) 67 жас");
                    testNumber.setText("4/10");
                }
                else if(count==4){
                    question.setText("1984-1985 ж-да болған құрғақшылық нәтижесінде қай елде миллиондаған адам қайтыс болды");
                    txtTest1.setText("А) Кувейтте");
                    txtTest2.setText("В) Эфиопияда");
                    txtTest3.setText("С) Қытай");
                    txtTest4.setText("Д) Африка");
                    txtTest5.setText("Е) Жапонияда");
                    testNumber.setText("5/10");
                }
                else if(count==5){
                    question.setText("Дүниежүзінің қанша елінде мұсылман мешіттері мен қауымдастықтары бар?");
                    txtTest1.setText("А) 126");
                    txtTest2.setText("В) 90");
                    txtTest3.setText("С) 120");
                    txtTest4.setText("Д) 160");
                    txtTest5.setText("Е) 130");
                    testNumber.setText("6/10");
                }
                else if(count==6){
                    question.setText("Халықтың жастық-жыныстық құрамын сызба түрінде бейнелеу үшінне пайдаланылады?");
                    txtTest1.setText("А) халықтың жалпы санындағы үлес көрсеткіші");
                    txtTest2.setText("В) жастық – жыныстық пирамида");
                    txtTest3.setText("С) адамның өмір жасының ұзақтығы");
                    txtTest4.setText("Д) абсолюттік көрсеткіштері");
                    txtTest5.setText("Е) табиғи өсу коэффициенті");
                    testNumber.setText("7/10");
                }
                else if(count==7){
                    question.setText("Қазіргі кезде қай елдерде метистер көп шоғырланған?");
                    txtTest1.setText("А) Баризилия, Куба");
                    txtTest2.setText("В) Үндістан, Африка ");
                    txtTest3.setText("С) АҚШ, Аустарилия");
                    txtTest4.setText("Д) Мексика, Венесуэла");
                    txtTest5.setText("Е) Канада, Аргентина");
                    testNumber.setText("8/10");
                }
                else if(count==8){
                    question.setText("Бір ұлтты елдер қатарына қай елдер жатады?");
                    txtTest1.setText("А) Үндістан, Нигерия");
                    txtTest2.setText("В) Швеция, Жапония");
                    txtTest3.setText("С) Ресей, АҚШ");
                    txtTest4.setText("Д) Франция, Ұлыбритания");
                    txtTest5.setText("Е) Бразилия, Мексика");
                    testNumber.setText("9/10");
                }
                else if(count==9){
                    question.setText("Оқшау тілдер қатарына жататындар:");
                    txtTest1.setText("А) Жапон, корей");
                    txtTest2.setText("В) қытай, тибет");
                    txtTest3.setText("С) орыс, араб");
                    txtTest4.setText("Д) ағылшын, француз");
                    txtTest5.setText("Е) испан, өзбек");
                    testNumber.setText("10/10");
                }
                else if(count==10){
                    question.setText("Бақылау қортындысы бойынша:");
                    txtTest1.setText("Дұрыс жауап "+correct);
                    txtTest2.setText("Дұрыс емес"+incorrect);
                    txtTest3.setText("");
                    txtTest4.setText("");
                    txtTest5.setText("");
                    testNumber.setText("");
                    String correct1 = "" + correct;
                    String name = "Лекция 4";
                    String nameStudent = sName;

                    DatabaseHandler db = new DatabaseHandler(this);
                    db.addMark(new MarkData(name, nameStudent, correct1));
                    List<MarkData> markDatas = db.getAllMarks();
                }
                if(count==0){
                    incorrect = (incorrect+" 1");
                    count++;
                }
                else if(count==1){
                    correct++;
                    count++;
                }
                else if(count==2){
                    incorrect = (incorrect+" 3");
                    count++;
                }
                else if(count==3){
                    incorrect = (incorrect+" 4");
                    count++;
                }
                else if(count==4){
                    incorrect = (incorrect+" 5");
                    count++;
                }
                else if(count==5){
                    incorrect = (incorrect+" 6");
                    count++;
                }
                else if(count==6){
                    incorrect = (incorrect+" 7");
                    count++;
                }
                else if(count==7){
                    incorrect = (incorrect+" 8");
                    count++;
                }
                else if(count==8){
                    incorrect = (incorrect+" 9");
                    count++;
                }
                else if(count==9){
                    correct++;
                    count++;
                }
                break;
            case R.id.varB:
                if(count==0){
                    question.setText("Алғашқы халық санақтары б.з.д ІІІ мың жылд қай елдерде жүргізілген?");
                    txtTest1.setText("А) Австрия – Венгрия");
                    txtTest2.setText("В) Скандинавия, АҚШ");
                    txtTest3.setText("С) Үндістан, Ресей");
                    txtTest4.setText("Д) Латын Америкасы елдері");
                    txtTest5.setText("Е) Ежелгі Қытай, Египетте");
                    testNumber.setText("1/10");
                }
                else if(count==1){
                    question.setText("Қазақстан тәуелсіздігін алғаннан кейінгі халық санағы қай жылы өткізілді?");
                    txtTest1.setText("А) 1999 ж");
                    txtTest2.setText("В) 2000 ж");
                    txtTest3.setText("С) 2006 ж");
                    txtTest4.setText("Д) 2009 ж");
                    txtTest5.setText("Е) 2011 ж");
                    testNumber.setText("2/10");
                }
                else if(count==2){
                    question.setText("Халық санының күрт өсу үдерісі қалай аталады?");
                    txtTest1.setText("А) антропология");
                    txtTest2.setText("В) демографиялық жарылыс");
                    txtTest3.setText("С) абсолюттік демографиялық көрсеткіш");
                    txtTest4.setText("Д) табиғи өсу");
                    txtTest5.setText("Е) механикалық өсу");
                    testNumber.setText("3/10");
                }
                else if(count==3){
                    question.setText("ҚР-да адамның өмір жасының орташа ұзақтығы қанша?");
                    txtTest1.setText("А) 68 жас");
                    txtTest2.setText("В) 72 жас");
                    txtTest3.setText("С) 46 жас");
                    txtTest4.setText("Д) 61 жас");
                    txtTest5.setText("Е) 67 жас");
                    testNumber.setText("4/10");
                }
                else if(count==4){
                    question.setText("1984-1985 ж-да болған құрғақшылық нәтижесінде қай елде миллиондаған адам қайтыс болды");
                    txtTest1.setText("А) Кувейтте");
                    txtTest2.setText("В) Эфиопияда");
                    txtTest3.setText("С) Қытай");
                    txtTest4.setText("Д) Африка");
                    txtTest5.setText("Е) Жапонияда");
                    testNumber.setText("5/10");
                }
                else if(count==5){
                    question.setText("Дүниежүзінің қанша елінде мұсылман мешіттері мен қауымдастықтары бар?");
                    txtTest1.setText("А) 126");
                    txtTest2.setText("В) 90");
                    txtTest3.setText("С) 120");
                    txtTest4.setText("Д) 160");
                    txtTest5.setText("Е) 130");
                    testNumber.setText("6/10");
                }
                else if(count==6){
                    question.setText("Халықтың жастық-жыныстық құрамын сызба түрінде бейнелеу үшінне пайдаланылады?");
                    txtTest1.setText("А) халықтың жалпы санындағы үлес көрсеткіші");
                    txtTest2.setText("В) жастық – жыныстық пирамида");
                    txtTest3.setText("С) адамның өмір жасының ұзақтығы");
                    txtTest4.setText("Д) абсолюттік көрсеткіштері");
                    txtTest5.setText("Е) табиғи өсу коэффициенті");
                    testNumber.setText("7/10");
                }
                else if(count==7){
                    question.setText("Қазіргі кезде қай елдерде метистер көп шоғырланған?");
                    txtTest1.setText("А) Баризилия, Куба");
                    txtTest2.setText("В) Үндістан, Африка ");
                    txtTest3.setText("С) АҚШ, Аустарилия");
                    txtTest4.setText("Д) Мексика, Венесуэла");
                    txtTest5.setText("Е) Канада, Аргентина");
                    testNumber.setText("8/10");
                }
                else if(count==8){
                    question.setText("Бір ұлтты елдер қатарына қай елдер жатады?");
                    txtTest1.setText("А) Үндістан, Нигерия");
                    txtTest2.setText("В) Швеция, Жапония");
                    txtTest3.setText("С) Ресей, АҚШ");
                    txtTest4.setText("Д) Франция, Ұлыбритания");
                    txtTest5.setText("Е) Бразилия, Мексика");
                    testNumber.setText("9/10");
                }
                else if(count==9){
                    question.setText("Оқшау тілдер қатарына жататындар:");
                    txtTest1.setText("А) Жапон, корей");
                    txtTest2.setText("В) қытай, тибет");
                    txtTest3.setText("С) орыс, араб");
                    txtTest4.setText("Д) ағылшын, француз");
                    txtTest5.setText("Е) испан, өзбек");
                    testNumber.setText("10/10");
                }
                else if(count==10){
                    question.setText("Бақылау қортындысы бойынша:");
                    txtTest1.setText("Дұрыс жауап "+correct);
                    txtTest2.setText("Дұрыс емес"+incorrect);
                    txtTest3.setText("");
                    txtTest4.setText("");
                    txtTest5.setText("");
                    testNumber.setText("");
                    String correct1 = "" + correct;
                    String name = "Лекция 4";
                    String nameStudent = sName;

                    DatabaseHandler db = new DatabaseHandler(this);
                    db.addMark(new MarkData(name, nameStudent, correct1));
                    List<MarkData> markDatas = db.getAllMarks();
                }
                if(count==0){
                    incorrect = (incorrect+" 1");
                    count++;
                }
                else if(count==1){
                    incorrect = (incorrect+" 2");
                    count++;
                }
                else if(count==2){
                    correct++;
                    count++;
                }
                else if(count==3){
                    incorrect = (incorrect+" 4");
                    count++;
                }
                else if(count==4){
                    correct++;
                    count++;
                }
                else if(count==5){
                    incorrect = (incorrect+" 6");
                    count++;
                }
                else if(count==6){
                    correct++;
                    count++;
                }
                else if(count==7){
                    incorrect = (incorrect+" 8");
                    count++;
                }
                else if(count==8){
                    correct++;
                    count++;
                }
                else if(count==9){
                    incorrect = (incorrect+" 10");
                    count++;
                }
                break;
            case R.id.varC:
                if(count==0){
                    question.setText("Алғашқы халық санақтары б.з.д ІІІ мың жылд қай елдерде жүргізілген?");
                    txtTest1.setText("А) Австрия – Венгрия");
                    txtTest2.setText("В) Скандинавия, АҚШ");
                    txtTest3.setText("С) Үндістан, Ресей");
                    txtTest4.setText("Д) Латын Америкасы елдері");
                    txtTest5.setText("Е) Ежелгі Қытай, Египетте");
                    testNumber.setText("1/10");
                }
                else if(count==1){
                    question.setText("Қазақстан тәуелсіздігін алғаннан кейінгі халық санағы қай жылы өткізілді?");
                    txtTest1.setText("А) 1999 ж");
                    txtTest2.setText("В) 2000 ж");
                    txtTest3.setText("С) 2006 ж");
                    txtTest4.setText("Д) 2009 ж");
                    txtTest5.setText("Е) 2011 ж");
                    testNumber.setText("2/10");
                }
                else if(count==2){
                    question.setText("Халық санының күрт өсу үдерісі қалай аталады?");
                    txtTest1.setText("А) антропология");
                    txtTest2.setText("В) демографиялық жарылыс");
                    txtTest3.setText("С) абсолюттік демографиялық көрсеткіш");
                    txtTest4.setText("Д) табиғи өсу");
                    txtTest5.setText("Е) механикалық өсу");
                    testNumber.setText("3/10");
                }
                else if(count==3){
                    question.setText("ҚР-да адамның өмір жасының орташа ұзақтығы қанша?");
                    txtTest1.setText("А) 68 жас");
                    txtTest2.setText("В) 72 жас");
                    txtTest3.setText("С) 46 жас");
                    txtTest4.setText("Д) 61 жас");
                    txtTest5.setText("Е) 67 жас");
                    testNumber.setText("4/10");
                }
                else if(count==4){
                    question.setText("1984-1985 ж-да болған құрғақшылық нәтижесінде қай елде миллиондаған адам қайтыс болды");
                    txtTest1.setText("А) Кувейтте");
                    txtTest2.setText("В) Эфиопияда");
                    txtTest3.setText("С) Қытай");
                    txtTest4.setText("Д) Африка");
                    txtTest5.setText("Е) Жапонияда");
                    testNumber.setText("5/10");
                }
                else if(count==5){
                    question.setText("Дүниежүзінің қанша елінде мұсылман мешіттері мен қауымдастықтары бар?");
                    txtTest1.setText("А) 126");
                    txtTest2.setText("В) 90");
                    txtTest3.setText("С) 120");
                    txtTest4.setText("Д) 160");
                    txtTest5.setText("Е) 130");
                    testNumber.setText("6/10");
                }
                else if(count==6){
                    question.setText("Халықтың жастық-жыныстық құрамын сызба түрінде бейнелеу үшінне пайдаланылады?");
                    txtTest1.setText("А) халықтың жалпы санындағы үлес көрсеткіші");
                    txtTest2.setText("В) жастық – жыныстық пирамида");
                    txtTest3.setText("С) адамның өмір жасының ұзақтығы");
                    txtTest4.setText("Д) абсолюттік көрсеткіштері");
                    txtTest5.setText("Е) табиғи өсу коэффициенті");
                    testNumber.setText("7/10");
                }
                else if(count==7){
                    question.setText("Қазіргі кезде қай елдерде метистер көп шоғырланған?");
                    txtTest1.setText("А) Баризилия, Куба");
                    txtTest2.setText("В) Үндістан, Африка ");
                    txtTest3.setText("С) АҚШ, Аустарилия");
                    txtTest4.setText("Д) Мексика, Венесуэла");
                    txtTest5.setText("Е) Канада, Аргентина");
                    testNumber.setText("8/10");
                }
                else if(count==8){
                    question.setText("Бір ұлтты елдер қатарына қай елдер жатады?");
                    txtTest1.setText("А) Үндістан, Нигерия");
                    txtTest2.setText("В) Швеция, Жапония");
                    txtTest3.setText("С) Ресей, АҚШ");
                    txtTest4.setText("Д) Франция, Ұлыбритания");
                    txtTest5.setText("Е) Бразилия, Мексика");
                    testNumber.setText("9/10");
                }
                else if(count==9){
                    question.setText("Оқшау тілдер қатарына жататындар:");
                    txtTest1.setText("А) Жапон, корей");
                    txtTest2.setText("В) қытай, тибет");
                    txtTest3.setText("С) орыс, араб");
                    txtTest4.setText("Д) ағылшын, француз");
                    txtTest5.setText("Е) испан, өзбек");
                    testNumber.setText("10/10");
                }
                else if(count==10){
                    question.setText("Бақылау қортындысы бойынша:");
                    txtTest1.setText("Дұрыс жауап "+correct);
                    txtTest2.setText("Дұрыс емес"+incorrect);
                    txtTest3.setText("");
                    txtTest4.setText("");
                    txtTest5.setText("");
                    testNumber.setText("");
                    String correct1 = "" + correct;
                    String name = "Лекция 4";
                    String nameStudent = sName;

                    DatabaseHandler db = new DatabaseHandler(this);
                    db.addMark(new MarkData(name, nameStudent, correct1));
                    List<MarkData> markDatas = db.getAllMarks();
                }
                if(count==0){
                    incorrect = (incorrect+" 1");
                    count++;
                }
                else if(count==1){
                    incorrect = (incorrect+" 2");
                    count++;
                }
                else if(count==2){
                    incorrect = (incorrect+" 3");
                    count++;
                }
                else if(count==3){
                    incorrect = (incorrect+" 4");
                    count++;
                }
                else if(count==4){
                    incorrect = (incorrect+" 5");
                    count++;
                }
                else if(count==5){
                    correct++;
                    count++;
                }
                else if(count==6){
                    incorrect = (incorrect+" 7");
                    count++;
                }
                else if(count==7){
                    incorrect = (incorrect+" 8");
                    count++;
                }
                else if(count==8){
                    incorrect = (incorrect+" 9");
                    count++;
                }
                else if(count==9){
                    incorrect = (incorrect+" 10");
                    count++;
                }
                break;
            case R.id.varD:
                if(count==0){
                    question.setText("Алғашқы халық санақтары б.з.д ІІІ мың жылд қай елдерде жүргізілген?");
                    txtTest1.setText("А) Австрия – Венгрия");
                    txtTest2.setText("В) Скандинавия, АҚШ");
                    txtTest3.setText("С) Үндістан, Ресей");
                    txtTest4.setText("Д) Латын Америкасы елдері");
                    txtTest5.setText("Е) Ежелгі Қытай, Египетте");
                    testNumber.setText("1/10");
                }
                else if(count==1){
                    question.setText("Қазақстан тәуелсіздігін алғаннан кейінгі халық санағы қай жылы өткізілді?");
                    txtTest1.setText("А) 1999 ж");
                    txtTest2.setText("В) 2000 ж");
                    txtTest3.setText("С) 2006 ж");
                    txtTest4.setText("Д) 2009 ж");
                    txtTest5.setText("Е) 2011 ж");
                    testNumber.setText("2/10");
                }
                else if(count==2){
                    question.setText("Халық санының күрт өсу үдерісі қалай аталады?");
                    txtTest1.setText("А) антропология");
                    txtTest2.setText("В) демографиялық жарылыс");
                    txtTest3.setText("С) абсолюттік демографиялық көрсеткіш");
                    txtTest4.setText("Д) табиғи өсу");
                    txtTest5.setText("Е) механикалық өсу");
                    testNumber.setText("3/10");
                }
                else if(count==3){
                    question.setText("ҚР-да адамның өмір жасының орташа ұзақтығы қанша?");
                    txtTest1.setText("А) 68 жас");
                    txtTest2.setText("В) 72 жас");
                    txtTest3.setText("С) 46 жас");
                    txtTest4.setText("Д) 61 жас");
                    txtTest5.setText("Е) 67 жас");
                    testNumber.setText("4/10");
                }
                else if(count==4){
                    question.setText("1984-1985 ж-да болған құрғақшылық нәтижесінде қай елде миллиондаған адам қайтыс болды");
                    txtTest1.setText("А) Кувейтте");
                    txtTest2.setText("В) Эфиопияда");
                    txtTest3.setText("С) Қытай");
                    txtTest4.setText("Д) Африка");
                    txtTest5.setText("Е) Жапонияда");
                    testNumber.setText("5/10");
                }
                else if(count==5){
                    question.setText("Дүниежүзінің қанша елінде мұсылман мешіттері мен қауымдастықтары бар?");
                    txtTest1.setText("А) 126");
                    txtTest2.setText("В) 90");
                    txtTest3.setText("С) 120");
                    txtTest4.setText("Д) 160");
                    txtTest5.setText("Е) 130");
                    testNumber.setText("6/10");
                }
                else if(count==6){
                    question.setText("Халықтың жастық-жыныстық құрамын сызба түрінде бейнелеу үшінне пайдаланылады?");
                    txtTest1.setText("А) халықтың жалпы санындағы үлес көрсеткіші");
                    txtTest2.setText("В) жастық – жыныстық пирамида");
                    txtTest3.setText("С) адамның өмір жасының ұзақтығы");
                    txtTest4.setText("Д) абсолюттік көрсеткіштері");
                    txtTest5.setText("Е) табиғи өсу коэффициенті");
                    testNumber.setText("7/10");
                }
                else if(count==7){
                    question.setText("Қазіргі кезде қай елдерде метистер көп шоғырланған?");
                    txtTest1.setText("А) Баризилия, Куба");
                    txtTest2.setText("В) Үндістан, Африка ");
                    txtTest3.setText("С) АҚШ, Аустарилия");
                    txtTest4.setText("Д) Мексика, Венесуэла");
                    txtTest5.setText("Е) Канада, Аргентина");
                    testNumber.setText("8/10");
                }
                else if(count==8){
                    question.setText("Бір ұлтты елдер қатарына қай елдер жатады?");
                    txtTest1.setText("А) Үндістан, Нигерия");
                    txtTest2.setText("В) Швеция, Жапония");
                    txtTest3.setText("С) Ресей, АҚШ");
                    txtTest4.setText("Д) Франция, Ұлыбритания");
                    txtTest5.setText("Е) Бразилия, Мексика");
                    testNumber.setText("9/10");
                }
                else if(count==9){
                    question.setText("Оқшау тілдер қатарына жататындар:");
                    txtTest1.setText("А) Жапон, корей");
                    txtTest2.setText("В) қытай, тибет");
                    txtTest3.setText("С) орыс, араб");
                    txtTest4.setText("Д) ағылшын, француз");
                    txtTest5.setText("Е) испан, өзбек");
                    testNumber.setText("10/10");
                }
                else if(count==10){
                    question.setText("Бақылау қортындысы бойынша:");
                    txtTest1.setText("Дұрыс жауап "+correct);
                    txtTest2.setText("Дұрыс емес"+incorrect);
                    txtTest3.setText("");
                    txtTest4.setText("");
                    txtTest5.setText("");
                    testNumber.setText("");
                    String correct1 = "" + correct;
                    String name = "Лекция 4";
                    String nameStudent = sName;

                    DatabaseHandler db = new DatabaseHandler(this);
                    db.addMark(new MarkData(name, nameStudent, correct1));
                    List<MarkData> markDatas = db.getAllMarks();
                }
                if(count==0){
                    incorrect = (incorrect+" 1");
                    count++;
                }
                else if(count==1){
                    incorrect = (incorrect+" 2");
                    count++;
                }
                else if(count==2){
                    incorrect = (incorrect+" 3");
                    count++;
                }
                else if(count==3){
                    incorrect = (incorrect+" 4");
                    count++;
                }
                else if(count==4){
                    incorrect = (incorrect+" 5");
                    count++;
                }
                else if(count==5){
                    incorrect = (incorrect+" 6");
                    count++;
                }
                else if(count==6){
                    incorrect = (incorrect+" 7");
                    count++;
                }
                else if(count==7){
                    correct++;
                    count++;
                }
                else if(count==8){
                    incorrect = (incorrect+" 9");
                    count++;
                }
                else if(count==9){
                    incorrect = (incorrect+" 10");
                    count++;
                }
                break;
            case R.id.varE:
                if(count==0){
                    question.setText("Алғашқы халық санақтары б.з.д ІІІ мың жылд қай елдерде жүргізілген?");
                    txtTest1.setText("А) Австрия – Венгрия");
                    txtTest2.setText("В) Скандинавия, АҚШ");
                    txtTest3.setText("С) Үндістан, Ресей");
                    txtTest4.setText("Д) Латын Америкасы елдері");
                    txtTest5.setText("Е) Ежелгі Қытай, Египетте");
                    testNumber.setText("1/10");
                }
                else if(count==1){
                    question.setText("Қазақстан тәуелсіздігін алғаннан кейінгі халық санағы қай жылы өткізілді?");
                    txtTest1.setText("А) 1999 ж");
                    txtTest2.setText("В) 2000 ж");
                    txtTest3.setText("С) 2006 ж");
                    txtTest4.setText("Д) 2009 ж");
                    txtTest5.setText("Е) 2011 ж");
                    testNumber.setText("2/10");
                }
                else if(count==2){
                    question.setText("Халық санының күрт өсу үдерісі қалай аталады?");
                    txtTest1.setText("А) антропология");
                    txtTest2.setText("В) демографиялық жарылыс");
                    txtTest3.setText("С) абсолюттік демографиялық көрсеткіш");
                    txtTest4.setText("Д) табиғи өсу");
                    txtTest5.setText("Е) механикалық өсу");
                    testNumber.setText("3/10");
                }
                else if(count==3){
                    question.setText("ҚР-да адамның өмір жасының орташа ұзақтығы қанша?");
                    txtTest1.setText("А) 68 жас");
                    txtTest2.setText("В) 72 жас");
                    txtTest3.setText("С) 46 жас");
                    txtTest4.setText("Д) 61 жас");
                    txtTest5.setText("Е) 67 жас");
                    testNumber.setText("4/10");
                }
                else if(count==4){
                    question.setText("1984-1985 ж-да болған құрғақшылық нәтижесінде қай елде миллиондаған адам қайтыс болды");
                    txtTest1.setText("А) Кувейтте");
                    txtTest2.setText("В) Эфиопияда");
                    txtTest3.setText("С) Қытай");
                    txtTest4.setText("Д) Африка");
                    txtTest5.setText("Е) Жапонияда");
                    testNumber.setText("5/10");
                }
                else if(count==5){
                    question.setText("Дүниежүзінің қанша елінде мұсылман мешіттері мен қауымдастықтары бар?");
                    txtTest1.setText("А) 126");
                    txtTest2.setText("В) 90");
                    txtTest3.setText("С) 120");
                    txtTest4.setText("Д) 160");
                    txtTest5.setText("Е) 130");
                    testNumber.setText("6/10");
                }
                else if(count==6){
                    question.setText("Халықтың жастық-жыныстық құрамын сызба түрінде бейнелеу үшінне пайдаланылады?");
                    txtTest1.setText("А) халықтың жалпы санындағы үлес көрсеткіші");
                    txtTest2.setText("В) жастық – жыныстық пирамида");
                    txtTest3.setText("С) адамның өмір жасының ұзақтығы");
                    txtTest4.setText("Д) абсолюттік көрсеткіштері");
                    txtTest5.setText("Е) табиғи өсу коэффициенті");
                    testNumber.setText("7/10");
                }
                else if(count==7){
                    question.setText("Қазіргі кезде қай елдерде метистер көп шоғырланған?");
                    txtTest1.setText("А) Баризилия, Куба");
                    txtTest2.setText("В) Үндістан, Африка ");
                    txtTest3.setText("С) АҚШ, Аустарилия");
                    txtTest4.setText("Д) Мексика, Венесуэла");
                    txtTest5.setText("Е) Канада, Аргентина");
                    testNumber.setText("8/10");
                }
                else if(count==8){
                    question.setText("Бір ұлтты елдер қатарына қай елдер жатады?");
                    txtTest1.setText("А) Үндістан, Нигерия");
                    txtTest2.setText("В) Швеция, Жапония");
                    txtTest3.setText("С) Ресей, АҚШ");
                    txtTest4.setText("Д) Франция, Ұлыбритания");
                    txtTest5.setText("Е) Бразилия, Мексика");
                    testNumber.setText("9/10");
                }
                else if(count==9){
                    question.setText("Оқшау тілдер қатарына жататындар:");
                    txtTest1.setText("А) Жапон, корей");
                    txtTest2.setText("В) қытай, тибет");
                    txtTest3.setText("С) орыс, араб");
                    txtTest4.setText("Д) ағылшын, француз");
                    txtTest5.setText("Е) испан, өзбек");
                    testNumber.setText("10/10");
                }
                else if(count==10){
                    question.setText("Бақылау қортындысы бойынша:");
                    txtTest1.setText("Дұрыс жауап "+correct);
                    txtTest2.setText("Дұрыс емес"+incorrect);
                    txtTest3.setText("");
                    txtTest4.setText("");
                    txtTest5.setText("");
                    testNumber.setText("");
                    String correct1 = "" + correct;
                    String name = "Лекция 4";
                    String nameStudent = sName;

                    DatabaseHandler db = new DatabaseHandler(this);
                    db.addMark(new MarkData(name, nameStudent, correct1));
                    List<MarkData> markDatas = db.getAllMarks();
                }
                if(count==0){
                    correct++;
                    count++;
                }
                else if(count==1){
                    incorrect = (incorrect+" 2");
                    count++;
                }
                else if(count==2){
                    incorrect = (incorrect+" 3");
                    count++;
                }
                else if(count==3){
                    correct++;
                    count++;
                }
                else if(count==4){
                    incorrect = (incorrect+" 5");
                    count++;
                }
                else if(count==5){
                    incorrect = (incorrect+" 6");
                    count++;
                }
                else if(count==6){
                    incorrect = (incorrect+" 7");
                    count++;
                }
                else if(count==7){
                    incorrect = (incorrect+" 8");
                    count++;
                }
                else if(count==8){
                    incorrect = (incorrect+" 9");
                    count++;
                }
                else if(count==9){
                    incorrect = (incorrect+" 10");
                    count++;
                }
                break;

        }
    }
}
