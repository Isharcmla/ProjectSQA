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
import java.lang.Object;
import java.lang.String;

public class CSVFormat_getHeader_180582740884 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3060;
     Object term44346;
     Object term44264;

    public CSVFormat_getHeader_180582740884() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term3062 = new Character('x');
        Character term3065 = new Character('l');
        Character term3096 = new Character('P');
        Class<? extends Object> term44479 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term44478 = ((Class) term44479).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term44478).setAccessible(true);
        Object enum86 = ((Field) term44478).get((Object) null);
        term3060 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term3067 = (Object[]) newArray("java.lang.String", 1);
        Object[] term3080 = (Object[]) newArray("java.lang.String", 0);
        setBooleanField(term3060, term3060.getClass(), "allowMissingColumnNames", true);
        setField(term3060, term3060.getClass(), "commentMarker", term3062);
        setCharField(term3060, term3060.getClass(), "delimiter", 't');
        setField(term3060, term3060.getClass(), "escapeCharacter", term3065);
        setElement(term3067, 0, "tPlsykYBqO");
        setField(term3060, term3060.getClass(), "header", term3067);
        setField(term3060, term3060.getClass(), "headerComments", term3080);
        setBooleanField(term3060, term3060.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term3060, term3060.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term3060, term3060.getClass(), "ignoreSurroundingSpaces", true);
        setField(term3060, term3060.getClass(), "nullString", "bLPjGVBhlX");
        setField(term3060, term3060.getClass(), "quoteCharacter", term3096);
        setField(term3060, term3060.getClass(), "quoteMode", enum86);
        setField(term3060, term3060.getClass(), "recordSeparator", "whBvTVIIlC");
        setBooleanField(term3060, term3060.getClass(), "skipHeaderRecord", false);
        setBooleanField(term3060, term3060.getClass(), "trailingDelimiter", true);
        setBooleanField(term3060, term3060.getClass(), "trim", false);
        Character term44347 = new Character('x');
        Character term44348 = new Character('l');
        Character term44355 = new Character('P');
        Class<? extends Object> term44881 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term44880 = ((Class) term44881).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term44880).setAccessible(true);
        Object enum87 = ((Field) term44880).get((Object) null);
        term44346 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term44349 = (Object[]) newArray("java.lang.String", 1);
        Object[] term44352 = (Object[]) newArray("java.lang.String", 0);
        setBooleanField(term44346, term44346.getClass(), "allowMissingColumnNames", true);
        setField(term44346, term44346.getClass(), "commentMarker", term44347);
        setCharField(term44346, term44346.getClass(), "delimiter", 't');
        setField(term44346, term44346.getClass(), "escapeCharacter", term44348);
        setElement(term44349, 0, "tPlsykYBqO");
        setField(term44346, term44346.getClass(), "header", term44349);
        setField(term44346, term44346.getClass(), "headerComments", term44352);
        setBooleanField(term44346, term44346.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term44346, term44346.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term44346, term44346.getClass(), "ignoreSurroundingSpaces", true);
        setField(term44346, term44346.getClass(), "nullString", "bLPjGVBhlX");
        setField(term44346, term44346.getClass(), "quoteCharacter", term44355);
        setField(term44346, term44346.getClass(), "quoteMode", enum87);
        setField(term44346, term44346.getClass(), "recordSeparator", "whBvTVIIlC");
        setBooleanField(term44346, term44346.getClass(), "skipHeaderRecord", false);
        setBooleanField(term44346, term44346.getClass(), "trailingDelimiter", true);
        setBooleanField(term44346, term44346.getClass(), "trim", false);
        term44264 = (Object[]) newArray("java.lang.String", 1);
        setElement(term44264, 0, "tPlsykYBqO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getHeader", argTypes, term3060, args);
        assertTrue(recursiveEquals(term3060, term44346));
        assertTrue(recursiveEquals(retValue, term44264));
    }

};


