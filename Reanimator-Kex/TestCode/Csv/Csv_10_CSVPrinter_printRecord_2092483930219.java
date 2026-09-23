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

public class CSVPrinter_printRecord_2092483930219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term215373;
     Object term215038;

    public CSVPrinter_printRecord_2092483930219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term215495 = new Character((char) 64);
        Class<? extends Object> term216180 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term216179 = ((Class) term216180).getDeclaredField((String) "ALL");
        ((Field) term216179).setAccessible(true);
        Object enum179 = ((Field) term216179).get((Object) null);
        term215373 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term215443 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term215373, term215373.getClass(), "newRecord", true);
        setField(term215443, term215443.getClass(), "quoteChar", term215495);
        setCharField(term215443, term215443.getClass(), "delimiter", (char) 1);
        setField(term215443, term215443.getClass(), "quotePolicy", enum179);
        setField(term215373, term215373.getClass(), "format", term215443);
        term215038 = (Object[]) newArray("java.lang.Object", 2);
        Object term215667 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term215705 = newInstance(Class.forName("java.lang.Object"));
        setElement(term215038, 0, term215667);
        setElement(term215038, 1, term215705);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term215038;
        try {
            callMethod(klass, "printRecord", argTypes, term215373, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


