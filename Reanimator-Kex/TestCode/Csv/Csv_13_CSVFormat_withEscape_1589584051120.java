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

public class CSVFormat_withEscape_1589584051120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103354;
     Object term103694;

    public CSVFormat_withEscape_1589584051120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term103406 = new Character((char) 0);
        Class<? extends Object> term104252 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term104251 = ((Class) term104252).getDeclaredField((String) "NONE");
        ((Field) term104251).setAccessible(true);
        Object enum181 = ((Field) term104251).get((Object) null);
        Character term103566 = new Character((char) 0);
        term103354 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term103204 = (Object[]) newArray("java.lang.String", 2);
        setCharField(term103354, term103354.getClass(), "delimiter", (char) 0);
        setField(term103354, term103354.getClass(), "quoteCharacter", term103406);
        setField(term103354, term103354.getClass(), "quoteMode", enum181);
        setField(term103354, term103354.getClass(), "commentMarker", term103566);
        setBooleanField(term103354, term103354.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term103354, term103354.getClass(), "ignoreEmptyLines", false);
        setField(term103354, term103354.getClass(), "recordSeparator", null);
        setField(term103354, term103354.getClass(), "nullString", "");
        setElement(term103204, 0, "");
        setElement(term103204, 1, "");
        setField(term103354, term103354.getClass(), "headerComments", term103204);
        setField(term103354, term103354.getClass(), "header", null);
        setBooleanField(term103354, term103354.getClass(), "skipHeaderRecord", false);
        setBooleanField(term103354, term103354.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term103354, term103354.getClass(), "ignoreHeaderCase", false);
        term103694 = new Character((char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Character");
        Object[] args = new Object[1];
        args[0] = term103694;
        try {
            callMethod(klass, "withEscape", argTypes, term103354, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


