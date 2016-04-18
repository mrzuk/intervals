package zukowski.rafal.intervals.Database;

/**
 * Created by U0145084 on 2016-04-02.
 */
public class SeriesPart {
    public int Id;
    public int Seconds;
    public int CategoryId;
    public int SeriesId;


    public SeriesPart(int id, int seconds,int categoryId,int seriesId){
        this.Id = id;
        this.Seconds = seconds;
        this.CategoryId = categoryId;
        this.SeriesId = seriesId;
    }
}
