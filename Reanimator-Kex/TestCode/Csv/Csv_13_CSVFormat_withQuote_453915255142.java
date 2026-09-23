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
import java.lang.String;
import java.lang.Object;

public class CSVFormat_withQuote_453915255142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120342;

    public CSVFormat_withQuote_453915255142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term120958 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term120957 = ((Class) term120958).getDeclaredField((String) "NONE");
        ((Field) term120957).setAccessible(true);
        Object enum197 = ((Field) term120957).get((Object) null);
        term120342 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term120196 = (Object[]) newArray("java.lang.String", 2);
        setCharField(term120342, term120342.getClass(), "delimiter", (char) 13);
        setField(term120342, term120342.getClass(), "quoteMode", enum197);
        setField(term120342, term120342.getClass(), "commentMarker", null);
        setField(term120342, term120342.getClass(), "escapeCharacter", null);
        setBooleanField(term120342, term120342.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term120342, term120342.getClass(), "ignoreEmptyLines", false);
        setField(term120342, term120342.getClass(), "recordSeparator", null);
        setField(term120342, term120342.getClass(), "nullString", null);
        setField(term120342, term120342.getClass(), "headerComments", term120196);
        setField(term120342, term120342.getClass(), "header", null);
        setBooleanField(term120342, term120342.getClass(), "skipHeaderRecord", false);
        setBooleanField(term120342, term120342.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term120342, term120342.getClass(), "ignoreHeaderCase", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = (char) 0;
        try {
            callMethod(klass, "withQuote", argTypes, term120342, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


