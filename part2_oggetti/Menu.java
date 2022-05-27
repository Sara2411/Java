public class Menu {
    
    private String menuText;
    private int optionCount;

    public Menu ()  
    {
        menuText = "";
        optionCount = 0;
    }

    public void addOption (String option)
    {
        optionCount++;
        menuText += optionCount + ") " + option + "\n";
    }

    public void display ()
    {
        System.out.println(menuText);
    }

    public String getOption (int k)
    {
        String[] opzioni = menuText.split("\n");
        String opzione = opzioni[k-1];
        int posizione = opzione.indexOf(") ");
        return opzione.substring(posizione+2);
    }
}
