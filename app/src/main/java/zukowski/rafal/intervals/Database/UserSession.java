package zukowski.rafal.intervals.Database;

import java.util.Date;

/**
 * Created by U0145084 on 2016-04-02.
 */
public class UserSession {
    public int Id;
    public Date Created;


    public UserSession(int id, Date created){
        this.Id = id;
        this.Created = created;
    }
}
