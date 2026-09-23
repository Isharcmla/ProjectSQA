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

public class CSVFormat_isQuoteCharacterSet_196898539565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6540;
     Object term31385;

    public CSVFormat_isQuoteCharacterSet_196898539565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term6542 = new Character('h');
        Class<? extends Object> term31403 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term31402 = ((Class) term31403).getDeclaredField((String) "ALL");
        ((Field) term31402).setAccessible(true);
        Object enum81 = ((Field) term31402).get((Object) null);
        Character term6551 = new Character('R');
        Character term6553 = new Character('N');
        term6540 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term6582 = (Object[]) newArray("java.lang.String", 2);
        setCharField(term6540, term6540.getClass(), "delimiter", 'F');
        setField(term6540, term6540.getClass(), "quoteCharacter", term6542);
        setField(term6540, term6540.getClass(), "quoteMode", enum81);
        setField(term6540, term6540.getClass(), "commentMarker", term6551);
        setField(term6540, term6540.getClass(), "escapeCharacter", term6553);
        setBooleanField(term6540, term6540.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term6540, term6540.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term6540, term6540.getClass(), "ignoreEmptyLines", false);
        setField(term6540, term6540.getClass(), "recordSeparator", "SJiQaLvSKv");
        setField(term6540, term6540.getClass(), "nullString", "OEXDRUKcFl");
        setElement(term6582, 0, "RYdKCNNMBR");
        setElement(term6582, 1, "yGtHPyvYiQ");
        setField(term6540, term6540.getClass(), "header", term6582);
        setBooleanField(term6540, term6540.getClass(), "skipHeaderRecord", true);
        Character term31386 = new Character('h');
        Class<? extends Object> term31619 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term31618 = ((Class) term31619).getDeclaredField((String) "ALL");
        ((Field) term31618).setAccessible(true);
        Object enum82 = ((Field) term31618).get((Object) null);
        Character term31390 = new Character('R');
        Character term31391 = new Character('N');
        term31385 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term31396 = (Object[]) newArray("java.lang.String", 2);
        setCharField(term31385, term31385.getClass(), "delimiter", 'F');
        setField(term31385, term31385.getClass(), "quoteCharacter", term31386);
        setField(term31385, term31385.getClass(), "quoteMode", enum82);
        setField(term31385, term31385.getClass(), "commentMarker", term31390);
        setField(term31385, term31385.getClass(), "escapeCharacter", term31391);
        setBooleanField(term31385, term31385.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term31385, term31385.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term31385, term31385.getClass(), "ignoreEmptyLines", false);
        setField(term31385, term31385.getClass(), "recordSeparator", "SJiQaLvSKv");
        setField(term31385, term31385.getClass(), "nullString", "OEXDRUKcFl");
        setElement(term31396, 0, "RYdKCNNMBR");
        setElement(term31396, 1, "yGtHPyvYiQ");
        setField(term31385, term31385.getClass(), "header", term31396);
        setBooleanField(term31385, term31385.getClass(), "skipHeaderRecord", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isQuoteCharacterSet", argTypes, term6540, args);
        assertTrue(recursiveEquals(term6540, term31385));
        assertTrue(recursiveEquals(retValue, true));
    }

};


