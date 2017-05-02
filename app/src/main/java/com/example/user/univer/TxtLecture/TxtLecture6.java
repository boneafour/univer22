package com.example.user.univer.TxtLecture;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.user.univer.R;

/**
 * Created by user on 14.06.2016.
 */
public class TxtLecture6 extends Activity implements View.OnClickListener {

    private TextView txtTitle, textView;
    private ImageButton btnBack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_txt_lecture);

        txtTitle = (TextView) findViewById(R.id.txtTitle);
        txtTitle.setText("Д.Ж. саяси картасы");

        textView = (TextView) findViewById(R.id.textView);
        textView.setText("Азия – ең үлкен дүние бөлігі. Азия 4 тарихи-географиялық аймаққа бөлінеді: Оңтүстік Батыс Азия, Оңтүстік Азия, Оңтүстік шығыс Азия, Орталық және Шығыс Азия. Шетел инвестициясы мен жоғарғы технологиялар есебінен жоғары деңгейде дамып жатқан Корей Республикасы, Сингапур, Малайзия, Тайвань, Сянган (Гонгконг) сияқты елдер тобын  Азияның мұнай экспорттаушы елдеріне Сауд Арабиясы, Кувейт, Катар, Оман, Біріккен Араб Әмірлігі, Иран, Ирак, Бахрейн кіреді. Бұл елдер мұнайдың барланған қоры жөнінен әлемде алдыңғы орындарды алады. Жапония – аралда орын тепкен мемлекет. Жапония төрт ірі, төрт мың ұсақ аралдан тұрады. Жапонияның ірі аралдарына: Хонсю, Сикоку, Кюсю, Хоккайдо аралдары жатады. Жапония мемлекеттік құрылымы жағынан конституциялық монархия. Мемлекет басшысы император, бірақ іс жүзінде мемлекетті премьер-министр басқарады. Жер шарындағы ұлттық діндерге конфуций, индуизм, иудаизм, синтоизм жатады. Жапониядағы ұлттық дін – синтоизм. Синтоизм  Жапондықтарда сакураның гүлдеуі, шай рәсімі, икебана құрастыру сияқты ұлттық дәстүрлер бар. Жапонияда өсірілетін негізгі дәнді дақыл-күріш. Күріштен жылына 12 -14 млн т өнім жинайды. Күріш алқаптары Хонсю аралында орналасқан. Жапония дүниежүзіндегі аса ірі көлемде несие беруші ел болып саналады. Мысал ретінде Жапонияның Қазақстандағы Семей қаласындағы аспалы көпірді салуға, Батыс Қазақстанның автомобиль жолдарын салуға көп көлемде қаржы бөлгенін айтуға болады. Қытай жер көлемі жөнінен Ресей мен Канададан кейінгі үшінші орынды алады. Қытайдың жер көлемі 9,6 млн шаршы шақырым. Қытай елінің жағалауында 5400 арал орналасқан. Қытайдағы ең ірі аралдарға Тайвань мен Хайнань аралдары жатады. Қытайда қара металлургияны өңдеу жақсы дамыған. Қытай болат пен шойын өндіруден дүниежүзі бойынша алдыңғы орындарды алады. Қытайдағы ең ірі қара металлургия комбинаты Аньшань қаласында орналасқан. Қытай дәнді дақылдардан бидай, күріш, жүгері өсіреді. Қытай 2009 жылы 114 млн т бидай жинап, дүниежүзі бойынша алдыңғы орынға шықты. Шай – сергітпе дақылға жатады. Шайдың Отаны – Қытай елі. Қытай шай өндіруден дүниежүзілік біріншілікке ие. Ежелгі тарихи ескерткіштердің молдығы Қытайға туристердің көп келуіне серпін береді. Қытайдың негізгі туристік орталығы Пекин қаласы. Пекинде туристерді Цинь әулетінің храмдары, саябақтары, император сарайлары қызықтырады. Үндістанның ұлттық діні – индуизм. Үндістан халқының 82,5% индуизмді ұстанады. Индуизм дінін ұстанатындардың қасиетті өзені Ганг болып саналады, олар сонымен қатар сиыр малын қасиетті жануар деп есептейді. Үндістанда мемлекеттік тілдер ағылшын мен хинди тілдері. Себебі Үндістан екі ғасыр бойы Ұлыбританияның отары болған. Үндістан дүниежүзі бойынша ірі қараның саны жөнінен дүниежүзінде алдыңғы орынды, ал ет өнімдерін тұтынудан соңғы орынды алады. Әрбір үндістан тұрғынына жылына 2 кг еттен келеді. Олар сиыр малын қасиетті жануар деп есептейтіндіктен, оның етін пайдаланбайды. Үндістанның ірі өнеркәсіп орталығы Дели. Дели қаласы Жаңа және Ескі Дели болып екіге бөлінеді. Жаңа Делиде басты іскерлік орталықтар орналасқан. Троя қазіргі Түркияның аумағында орналасқан. Троя ежелгі грек мәдениеті ошағының бірі болған. Корей Республикасы машина жасау, электроника, кеме жасауға маманданған. Корейдегі кеме жасау орталығы Пусан қаласы. Оңтүстік батыс Азия елдерінің негізгі байлығы – мұнай мен газ. Бұл аймақ мұнайдың қоры жөнінен дүниежүзінде бірінші орын алады. Мұнайдың басты кен орындары Парсы шығанағында орналасқан. Парсы шығанағындағы аралдық мемлекет – Бахрейн. Бахрейннің астанасы –Манама қаласы. Бұл елдің экономикасындағы жетістіктіктер мұнайдан түскен қаржы есебінен болып отыр. Бірақ қазір Бахрейн елі мұнай қорының таусылуына байланысты ОПЕК-ке мүше емес. ");

        btnBack = (ImageButton) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnBack:
                NavUtils.navigateUpFromSameTask(this);
                break;

        }
    }
}
