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

public class CSVPrinter_printRecord_2092483930153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148280;
     Object term147675;

    public CSVPrinter_printRecord_2092483930153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term148402 = new Character((char) 0);
        Class<? extends Object> term149053 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term149052 = ((Class) term149053).getDeclaredField((String) "ALL");
        ((Field) term149052).setAccessible(true);
        Object enum128 = ((Field) term149052).get((Object) null);
        term148280 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term148350 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term148280, term148280.getClass(), "newRecord", true);
        setField(term148350, term148350.getClass(), "quoteChar", term148402);
        setCharField(term148350, term148350.getClass(), "delimiter", (char) 0);
        setField(term148350, term148350.getClass(), "quotePolicy", enum128);
        setField(term148280, term148280.getClass(), "format", term148350);
        term147675 = (Object[]) newArray("java.lang.Object", 1);
        Object term148578 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term147675, 0, term148578);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term147675;
        try {
            callMethod(klass, "printRecord", argTypes, term148280, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


