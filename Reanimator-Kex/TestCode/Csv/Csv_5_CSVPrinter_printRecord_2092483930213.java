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

public class CSVPrinter_printRecord_2092483930213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term272792;
     Object term272316;

    public CSVPrinter_printRecord_2092483930213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term272914 = new Character((char) 0);
        Class<? extends Object> term273707 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term273706 = ((Class) term273707).getDeclaredField((String) "ALL");
        ((Field) term273706).setAccessible(true);
        Object enum191 = ((Field) term273706).get((Object) null);
        term272792 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term272862 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term272792, term272792.getClass(), "newRecord", true);
        setField(term272862, term272862.getClass(), "quoteChar", term272914);
        setCharField(term272862, term272862.getClass(), "delimiter", (char) 0);
        setField(term272862, term272862.getClass(), "quotePolicy", enum191);
        setField(term272792, term272792.getClass(), "format", term272862);
        Class<? extends Object> term273863 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term273862 = ((Class) term273863).getDeclaredField((String) "ALL");
        ((Field) term273862).setAccessible(true);
        Object enum192 = ((Field) term273862).get((Object) null);
        term272316 = (Object[]) newArray("java.lang.Object", 1);
        setElement(term272316, 0, enum192);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term272316;
        try {
            callMethod(klass, "printRecord", argTypes, term272792, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


