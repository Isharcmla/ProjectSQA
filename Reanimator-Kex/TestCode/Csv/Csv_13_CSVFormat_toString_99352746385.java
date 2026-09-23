package org.apache.commons.csv;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.csv.EqualityUtils.*;
import java.lang.Character;
import java.lang.String;
import java.lang.Object;

public class CSVFormat_toString_99352746385 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11405;
     Object term58921;

    public CSVFormat_toString_99352746385() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term11407 = new Character('g');
        Class<? extends Object> term58949 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term58948 = ((Class) term58949).getDeclaredField((String) "MINIMAL");
        ((Field) term58948).setAccessible(true);
        Object enum103 = ((Field) term58948).get((Object) null);
        Character term11420 = new Character('J');
        Character term11422 = new Character('l');
        term11405 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term11451 = (Object[]) newArray("java.lang.String", 2);
        Object[] term11476 = (Object[]) newArray("java.lang.String", 5);
        setCharField(term11405, term11405.getClass(), "delimiter", 'v');
        setField(term11405, term11405.getClass(), "quoteCharacter", term11407);
        setField(term11405, term11405.getClass(), "quoteMode", enum103);
        setField(term11405, term11405.getClass(), "commentMarker", term11420);
        setField(term11405, term11405.getClass(), "escapeCharacter", term11422);
        setBooleanField(term11405, term11405.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term11405, term11405.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term11405, term11405.getClass(), "ignoreEmptyLines", false);
        setField(term11405, term11405.getClass(), "recordSeparator", "zaloBqlrSo");
        setField(term11405, term11405.getClass(), "nullString", "vvoLrMGCoN");
        setElement(term11451, 0, "pXdglvyrQe");
        setElement(term11451, 1, "OcfNzHYdki");
        setField(term11405, term11405.getClass(), "header", term11451);
        setElement(term11476, 0, "uPuCVuZYOI");
        setElement(term11476, 1, "TweMFhxNdj");
        setElement(term11476, 2, "NBrvVzvQHe");
        setElement(term11476, 3, "FjOiNAfBOc");
        setElement(term11476, 4, "iCCsaLHohG");
        setField(term11405, term11405.getClass(), "headerComments", term11476);
        setBooleanField(term11405, term11405.getClass(), "skipHeaderRecord", false);
        setBooleanField(term11405, term11405.getClass(), "ignoreHeaderCase", true);
        Character term58922 = new Character('g');
        Class<? extends Object> term59227 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term59226 = ((Class) term59227).getDeclaredField((String) "MINIMAL");
        ((Field) term59226).setAccessible(true);
        Object enum104 = ((Field) term59226).get((Object) null);
        Character term58926 = new Character('J');
        Character term58927 = new Character('l');
        term58921 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term58932 = (Object[]) newArray("java.lang.String", 2);
        Object[] term58937 = (Object[]) newArray("java.lang.String", 5);
        setCharField(term58921, term58921.getClass(), "delimiter", 'v');
        setField(term58921, term58921.getClass(), "quoteCharacter", term58922);
        setField(term58921, term58921.getClass(), "quoteMode", enum104);
        setField(term58921, term58921.getClass(), "commentMarker", term58926);
        setField(term58921, term58921.getClass(), "escapeCharacter", term58927);
        setBooleanField(term58921, term58921.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term58921, term58921.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term58921, term58921.getClass(), "ignoreEmptyLines", false);
        setField(term58921, term58921.getClass(), "recordSeparator", "zaloBqlrSo");
        setField(term58921, term58921.getClass(), "nullString", "vvoLrMGCoN");
        setElement(term58932, 0, "pXdglvyrQe");
        setElement(term58932, 1, "OcfNzHYdki");
        setField(term58921, term58921.getClass(), "header", term58932);
        setElement(term58937, 0, "uPuCVuZYOI");
        setElement(term58937, 1, "TweMFhxNdj");
        setElement(term58937, 2, "NBrvVzvQHe");
        setElement(term58937, 3, "FjOiNAfBOc");
        setElement(term58937, 4, "iCCsaLHohG");
        setField(term58921, term58921.getClass(), "headerComments", term58937);
        setBooleanField(term58921, term58921.getClass(), "skipHeaderRecord", false);
        setBooleanField(term58921, term58921.getClass(), "ignoreHeaderCase", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term11405, args);
        assertTrue(recursiveEquals(term11405, term58921));
        assertTrue(recursiveEquals(retValue, "Delimiter=<v> Escape=<l> QuoteChar=<g> CommentStart=<J> NullString=<vvoLrMGCoN> RecordSeparator=<zaloBqlrSo> IgnoreHeaderCase:ignored SkipHeaderRecord:false HeaderComments:[uPuCVuZYOI, TweMFhxNdj, NBrvVzvQHe, FjOiNAfBOc, iCCsaLHohG] Header:[pXdglvyrQe, OcfNzHYdki]"));
    }

};


