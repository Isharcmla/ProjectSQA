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

public class CSVFormat_toStringArray_25380192961 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term410;
     Object term544;
     Object term25877;
     Object term25904;
     Object term25713;

    public CSVFormat_toStringArray_25380192961() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term412 = new Character('T');
        Class<? extends Object> term25907 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term25906 = ((Class) term25907).getDeclaredField((String) "MINIMAL");
        ((Field) term25906).setAccessible(true);
        Object enum56 = ((Field) term25906).get((Object) null);
        Character term425 = new Character('D');
        Character term427 = new Character('s');
        term410 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term456 = (Object[]) newArray("java.lang.String", 3);
        Object[] term493 = (Object[]) newArray("java.lang.String", 4);
        setCharField(term410, term410.getClass(), "delimiter", 't');
        setField(term410, term410.getClass(), "quoteCharacter", term412);
        setField(term410, term410.getClass(), "quoteMode", enum56);
        setField(term410, term410.getClass(), "commentMarker", term425);
        setField(term410, term410.getClass(), "escapeCharacter", term427);
        setBooleanField(term410, term410.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term410, term410.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term410, term410.getClass(), "ignoreEmptyLines", true);
        setField(term410, term410.getClass(), "recordSeparator", "MjGYSRKTNF");
        setField(term410, term410.getClass(), "nullString", "hRNSzYYIrc");
        setElement(term456, 0, "RMFIsYGgne");
        setElement(term456, 1, "NRdvgJlhkX");
        setElement(term456, 2, "uuaPigETmJ");
        setField(term410, term410.getClass(), "header", term456);
        setElement(term493, 0, "MxlszYVzRf");
        setElement(term493, 1, "LQFpaHEwXR");
        setElement(term493, 2, "oVcInYnLWB");
        setElement(term493, 3, "aJlieCFVtF");
        setField(term410, term410.getClass(), "headerComments", term493);
        setBooleanField(term410, term410.getClass(), "skipHeaderRecord", false);
        setBooleanField(term410, term410.getClass(), "ignoreHeaderCase", true);
        term544 = (Object[]) newArray("java.lang.Object", 1);
        Object term545 = newInstance(Class.forName("java.lang.Object"));
        setElement(term544, 0, term545);
        Character term25878 = new Character('T');
        Class<? extends Object> term26185 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term26184 = ((Class) term26185).getDeclaredField((String) "MINIMAL");
        ((Field) term26184).setAccessible(true);
        Object enum57 = ((Field) term26184).get((Object) null);
        Character term25882 = new Character('D');
        Character term25883 = new Character('s');
        term25877 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term25888 = (Object[]) newArray("java.lang.String", 3);
        Object[] term25895 = (Object[]) newArray("java.lang.String", 4);
        setCharField(term25877, term25877.getClass(), "delimiter", 't');
        setField(term25877, term25877.getClass(), "quoteCharacter", term25878);
        setField(term25877, term25877.getClass(), "quoteMode", enum57);
        setField(term25877, term25877.getClass(), "commentMarker", term25882);
        setField(term25877, term25877.getClass(), "escapeCharacter", term25883);
        setBooleanField(term25877, term25877.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term25877, term25877.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term25877, term25877.getClass(), "ignoreEmptyLines", true);
        setField(term25877, term25877.getClass(), "recordSeparator", "MjGYSRKTNF");
        setField(term25877, term25877.getClass(), "nullString", "hRNSzYYIrc");
        setElement(term25888, 0, "RMFIsYGgne");
        setElement(term25888, 1, "NRdvgJlhkX");
        setElement(term25888, 2, "uuaPigETmJ");
        setField(term25877, term25877.getClass(), "header", term25888);
        setElement(term25895, 0, "MxlszYVzRf");
        setElement(term25895, 1, "LQFpaHEwXR");
        setElement(term25895, 2, "oVcInYnLWB");
        setElement(term25895, 3, "aJlieCFVtF");
        setField(term25877, term25877.getClass(), "headerComments", term25895);
        setBooleanField(term25877, term25877.getClass(), "skipHeaderRecord", false);
        setBooleanField(term25877, term25877.getClass(), "ignoreHeaderCase", true);
        term25904 = (Object[]) newArray("java.lang.Object", 1);
        Object term25905 = newInstance(Class.forName("java.lang.Object"));
        setElement(term25904, 0, term25905);
        term25713 = (Object[]) newArray("java.lang.String", 1);
        setElement(term25713, 0, "java.lang.Object@440d4315");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term544;
        Object retValue = callMethod(klass, "toStringArray", argTypes, term410, args);
        assertTrue(recursiveEquals(term410, term25877));
        assertTrue(recursiveEquals(term544, term25904));
        assertTrue(recursiveEquals(retValue, term25713));
    }

};


