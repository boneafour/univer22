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
public class TxtLecture10 extends Activity implements View.OnClickListener {

    private TextView txtTitle, textView;
    private ImageButton btnBack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_txt_lecture);

        txtTitle = (TextView) findViewById(R.id.txtTitle);
        txtTitle.setText("Атмосфера және климат");

        textView = (TextView) findViewById(R.id.textView);
        textView.setText("Атмосфера – Жердің ауа қабаты. 100 км биіктікке дейін ауа құрамы 78% азот, 21% оттегі, 1% басқа газдарынан тұрады. Тропосфера – атмосфераның Жер бетіндегі тіршілік үшін ең маңызды қабаты, себебі мұнда ауаның 4/5 шоғырланған. Тропосфераны \"ауа райы жасалатын орын\" деп те атайды. Бұл қабатта жаңбыр, қар, күн күркіреу, жел соғу сияқты күн райы құбылыстары өтеді. Тропосфера – атмосфераның ең төменгі қабаты, тропосфераның қалыңдығы шамамен 17 шақырым. Тропосфераның қалыңдығы экватор үстінде 15-17 км, полюстер үстінде 9 км, қоңыржай ендіктерде 10-12 шақырымды құрайды. Биіктеген сайын ауаның қасиеттерінің, атап айтқанда температура, ылғал, тығыздығының өзгеруіне байланысты тропосфера, стратосфера, мезосфера, термосфера, экзосфера сияқты қабаттарға жіктеледі. Қысым дегеніміз – ауаның жер бетіне түсірген салмағы. Атмосфералық қысымды металдан жасалған барометр анероидпен өлшейді (\"барос\" грекше салмақ). Атмосфералық қысым биіктеген сайын өзгереді, яғни төмендейді, себебі салмақ түсіретін ауа қабатының қалыңдығы да кеми береді. 100 км биіктікке көтерілгенде, атмосфералық қысым жер бетіндегімен салыстырғанда миллион есе азаяды. Әрбір 10 м биіктікке көтерілген сайын қысым 1 мм төмендейді. Жер шарында географиялық ендіктерге байланысты 3 төменгі, 4 жоғары қысымды белдеу ажыратылады. Жоғарғы қысымды белдеулерде ауаның төмен бағытталған қозғалысы басым болып, антициклондық күн райы қалыптасады. Антициклондық күн райы кезінде күн ашық, құрғақ, қыс күндері қатты аяздар болады. Жоғары қысымды белдеуге екі жарты шардағы тропиктік белдеу мен полярлық белдеулер жатады. Атмосфераның төменгі қабаты болып саналатын тропосфераның белгілі бір жердегі бір күндік жай күйі күн райы деп аталады. Күн райының элементтері ретінде ауа қысымы, температура, ылғалдылық саналады. Ауа температуралық көрсеткішке, ылғалдану дәрежесіне, мөлдірлігіне, қалыптасу ауданына сәйкес біртектес ауа ағынына, яғни ауа массаларына жіктеледі. Қалыптасу орнына байланысты экватордан полюстерге дейінгі аралықта әрбір жарты шар үшін ауа массаларының 4 түрі ажыратылады: экваторлық, тропиктік, қоңыржай, арктикалық немесе антарктикалық. Күн райын зерттеу адамның күнделікті тұрмысы мен шаруашылық әрекеті үшін қажет. Әр адам күнделікті күн райын алдын ала білгісі келеді. Сонымен қатар алдын ала күн райын білмей ұшақтар ұшырылмайды, алысқа жүзетін теңіз кемелері сапарға жіберілмейді. Сондықтан күн райын болжаудың маңызы өте зор. Күн райын болжайтын Жер шарында 10 мыңнан астам станса бар, ал ол стансаларда жұмыс істейтін адамдарды метеорологтар деп атайды. Жер бетіндегі ауаның горизонталь бағытта бір жерден екінші жерге ауысуын жел деп атайды. Желдің бағытын көрсететін құрал желбағар деп аталады. Жел жылдамдығын Бофорт деп аталатын шкаламен анықтайды. Желдің бағытын желбағдар деп аталатын құралмен анықтайды. Онда желдің бағытын жағалай еркін айналып тұратын айыр қанат жебе көрсетеді. Бриз – француз тілінен аударғанда \"жеңіл жел\" деген мағына береді. Бриз теңіздер мен үлкен көлдердің маңында байқалады. Бриз су айдындары мен құрлық арасындағы тәулік ішіндегі температура мен қысым айырмашылықтарынан пайда болады. Бриз желі тәулігіне бағытын екі рет өзгертеді. Күндіз жел теңізден құрлыққа (күндізгі бриз), түнде құрлықтан теңізге (түнгі бриз) соғады. Муссон желі маусымдық желге жатады. Муссон арабша маусым деген мағына береді. Жылына бағытын екі рет өзгертеді. Қыста құрлықтан теңізге, жазда теңізден құрлыққа қарай соғады. Муссондар Тынық мұхит жағалауында жиі байқалады. Пассаттар – атмосфералық қысым жоғары болатын тропиктік ендіктерден қысымы төмен экваторға қарай соғатын тұрақты жел. Оның орташа жылдамдығы 5-8м /с. Жел – сарқылмайтын қуат көзі. Оны \"көгілдір отын\" деп босқа атамаған. Ғалымдар жел жыл сайын бүкіл дүниежүзінде жағылатын көмірден үш есе артық энергия беретінін есептеп шығарған. Климат грекше еңкіш деген сөз. Ежелгі гректер кез келген жердің климаты түгелдей Күн сәулелерінің түсу бұрышының еңкіштігіне байланысты деп есептеген. Күн сәулесінің тік немесе еңкіш түсуі географиялық ендікке байланысты. Жер шарындағы негізгі климат қалыптастырушы географиялық ендік, күн сәулесінің көкжиектен биіктігі, ауа массаларының қозғалысы, мұхиттар мен ағыстардың жақындығы, жердің төсеніш беті, яғни жер бедері жатады. Белгілі орыс климат зерттеушісі Б.П. Алисов Жер шарын 13 климаттық белдеуге бөлген. Ғалым Жер шарын 7 негізгі, 6 өтпелі климаттық белдеуге жіктеген. Ғалым жасаған бұл климаттық аудандастыру бүгінгі күнге дейін ғылыми маңызын жойған жоқ.");

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
