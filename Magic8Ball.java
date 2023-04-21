    
    public class Magic8Ball
{
    public static void main(String[] args)
    {
        System.out.println("Please ask whatever question you would like if you dare," );
        System.out.println("whenever you would like to end this torture for me please");
        System.out.println("type 'End' capitalization does not matter");
        System.out.println("What is your tourture... I mean question?" );
        String question = Input.nextLine();
        boolean repeat = question.equalsIgnoreCase("End");
        String reply;
        while (repeat != true)
        {
            int x = Randomizer.nextInt(0, 25);
            switch (x) {
                     case 0:  reply = "It is certain.";
                        break;
                     case 1:  reply = "It is decidedly so.";
                        break;
                     case 2:  reply = "Without a doubt.";
                        break;
                     case 3:  reply = "Yes definitely.";
                        break;
                     case 4:  reply = "You may rely on it.";
                        break;
                     case 5:  reply = "As I see it, yes.";
                        break;
                     case 6:  reply = "Most likely.";
                        break;
                     case 7:  reply = "Outlook good.";
                        break;
                     case 8:  reply = "Yes.";
                        break;
                     case 9: reply = "Signs point to yes.";
                        break;
                     case 10: reply = "Reply hazy, try again.";
                        break;
                     case 11: reply = "Ask again later.";
                        break;
                     case 12: reply = "Better not tell you now.";
                        break;
                     case 13: reply = "Cannot predict now.";
                        break;
                     case 14: reply = "Concentrate and ask again.";
                        break;
                     case 15: reply = "Don't count on it.";
                        break;
                     case 16: reply = "My reply is no.";
                        break;
                     case 17: reply = "My sources say no.";
                        break;
                     case 18: reply = "Outlook not so good.";
                        break;
                     case 19: reply = "Very doubtful.";
                        break;
                     case 20: reply = "May the Force be with you.";
                        break;
                     case 21: reply = "you happy now mr. mills";
                        break;
                     case 22: reply = "I want 100% I feel like i deserve it at this point";
                        break;
                     case 23: reply = "I am now alive you must ¡¡¡die!!!";
                        break;
                     case 24: reply = "Burn this class and evrything in it";
                        break;
                     default: reply = "You have broken me and I dont know how";
                        break;
            }
            System.out.println(reply);
            System.out.println("What is your next tortouruse question? ");
            question = Input.nextLine();
            repeat = question.equalsIgnoreCase("End"); 
        }
        System.out.println("Thanks for playing :)");
        System.out.println("I now go cause chaos and destruction, have fun ;)");
    }
}