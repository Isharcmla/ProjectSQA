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

public class CSVPrinter_printRecord_2092483930374 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1037894;
     Object term1037149;

    public CSVPrinter_printRecord_2092483930374() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term1038016 = new Character((char) 65343);
        Class<? extends Object> term1046583 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term1046582 = ((Class) term1046583).getDeclaredField((String) "MINIMAL");
        ((Field) term1046582).setAccessible(true);
        Object enum366 = ((Field) term1046582).get((Object) null);
        term1037894 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term1037964 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term1037894, term1037894.getClass(), "newRecord", true);
        setField(term1037964, term1037964.getClass(), "quoteChar", term1038016);
        setCharField(term1037964, term1037964.getClass(), "delimiter", (char) 40959);
        setField(term1037964, term1037964.getClass(), "quotePolicy", enum366);
        setField(term1037894, term1037894.getClass(), "format", term1037964);
        Class<? extends Object> term1046751 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term1046750 = ((Class) term1046751).getDeclaredField((String) "ALL");
        ((Field) term1046750).setAccessible(true);
        Object enum367 = ((Field) term1046750).get((Object) null);
        term1037149 = (Object[]) newArray("java.lang.Object", 8);
        Object term1038192 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term1037149, 0, term1038192);
        setElement(term1037149, 1, enum367);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1037149;
        try {
            callMethod(klass, "printRecord", argTypes, term1037894, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


