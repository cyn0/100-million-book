package in.co.books.surpriseme;

import android.graphics.Color;
import android.os.Bundle;

import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.heinrichreimersoftware.materialintro.slide.FragmentSlide;
import com.heinrichreimersoftware.materialintro.slide.Slide;

import in.co.books.surpriseme.Fragments.ClueFragment;


//public class ClueActivity extends AppIntro {
public class ClueActivity extends IntroActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		String description = "I first met Dean not long after my wife and I split up. I had just gotten over a serious illness that I won’t bother to talk about, except that it had something to do with the miserably weary split-up and my feeling that everything was dead. With the coming of Dean Moriarty began the part of my life you could call my life on the road. Before that I’d often dreamed of going West to see the country, always vaguely planning and never taking off. Dean is the perfect guy for the road because he actually was born on the road, when his parents were passing through Salt Lake City in 1926, in a jalopy, on their way to Los Angeles. First reports of him came to me through Chad King, who’d shown me a few letters from him written in a New Mexico reform school. I was tremendously interested in the letters because they so naively and sweetly asked Chad to teach him all about Nietzsche and all the wonderful intellectual things that Chad knew. At one point Carlo and I talked about the letters and wondered if we would ever meet the strange Dean Moriarty. This is all far back, when Dean was not the way he is today, when he was a young jailkid shrouded in mystery. Then news came that Dean was out of reform school and was coming to New York for the first time; also there was talk that he had just married a girl called Marylou.\n" +
				" One day I was hanging around the campus and Chad and Tim Gray told me Dean was staying ina cold-water pad in East Harlem, the Spanish Harlem. Dean had arrived the night before, the first\n" +
				"time in New York, with his beautiful little sharp chick Marylou; they got off the Greyhound bus at\n" +
				"50th Street and cut around the corner  looking for a place to eat and went right in Hector’s, and since\n" +
				"then Hector’s cafeteria has always been a big symbol of New York for Dean. They spent money on\n" +
				"beautiful big glazed cakes and creampuffs.\n" +
				"All this time Dean was telling Marylou things like this: 'Now, darling, here we are in New York\n" +
				"and although I haven’t quite told you everything that I was thinking about when we crossed Missouri\n" +
				"and especially at the point when we passed the Booneville reformatory which reminded me of my jail\n" +
				"problem, it is absolutely necessary now to postpone all those leftover things concerning our personal\n" +
				"lovethings and at once begin thinking of specific worklife plans . . .' and so on in the way that he had\n" +
				"in those early days.\n" +
				"I went to the cold-water flat with the boys, and Dean came to the door in his shorts. Marylou was\n" +
				"jumping off the couch; Dean had dispatched the occupant of the apartment to the kitchen, probably\n" +
				"to make coffee, while he proceeded with his loveproblems, for to him sex was the one and only holy\n" +
				"and important thing in life, although he had to sweat and curse to make a living and so on. You saw\n" +
				"that in the way he stood bobbing his head, always looking down, nodding, like a young boxer to\n" +
				"instructions, to make you think he was listening to every word, throwing in a thousand 'Yeses' and\n" +
				"'That’s rights.' My first impression of Dean was of a young Gene Autry - trim, thin-hipped, blueeyed,\n" +
				"with a real Oklahoma accent - a sideburned hero of the snowy West. In fact he’d just been\n" +
				"working on a ranch, Ed Wall’s in Colorado, before marrying Marylou and coming East. Marylou\n" +
				"was a pretty blonde with immense ringlets of hair like a sea of golden tresses; she sat there on the\n" +
				"edge of the couch with her hands hanging in her lap and her smoky blue country eyes fixed in a wide\n" +
				"stare because she was in an evil gray New York pad that she’d heard about back West, and waiting\n" +
				"like a longbodied emaciated Modigliani surrealist woman in a serious room. But, outside of being a\n" +
				"sweet little girl, she was awfully dumb and capable of doing horrible things. That night we all drank\n" +
				"beer and pulled wrists and talked till dawn, and in the morning, while we sat around dumbly smoking\n" +
				"butts from ashtrays in the gray light of a gloomy day, Dean got up nervously, paced around, thinking,\n" +
				"and decided the thing to do was to have Marylou make breakfast and sweep the floor. 'In other words we’ve got to get on the ball, darling, what I’m saying, otherwise it’ll be fluctuating and lack of\n" +
				"true knowledge or crystallization of our plans.' Then I went away.\n";
//		addSlide(ClueFragment.newInstance("title1", description));
//		addSlide(ClueFragment.newInstance("title2", description));
//		addSlide(ClueFragment.newInstance("title3", description));

		Slide loginSlide = new FragmentSlide.Builder()
				.background(R.color.color_dark_try)
				.backgroundDark(R.color.color_dark_custom_fragment_1)
				.fragment(ClueFragment.newInstance("", description, Color.parseColor("#000000")))
				.build();
		Slide loginSlide1 = new FragmentSlide.Builder()
				.background(R.color.color_dark_try)
				.backgroundDark(R.color.color_dark_material_metaphor)
				.fragment(ClueFragment.newInstance("", description,Color.parseColor("#003300")))
				.build();
		Slide loginSlide2 = new FragmentSlide.Builder()
				.background(R.color.color_dark_try)
				.backgroundDark(R.color.color_dark_material_shadow)
				.fragment(ClueFragment.newInstance("", description, Color.parseColor("#000033")))
				.build();
		Slide loginSlide3 = new FragmentSlide.Builder()
				.background(R.color.color_dark_try)
				.backgroundDark(R.color.color_dark_custom_fragment_1)
				.fragment(ClueFragment.newInstance("", description, Color.parseColor("#330000")))
				.build();
		addSlide(loginSlide);
		addSlide(loginSlide1);
		addSlide(loginSlide2);
		addSlide(loginSlide3);
	}


}
