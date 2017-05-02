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
public class TxtLecture55 extends Activity implements View.OnClickListener {

    private TextView txtTitle, textView;
    private ImageButton btnBack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_txt_lecture);

        txtTitle = (TextView) findViewById(R.id.txtTitle);
        txtTitle.setText("Материалдық және рухани игіліктер");

        textView = (TextView) findViewById(R.id.textView);
        textView.setText("Қазіргі заманғы дүние жүзінде әрбір елдің ілгерілеуі ол материалдық және рухани игіліктердің халықаралық айырбасына қатынаспайынша мүмкін емес. Бүгінде ең дамыған елдердің бірде – біреуі де заманға лайық өнімдердің бәрін бірдей түгел ойдағыдай өндіре алмайды. Ұлттық оқшауланушылық заманы, мемлекеттердің шаруашылық тұрғысынан тұйықталушылығы келмеске кетті. Халықаралық қарым – қатынастарда осы уақытқа дейін суу мен жылыну кезеңдерінің алма – кезек ауысуларына қарамастанғ халықаралық экономикалық байланыстардың үнемі ұлғая түскені әлдеқалай емес. Бұл орайда мұндай байланыстар сол нақты бір елдер үшін экономикалық тұрғыдан тиімді болып қана қоймады, сонымен қатар Жер шарында бейбітшіліктің нығаюына жәрдемдесті. Сыртқы экономикалық байланыстардың дамуы үшін ақшалардың қолданымдылығы өте маңызды. Қолданымдылық дегеніміз отандық валютаны шетелдік валютаға және керісінше тиянақты курс бойынша айырбас курсының өзгеруі арқылы валюта құнының көтерілуі ревальвация деп, ал құнының төмендеуі девальвация деп аталады. Халықаралық экономикалық байланыстардың көптеген түрлері бар. Бұлардың бірі сонау ежелгі заманда, капитализмнің орнауынан көп уақыт бұрын пайда болған сыртқы сауда. Алайда ол ежелгі замандарда өндіріс заттық сипатта болды да, мемлекеттің сыртқы саудасының көлемі мардымсыз болды, тек үстем таптардың көбіне жеке бастарының тұтынуына қызмет етті. Сыртқы сауданың өркендегені капитализм дәуірінде ғана, әсіресе ірі машиналы өнеркәсіп кезеңінде. Бүгінде де сыртқы сауда мемлекеттер арасындағы экономикалық байланыстардың бұрынғысынша жетекші түрлерінің бірі болып отыр. Капитал шығару да өте маңызды бір түр қалпында қалып келеді. Оның мәнісі мынада: капитал оның иесі тұратын елден пайда түсіру үшін, ондай –ақ саяси мақсат көзделіп басқа елге ауыстырылады. Отаршылдық дәуірде метрополияелдер капиталының ең басты қолданылу өрісі отарлар болды. Ұлыбританияның шетелге салған капиталының басым бөлігі қазір де бұрынғы Британия империясының иеліктерінде тұр. Алайда капитал кемел дамыған елдерге де белсенді түрде шығарылады. Мысалы, АҚШ – тың капитал шығаруының негізгі өрісі Латын Америкасы ғана емес сонымен қатар Канада, батыс Еуропа және т.б. болған күйінде қалып отыр. ҒТР жағдайында халықаралық эканомикалық байланыстардың бір түрі  ғылыми-техникалық ынтымақ болып келеді; ол ең жаңа техникалық жетістіктердің енгізілуіне, табиғи ресурстардың ұтымды пайдаланылуына және т.б. жағдай жасайды . Бұл орайда ғылыми –техникалық ақпарат (патенттер мен лицензиялар) саудасы ерекше орын алады. Соңғы жылдары бірқатар мемлекеттердің эканомикалық байланыстарының маңызды бір түрі компенсациялық мәлімелер деп аталатындар болып отыр. Бұл орайда шетелдік фирмалар қайсыбір елге несие береді, осы несие есебіне бір ірі шаруашылық обьектісі салынады. Ал обьект пайдалануға берілгеннен кейін бұл ел несиені дайын өнім беріп қайтарады. Халықаралық экономикалық байланыстардың басқа да маңызды- маңызды түрлерінің қатарында несие –қаржы қарым – қатынастары, әр алуан қызмет көрсету, халықаралық туризм бар. Мысалы, көптеген елдерде (Испания, Грекия, Мексика және т.б.) туризмді қызмет түрлерімен қамтамасыз ету халықаралық маманданудың маңызды бір саласына айналды. Жыл сайын туристік сапарларға Жер шары халқының үштен бірі қатысады. Дүниежүзілік экспорттың жалпы көлемінің 6 пайызы туризмнің үлесіне келеді. Жаңа ғасырдың басында ол дүние жүзінде жетекші экспорттық салаға айналады деген пікір бар. Дүние жүзінің көптеген елдері үшін сыртқы сауда – сыртқы экономикалық байланыстардың негізгі түрі. Оның көлемі әдетте сыртқы сауда айналымымен, яғни сол елдің құндық формадағы экспорты мен импортының қосындысымен анықталады. Бұл көрсеткіш елдің халықаралық еңбек бөлінісіне қаншалық қатысып отырғанын көрсетеді. Елдің сыртқы сауданы реттеп отырудың негізгі екі құралын: кедендік тарифтер мен мөлшерлік шектеулерді қолданады. Кедендік тарифтер импорттық және экспорттық болады. Бірінші жағдайда мемлекет әкелінетін белгілі бір тауарға кедендік салық салып, оны қымбаттатады, демек бәсекеге қабілеттілігін кемітеді, мұның өзі отандық өнеркәсіптің жағдайын қолдауға көмектеседі. Екінші жағдайда отандық өнім қымбаттатылады, осы арқылы оның елден сыртқа тиімсіз шығарылуы тежеледі. Мөлшерлік шектеулер жекелеген тауарлардың әкелінуіне не сыртқа шығарылуына толық тыйым салу болып шығатыны жиі болады. Дүниежүзілік шаруашылық шеңберінде халықаралық сауданың негізгі бірнеше географиялық бағыты қалыптасқан, бұлардың әрқайсысының өзіне тән ерекшеліктері бар. Мысалы, көлемі жағынан неғұрлым ірі сауданы Батыстың дамыған елдері мен Жапония өзара жүргізеді, дүниежүзілік тауар айналымында бұлардың үлесі 40 пайызға жуық болып отыр. Олардың өзара тауар айналымының айрықша бір ерекшелігі дайын өнеркәсіп бұйымдарының үлес салмағы жоғары болады. Өнеркәсібінің құрылымы сан салалы елдер- АҚШ пен Германияның импортында дайын бұйымдар үштен біріне жуық болып келеді. Ресейдің кемел дамыған мемлекеттермен саудасының сипаты біршама басқаша. Бүгінде оған дүниежүзілік сауданың жалпы көлемінің не бары 2 пайызы ғана келеді. Шығыс –Батыс тауар айналымының құрылымы да қолайсыз. Батысқа экспорт отын – шикізат тауарларының шағын тобымен шектелген, бұл тауарлар оның 70 пайызынан астамы, ал Шығысқа экспорт көбіне машиналар мен жабдықтардан тұрады. Елден шикізат тауарларының экспортқа шығарылуы фактісінің өзінде оғаштық жоқ. АҚШ та, Канада да, Швеция да, басқа индустриялық капиталистік елдер де экспортқа шикізат шығарады. Алайда қай ел болсын экспортта машиналар мен жабдықтардың ұзақ пайдаланылатын еңбек көп жұмсалатын тауарлардың үлес салмағын арттыруды көздеуі қажет. ");

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
