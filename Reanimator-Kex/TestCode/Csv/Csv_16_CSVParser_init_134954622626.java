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
import java.lang.Long;

public class CSVParser_init_134954622626 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3479;
     Object term3577;
     Object term3579;

    public CSVParser_init_134954622626() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term3481 = new Character('q');
        Character term3484 = new Character('x');
        Character term3551 = new Character('x');
        Class<? extends Object> term170393 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term170392 = ((Class) term170393).getDeclaredField((String) "NONE");
        ((Field) term170392).setAccessible(true);
        Object enum44 = ((Field) term170392).get((Object) null);
        term3479 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term3486 = (Object[]) newArray("java.lang.String", 3);
        Object[] term3523 = (Object[]) newArray("java.lang.String", 1);
        setBooleanField(term3479, term3479.getClass(), "allowMissingColumnNames", false);
        setField(term3479, term3479.getClass(), "commentMarker", term3481);
        setCharField(term3479, term3479.getClass(), "delimiter", 'z');
        setField(term3479, term3479.getClass(), "escapeCharacter", term3484);
        setElement(term3486, 0, "KoyGrUJeJW");
        setElement(term3486, 1, "HqBOwkVqjD");
        setElement(term3486, 2, "MAcUBcBckh");
        setField(term3479, term3479.getClass(), "header", term3486);
        setElement(term3523, 0, "oVgzLbrsFr");
        setField(term3479, term3479.getClass(), "headerComments", term3523);
        setBooleanField(term3479, term3479.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term3479, term3479.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term3479, term3479.getClass(), "ignoreSurroundingSpaces", false);
        setField(term3479, term3479.getClass(), "nullString", "vQVyKLdtaz");
        setField(term3479, term3479.getClass(), "quoteCharacter", term3551);
        setField(term3479, term3479.getClass(), "quoteMode", enum44);
        setField(term3479, term3479.getClass(), "recordSeparator", "OWKQODBLzb");
        setBooleanField(term3479, term3479.getClass(), "skipHeaderRecord", false);
        setBooleanField(term3479, term3479.getClass(), "trailingDelimiter", false);
        setBooleanField(term3479, term3479.getClass(), "trim", true);
        setBooleanField(term3479, term3479.getClass(), "autoFlush", true);
        term3577 = new Long(2442117782898005296L);
        term3579 = new Long(6375119433582206027L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.io.Reader");
        argTypes[1] = Class.forName("org.apache.commons.csv.CSVFormat");
        argTypes[2] = long.class;
        argTypes[3] = long.class;
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term3479;
        args[2] = term3577;
        args[3] = term3579;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


