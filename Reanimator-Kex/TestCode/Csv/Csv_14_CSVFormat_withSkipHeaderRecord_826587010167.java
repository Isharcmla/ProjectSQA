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

public class CSVFormat_withSkipHeaderRecord_826587010167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139093;

    public CSVFormat_withSkipHeaderRecord_826587010167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term139145 = new Character((char) 0);
        Class<? extends Object> term139919 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term139918 = ((Class) term139919).getDeclaredField((String) "MINIMAL");
        ((Field) term139918).setAccessible(true);
        Object enum259 = ((Field) term139918).get((Object) null);
        term139093 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term138958 = (Object[]) newArray("java.lang.String", 1);
        setCharField(term139093, term139093.getClass(), "delimiter", (char) 0);
        setField(term139093, term139093.getClass(), "quoteCharacter", term139145);
        setField(term139093, term139093.getClass(), "quoteMode", enum259);
        setField(term139093, term139093.getClass(), "commentMarker", null);
        setField(term139093, term139093.getClass(), "escapeCharacter", null);
        setBooleanField(term139093, term139093.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term139093, term139093.getClass(), "ignoreEmptyLines", false);
        setField(term139093, term139093.getClass(), "recordSeparator", "");
        setField(term139093, term139093.getClass(), "nullString", "");
        setElement(term138958, 0, "");
        setField(term139093, term139093.getClass(), "headerComments", term138958);
        setField(term139093, term139093.getClass(), "header", null);
        setBooleanField(term139093, term139093.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term139093, term139093.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term139093, term139093.getClass(), "trim", false);
        setBooleanField(term139093, term139093.getClass(), "trailingDelimiter", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "withSkipHeaderRecord", argTypes, term139093, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


