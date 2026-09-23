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

public class CSVPrinter_printRecord_2092483930203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198432;
     Object term195968;

    public CSVPrinter_printRecord_2092483930203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term198554 = new Character((char) 8192);
        Class<? extends Object> term199201 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term199200 = ((Class) term199201).getDeclaredField((String) "ALL");
        ((Field) term199200).setAccessible(true);
        Object enum167 = ((Field) term199200).get((Object) null);
        term198432 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term198502 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term198432, term198432.getClass(), "newRecord", true);
        setField(term198502, term198502.getClass(), "quoteChar", term198554);
        setCharField(term198502, term198502.getClass(), "delimiter", (char) 128);
        setField(term198502, term198502.getClass(), "quotePolicy", enum167);
        setField(term198432, term198432.getClass(), "format", term198502);
        term195968 = (Object[]) newArray("java.lang.Object", 1);
        Object term198726 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term195968, 0, term198726);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term195968;
        try {
            callMethod(klass, "printRecord", argTypes, term198432, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


