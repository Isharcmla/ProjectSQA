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

public class CSVPrinter_printRecord_2092483930235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term256729;
     Object term254154;

    public CSVPrinter_printRecord_2092483930235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term256851 = new Character((char) 65524);
        Class<? extends Object> term257498 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term257497 = ((Class) term257498).getDeclaredField((String) "ALL");
        ((Field) term257497).setAccessible(true);
        Object enum195 = ((Field) term257497).get((Object) null);
        term256729 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term256799 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term256729, term256729.getClass(), "newRecord", true);
        setField(term256799, term256799.getClass(), "quoteChar", term256851);
        setCharField(term256799, term256799.getClass(), "delimiter", (char) 65383);
        setField(term256799, term256799.getClass(), "quotePolicy", enum195);
        setField(term256729, term256729.getClass(), "format", term256799);
        term254154 = (Object[]) newArray("java.lang.Object", 1);
        Object term257023 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term254154, 0, term257023);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term254154;
        try {
            callMethod(klass, "printRecord", argTypes, term256729, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


