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

public class CSVFormat_getHeader_180582740867 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3067;
     Object term44307;
     Object term43935;

    public CSVFormat_getHeader_180582740867() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term3069 = new Character('t');
        Class<? extends Object> term44325 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term44324 = ((Class) term44325).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term44324).setAccessible(true);
        Object enum68 = ((Field) term44324).get((Object) null);
        Character term3086 = new Character('l');
        Character term3088 = new Character('P');
        term3067 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term3117 = (Object[]) newArray("java.lang.String", 0);
        Object[] term3118 = (Object[]) newArray("java.lang.String", 2);
        setCharField(term3067, term3067.getClass(), "delimiter", 'x');
        setField(term3067, term3067.getClass(), "quoteCharacter", term3069);
        setField(term3067, term3067.getClass(), "quoteMode", enum68);
        setField(term3067, term3067.getClass(), "commentMarker", term3086);
        setField(term3067, term3067.getClass(), "escapeCharacter", term3088);
        setBooleanField(term3067, term3067.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term3067, term3067.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term3067, term3067.getClass(), "ignoreEmptyLines", true);
        setField(term3067, term3067.getClass(), "recordSeparator", "bLPjGVBhlX");
        setField(term3067, term3067.getClass(), "nullString", "whBvTVIIlC");
        setField(term3067, term3067.getClass(), "header", term3117);
        setElement(term3118, 0, "IgRJUzaCwW");
        setElement(term3118, 1, "JUmudUmaaV");
        setField(term3067, term3067.getClass(), "headerComments", term3118);
        setBooleanField(term3067, term3067.getClass(), "skipHeaderRecord", true);
        setBooleanField(term3067, term3067.getClass(), "ignoreHeaderCase", false);
        Character term44308 = new Character('t');
        Class<? extends Object> term44565 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term44564 = ((Class) term44565).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term44564).setAccessible(true);
        Object enum69 = ((Field) term44564).get((Object) null);
        Character term44312 = new Character('l');
        Character term44313 = new Character('P');
        term44307 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term44318 = (Object[]) newArray("java.lang.String", 0);
        Object[] term44319 = (Object[]) newArray("java.lang.String", 2);
        setCharField(term44307, term44307.getClass(), "delimiter", 'x');
        setField(term44307, term44307.getClass(), "quoteCharacter", term44308);
        setField(term44307, term44307.getClass(), "quoteMode", enum69);
        setField(term44307, term44307.getClass(), "commentMarker", term44312);
        setField(term44307, term44307.getClass(), "escapeCharacter", term44313);
        setBooleanField(term44307, term44307.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term44307, term44307.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term44307, term44307.getClass(), "ignoreEmptyLines", true);
        setField(term44307, term44307.getClass(), "recordSeparator", "bLPjGVBhlX");
        setField(term44307, term44307.getClass(), "nullString", "whBvTVIIlC");
        setField(term44307, term44307.getClass(), "header", term44318);
        setElement(term44319, 0, "IgRJUzaCwW");
        setElement(term44319, 1, "JUmudUmaaV");
        setField(term44307, term44307.getClass(), "headerComments", term44319);
        setBooleanField(term44307, term44307.getClass(), "skipHeaderRecord", true);
        setBooleanField(term44307, term44307.getClass(), "ignoreHeaderCase", false);
        term43935 = (Object[]) newArray("java.lang.String", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getHeader", argTypes, term3067, args);
        assertTrue(recursiveEquals(term3067, term44307));
        assertTrue(recursiveEquals(retValue, term43935));
    }

};


