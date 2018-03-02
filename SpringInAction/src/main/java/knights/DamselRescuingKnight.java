package knights;

public class DamselRescuingKnight implements Knight {

    private RescueDamselQuest quest;

    private DamselRescuingKnight(){
        this.quest = new RescueDamselQuest();
    }
    public void embarkQuest() {
        quest.embark();
    }
}
