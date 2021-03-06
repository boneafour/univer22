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
public class TxtLecture9 extends Activity implements View.OnClickListener {

    private TextView txtTitle, textView;
    private ImageButton btnBack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_txt_lecture);

        txtTitle = (TextView) findViewById(R.id.txtTitle);
        txtTitle.setText("Литосфера, жер бедері");

        textView = (TextView) findViewById(R.id.textView);
        textView.setText("Литосфера – Жердің қатты бөлігінің сыртқы қабығы, ол біртіндеп заттектердің беріктілігі азаятын сфераларға өтеді және оның құрамына жер қыртысы мен Жердің беткі мантиясы кіреді. Литосфераның қалыңдығы 5-200 км, оның ішінде жер қыртысы – құрлықта 50-70 км дейін, мұхиттың астында төменгі шегі 5-10 км шамасында.Литосфера (немесе ,басқаша жер) – қоршаған табиғи ортаның ең маңызды бөлігі, ол көлеммен, бетінің пішінімен топырақ жамылғысымен, өсімдіктермен, кен қазбаларымен, сонымен қатар әр түрлі салаларының кеңістікте орналасуымен сипатталады.Табиғи күштер мен адамның іс әрекеті нәтижесінде уақытқа байланысты литосфераның жағдайы өзгеріп отырады.Табиғи күштер (жылу, ылғалдылық, жел, радиация және т.б) және олардың салдарынан орын алатын геологиялық құбылыстар (жанартаудың атқылауы, жердің сілкінуі, судың тасыуы т.б) жеке аймақтарда литосфераның сипаттамасын едәуір өзгертеді. Жер қабатының үстінгі қабатын топырақ дейді.Топырақ – ол аналық жыныстардың, ауар райының, өсімдіктер мен жануарлардың, жергілікті жер бедерінің күрделі өзара әрекеттестігі нәтижесінде қалыптасқан жаратылыстық – тарихи дене. Топырақ – сыртқы орта жағдайлары: жылу, су, ауа, өсімдіктер, жануарлар, микроорганизмдердің біріккен организмдерден қалыптасқан жердің беткі қабаты.Топырақтың ең маңызды қасиетінің бірі оның құнарлығы.Топырақтың құнарлығы дегеніміз – оның өсімдіктерді оларға қажетті қоректік элементтермен, сумен және ауамен қамтамасыз ету қабілеті.Ол топырақ түзілу процессі барысында және адамның топыраққа әсер етуі нәтижесінде қалыптасады.Ол бүкіл адам баласының тіршілігінің көзі болып табылатын аса маңызды байлық, ауылшаруашылық дақылдарының өнімінің,  уылшаруашылық дақылдары өндірісінің негізі. Топырақ – барлық элементтердің акумуляторы:ол оларды өзінде жинақтап,сумен шайылып кетуден сақтайды.Өзінің қалыптасқан зат алмасу қасиеті бар,тұрақты динамикалық жүйе болғандықтан топырақ табиғи факторлар әсеріне қарсы тұра алады.Бірақ топырақ көптегн антропогендік факторлардың ұзақ уақытқа созылатын әсеріне сезімтал келеді. Топырақ – барлық материалдық игіліктердің көзі.ол азық түлік,малға жем,киім үшін талшық,құрылыс материалдврын береді.топырақтың ең маңызды байлық екендігін айта келіп,К.Маркс,еңбек – байлықтың әкесі болса,топырақ – анасы деген. Топырақ еш нәрсеге айырбасчталмайтын табиғи ресурс.Қазіргі таңда,ғылым әлі күнге дейін табиғи топырақтың орнын баса алатын жасанды материал таба алған жоқ.Өсімдіктерді топырақсыз өсірудің кез келген әдісі топырақтың рөлін дәл өз мәнінде орындай алмайды. Топырақтану ғылымының негізін көрнекті орыс ғылымы В.В Докучаев (1846-1903 ж ж) қалады.Ол бірінші рет «топырақ» және «топырақ құрылымы» ұғымдарының анықтамасын берді, топырақ түзілу процесінің мәнін ашты және басты ерекше қасиеттерін тапты. В.В Докучаев топырақ түзілу процесінің бес факторға байланысты екенін анықтады.Оларға бастапқы жыныстар, ауа райы, жер бедері және уақыт, өсімдіктер мен жануарлар жатады.Кейін ғылыми зерттеулердің нәтижесіне байланысты бұларға су (топырақ суы, жер асты суы) және адамның шаруашылық әрекеті қосылады. Топырақтағы заттектердің миграциясы мен трансформациясына байланысты топырақ құрлымы бірнеше қабаттарға немесе горизонттарға дараланады.Қабаттардың ара қатысы мен байлығы топырақ түріне байланысты.Ең жоғарғы органикалық заттектердің шіруінен пайда болған өнімінен тұратын қабат ең негізгі құнарлығы жоғары горизонт болып саналады.Оны гумусты немесе қара шірінді деп атайды, құрылымы қиыршықты – түйірлі болады.Гумус немесе қара шірік жиынтығы деп крахмал, целлюлоза, белок қосылыстарын ыдырататын микроорганизмдер әсерінен пайда болған өсімдіктекті мен жануар текті қалдықтарды айтады.Топырақ құнарлығы негізінде осы өсімдік текті және жануар текті қалдықтардың биохимиялық ыдырауынан түзілген қара қоңыр гумусқа байланысты.Қарашірінді негізінде гумминнен,гумминқышқылынан және фульвоқышқылынан,сонымен қатар белоктардан,көмірсуларынан,майлардан,шайырлардан және т.б. тұрады. ");

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
