// import java.util.*;

// public class RandomEvents
// {
//     public static int roadEvents()
//     {
//         int num = (int) (Math.random() * 1000 + 1);
//         if (num == 1)
//         {
//             return 1;
//         }
//         else if (num <= 16)
//         {
//             return 2;
//         }
//         return 0;
//     }
//     public static void cityEvents()
//     {
//         int num = (int) (1+Math.random()*100);
//         if (num < 16)
//         {
//             talk();
//         }
//         else if (num < 18)
//         {
//             if (GrapesOfWrath.getFood() > 0)
//             {
//                 System.out.println("You give some of your food to another family. Even in hardship, you always help those in need.");
//                 GrapesOfWrath.addFood(-1*(int)(1+Math.random()*50));
//             }
//         }
//         else if (num < 20)
//         {
//             System.out.println("A local store clerk gives you some food for free.");
//             GrapesOfWrath.addFood((int)(1+Math.random()*50));
//          }
//         else if (num < 21)
//         {
//             System.out.println("Another family gives you some of their food.");
//             GrapesOfWrath.addFood((int)(1+Math.random()*50));
//         }
//         else if (num < 23)
//         {
//             if (GrapesOfWrath.getGas() > 0)
//             {
//                 System.out.println("You give some of your gas to another family. Even in hardship, you always help those in need.");
//                 GrapesOfWrath.addGas(-1*(int)(1+Math.random()*125));
//             }
//         }
//         else if (num < 25)
//         {
//             System.out.println("A local store clerk gives you some gas for free.");
//             GrapesOfWrath.addGas((int)(1+Math.random()*125));
//         }
//         else if (num < 26)
//         {
//             System.out.println("Another family gives you some of their gas.");
//             GrapesOfWrath.addGas((int)(1+Math.random()*125));
//         }
//         else if (num < 28)
//         {
//             if (GrapesOfWrath.getMoney() > 0)
//             {
//                 System.out.println("You give some of your money to another family. Even in hardship, you always help those in need.");
//                 GrapesOfWrath.addMoney(0.1+Math.random()*2.0);
//             }
//         } 
//         else if (num < 30)
//         {
//             System.out.println("A local store clerk gives you some money.");
//             GrapesOfWrath.addMoney(0.1+Math.random()*2.0);
//         }
//         else if (num < 31)
//         {
//             System.out.println("Another family gives you some of their money.");
//             GrapesOfWrath.addMoney(0.1+Math.random()*2.0);
//         }
//     }
//     public static void campEvents()
//     {
//         int num = (int) (1+Math.random()*100);
//         if (num < 26)
//         {
//             talk();
//         }
//         else if (num < 28)
//         {
//             if (GrapesOfWrath.getFood() > 0)
//             {
//                 System.out.println("You give some of your food to another family. Even in hardship, you always help those in need.");
//                 GrapesOfWrath.addFood(-1*(int)(1+Math.random()*50));
//             }
//         }
//         else if (num < 31)
//         {
//             System.out.println("Another family gives you some of their food");
//             GrapesOfWrath.addFood((int)(1+Math.random()*50));
//         }
//         else if (num < 33)
//         {
//             if (GrapesOfWrath.getGas() > 0)
//             {
//                 System.out.println("You give some of your gas to another family. Even in hardship, you always help those in need.");
//                 GrapesOfWrath.addGas(-1*(int)(1+Math.random()*125));
//             }
//         }
//         else if (num < 36)
//         {
//             System.out.println("Another family gives you some of their gas.");
//             GrapesOfWrath.addGas((int)(1+Math.random()*125));
//         }
//         else if (num < 38)
//         {
//             if (GrapesOfWrath.getMoney() > 0.01)
//             {
//                 System.out.println("You give some of your money to another family. Even in hardship, you always help those in need.");
//                 GrapesOfWrath.addMoney(GrapesOfWrath.round(0.1+Math.random()*2.0));
//             }
//         }
//         else if (num < 40)
//         {
//             System.out.println("A local store clerk gives you some money.");
//             GrapesOfWrath.addMoney(GrapesOfWrath.round(0.1+Math.random()*2.0));
//         }
//         else if (num < 41)
//         {
//             System.out.println("Another family gives you some of their money.");
//             GrapesOfWrath.addMoney(GrapesOfWrath.round(0.1+Math.random()*2.0));
//         }
//         else if (num < 46)
//         {
//             System.out.println("The police burn down the camp. You camp on the side of the road for night.");
//             GrapesOfWrath.setRestingPlace(0);
//         }
//     }
//     public static void talk()
//     {
//         int num = (int) (1+Math.random()*35);
//         System.out.println("You talk to a local.");
//         switch(num)
//         {
//             case 1:
//                 System.out.println("\"I should've stayed home. It may not have been the most luxurious place, but at least I could call it home.\"");
//                 break;
//             case 2:
//                 System.out.println("\"I'm going back home. There's no jobs out West, and everyone seems to hate you. God knows why. I'm going to die either way; might as well do it at home.\"");
//                 break;
//             case 3:
//                 System.out.println("\"What's with all the folks going out West? Seems like no one nowadays knows what's going on in this country, especially not me.\"");
//                 break;
//             case 4:
//                 System.out.println("\"What's the deal with all these Okies? They all come in dirty and use up everything we have and then beg for more. If you ask me, they should all come back where they come from.\"");
//                 break;
//             case 5:
//                 System.out.println("\"Why are those cops always picking on us? They're all well-fed and we're barely getting by. What business do they have bossing us around?\"");
//                 break;
//             case 6:
//                 System.out.println("\"If I just had a few acres or so, I could be comfortable. All I'd need is some land, a few pigs, and some corn, then I'd be set.\"");
//                 break;
//             case 7:
//                 System.out.println("\"If you find a job, ask what the pay is. Or else you'll be working for pennies, and you'll take because you've got kids to feed, and it'll cost you your wife and kids to realize you've been played.\"");
//                 break;
//             case 8:
//                 System.out.println("\"You know, there's a rich guy in California with thousands upon thousands of acres. What can you even do with that much land? I tell you, all I'd need is a few of those acres and I'd be happy.\"");
//                 break;
//             case 9:
//                 System.out.println("\"You'd think it'd be good to put your kids in school, get them some education. But the other kids will mock and yell 'Okie! Okie!' Had to pull them out.\"");
//                 break;
//             case 10:
//                 System.out.println("\"I heard there were government camps out West, where you can settle down with other migrants. There's no cops allowed, and they even have hot water.\"");
//                 break;
//             case 11:
//                 System.out.println("\"I can't wait to get to California. I've seen the handbills. There's rows and rows of peaches ripe for the picking, I could sneak one to eat every now and then.\"");
//                 break;
//             case 12:
//                 System.out.println("\"The handbills are nothing but a big lie. They print out 5000 handbills, and they need maybe 1000 men, and then all these people go out West for jobs that are already taken.");
//                 break;
//             case 13:
//                 System.out.println("\"I can't stop thinking about the old house. It wasn't too large, but it had everything we had ever known, until the tractors ran it down.\"");
//                 break;
//             case 14:
//                 System.out.println("\"We had a good thing going back home. We had corn and some pigs and a nice family and neighbors, until the bank pushed us off.\"");
//                 break;
//             case 15:
//                 System.out.println("\"Everyone's coming out West for jobs, but there's hardly any.\"");
//                 break;
//             case 16:
//                 System.out.println("\"Do you know how to play the guitar? I'm a mighty mean harmonica player and I know a few songs.\"");
//                 break;
//             case 17:
//                 System.out.println("\"To tell you the truth, I didn't want to come. I should've stayed home. But the whole family was going, and at that point I just had to.\"");
//                 break;
//             case 18:
//                 System.out.println("\"When's the last time I've had a good meal? I can't remember. Those rich folks in their big houses got meat and fruit everyday, and how hard have they worked?\"");
//                 break;
//             case 19:
//                 System.out.println("\"I've been figuring, that maybe we're all part of something larger, like a collective soul. I figure if we all stop fighting, then maybe we can get what we want.\"");
//                 break;
//             case 20:
//                 System.out.println("\"Where can an honest hardworking man live in this world? Seems like every place you turn, someone's trying to screw you over.\"");
//                 break;
//             case 21:
//                 System.out.println("\"I'll tell you those government camps are all just full of sin. They had plays, where people pretended to be something they're not, and dancing! Oh, the dancing! Keep your children away from such sin.\"");
//                 break;
//             case 22:
//                 System.out.println("\"This is such a pretty country. Shame I can't really appreciate it, instead having to run around the country to hope to get a morsel.\"");
//                 break;
//             case 23:
//                 System.out.println("\"All this travelling and worrying can't be good for the kids. Twenty, or even ten cents isn't enough to feed a man and his wife and kids. They're all dying of what they call malnutrition.\"");
//                 break;
//             case 24:
//                 System.out.println("\"Once I get some money for myself, I'm going to go right back to dancing. I just can't sit still, and I've seen some real pretty girls around this part of the country.\"");
//                 break;
//             case 25:
//                 System.out.println("\"Why, once I get to California, I'll study cars or books or something, and get a nice job and a cozy house and a couple of kids. As long as I can get through now, I'll be fine.\"");
//                 break;
//             case 26:
//                 System.out.println("\"My life's just about over. The tractors are just the nail in the coffin. It's too late for me to start again now; I'm far too old. All I can hope is that kids like you turn out all right. Promise me you'll turn out all right.\"");
//                 break;
//             case 27:
//                 System.out.println("\"We may not be doing the best right now, but you've got to help out people in need; it's simply the right thing to do. If only the more well-to-do people in this world could do the same.\"");
//                 break;
//             case 28:
//                 System.out.println("\"It's getting to the point where I have to beg to get half of what I need. It's humiliating to do this to a man. Don't even get me started on the Salvation Army.\"");
//                 break;
//             case 29:
//                 System.out.println("\"All we have every day is fried dough. We don't even have flour anymore; we have to use whatever sort of dust or shavings we can find.\"");
//                 break;
//             case 30:
//                 System.out.println("\"Have you ever seen some of those cars, that look just about ready to fall apart, filled to the brim with pots and pans and little kids and the like? I wonder where they're headed, and what for.\"");
//                 break;
//             case 31:
//                 System.out.println("\"I'm sick and tired of people telling me what I can do. Next time some cop comes all high and mighty, I'm going to put the sharpest object I can find straight through his skull.\"");
//                 break;
//             case 32:
//                 System.out.println("\"The police over here don't fight for justice. They'll say you need to do this or that, and they won't say why, and if you question them or disagree, they'll just put you in jail.\"");
//                 break;
//             case 33:
//                 System.out.println("\"I'm telling you, if I just had another year there could've been a good crop, and I could pay off my debt, and I wouldn't have to be here.\"");
//                 break;
//             case 34:
//                 System.out.println("\"Have you heard what happened in Akron. The workers all got and stood outside the factory. They said they wouldn't work unless they got paid more. The factory owners just had to listen to them. Maybe we could do something like that.\"");
//                 break;
//             case 35:
//                 System.out.println("\"You've got to take the days one at a time. Don't get too preoccupied thinking about the future or the past. That brings you down. Just one foot in front of the other, like that.\"");
//                 break;
//         }
//     }
// }
