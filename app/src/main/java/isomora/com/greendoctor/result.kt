

package isomora.com.greendoctor


import android.content.Intent
import android.os.Bundle
import android.widget.*
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.result.*

class result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.result)

        var intent = intent
        val name = intent.getStringExtra("answer")
        val head = findViewById<TextView>(R.id.Head)
        val des = findViewById<TextView>(R.id.desc)
        if (name.contains("apple")) {
            if (name.contains("scab")) {
                head.text = "APPLE SCAB"
                des.text =
                    "1.\tFor best control, spray liquid copper soap early, two weeks before symptoms normally appear. Alternatively, begin applications when disease first appears, and repeat at 7 to 10 day intervals up to blossom drop.\n" +
                            "2.\tOrganocide® Plant Doctor is an earth-friendly systemic fungicide that works its way through the entire plant to combat a large number of diseases on ornamentals, turf, fruit and more. Apply as a soil drench or foliar spray (3-4 tsp/ gallon of water) to prevent and attack fungal problems.\n"
                des.setBackgroundResource(R.drawable.applescab)
            } else if (name.contains("rot")) {
                head.text = "APPLE rot"
                des.text =
                    " black rot on apple trees starts with sanitation. Because fungal spores overwinter on fallen leaves, mummified fruits, dead bark and cankers, it’s important to keep all the fallen debris and dead fruit cleaned up and away from the tree."
                des.setBackgroundResource(R.drawable.applerot)
            } else if (name.contains("cedar")) {
                head.text = "APPLE cedar"
                des.text =
                    "Apply preventative, disease-fighting fungicides labeled for use on apples weekly, starting with bud break, to protect trees from spores being released by the juniper host. This occurs only once per year, so additional applications after this springtime spread are not necessary."
                des.setBackgroundResource(R.drawable.applescab)
            }
        } else if (name.contains("blueberry")) {
            head.text = "healthy blueberry"
            des.text = "Congratulations! Your plant is healthy"
            des.setBackgroundResource(R.drawable.blueberryhealthy)
        } else if (name.contains("cherry")) {
            if (name.contains("mildrew")) {
                head.text = "Cherry including sour powdery mildew"
                des.text =
                    "The best fungicides currently available for powdery mildew control are the new SDHI premixes Luna Sensation and Merivon and the stobilurin fungicide Gem. Other fungicides including sterol-inhibitors and sulfur provide some powdery mildew control, but are not nearly as effective as Luna Sensation, Merivon or Gem."
                des.setBackgroundResource(R.drawable.cherryincludingsourpowderymildew)
            } else if (name.contains("healthy")) {
                head.text = "cherry including sour healthy"
                des.text = "Congratulations! Your plant is healthy"
                des.setBackgroundResource(R.drawable.cherryincludingsourhealthy)
            }
        } else if (name.contains("corn maize")) {
            if (name.contains("cercospora")) {
                head.text = "Corn maize cercospora leaf spot gray leaf spot"
                des.text =
                    "Crop rotation and clean plowing are effective at reducing in-field inoculum buildup. A two-year crop rotation away from corn is effective if reduced tillage must be maintained for conservation purposes or a one-year rotation with clean plowing is recommended in fields that have had a problem with the disease\n" +
                            "Hybrids with partial resistance to GLS are available. \n"
                des.setBackgroundResource(R.drawable.cornmaizecercospora)
            } else if (name.contains("rust")) {
                head.text = "corn maize common rust "
                des.text =
                    "Fungicides have been used against both common and southern rust, but they are usually not needed in maize because of the resistance bred into commercialvarieties. However, foliar fungicides may have a use on sweet corn. A number of protectant fungicide have been recommended: e.g., chlorothalonil or mancozeb. Plants are monitored and sprays commence when there are on average six pustules per leaf."
                des.setBackgroundResource(R.drawable.cornmaizecommonrust)
            } else if (name.contains("blight")) {
                head.text = "corn maize northern leaf blight"
                des.text =
                    "•\tCrop rotation to reduce previous corn residues and disease inoculum\n" +
                            "•\tTillage to help break down crop debris and reduce inoculum load\n" +
                            "•\tFungicide application to reduce yield loss and improve harvestability\n" +
                            "•\tConsider hybrid susceptibility, previous crop, tillage, field history, application cost, corn price\n"
                des.setBackgroundResource(R.drawable.cornmaizenorthernleafblight)
            } else if (name.contains("healthy")) {
                head.text = "corn maize healthy"
                des.text = "Congratulations! Your plant is healthy"
                des.setBackgroundResource(R.drawable.cornmaizehealthy)
            }

        } else if (name.contains("grape")) {
            if (name.contains("rot")) {
                head.text = "grape black rot"
                des.text =
                    "Cut off the obviously affected parts of the grape vine with a sterile knife. Remove all spotted leaves and the black, mummified grapes. Be extremely thorough and make sure you remove all parts of the plant that are affected by the black rot."
                des.setBackgroundResource(R.drawable.grapeblackrot)
            } else if (name.contains("healthy")) {

                head.text = "grape healthy"
                des.text = "Congratulations! Your plant is healthy"
                des.setBackgroundResource(R.drawable.grapehealthy)
            } else if (name.contains("measles")) {

                head.text = "grape esca black measles "
                des.text =
                    "Presently, there are no effective management strategies for measles. Wine grape growers with small vineyards will often have field crews remove infected fruit prior to harvest. Raisins affected by measles will be discarded during harvest or at the packing house, while table grape growers will leave affected fruit on the vine. Current research is focused on protecting pruning wounds from fungal infections to minimize suspect fungi from colonizing fresh wounds."
                des.setBackgroundResource(R.drawable.grapeescablackmeasles)
            } else if (name.contains("isariopsis")) {

                head.text = "grape leaf blight isariopsis leaf spot"
                des.text =
                    "Plant less susceptible varieties; reduce amount of vegetative growth on vines; do not over fertilize; use suitable trellises to increase air circulation in canopy and expose grape clusters to sun; disease usually merits chemical control"
                des.setBackgroundResource(R.drawable.grapeleafblightisariopsisleafspot)
            }


        }
        else if (name.contains("orange")) {
            if (name.contains("haunglongbing")) {
                head.text = "orange haunglongbing citrus greening "
                des.text =
                    "Heating HLB-infected trees in the sun by encasing them in plastic “tents” slows or diminishes the psyllid count, which may potentially prolong the productivity of trees. Steam treatment also shows promise for extending the tree’s lifespan and ability to produce fruit. With thousands of acres of citrus groves infected with greening, this method poses implementation challenges. Researchers are currently looking at ways in which this can be done on a larger scale."
                des.setBackgroundResource(R.drawable.orangecitrus)
            }

        }

        else if (name.contains("peach")) {

            if (name.contains("spot")) {
                head.text = "peach bacterial spot"
                des.text =
                    "Oxytetracycline is generally considered the most effective compound and the least prone to phytotoxicity problems (damage to plant tissue), but also perhaps most likely to lose effectiveness with the appearance of bacterial strains with resistance. There is some evidence that the hydrochloride form of oxytetracycline (Fireline) is more effective than the calcium form Mycoshield."
                des.setBackgroundResource(R.drawable.peachbacterialspot)
            } else if (name.contains("healthy")) {
                head.text = "orange haunglongbing citrus greening"
                des.text = "Congratulations! Your plant is healthy"
                des.setBackgroundResource(R.drawable.peachhealthy)
            }
        }

        else if (name.contains("pepper")) {
            if (name.contains("spot")) {
                head.text = "pepper bell bacterial spot"
                des.text = "1.\tPurchase disease-free seed and transplants.\n" +
                        "2.\tTreat seeds by soaking them for 2 minutes in a 10% chlorine bleach solution (1 part bleach; 9 parts water). Thoroughly rinse seeds and dry them before planting.\n"
                des.setBackgroundResource(R.drawable.pepperbellbacterialspot)
            } else if (name.contains("healthy")) {
                head.text = "pepper bell healthy"
                des.text = "Congratulations! Your plant is healthy"
                des.setBackgroundResource(R.drawable.pepperbellhealthy)
            }
        }
        else if (name.contains("potato")) {
            if (name.contains("early")) {
                head.text = "potato early blight"
                des.text =
                    "Containing copper and pyrethrins, Bonide® Garden Dust is a safe, one-step control for many insect attacks and fungal problems. For best results, cover both the tops and undersides of leaves with a thin uniform film or dust. Depending on foliage density, 10 oz will cover 625 sq ft. Repeat applications every 7-10 days, as needed.\n" +
                            "\n"
                des.setBackgroundResource(R.drawable.potatoearlyblight)
            } else if (name.contains("healthy")) {
                head.text = "potato late blight"
                des.text =
                    "Chemical management is very popular strategy for the management of late blight. Since the discovery of Bordeaux mixture in 1885 and it was first important landmark in the history of chemical disease control. Bordeaux mixture belongs to first generation of fungicides along with other inorganic chemicals. "
                des.setBackgroundResource(R.drawable.potatolateblight)
            } else if (name.contains("healthy")) {
                head.text = "potato healthy"
                des.text = "Congratulations! Your plant is healthy"
                des.setBackgroundResource(R.drawable.potatohealthy)
            }

        }
        else if (name.contains("raspberry")) {
            if (name.contains("healthy")) {
                head.text = "raspberry healthy"
                des.text = "Congratulations! Your plant is healthy"
                des.setBackgroundResource(R.drawable.raspberryhealthy)
            }
        }
        else if (name.contains("soybean")) {
            if (name.contains("healthy")) {
                head.text = "soybean healthy"
                des.text = "Congratulations! Your plant is healthy"
                des.setBackgroundResource(R.drawable.soybeanhealthy)
            }
        }
        else if (name.contains("squash")) {
            if (name.contains("mildrew")) {
                head.text = "squash powdery mildew"
                des.text =
                    "Baking Soda. Baking soda itself isn’t normally effective as a powdery mildew treatment, but when it’s combined with liquid soap and water, it can be a powerful weapon. It’s normally most beneficial if used as a preventative measure rather than a treatment. Combine one tablespoon baking soda and one-half teaspoon of liquid, non-detergent soap with one gallon of water, and spray the mixture liberally"
                des.setBackgroundResource(R.drawable.squashpowderymildew)
            }
        }
        else if (name.contains("strawberry"))
        {
            if (name.contains("leaf"))
            {
                head.text = "strawberry leaf scorch"
                des.text =
                    "Although often easier said than done, it is important to purchase the highest quality seed possible. The seed extraction process will not reliably eliminate bacteria from the seed so treating the seed either with a chlorine bleach to disinfest the seed surface or a hot-water seed treatment to disinfest the seed surface as well as eliminate bacteria that may be under the seed coat may be necessary"
                des.setBackgroundResource(R.drawable.strawberryleafscorch)
            } else if (name.contains("healthy"))
            {
                head.text = "strawberry healthy"
                des.text = "Congratulations! Your plant is healthy"
                des.setBackgroundResource(R.drawable.strawberryhealthy)
            }

        }
        else if (name.contains("tomato"))
        {
            if (name.contains("bacterial"))
            {
                head.text = "tomato bacterial spot"
                des.text =
                    "Although often easier said than done, it is important to purchase the highest quality seed possible. The seed extraction process will not reliably eliminate bacteria from the seed so treating the seed either with a chlorine bleach to disinfest the seed surface or a hot-water seed treatment to disinfest the seed surface as well as eliminate bacteria that may be under the seed coat may be necessary"
                des.setBackgroundResource(R.drawable.tomatobacterialspot)
            }
            else if (name.contains("early"))
            {
                head.text = "tomato early blight"
                des.text =
                    "1.\tPrune or stake plants to improve air circulation and reduce fungal problems.\n" +
                            "2.\tMake sure to disinfect your pruning shears (one part bleach to 4 parts water) after each cut.\n" +
                            "3.\tKeep the soil under plants clean and free of garden debris.\n" +
                            "\n"
                des.setBackgroundResource(R.drawable.tomatoearlyblight)
            }
            else if (name.contains("late"))
            {
                head.text = "tomato late blight"
                des.text = "1.\tPlant resistant cultivars when available.\n" +
                        "2.\tRemove volunteers from the garden prior to planting and space plants far enough apart to allow for plenty of air circulation.\n" +
                        "3.\tWater in the early morning hours, or use soaker hoses, to give plants time to dry out during the day — avoid overhead irrigation.\n"
                des.setBackgroundResource(R.drawable.tomatolateblight)
            }
            else if (name.contains("leaf"))
            {
                head.text = "tomato leaf mold"
                des.text = "The pathogen P. fulfa can survive on infected plant debris or in the soil, although the initial source of the disease is often infected seed. The disease is spread by rain and wind, on tools, clothing and via insect activity. High relative humidity (greater that 85%) combined with high temperatures encourages the spread of the disease. With that in mind, if growing tomatoes in a greenhouse, maintain night temps higher than outside temperatures."
                des.setBackgroundResource(R.drawable.tomatoleafmold)
            }
            else if (name.contains("septoria"))
            {
                head.text = "tomato septoria leaf spot"
                des.text = "Treat organically with copper spray, which you can purchase online, at the hardware store, or home improvement center. Follow label directions. You can apply until the leaves are dripping, once a week and after each rain."
                des.setBackgroundResource(R.drawable.tomatoseptorialeafspot)
            }
            else if (name.contains("spider"))
            {
                head.text = "tomato spider mites two spotted spider mite"
                des.text = "1.\tMix Pure Neem Oil with Coco-Wet and apply every 3-5 days to kill pest eggs indoors and interrupt the reproductive cycle. Make sure to spray all plant parts, including the undersides of leaves. Do NOT apply when temperatures exceed 90˚F and wait at last six hours before turning lights on.\n" +
                        "2.\tIf populations are high, use a least-toxic, short-lived pesticide (Take Down Spray, Doktor Doom Foggers) to reduce infestations, then release predatory mites to maintain control.\n"
                des.setBackgroundResource(R.drawable.tomatospidermitestwospottedspidermite)
            }
            else if (name.contains("target"))
            {
                head.text = "tomato target spot"
                des.text = "Spray with protectant fungicides after first symptoms appear. Consult with your local extension agent for fungicides available in your region. Remove affected debris to prevent carryover into the next crop. Use an adequate period of crop rotation. Genetic resistance to this fungus has been documented in tomato and soybean but commercial varieties are not yet available."
                des.setBackgroundResource(R.drawable.tomatotargetspot)
            }
            else if (name.contains("curl"))
            {
                head.text = "tomato tomato yellow leaf curl virus"
                des.text = "Inspect plants for whitefly infestations two times per week. If whiteflies are beginning to appear, spray with azadirachtin (Neem), pyrethrin or insecticidal soap. For more effective control, it is recommended that at least two of the above insecticides be rotated at each spraying. Follow label directions closely for dosage rates, spray intervals and precautions. Spray the undersides of the leaves thoroughly"
                des.setBackgroundResource(R.drawable.tomatoyellowleafcurlvirus)
            }
            else if (name.contains("mozaic"))
            {
                head.text = "tomato tomato mosaic virus"
                des.text = "1.\the virus can be spread through human activity, tools and equipment. Frequently wash your hands and disinfect garden tools, stakes, ties, pots, greenhouse benches, etc. (one part bleach to 4 parts water) to reduce the risk of contamination.\n" +
                        "2.\tAvoid working in the garden during damp conditions (viruses are easily spread when plants are wet).\n" +
                        "3.\tAvoid using tobacco around susceptible plants. Cigarettes and other tobacco products may be infected and can spread the virus.\n"
                des.setBackgroundResource(R.drawable.tomatomosaicvirus)
            }
            else if (name.contains("healthy"))
            {
                head.text = "tomato healthy"
                des.text = "Congratulations! Your plant is healthy"
                des.setBackgroundResource(R.drawable.tomatohealthy)
            }


        }


        val button=findViewById<ImageButton>(R.id.mess_but)
        mess_but.setOnClickListener()
        {
            val intent=Intent(this, mess::class.java)

            intent.putExtra("dname",head.text)
            intent.putExtra("remed",des.text.toString())
            startActivity(intent)
        }

    }
}