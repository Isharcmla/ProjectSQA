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
import java.lang.Character;
import java.lang.Object;
import java.lang.String;

public class CSVFormat_printRecord_64446801539 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16267;
     Object term16449;

    public CSVFormat_printRecord_64446801539() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term16269 = new Character('I');
        Character term16272 = new Character('Y');
        Character term16423 = new Character('n');
        Class<? extends Object> term16572 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term16571 = ((Class) term16572).getDeclaredField((String) "NONE");
        ((Field) term16571).setAccessible(true);
        Object enum36 = ((Field) term16571).get((Object) null);
        term16267 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term16274 = (Object[]) newArray("java.lang.String", 6);
        Object[] term16347 = (Object[]) newArray("java.lang.String", 5);
        setBooleanField(term16267, term16267.getClass(), "allowMissingColumnNames", true);
        setField(term16267, term16267.getClass(), "commentMarker", term16269);
        setCharField(term16267, term16267.getClass(), "delimiter", 'n');
        setField(term16267, term16267.getClass(), "escapeCharacter", term16272);
        setElement(term16274, 0, "NFlvfJCVPO");
        setElement(term16274, 1, "KarbTXFmUU");
        setElement(term16274, 2, "jiUSjqwSIQ");
        setElement(term16274, 3, "MgLCedQfoj");
        setElement(term16274, 4, "zgKiINdgNu");
        setElement(term16274, 5, "zLMTXDQHYH");
        setField(term16267, term16267.getClass(), "header", term16274);
        setElement(term16347, 0, "PqywFWJlpE");
        setElement(term16347, 1, "OzXRsFGTIp");
        setElement(term16347, 2, "TjWpyghUWN");
        setElement(term16347, 3, "dkZFDZxcde");
        setElement(term16347, 4, "WXcZEtUKlI");
        setField(term16267, term16267.getClass(), "headerComments", term16347);
        setBooleanField(term16267, term16267.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term16267, term16267.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term16267, term16267.getClass(), "ignoreSurroundingSpaces", true);
        setField(term16267, term16267.getClass(), "nullString", "IkpjUOuWQU");
        setField(term16267, term16267.getClass(), "quoteCharacter", term16423);
        setField(term16267, term16267.getClass(), "quoteMode", enum36);
        setField(term16267, term16267.getClass(), "recordSeparator", "boSSpezHeU");
        setBooleanField(term16267, term16267.getClass(), "skipHeaderRecord", true);
        setBooleanField(term16267, term16267.getClass(), "trailingDelimiter", true);
        setBooleanField(term16267, term16267.getClass(), "trim", true);
        setBooleanField(term16267, term16267.getClass(), "autoFlush", true);
        term16449 = (Object[]) newArray("java.lang.Object", 1);
        Object term16450 = newInstance(Class.forName("java.lang.Object"));
        setElement(term16449, 0, term16450);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term16449;
        callMethod(klass, "printRecord", argTypes, term16267, args);
    }

};


