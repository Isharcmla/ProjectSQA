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

public class CSVPrinter_printRecord_2092483930257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term831638;
     Object term831343;

    public CSVPrinter_printRecord_2092483930257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term831760 = new Character((char) 0);
        Class<? extends Object> term832684 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term832683 = ((Class) term832684).getDeclaredField((String) "MINIMAL");
        ((Field) term832683).setAccessible(true);
        Object enum239 = ((Field) term832683).get((Object) null);
        term831638 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term831708 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term831638, term831638.getClass(), "newRecord", true);
        setField(term831708, term831708.getClass(), "quoteChar", term831760);
        setCharField(term831708, term831708.getClass(), "delimiter", (char) 0);
        setField(term831708, term831708.getClass(), "quotePolicy", enum239);
        setField(term831638, term831638.getClass(), "format", term831708);
        Class<? extends Object> term832852 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term832851 = ((Class) term832852).getDeclaredField((String) "ALL");
        ((Field) term832851).setAccessible(true);
        Object enum240 = ((Field) term832851).get((Object) null);
        term831343 = (Object[]) newArray("java.lang.Object", 1);
        setElement(term831343, 0, enum240);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term831343;
        try {
            callMethod(klass, "printRecord", argTypes, term831638, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


