package zukowski.rafal.intervals.Database;

/**
 * Created by U0145084 on 2016-04-02.
 */
public class Series {

    public int Id;
    public int Repeats;

    public int UserSessionId;

    public Series(int id,int repeats,int userSessionId){
        this.Id = id;
        this.Repeats = repeats;
        this.UserSessionId = userSessionId;
    }

}
