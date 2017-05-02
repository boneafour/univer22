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
public class TxtLecture11 extends Activity implements View.OnClickListener {

    private TextView txtTitle, textView;
    private ImageButton btnBack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_txt_lecture);

        txtTitle = (TextView) findViewById(R.id.txtTitle);
        txtTitle.setText("Д.Ж. саяси картасы");

        textView = (TextView) findViewById(R.id.textView);
        textView.setText("Дүние жүзінің саяси картасында  елдің  әлемдегі  орнын,  саяси-әкімшілік құрылымы бейнеленеді. Сонымен қатар, саяси картада басты  саяси-географиялық өзгерістер:  жаңа  тәуелсіз  мемлекеттердің  пайда  болуы,  елдердің   саяси статусының ауысуы,  шекаралары  мен  аумағының,  ел  атауы  мен  астанасының өзгеруі және т.б. көрініс табады. Дүние жүзінің  саяси  картасы  мен  ондағы заңдылықтарды,  өзгерістерді  географияның  саяси  география  деп   аталатын тармағы зерттейді. Мазмұны жағынан бір қарағанда қарапайым болып  көрінетін  саяси  картада әдетте мемлекеттер  мен  олардың  шекаралары,  әкімшілік-аумақтық  жіктелуі, астанасы мен ірі қалалары бейнеленеді. Мұның негізінде дүние жүзі  елдерінің мемлекеттік  құрылымы  мен  басқару   үлгілерінің   таралу   заңдылықтарына, мемлекеттер  арасындағы  өзара  қарым-қатынастарға,  сондай  ақ  мемлекеттік шекараларды анықтау мен халықтың қоныстануына  байланысты  болатын  аумақтық жанжалдарға (қақтығыстар) қатысты күрделі  мәселелер  жатыр.  Дүние  жүзінің саяси  картасы  тарихи  кезеңдерде  ұдайы  өзгеріске  түсуде.  Оған  әртүрлі факторлар ықпал етеді. Дүние жүзінің қазіргі  заманғы  саяси  картасының  қалыптасуына  қатысты  оқиғаларды шартты түрде Жаңа (XVІІ  ғасырдан  Бірінші  дүниежүзілік  соғысқа дейін) және Ең жаңа  кезең  (Бірінші  дүниежүзілік  соғыстан  бүгінгі  күнге дейін) деп аталатын екі дәуірге топтастырады. Еуропалықтардың  отарлау  әрекеттері   XV   ғасырда   португалдардың Солтүстік  Африкадағы  аса  маңызды   сауда   және   көлік   қатынасы  орталықтары болып  табылатын  Сеута  және  Мелилья  қалаларын  жаулап алуынан басталды. ХІХ ғасырдың аяғы мен ХХ ғасырдың  басында  дүние  жүзіндегі  жетекші метрополиялар арасында  ықпал  ету  аймақтары  үшін  күрес  шиеленісе түсті. Соның нәтижесінде әлемді Бірінші  дүниежүзілік  соғыстың  өрті  шарпыды.  Дүние жүзінің қазіргі заманғы саяси картасының  қалыптасуында  Екінші  дүниежүзілік соғыс қарсаңы мен одан соң болған маңызды өзгерістер, ХХ ғасырдың 50-60-жылдарындағы отарлық жүйенің күйреуі, 80-90-жылдарында социалистік  жүйенің  ыдырауына  байланысты  оқиғалар  айрықша   роль  атқарды. Сонымен, дүние жүзінің саяси картасы мемлекет пен қоғам  дамуы  барысында ұдайы  жүріп  отыратын  түбегейлі  саяси-әлеуметтік  өзгерістерді,  әлемдегі елдердің      орны      мен      ауқымын,      түр-сипатын       бейнелейді. Дүние жүзінің қазіргі саяси картасының объектілері қатарына  мемлекеттік мәртебесі ресімделген және ресімделмеген 267 ел мен аумақтар жатады.  Оларды басты екі топқа: 1) мемлекет  мәртебесі  ресімделген,  халықаралық  деңгейде танылған егемен (тәуелсіз) мемлекеттер; 2)  дербес  басқару  мәртебесіне  ие болмаған (тәуелді) аумақтар  деп  екіге  бөледі.  Олар  бір-бірінен  жерінің ауданы,   халық   саны,   әлеуметтік-экономикалық   даму   деңгейіне   қарай айырмашылық жасайды. Тәуелсіз  мемлекеттер.  Тәуелсіз  елдер  мемлекеттік  құрылымы  мен  басқару формалары  жағынан  әртүрлі  болады.  Дүние  жүзінің  халықаралық   деңгейде танылған тәуелсіз мемлекеттерін  мемлекеттік  құрылымы  бойынша  монархиялар мен республикаларға бөледі.  Монархия жағдайында жоғары өкімет билігі бір  ғана  адамның  (император, король, герцог, князь, сұлтан және  т.б.)  қолында  шоғырланған.  Билік  ету құқығы атадан балаға мұра етіп беріледі.  Дүние  жүзінде  қазіргі  кезде  30 монархия бар. Олардың барлығы дерлік Ескі Дүниеде (Азияда – 14,  Еуропада  – 12, Африкада – 3), тек біреуі  ғана  Мұхит  Аралдарында  (Тонга  Корольдігі) орналасқан.  Дүние жүзіндегі елдердің басым көпшілігі  мемлекетті  басқару  формасына қарай республика (латынша “res  publіca”  –  қоғамдық  іс)  болып  табылады. Республикалық   басқару   формасы   Еуропадағы   буржуазиялық    төңкерістер нәтижесінде енгізілген болатын. Федерациялы  мемлекет  жағдайында   оның   құрамына   енетін   федерация мүшелерінің белгілі бір  саяси,  экономикалық  дербестігі  болады.  Бірыңғай (федералдық) заңдарымен және басқару  органдарымен,  ортақ  әскермен  қатар, федерация мүшелерінде мемлекеттік биліктің  барлық  белгілері  (ту,  әнұран,конституция,  парламент,  атқарушы  билік  жүйесі)  бар.   Дүние   жүзіндегі федерациялар саны 20-дан асады.");

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
