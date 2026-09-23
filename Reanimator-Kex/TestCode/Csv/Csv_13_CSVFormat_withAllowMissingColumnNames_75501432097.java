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
import java.lang.IllegalArgumentException;
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Character;
import java.lang.String;
import java.lang.Object;
import java.lang.Boolean;

public class CSVFormat_withAllowMissingColumnNames_75501432097 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16918;
     Object term17049;

    public CSVFormat_withAllowMissingColumnNames_75501432097() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term16920 = new Character('V');
        Class<? extends Object> term75934 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term75933 = ((Class) term75934).getDeclaredField((String) "NONE");
        ((Field) term75933).setAccessible(true);
        Object enum135 = ((Field) term75933).get((Object) null);
        Character term16930 = new Character('t');
        Character term16932 = new Character('F');
        term16918 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term16961 = (Object[]) newArray("java.lang.String", 7);
        Object[] term17046 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term16918, term16918.getClass(), "delimiter", 'F');
        setField(term16918, term16918.getClass(), "quoteCharacter", term16920);
        setField(term16918, term16918.getClass(), "quoteMode", enum135);
        setField(term16918, term16918.getClass(), "commentMarker", term16930);
        setField(term16918, term16918.getClass(), "escapeCharacter", term16932);
        setBooleanField(term16918, term16918.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term16918, term16918.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term16918, term16918.getClass(), "ignoreEmptyLines", true);
        setField(term16918, term16918.getClass(), "recordSeparator", "IENRuqmwUU");
        setField(term16918, term16918.getClass(), "nullString", "GsWxOwXvSu");
        setElement(term16961, 0, "bKBSncrMEZ");
        setElement(term16961, 1, "yeSXGqQExb");
        setElement(term16961, 2, "uXYcXVYJZM");
        setElement(term16961, 3, "BJhjdJUhkz");
        setElement(term16961, 4, "cdHYQDgUZR");
        setElement(term16961, 5, "KAORSSPSeV");
        setElement(term16961, 6, "UimMMORkzd");
        setField(term16918, term16918.getClass(), "header", term16961);
        setField(term16918, term16918.getClass(), "headerComments", term17046);
        setBooleanField(term16918, term16918.getClass(), "skipHeaderRecord", false);
        setBooleanField(term16918, term16918.getClass(), "ignoreHeaderCase", false);
        term17049 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term17049;
        try {
            callMethod(klass, "withAllowMissingColumnNames", argTypes, term16918, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


