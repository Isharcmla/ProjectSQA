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
import java.lang.NullPointerException;
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Character;
import java.lang.String;

public class CSVPrinter_printRecord_209248393025 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3325;
     Object term3446;

    public CSVPrinter_printRecord_209248393025() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term3328 = new Character('J');
        Class<? extends Object> term11670 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term11669 = ((Class) term11670).getDeclaredField((String) "MINIMAL");
        ((Field) term11669).setAccessible(true);
        Object enum27 = ((Field) term11669).get((Object) null);
        Character term3341 = new Character('C');
        Character term3343 = new Character('Z');
        term3325 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term3326 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term3371 = (Object[]) newArray("java.lang.String", 6);
        setField(term3325, term3325.getClass(), "out", null);
        setCharField(term3326, term3326.getClass(), "delimiter", 'j');
        setField(term3326, term3326.getClass(), "quoteChar", term3328);
        setField(term3326, term3326.getClass(), "quotePolicy", enum27);
        setField(term3326, term3326.getClass(), "commentStart", term3341);
        setField(term3326, term3326.getClass(), "escape", term3343);
        setBooleanField(term3326, term3326.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term3326, term3326.getClass(), "ignoreEmptyLines", false);
        setField(term3326, term3326.getClass(), "recordSeparator", "ieCtQFdkii");
        setField(term3326, term3326.getClass(), "nullString", "dEnhdmILtU");
        setElement(term3371, 0, "hoicvmsovO");
        setElement(term3371, 1, "eqJfYWRaEL");
        setElement(term3371, 2, "fhkbdRViHi");
        setElement(term3371, 3, "uWHnvSvaPl");
        setElement(term3371, 4, "kBdSllIBVz");
        setElement(term3371, 5, "TJmVBGfTML");
        setField(term3326, term3326.getClass(), "header", term3371);
        setBooleanField(term3326, term3326.getClass(), "skipHeaderRecord", false);
        setField(term3325, term3325.getClass(), "format", term3326);
        setBooleanField(term3325, term3325.getClass(), "newRecord", true);
        term3446 = (Object[]) newArray("java.lang.Object", 5);
        Object term3447 = newInstance(Class.forName("java.lang.Object"));
        Object term3448 = newInstance(Class.forName("java.lang.Object"));
        Object term3449 = newInstance(Class.forName("java.lang.Object"));
        Object term3450 = newInstance(Class.forName("java.lang.Object"));
        Object term3451 = newInstance(Class.forName("java.lang.Object"));
        setElement(term3446, 0, term3447);
        setElement(term3446, 1, term3448);
        setElement(term3446, 2, term3449);
        setElement(term3446, 3, term3450);
        setElement(term3446, 4, term3451);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term3446;
        try {
            callMethod(klass, "printRecord", argTypes, term3325, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


