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

public class CSVFormat_getAllowMissingColumnNames_47810498553 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2432;
     Object term23752;

    public CSVFormat_getAllowMissingColumnNames_47810498553() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term2434 = new Character('t');
        Class<? extends Object> term23779 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term23778 = ((Class) term23779).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term23778).setAccessible(true);
        Object enum56 = ((Field) term23778).get((Object) null);
        Character term2451 = new Character('l');
        Character term2453 = new Character('P');
        term2432 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term2482 = (Object[]) newArray("java.lang.String", 7);
        setCharField(term2432, term2432.getClass(), "delimiter", 'x');
        setField(term2432, term2432.getClass(), "quoteCharacter", term2434);
        setField(term2432, term2432.getClass(), "quoteMode", enum56);
        setField(term2432, term2432.getClass(), "commentMarker", term2451);
        setField(term2432, term2432.getClass(), "escapeCharacter", term2453);
        setBooleanField(term2432, term2432.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term2432, term2432.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term2432, term2432.getClass(), "ignoreEmptyLines", true);
        setField(term2432, term2432.getClass(), "recordSeparator", "UlajhuVLaP");
        setField(term2432, term2432.getClass(), "nullString", "gGSMzuGICf");
        setElement(term2482, 0, "hxCBltsObl");
        setElement(term2482, 1, "BndsHwAFMv");
        setElement(term2482, 2, "GzFkzHGYFt");
        setElement(term2482, 3, "tShwQLRGNe");
        setElement(term2482, 4, "LvtrsXUliU");
        setElement(term2482, 5, "xLbjWUgOIL");
        setElement(term2482, 6, "jDtqGUpnZN");
        setField(term2432, term2432.getClass(), "header", term2482);
        setBooleanField(term2432, term2432.getClass(), "skipHeaderRecord", true);
        Character term23753 = new Character('t');
        Class<? extends Object> term24069 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term24068 = ((Class) term24069).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term24068).setAccessible(true);
        Object enum57 = ((Field) term24068).get((Object) null);
        Character term23757 = new Character('l');
        Character term23758 = new Character('P');
        term23752 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term23763 = (Object[]) newArray("java.lang.String", 7);
        setCharField(term23752, term23752.getClass(), "delimiter", 'x');
        setField(term23752, term23752.getClass(), "quoteCharacter", term23753);
        setField(term23752, term23752.getClass(), "quoteMode", enum57);
        setField(term23752, term23752.getClass(), "commentMarker", term23757);
        setField(term23752, term23752.getClass(), "escapeCharacter", term23758);
        setBooleanField(term23752, term23752.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term23752, term23752.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term23752, term23752.getClass(), "ignoreEmptyLines", true);
        setField(term23752, term23752.getClass(), "recordSeparator", "UlajhuVLaP");
        setField(term23752, term23752.getClass(), "nullString", "gGSMzuGICf");
        setElement(term23763, 0, "hxCBltsObl");
        setElement(term23763, 1, "BndsHwAFMv");
        setElement(term23763, 2, "GzFkzHGYFt");
        setElement(term23763, 3, "tShwQLRGNe");
        setElement(term23763, 4, "LvtrsXUliU");
        setElement(term23763, 5, "xLbjWUgOIL");
        setElement(term23763, 6, "jDtqGUpnZN");
        setField(term23752, term23752.getClass(), "header", term23763);
        setBooleanField(term23752, term23752.getClass(), "skipHeaderRecord", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAllowMissingColumnNames", argTypes, term2432, args);
        assertTrue(recursiveEquals(term2432, term23752));
    }

};


