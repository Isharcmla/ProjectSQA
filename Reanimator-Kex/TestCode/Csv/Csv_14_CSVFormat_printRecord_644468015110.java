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
import java.lang.NullPointerException;
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Character;
import java.lang.Object;
import java.lang.String;

public class CSVFormat_printRecord_644468015110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15371;
     Object term15552;

    public CSVFormat_printRecord_644468015110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term15373 = new Character('H');
        Character term15376 = new Character('w');
        Character term15527 = new Character('X');
        Class<? extends Object> term66824 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term66823 = ((Class) term66824).getDeclaredField((String) "NONE");
        ((Field) term66823).setAccessible(true);
        Object enum136 = ((Field) term66823).get((Object) null);
        term15371 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term15378 = (Object[]) newArray("java.lang.String", 6);
        Object[] term15451 = (Object[]) newArray("java.lang.String", 5);
        setBooleanField(term15371, term15371.getClass(), "allowMissingColumnNames", true);
        setField(term15371, term15371.getClass(), "commentMarker", term15373);
        setCharField(term15371, term15371.getClass(), "delimiter", 'E');
        setField(term15371, term15371.getClass(), "escapeCharacter", term15376);
        setElement(term15378, 0, "nKZKnxWYCK");
        setElement(term15378, 1, "JOqQxuzRuZ");
        setElement(term15378, 2, "RSaoipUlsg");
        setElement(term15378, 3, "cSHGbqKqlN");
        setElement(term15378, 4, "pFAfANnxup");
        setElement(term15378, 5, "FbSIUZyBXZ");
        setField(term15371, term15371.getClass(), "header", term15378);
        setElement(term15451, 0, "mhQDwIyrRi");
        setElement(term15451, 1, "HpZXWDPhlg");
        setElement(term15451, 2, "lBOokzEPfe");
        setElement(term15451, 3, "dtGZCsKXbW");
        setElement(term15451, 4, "bdyhHbDAmJ");
        setField(term15371, term15371.getClass(), "headerComments", term15451);
        setBooleanField(term15371, term15371.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term15371, term15371.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term15371, term15371.getClass(), "ignoreSurroundingSpaces", true);
        setField(term15371, term15371.getClass(), "nullString", "BBXiTNHqGE");
        setField(term15371, term15371.getClass(), "quoteCharacter", term15527);
        setField(term15371, term15371.getClass(), "quoteMode", enum136);
        setField(term15371, term15371.getClass(), "recordSeparator", "IEYhJmgCVd");
        setBooleanField(term15371, term15371.getClass(), "skipHeaderRecord", true);
        setBooleanField(term15371, term15371.getClass(), "trailingDelimiter", false);
        setBooleanField(term15371, term15371.getClass(), "trim", false);
        term15552 = (Object[]) newArray("java.lang.Object", 1);
        Object term15553 = newInstance(Class.forName("java.lang.Object"));
        setElement(term15552, 0, term15553);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term15552;
        try {
            callMethod(klass, "printRecord", argTypes, term15371, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


