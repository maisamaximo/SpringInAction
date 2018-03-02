package knights;

/*constructor-args
* Quest is an interface - DI benefit: loose coupling*/

public class BraveKnight implements Knight{

    private Quest quest;
    private Minstrel minstrel;

    public BraveKnight(Quest quest, Minstrel minstrel){
        this.quest = quest;
        this.minstrel = minstrel;
    }

    public BraveKnight(SlayDragonQuest slayDragonQuest) {
    }

    public void embarkQuest() throws Exception{
        minstrel.singBeforeQuest();
        quest.embark();
        minstrel.singAfterQuest();
    }
}
