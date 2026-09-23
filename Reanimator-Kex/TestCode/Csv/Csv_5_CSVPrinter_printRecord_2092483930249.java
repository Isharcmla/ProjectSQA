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

public class CSVPrinter_printRecord_2092483930249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term347333;
     Object term346771;

    public CSVPrinter_printRecord_2092483930249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term347455 = new Character((char) 0);
        Class<? extends Object> term348316 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term348315 = ((Class) term348316).getDeclaredField((String) "ALL");
        ((Field) term348315).setAccessible(true);
        Object enum232 = ((Field) term348315).get((Object) null);
        term347333 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term347403 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term347333, term347333.getClass(), "newRecord", true);
        setField(term347403, term347403.getClass(), "quoteChar", term347455);
        setCharField(term347403, term347403.getClass(), "delimiter", (char) 0);
        setField(term347403, term347403.getClass(), "quotePolicy", enum232);
        setField(term347333, term347333.getClass(), "format", term347403);
        term346771 = (Object[]) newArray("java.lang.Object", 4);
        Object term347625 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term347625, term347625.getClass(), "delimiter", (char) 0);
        setField(term347625, term347625.getClass(), "escape", null);
        setField(term347625, term347625.getClass(), "quoteChar", null);
        setField(term347625, term347625.getClass(), "commentStart", null);
        setField(term347625, term347625.getClass(), "nullString", null);
        setField(term347625, term347625.getClass(), "recordSeparator", null);
        setBooleanField(term347625, term347625.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term347625, term347625.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term347625, term347625.getClass(), "skipHeaderRecord", false);
        setField(term347625, term347625.getClass(), "header", null);
        setElement(term346771, 0, term347625);
        setElement(term346771, 1, "Delimiter=<");
        setElement(term346771, 2, " SkipHeaderRecord:");
        setElement(term346771, 3, enum232);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term346771;
        try {
            callMethod(klass, "printRecord", argTypes, term347333, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


