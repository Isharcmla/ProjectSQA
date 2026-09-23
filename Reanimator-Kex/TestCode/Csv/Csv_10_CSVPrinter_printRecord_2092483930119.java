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

public class CSVPrinter_printRecord_2092483930119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56219;
     Object term55657;

    public CSVPrinter_printRecord_2092483930119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term56341 = new Character((char) 0);
        Class<? extends Object> term57202 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term57201 = ((Class) term57202).getDeclaredField((String) "ALL");
        ((Field) term57201).setAccessible(true);
        Object enum82 = ((Field) term57201).get((Object) null);
        term56219 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term56289 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term56219, term56219.getClass(), "newRecord", true);
        setField(term56289, term56289.getClass(), "quoteChar", term56341);
        setCharField(term56289, term56289.getClass(), "delimiter", (char) 0);
        setField(term56289, term56289.getClass(), "quotePolicy", enum82);
        setField(term56219, term56219.getClass(), "format", term56289);
        term55657 = (Object[]) newArray("java.lang.Object", 4);
        Object term56511 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term56511, term56511.getClass(), "delimiter", (char) 0);
        setField(term56511, term56511.getClass(), "escape", null);
        setField(term56511, term56511.getClass(), "quoteChar", null);
        setField(term56511, term56511.getClass(), "commentStart", null);
        setField(term56511, term56511.getClass(), "nullString", null);
        setField(term56511, term56511.getClass(), "recordSeparator", null);
        setBooleanField(term56511, term56511.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term56511, term56511.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term56511, term56511.getClass(), "skipHeaderRecord", false);
        setField(term56511, term56511.getClass(), "header", null);
        setElement(term55657, 0, term56511);
        setElement(term55657, 1, "Delimiter=<");
        setElement(term55657, 2, " SkipHeaderRecord:");
        setElement(term55657, 3, enum82);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term55657;
        try {
            callMethod(klass, "printRecord", argTypes, term56219, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


