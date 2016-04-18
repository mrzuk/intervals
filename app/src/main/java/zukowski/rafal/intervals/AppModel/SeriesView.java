package zukowski.rafal.intervals.AppModel;

import java.util.Dictionary;
import java.util.HashSet;

import zukowski.rafal.intervals.Database.Category;
import zukowski.rafal.intervals.Database.SeriesPart;

/**
 * Created by U0145084 on 2016-04-04.
 */
public class SeriesView {
    public int Repeats;
    public HashSet<Category> Categories;
    public HashSet<SeriesPart> SeriesParts;

    public SeriesView(int repeats,HashSet<SeriesPart> seriesParts){
        this.Repeats = repeats;
        this.SeriesParts = seriesParts;
    }

}
