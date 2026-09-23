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

public class CSVFormat_getQuoteCharacter_44758352057 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3906;
     Object term26351;
     Object term25908;

    public CSVFormat_getQuoteCharacter_44758352057() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term3908 = new Character('n');
        Class<? extends Object> term26374 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term26373 = ((Class) term26374).getDeclaredField((String) "NONE");
        ((Field) term26373).setAccessible(true);
        Object enum64 = ((Field) term26373).get((Object) null);
        Character term3918 = new Character('W');
        Character term3920 = new Character('E');
        term3906 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term3949 = (Object[]) newArray("java.lang.String", 5);
        setCharField(term3906, term3906.getClass(), "delimiter", 'a');
        setField(term3906, term3906.getClass(), "quoteCharacter", term3908);
        setField(term3906, term3906.getClass(), "quoteMode", enum64);
        setField(term3906, term3906.getClass(), "commentMarker", term3918);
        setField(term3906, term3906.getClass(), "escapeCharacter", term3920);
        setBooleanField(term3906, term3906.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term3906, term3906.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term3906, term3906.getClass(), "ignoreEmptyLines", true);
        setField(term3906, term3906.getClass(), "recordSeparator", "tPlsykYBqO");
        setField(term3906, term3906.getClass(), "nullString", "bLPjGVBhlX");
        setElement(term3949, 0, "whBvTVIIlC");
        setElement(term3949, 1, "IgRJUzaCwW");
        setElement(term3949, 2, "JUmudUmaaV");
        setElement(term3949, 3, "KoyGrUJeJW");
        setElement(term3949, 4, "HqBOwkVqjD");
        setField(term3906, term3906.getClass(), "header", term3949);
        setBooleanField(term3906, term3906.getClass(), "skipHeaderRecord", true);
        Character term26352 = new Character('n');
        Class<? extends Object> term26623 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term26622 = ((Class) term26623).getDeclaredField((String) "NONE");
        ((Field) term26622).setAccessible(true);
        Object enum65 = ((Field) term26622).get((Object) null);
        Character term26356 = new Character('W');
        Character term26357 = new Character('E');
        term26351 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term26362 = (Object[]) newArray("java.lang.String", 5);
        setCharField(term26351, term26351.getClass(), "delimiter", 'a');
        setField(term26351, term26351.getClass(), "quoteCharacter", term26352);
        setField(term26351, term26351.getClass(), "quoteMode", enum65);
        setField(term26351, term26351.getClass(), "commentMarker", term26356);
        setField(term26351, term26351.getClass(), "escapeCharacter", term26357);
        setBooleanField(term26351, term26351.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term26351, term26351.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term26351, term26351.getClass(), "ignoreEmptyLines", true);
        setField(term26351, term26351.getClass(), "recordSeparator", "tPlsykYBqO");
        setField(term26351, term26351.getClass(), "nullString", "bLPjGVBhlX");
        setElement(term26362, 0, "whBvTVIIlC");
        setElement(term26362, 1, "IgRJUzaCwW");
        setElement(term26362, 2, "JUmudUmaaV");
        setElement(term26362, 3, "KoyGrUJeJW");
        setElement(term26362, 4, "HqBOwkVqjD");
        setField(term26351, term26351.getClass(), "header", term26362);
        setBooleanField(term26351, term26351.getClass(), "skipHeaderRecord", true);
        term25908 = new Character('n');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getQuoteCharacter", argTypes, term3906, args);
        assertTrue(recursiveEquals(term3906, term26351));
        assertTrue(recursiveEquals(retValue, term25908));
    }

};


