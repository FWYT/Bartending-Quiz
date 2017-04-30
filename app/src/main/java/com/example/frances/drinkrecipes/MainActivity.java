package com.example.frances.drinkrecipes;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int[] screens = {R.id.glass1, R.id.glass2, R.id.vodka, R.id.whiskey, R.id.tequila, R.id.scotch, R.id.rum, R.id.mixers1,
                     R.id.mixers2, R.id.irishwhiskey, R.id.gin, R.id.garnish1, R.id.garnish2, R.id.flavorenhancers, R.id.cordials1,
                     R.id.cordials2, R.id.cognac, R.id.brandy, R.id.bourbon, R.id.aperitif};

    int currentScreenIdx = 0;

    HashMap<Integer, String> item = new HashMap<Integer, String>()
    {{
        put(R.id.flute, "Flute glass");
        put(R.id.beer, "Beer glass");
        put(R.id.highball, "Highball glass");
        put(R.id.tall, "Tall glass");
        put(R.id.rocks, "Rocks glass");
        put(R.id.wine, "Wine glass");
        put(R.id.shooter, "Shooter glass");
        put(R.id.shot, "Shot glass");
        put(R.id.snifter, "Snifter glass");
        put(R.id.pony, "Pony glass");
        put(R.id.irish, "Irish glass");
        put(R.id.margarita, "Margarita glass");
        put(R.id.mug, "Mug");
        put(R.id.up, "Up glass");
        put(R.id.citron, "Absolut Citron");
        put(R.id.absoluteVanilla, "Absolut Vanilla");
        put(R.id.belvedere, "Belvedere");
        put(R.id.finlandia, "Finlandia");
        put(R.id.greygoose, "Grey Goose");
        put(R.id.ketelone, "Ketel One");
        put(R.id.smirnoff, "Smirnoff");
        put(R.id.stoli, "Stolichnaya");
        put(R.id.canadianclub, "Canadian Club");
        put(R.id.crownroyal, "Crown Royal");
        put(R.id.jackdaniels, "Jack Daniels");
        put(R.id.seagrams7, "Seagrams 7");
        put(R.id.seagramsvo, "Seagrams VO");
        put(R.id.windsorcanadian, "Windsor Canadian");
        put(R.id.cabowabo, "Cabo Wabo");
        put(R.id.hornitos, "Hornitos");
        put(R.id.josecuervo, "Jose Cuervo");
        put(R.id.patronroca, "Patron Roca");
        put(R.id.patron, "Patron");
        put(R.id.sauza, "Sauza");
        put(R.id.chivasregal, "Chivas Regal");
        put(R.id.dewars, "Dewars");
        put(R.id.glenfiddich, "Glenfiddich");
        put(R.id.glenlivet, "Glenlivet");
        put(R.id.johnniewalker, "Johnnie Walker");
        put(R.id.lagavulin, "Lagavulin");
        put(R.id.macallan, "Macallan");
        put(R.id.bacardi, "Bacardi");
        put(R.id.captainmorgan, "Captain Morgan");
        put(R.id.malibu, "Malibu Rum");
        put(R.id.myers, "Myers Dark Rum");
        put(R.id.parrotbay, "Parrot Bay");
        put(R.id.coke, "Coke");
        put(R.id.cranberry, "Cranberry Juice");
        put(R.id.cream, "Cream");
        put(R.id.espresso, "Espresso");
        put(R.id.gingerale, "Ginger Ale");
        put(R.id.gingerbeer, "Ginger Beer");
        put(R.id.grapefruit, "Grapefruit Juice");
        put(R.id.orange, "Orange Juice");
        put(R.id.pineapple, "Pineapple Juice");
        put(R.id.sours, "Sour mix");
        put(R.id.sprite, "Sprite");
        put(R.id.water, "Water");
        put(R.id.coffee, "Coffee");
        put(R.id.jameson, "Jameson");
        put(R.id.redbreast12, "Red Breast 12");
        put(R.id.tullamoredew, "Tullamore Dew");
        put(R.id.beefeeter, "Beefeeter");
        put(R.id.bluecoat, "Blue Coat");
        put(R.id.bombaysaphire, "Bombay Sapphire");
        put(R.id.boodles, "Boodles");
        put(R.id.hendricks, "Hendricks");
        put(R.id.portobelloroad, "Portobello Road");
        put(R.id.tanqueray, "Tanqueray");
        put(R.id.cherry, "Cherry");
        put(R.id.onions, "Cocktail onions");
        put(R.id.beans, "Coffee beans");
        put(R.id.lemontwist, "Lemon twist");
        put(R.id.lemon, "Lemon");
        put(R.id.lime, "Lime");
        put(R.id.margaritasalt, "Margarita salt");
        put(R.id.mintleaf, "Mint leaf");
        put(R.id.olives, "Olives");
        put(R.id.orangecherry, "Orange and cherry");
        put(R.id.orangetwist, "Orange twist");
        put(R.id.orangeslice, "Orange");
        put(R.id.raspberry, "Raspberry");
        put(R.id.saltshaker, "Salt shaker");
        put(R.id.bitters, "Bitters");
        put(R.id.grenadine, "Grenadine");
        put(R.id.honey, "Honey");
        put(R.id.limejuice, "Lime juice");
        put(R.id.simplesyrup, "Simple syrup");
        put(R.id.soda, "Soda");
        put(R.id.amaretto, "Amaretto");
        put(R.id.baileys, "Baileys");
        put(R.id.bluecuracao, "Blue Curacao");
        put(R.id.chambord, "Chambord");
        put(R.id.cremedementhe, "Creme de Menthe");
        put(R.id.frangelico, "Frangelico");
        put(R.id.goldschlager, "Goldschalger");
        put(R.id.grandmarnier, "Grand Marnier");
        put(R.id.jagermeister, "Jagermeister");
        put(R.id.kahlua, "Kahlua");
        put(R.id.midori, "Midori");
        put(R.id.peachschnapps, "Peach Schnapps");
        put(R.id.southerncomfort, "Southern Comfort");
        put(R.id.cointreau, "Cointreau");
        put(R.id.applepucker, "Apple Pucker");
        put(R.id.peppermintschnapps, "Peppermint Schnapps");
        put(R.id.sloegin, "Sloe Gin");
        put(R.id.triplesec, "Triple Sec");
        put(R.id.drambuie, "Drambuie");
        put(R.id.campari, "Campari");
        put(R.id.courvoisier, "Courvoisier");
        put(R.id.hennessy, "Hennessy");
        put(R.id.louisxiii, "Louis XIII");
        put(R.id.remymartin, "Remy Martin");
        put(R.id.christianbrothers, "Christian Brothers");
        put(R.id.ej, "E&J");
        put(R.id.vecchiaromagna, "Vecchia Romagna");
        put(R.id.angelsenvy, "Angels Envy");
        put(R.id.jimbeam, "Jim Beam");
        put(R.id.knobcreek, "Knob Creek");
        put(R.id.makersmark, "Makers Mark");
        put(R.id.oldgranddad, "Old Grandad");
        put(R.id.wildturkey, "Wild Turkey");
        put(R.id.woodfordreserve, "Woodford Reserve");
        put(R.id.sweetvermouth, "Sweet Vermouth");
        put(R.id.dryvermouth, "Dry Vermouth");
        put(R.id.redwine, "Red Wine");
        put(R.id.whitewine, "White Wine");
        put(R.id.champagne, "Champagne");
        put(R.id.vodka, "Vodka");
        put(R.id.tequila, "Tequila");
        put(R.id.gin, "Gin");
        put(R.id.rum, "Rum");
        put(R.id.scotch, "Scotch");
        put(R.id.brandy, "Brandy");
        put(R.id.cognac, "Cognac");
        put(R.id.bourbon, "Bourbon");
        put(R.id.whiskey, "Whiskey");
        put(R.id.irishwhiskey, "Irish Whiskey");
    }};

    HashMap<Integer, Integer> itemToSection = new HashMap<Integer, Integer>()
    {{
        put(R.id.flute, R.id.glass1);
        put(R.id.beer, R.id.glass1);
        put(R.id.highball, R.id.glass1);
        put(R.id.tall, R.id.glass1);
        put(R.id.rocks, R.id.glass1);
        put(R.id.wine, R.id.glass1);
        put(R.id.shooter, R.id.glass1);
        put(R.id.shot, R.id.glass1);
        put(R.id.snifter, R.id.glass1);
        put(R.id.pony, R.id.glass1);
        put(R.id.irish, R.id.glass2);
        put(R.id.margarita, R.id.glass2);
        put(R.id.mug, R.id.glass2);
        put(R.id.up, R.id.glass2);
        put(R.id.citron, R.id.vodka);
        put(R.id.absoluteVanilla, R.id.vodka);
        put(R.id.belvedere, R.id.vodka);
        put(R.id.finlandia, R.id.vodka);
        put(R.id.greygoose, R.id.vodka);
        put(R.id.ketelone, R.id.vodka);
        put(R.id.smirnoff, R.id.vodka);
        put(R.id.stoli, R.id.vodka);
        put(R.id.canadianclub, R.id.whiskey);
        put(R.id.crownroyal, R.id.whiskey);
        put(R.id.jackdaniels, R.id.whiskey);
        put(R.id.seagrams7, R.id.whiskey);
        put(R.id.seagramsvo, R.id.whiskey);
        put(R.id.windsorcanadian, R.id.whiskey);
        put(R.id.cabowabo, R.id.tequila);
        put(R.id.hornitos, R.id.tequila);
        put(R.id.josecuervo, R.id.tequila);
        put(R.id.patronroca, R.id.tequila);
        put(R.id.patron, R.id.tequila);
        put(R.id.sauza, R.id.tequila);
        put(R.id.chivasregal, R.id.scotch);
        put(R.id.dewars, R.id.scotch);
        put(R.id.glenfiddich, R.id.scotch);
        put(R.id.glenlivet, R.id.scotch);
        put(R.id.johnniewalker, R.id.scotch);
        put(R.id.lagavulin, R.id.scotch);
        put(R.id.macallan, R.id.scotch);
        put(R.id.bacardi, R.id.rum);
        put(R.id.captainmorgan, R.id.rum);
        put(R.id.malibu, R.id.rum);
        put(R.id.myers, R.id.rum);
        put(R.id.parrotbay, R.id.rum);
        put(R.id.coke, R.id.mixers1);
        put(R.id.cranberry, R.id.mixers1);
        put(R.id.cream, R.id.mixers1);
        put(R.id.espresso, R.id.mixers1);
        put(R.id.gingerale, R.id.mixers1);
        put(R.id.gingerbeer, R.id.mixers1);
        put(R.id.grapefruit, R.id.mixers1);
        put(R.id.orange, R.id.mixers1);
        put(R.id.pineapple, R.id.mixers1);
        put(R.id.sours, R.id.mixers1);
        put(R.id.sprite, R.id.mixers2);
        put(R.id.water, R.id.mixers2);
        put(R.id.coffee, R.id.mixers2);
        put(R.id.jameson, R.id.irishwhiskey);
        put(R.id.redbreast12, R.id.irishwhiskey);
        put(R.id.tullamoredew, R.id.irishwhiskey);
        put(R.id.beefeeter, R.id.gin);
        put(R.id.bluecoat, R.id.gin);
        put(R.id.bombaysaphire, R.id.gin);
        put(R.id.boodles, R.id.gin);
        put(R.id.hendricks, R.id.gin);
        put(R.id.portobelloroad, R.id.gin);
        put(R.id.tanqueray, R.id.gin);
        put(R.id.cherry, R.id.garnish1);
        put(R.id.onions, R.id.garnish1);
        put(R.id.beans, R.id.garnish1);
        put(R.id.lemontwist, R.id.garnish1);
        put(R.id.lemon, R.id.garnish1);
        put(R.id.lime, R.id.garnish1);
        put(R.id.margaritasalt, R.id.garnish1);
        put(R.id.mintleaf, R.id.garnish1);
        put(R.id.olives, R.id.garnish1);
        put(R.id.orangecherry, R.id.garnish1);
        put(R.id.orangetwist, R.id.garnish2);
        put(R.id.orangeslice, R.id.garnish2);
        put(R.id.raspberry, R.id.garnish2);
        put(R.id.saltshaker, R.id.garnish2);
        put(R.id.bitters, R.id.flavorenhancers);
        put(R.id.grenadine, R.id.flavorenhancers);
        put(R.id.honey, R.id.flavorenhancers);
        put(R.id.limejuice, R.id.flavorenhancers);
        put(R.id.simplesyrup, R.id.flavorenhancers);
        put(R.id.soda, R.id.flavorenhancers);
        put(R.id.amaretto, R.id.cordials1);
        put(R.id.baileys, R.id.cordials1);
        put(R.id.bluecuracao, R.id.cordials1);
        put(R.id.chambord, R.id.cordials1);
        put(R.id.cremedementhe, R.id.cordials1);
        put(R.id.frangelico, R.id.cordials1);
        put(R.id.goldschlager, R.id.cordials1);
        put(R.id.grandmarnier, R.id.cordials1);
        put(R.id.jagermeister, R.id.cordials1);
        put(R.id.kahlua, R.id.cordials1);
        put(R.id.midori, R.id.cordials2);
        put(R.id.peachschnapps, R.id.cordials2);
        put(R.id.southerncomfort, R.id.cordials2);
        put(R.id.applepucker, R.id.cordials2);
        put(R.id.peppermintschnapps, R.id.cordials2);
        put(R.id.sloegin, R.id.cordials2);
        put(R.id.triplesec, R.id.cordials2);
        put(R.id.drambuie, R.id.cordials2);
        put(R.id.cointreau, R.id.cordials2);
        put(R.id.campari, R.id.cordials2);
        put(R.id.courvoisier, R.id.cognac);
        put(R.id.hennessy, R.id.cognac);
        put(R.id.louisxiii, R.id.cognac);
        put(R.id.remymartin, R.id.cognac);
        put(R.id.christianbrothers, R.id.brandy);
        put(R.id.ej, R.id.brandy);
        put(R.id.vecchiaromagna, R.id.brandy);
        put(R.id.angelsenvy, R.id.bourbon);
        put(R.id.jimbeam, R.id.bourbon);
        put(R.id.knobcreek, R.id.bourbon);
        put(R.id.makersmark, R.id.bourbon);
        put(R.id.oldgranddad, R.id.bourbon);
        put(R.id.wildturkey, R.id.bourbon);
        put(R.id.woodfordreserve, R.id.bourbon);
        put(R.id.sweetvermouth, R.id.aperitif);
        put(R.id.dryvermouth, R.id.aperitif);
        put(R.id.redwine, R.id.aperitif);
        put(R.id.whitewine, R.id.aperitif);
        put(R.id.champagne, R.id.aperitif);
    }};

    String[] drinksList = new String[]{"screwdriver", "white russian", "kamikaze", "cape codder", "chocolate cake", "sea breeze", "bay breeze",
                                        "madras", "greyhound", "salty dog", "sombrero", "highball", "whiskey sour", "fuzzy navel", "cuba libre",
                                        "tom collins", "sloe gin fizz", "bacardi cocktail", "tequila sunrise", "woo woo", "sex on the beach",
                                        "pearl harbor", "water-melon", "toasted almond", "grape crush", "red headed slut", "washington apple"};

    //code:section id : specific liquor id - amount
    //add ":" before cordial since it is specific
    HashMap<String, String[]> drinks = new HashMap<String, String[]>()
    {{
        put("screwdriver", new String[]{Integer.toString(R.id.vodka)+"-1", Integer.toString(R.id.orange), Integer.toString(R.id.orangeslice), Integer.toString(R.id.highball)});
        put("white russian", new String[]{Integer.toString(R.id.vodka)+"-1/2", ":"+Integer.toString(R.id.kahlua)+"-1/2", Integer.toString(R.id.cream), Integer.toString(R.id.highball)});
        put("kamikaze", new String[]{Integer.toString(R.id.vodka)+"-1 1/4", ":"+Integer.toString(R.id.triplesec)+"-3/4", Integer.toString(R.id.limejuice), Integer.toString(R.id.lime), Integer.toString(R.id.rocks)});
        put("cape codder", new String[]{Integer.toString(R.id.vodka)+"-1", Integer.toString(R.id.cranberry), Integer.toString(R.id.lime), Integer.toString(R.id.highball)});
        put("chocolate cake", new String[]{Integer.toString(R.id.vodka)+":"+Integer.toString(R.id.citron)+"-1/2", ":"+Integer.toString(R.id.frangelico)+"-1/2", Integer.toString(R.id.shooter), Integer.toString(R.id.lemon)});
        put("sea breeze", new String[]{Integer.toString(R.id.vodka)+"-1", Integer.toString(R.id.cranberry), Integer.toString(R.id.grapefruit), Integer.toString(R.id.highball), Integer.toString(R.id.lime)});
        put("bay breeze", new String[]{Integer.toString(R.id.vodka)+"-1", Integer.toString(R.id.cranberry), Integer.toString(R.id.pineapple), Integer.toString(R.id.highball), Integer.toString(R.id.lime)});
        put("madras", new String[]{Integer.toString(R.id.vodka)+"-1", Integer.toString(R.id.cranberry), Integer.toString(R.id.orange), Integer.toString(R.id.lime), Integer.toString(R.id.highball)});
        put("greyhound", new String[]{Integer.toString(R.id.vodka)+"-1", Integer.toString(R.id.grapefruit), Integer.toString(R.id.highball)});
        put("salty dog", new String[]{Integer.toString(R.id.vodka)+"-1", Integer.toString(R.id.grapefruit), Integer.toString(R.id.highball), Integer.toString(R.id.margaritasalt)});
        put("sombrero", new String[]{":"+Integer.toString(R.id.kahlua)+"-1", Integer.toString(R.id.cream), Integer.toString(R.id.highball)});
        put("highball", new String[]{Integer.toString(R.id.whiskey)+"-1", Integer.toString(R.id.gingerale), Integer.toString(R.id.highball)});
        put("whiskey sour", new String[]{Integer.toString(R.id.whiskey)+"-1", Integer.toString(R.id.sours), Integer.toString(R.id.orangecherry), Integer.toString(R.id.highball)});
        put("fuzzy navel", new String[]{":"+Integer.toString(R.id.peachschnapps)+"-1", Integer.toString(R.id.orange), Integer.toString(R.id.highball), Integer.toString(R.id.orangeslice)});
        put("cuba libre", new String[]{Integer.toString(R.id.rum)+"-1", Integer.toString(R.id.coke), Integer.toString(R.id.lime), Integer.toString(R.id.highball)});
        put("tom collins", new String[]{Integer.toString(R.id.gin)+"-1", Integer.toString(R.id.sours), Integer.toString(R.id.soda), Integer.toString(R.id.orangecherry), Integer.toString(R.id.highball)});
        put("sloe gin fizz", new String[]{":"+Integer.toString(R.id.sloegin)+"-1", Integer.toString(R.id.sours), Integer.toString(R.id.soda), Integer.toString(R.id.orangecherry), Integer.toString(R.id.highball)});
        put("bacardi cocktail", new String[]{Integer.toString(R.id.rum)+":"+Integer.toString(R.id.bacardi)+"-1", Integer.toString(R.id.sours), Integer.toString(R.id.grenadine), Integer.toString(R.id.orangecherry), Integer.toString(R.id.highball)});
        put("tequila sunrise", new String[]{Integer.toString(R.id.tequila)+"-1", Integer.toString(R.id.orange), Integer.toString(R.id.grenadine), Integer.toString(R.id.orangeslice), Integer.toString(R.id.highball)});
        put("woo woo", new String[]{Integer.toString(R.id.vodka)+"-1/2", ":"+Integer.toString(R.id.peachschnapps)+"-1/2", Integer.toString(R.id.cranberry), Integer.toString(R.id.lime), Integer.toString(R.id.highball)});
        put("sex on the beach", new String[]{Integer.toString(R.id.vodka)+"-1/2", ":"+Integer.toString(R.id.peachschnapps)+"-1/2", Integer.toString(R.id.cranberry), Integer.toString(R.id.orange), Integer.toString(R.id.lime), Integer.toString(R.id.highball)});
        put("pearl harbor", new String[]{Integer.toString(R.id.vodka)+"-1/2", ":"+ Integer.toString(R.id.midori)+"-1/2", Integer.toString(R.id.pineapple), Integer.toString(R.id.highball)});
        put("water-melon", new String[]{Integer.toString(R.id.vodka)+"-1/2", ":"+Integer.toString(R.id.midori)+"-1/2", Integer.toString(R.id.cranberry), Integer.toString(R.id.lime), Integer.toString(R.id.highball)});
        put("toasted almond", new String[]{":"+Integer.toString(R.id.amaretto)+"-1/2", ":"+Integer.toString(R.id.kahlua)+"-1/2", Integer.toString(R.id.cream), Integer.toString(R.id.highball)});
        put("grape crush", new String[]{Integer.toString(R.id.vodka)+"-1/2", ":"+Integer.toString(R.id.chambord)+"-1/2", Integer.toString(R.id.sours), Integer.toString(R.id.orangecherry), Integer.toString(R.id.highball)});
        put("red headed slut", new String[]{":"+Integer.toString(R.id.jagermeister)+"-1/2", ":"+Integer.toString(R.id.peachschnapps)+"-1/2", Integer.toString(R.id.cranberry), Integer.toString(R.id.lime), Integer.toString(R.id.highball)});
        put("washington apple", new String[]{Integer.toString(R.id.whiskey)+":"+Integer.toString(R.id.crownroyal)+"-1/2", ":"+Integer.toString(R.id.applepucker)+"-1/2", Integer.toString(R.id.cranberry), Integer.toString(R.id.lime), Integer.toString(R.id.highball)});
    }};

    Integer[] L = {R.id.vodka, R.id.tequila, R.id.bourbon, R.id.whiskey, R.id.irishwhiskey, R.id.brandy, R.id.gin, R.id.cognac, R.id.rum,
                   R.id.cordials2, R.id.cordials1, R.id.scotch, R.id.aperitif};
    ArrayList<Integer> liquors = new ArrayList<>(Arrays.asList(L));

    HashMap<Integer, String> chosen = new HashMap<>();

    Spinner amount;
    int id;
    Dialog q;
    Dialog d;
    String drink;
    TextView list;
    TextView drinkText;

    String prev;
    Random r = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.liquorshelf);

        drinkText = (TextView) findViewById(R.id.drink);

        int i = r.nextInt(drinksList.length);
        drink = drinksList[i];
        prev=drink;
        drinkText.setText(drink.toUpperCase());
    }

    public void moveRight(View v)
    {
        RelativeLayout screen = (RelativeLayout) findViewById(screens[currentScreenIdx]);
        screen.setVisibility(View.GONE);

        if (currentScreenIdx < screens.length-1)
        {
            currentScreenIdx++;
        }
        else
        {
            currentScreenIdx = 0;
        }

        screen = (RelativeLayout) findViewById(screens[currentScreenIdx]);
        screen.setVisibility(View.VISIBLE);
    }

    public void moveLeft(View v)
    {
        RelativeLayout screen = (RelativeLayout) findViewById(screens[currentScreenIdx]);
        screen.setVisibility(View.GONE);

        if (currentScreenIdx > 0)
        {
            currentScreenIdx--;
        }
        else
        {
            currentScreenIdx = screens.length-1;
        }

        screen = (RelativeLayout) findViewById(screens[currentScreenIdx]);
        screen.setVisibility(View.VISIBLE);
    }

    public void updateList(View v)
    {
        id = v.getId();
        if (!chosen.containsKey(v.getId()))
        {
            if (liquors.contains(itemToSection.get(v.getId())))
            {
                q = new Dialog(MainActivity.this);
                q.requestWindowFeature(Window.FEATURE_NO_TITLE);
                q.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));

                q.setContentView(R.layout.amountspinner);

                amount = (Spinner) q.findViewById(R.id.quantity);

                String[] g = new String[]{"1/8", "1/4", "1/2", "3/4", "1", "1 1/4", "1 1/2", "2", "2 1/2", "2 3/4", "3"};
                ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, R.layout.spinnertextview, g);
                amount.setAdapter(adapter2);

                q.setCancelable(true);

                Button ok = (Button) q.findViewById(R.id.amount);
                ok.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View k) {
                        chosen.put(id, amount.getSelectedItem().toString());
                        ImageButton image = (ImageButton) findViewById(id);
                        image.setImageResource(R.drawable.checkmark);
                        q.dismiss();
                    }
                });

                q.show();
            }
            else{
                chosen.put(id, "");
                ImageButton image = (ImageButton) findViewById(id);
                image.setImageResource(R.drawable.checkmark);
            }
        }
        else
        {
            chosen.remove(id);
            ImageButton image = (ImageButton) findViewById(id);
            image.setImageResource(android.R.color.transparent);
        }



        String[] eng = new String[chosen.keySet().size()];
        int c = 0;
        for (int k : chosen.keySet())
        {
            eng[c] = item.get(k);
            c++;
        }

        Log.d("Choices", Arrays.asList(eng).toString());
    }

    public void check(View v)
    {
        d = new Dialog(MainActivity.this);
        d.requestWindowFeature(Window.FEATURE_NO_TITLE);
        d.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));

        d.setContentView(R.layout.chosenlist);

        d.setCancelable(true);

        list = (TextView) d.findViewById(R.id.chosen);

        String eng = "";
        for (int k : chosen.keySet())
        {
            if (liquors.contains(itemToSection.get(k)))
            {
                eng += chosen.get(k) + " oz " + item.get(k)+"\n";
            }
            else {
                eng += item.get(k) + "\n";
            }
        }

        list.setText(eng);

        d.show();

        Button submit = (Button) d.findViewById(R.id.submitBut);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View k) {
                String[] corAns = drinks.get(drink);
                boolean correct = true;
                //HashMap<Integer, String> ans = new HashMap<>();
                for (String a : corAns)
                {
                    if (a.contains(":")) //this only applies to liquors and therefore must have amount
                    {
                        String[] s = a.split(":");
                        String[] ss = s[1].split("-");
                        int i = Integer.parseInt(ss[0]); //this is the id of the specific liquor
                        String oz = ss[1]; //amount of liquor in oz

                        //check that this pair is in the chosen hashmap
                        if (!(chosen.containsKey(i) && chosen.get(i).equals(oz.trim())))
                        {
                            correct = false;
                            break;
                        }
                        else
                        {
                            chosen.remove(i);
                            ImageButton image = (ImageButton) findViewById(i);
                            image.setImageResource(android.R.color.transparent);
                        }
                    }
                    else if (a.contains("-")) //only liquors have amounts
                    {
                        String[] s = a.split("-");
                        int i = Integer.parseInt(s[0]);
                        String oz = s[1];

                        if (!hasType(i,oz))
                        {
                            correct = false;
                            break;
                        }
                    }
                    else //not a alcohol
                    {
                        int i = Integer.parseInt(a);
                        if (!chosen.containsKey(i))
                        {
                            correct = false;
                            break;
                        }
                        else
                        {
                            chosen.remove(i);
                            ImageButton image = (ImageButton) findViewById(i);
                            image.setImageResource(android.R.color.transparent);
                        }
                    }
                }

                if (chosen.size()!=0) {
                    correct = false;

                    for (int i : chosen.keySet())
                    {
                        ImageButton image = (ImageButton) findViewById(i);
                        image.setImageResource(android.R.color.transparent);
                    }
                }

                String c = list.getText().toString();

                RelativeLayout cur = (RelativeLayout) d.findViewById(R.id.current);
                cur.setVisibility(View.GONE);

                RelativeLayout res = (RelativeLayout) d.findViewById(R.id.resultbox);
                res.setVisibility(View.VISIBLE);

                if (correct)
                {
                    d.setCancelable(false);

                    TextView r = (TextView) d.findViewById(R.id.result);
                    r.setText("CORRECT");
                    r.setTextColor(Color.parseColor("#00BF00"));

                    TextView a = (TextView) d.findViewById(R.id.answer);
                    a.setText(c);
                }
                if (!correct)
                {
                    d.setCancelable(false);

                    TextView r = (TextView) d.findViewById(R.id.result);
                    r.setText("WRONG");
                    r.setTextColor(Color.parseColor("#F60000"));

                    TextView a = (TextView) d.findViewById(R.id.answer);
                    a.setText(parseAnswer(corAns));
                }

                Button next = (Button) d.findViewById(R.id.next);
                next.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int i = r.nextInt(drinksList.length);

                        while(drinksList[i].equals(prev))
                        {
                            i = r.nextInt(drinksList.length);
                        }

                        drinkText.setText(drinksList[i].toUpperCase());
                        drink = drinksList[i];
                        chosen.clear();
                        d.dismiss();
                    }
                });
            }
        });
    }

    private String parseAnswer(String[] ans)
    {
        String e = "";

        for (String a : ans)
        {
            if (a.contains(":"))
            {
                String[] s = a.split(":")[1].split("-");
                e += s[1] + " oz " + item.get(Integer.parseInt(s[0])) + "\n";
            }
            else if (a.contains("-"))
            {
                String[] s = a.split("-");
                e += s[1] + " oz " + item.get(Integer.parseInt(s[0])) + "\n";
            }
            else
            {
                e += item.get(Integer.parseInt(a)) + "\n";
            }
        }

        return e;
    }

    private boolean hasType(int type, String oz)
    {
        for(int k : chosen.keySet())
        {
            Log.d("ans", "type: " + type + " in chosen: " + itemToSection.get(k) + " oz: " + chosen.get(k) + " should be oz: " + oz);
            if (itemToSection.get(k) == type && chosen.get(k).equals(oz.trim()))
            {
                chosen.remove(k);
                ImageButton image = (ImageButton) findViewById(k);
                image.setImageResource(android.R.color.transparent);
                return true;
            }

        }
        return false;
    }
}
