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

public class CSVPrinter_printRecord_2092483930273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term849629;
     Object term847407;

    public CSVPrinter_printRecord_2092483930273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term849751 = new Character((char) 4096);
        Class<? extends Object> term850507 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term850506 = ((Class) term850507).getDeclaredField((String) "NONE");
        ((Field) term850506).setAccessible(true);
        Object enum265 = ((Field) term850506).get((Object) null);
        term849629 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term849699 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term849629, term849629.getClass(), "newRecord", true);
        setField(term849699, term849699.getClass(), "quoteChar", term849751);
        setCharField(term849699, term849699.getClass(), "delimiter", (char) 65517);
        setField(term849699, term849699.getClass(), "quotePolicy", enum265);
        setField(term849629, term849629.getClass(), "format", term849699);
        term847407 = (Object[]) newArray("java.lang.Object", 8);
        Object term849923 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term847407, 0, term849923);
        setElement(term847407, 1, "NON_NUMERIC");
        setElement(term847407, 4, "NONE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term847407;
        try {
            callMethod(klass, "printRecord", argTypes, term849629, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


