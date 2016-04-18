package zukowski.rafal.intervals.Database;

/**
 * Created by U0145084 on 2016-04-02.
 */
public class Category {

    public int Id;
    public String Description;
    public String PathToSound;

    public Category(int id, String description, String pathToSound){
        this.Id = id;
        this.Description = description;
        this.PathToSound = pathToSound;
    }

    @Override
    public String toString(){
        return this.Description;
    }


}
