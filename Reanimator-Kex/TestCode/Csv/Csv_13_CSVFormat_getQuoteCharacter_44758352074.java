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

public class CSVFormat_getQuoteCharacter_44758352074 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6179;
     Object term50083;
     Object term49220;

    public CSVFormat_getQuoteCharacter_44758352074() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term6181 = new Character('S');
        Class<? extends Object> term50868 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term50867 = ((Class) term50868).getDeclaredField((String) "MINIMAL");
        ((Field) term50867).setAccessible(true);
        Object enum85 = ((Field) term50867).get((Object) null);
        Character term6194 = new Character('z');
        Character term6196 = new Character('j');
        term6179 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term6225 = (Object[]) newArray("java.lang.String", 6);
        Object[] term6298 = (Object[]) newArray("java.lang.String", 6);
        setCharField(term6179, term6179.getClass(), "delimiter", 'b');
        setField(term6179, term6179.getClass(), "quoteCharacter", term6181);
        setField(term6179, term6179.getClass(), "quoteMode", enum85);
        setField(term6179, term6179.getClass(), "commentMarker", term6194);
        setField(term6179, term6179.getClass(), "escapeCharacter", term6196);
        setBooleanField(term6179, term6179.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term6179, term6179.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term6179, term6179.getClass(), "ignoreEmptyLines", false);
        setField(term6179, term6179.getClass(), "recordSeparator", "mvrkADEgpp");
        setField(term6179, term6179.getClass(), "nullString", "pXOkjyeIRb");
        setElement(term6225, 0, "GgZWSjxjyE");
        setElement(term6225, 1, "EeBVbzjcCI");
        setElement(term6225, 2, "UfQtPRyWRC");
        setElement(term6225, 3, "FPvxVzzSvD");
        setElement(term6225, 4, "WHcwFgsGFC");
        setElement(term6225, 5, "HzqpegHiRq");
        setField(term6179, term6179.getClass(), "header", term6225);
        setElement(term6298, 0, "jwsfVjMoJT");
        setElement(term6298, 1, "ZfdXfCCFDf");
        setElement(term6298, 2, "MwwjNtdOFT");
        setElement(term6298, 3, "VYkqXKVlAJ");
        setElement(term6298, 4, "XkIoWJRNwN");
        setElement(term6298, 5, "aNWLJdrZMq");
        setField(term6179, term6179.getClass(), "headerComments", term6298);
        setBooleanField(term6179, term6179.getClass(), "skipHeaderRecord", false);
        setBooleanField(term6179, term6179.getClass(), "ignoreHeaderCase", false);
        Character term50084 = new Character('S');
        Class<? extends Object> term51196 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term51195 = ((Class) term51196).getDeclaredField((String) "MINIMAL");
        ((Field) term51195).setAccessible(true);
        Object enum86 = ((Field) term51195).get((Object) null);
        Character term50088 = new Character('z');
        Character term50824 = new Character('j');
        term50083 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term50841 = (Object[]) newArray("java.lang.String", 6);
        Object[] term50854 = (Object[]) newArray("java.lang.String", 6);
        setCharField(term50083, term50083.getClass(), "delimiter", 'b');
        setField(term50083, term50083.getClass(), "quoteCharacter", term50084);
        setField(term50083, term50083.getClass(), "quoteMode", enum86);
        setField(term50083, term50083.getClass(), "commentMarker", term50088);
        setField(term50083, term50083.getClass(), "escapeCharacter", term50824);
        setBooleanField(term50083, term50083.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term50083, term50083.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term50083, term50083.getClass(), "ignoreEmptyLines", false);
        setField(term50083, term50083.getClass(), "recordSeparator", "mvrkADEgpp");
        setField(term50083, term50083.getClass(), "nullString", "pXOkjyeIRb");
        setElement(term50841, 0, "GgZWSjxjyE");
        setElement(term50841, 1, "EeBVbzjcCI");
        setElement(term50841, 2, "UfQtPRyWRC");
        setElement(term50841, 3, "FPvxVzzSvD");
        setElement(term50841, 4, "WHcwFgsGFC");
        setElement(term50841, 5, "HzqpegHiRq");
        setField(term50083, term50083.getClass(), "header", term50841);
        setElement(term50854, 0, "jwsfVjMoJT");
        setElement(term50854, 1, "ZfdXfCCFDf");
        setElement(term50854, 2, "MwwjNtdOFT");
        setElement(term50854, 3, "VYkqXKVlAJ");
        setElement(term50854, 4, "XkIoWJRNwN");
        setElement(term50854, 5, "aNWLJdrZMq");
        setField(term50083, term50083.getClass(), "headerComments", term50854);
        setBooleanField(term50083, term50083.getClass(), "skipHeaderRecord", false);
        setBooleanField(term50083, term50083.getClass(), "ignoreHeaderCase", false);
        term49220 = new Character('S');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getQuoteCharacter", argTypes, term6179, args);
        assertTrue(recursiveEquals(term6179, term50083));
        assertTrue(recursiveEquals(retValue, term49220));
    }

};


