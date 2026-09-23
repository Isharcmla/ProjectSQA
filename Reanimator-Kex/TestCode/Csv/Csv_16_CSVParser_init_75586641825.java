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
import java.lang.Object;
import java.lang.String;

public class CSVParser_init_75586641825 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3044;

    public CSVParser_init_75586641825() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term3046 = new Character('g');
        Character term3049 = new Character('H');
        Character term3152 = new Character('g');
        Class<? extends Object> term169668 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term169667 = ((Class) term169668).getDeclaredField((String) "ALL_NON_NULL");
        ((Field) term169667).setAccessible(true);
        Object enum43 = ((Field) term169667).get((Object) null);
        term3044 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term3051 = (Object[]) newArray("java.lang.String", 5);
        Object[] term3112 = (Object[]) newArray("java.lang.String", 2);
        setBooleanField(term3044, term3044.getClass(), "allowMissingColumnNames", false);
        setField(term3044, term3044.getClass(), "commentMarker", term3046);
        setCharField(term3044, term3044.getClass(), "delimiter", 'Q');
        setField(term3044, term3044.getClass(), "escapeCharacter", term3049);
        setElement(term3051, 0, "fhkbdRViHi");
        setElement(term3051, 1, "uWHnvSvaPl");
        setElement(term3051, 2, "kBdSllIBVz");
        setElement(term3051, 3, "TJmVBGfTML");
        setElement(term3051, 4, "tPlsykYBqO");
        setField(term3044, term3044.getClass(), "header", term3051);
        setElement(term3112, 0, "bLPjGVBhlX");
        setElement(term3112, 1, "whBvTVIIlC");
        setField(term3044, term3044.getClass(), "headerComments", term3112);
        setBooleanField(term3044, term3044.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term3044, term3044.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term3044, term3044.getClass(), "ignoreSurroundingSpaces", false);
        setField(term3044, term3044.getClass(), "nullString", "IgRJUzaCwW");
        setField(term3044, term3044.getClass(), "quoteCharacter", term3152);
        setField(term3044, term3044.getClass(), "quoteMode", enum43);
        setField(term3044, term3044.getClass(), "recordSeparator", "JUmudUmaaV");
        setBooleanField(term3044, term3044.getClass(), "skipHeaderRecord", true);
        setBooleanField(term3044, term3044.getClass(), "trailingDelimiter", false);
        setBooleanField(term3044, term3044.getClass(), "trim", true);
        setBooleanField(term3044, term3044.getClass(), "autoFlush", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.Reader");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term3044;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


