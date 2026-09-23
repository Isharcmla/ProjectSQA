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

public class CSVPrinter_printRecord_2092483930139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89855;
     Object term83785;

    public CSVPrinter_printRecord_2092483930139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term89977 = new Character((char) 65526);
        Class<? extends Object> term90624 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term90623 = ((Class) term90624).getDeclaredField((String) "ALL");
        ((Field) term90623).setAccessible(true);
        Object enum102 = ((Field) term90623).get((Object) null);
        term89855 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term89925 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term89855, term89855.getClass(), "newRecord", true);
        setField(term89925, term89925.getClass(), "quoteChar", term89977);
        setCharField(term89925, term89925.getClass(), "delimiter", (char) 13999);
        setField(term89925, term89925.getClass(), "quotePolicy", enum102);
        setField(term89855, term89855.getClass(), "format", term89925);
        term83785 = (Object[]) newArray("java.lang.Object", 1);
        Object term90149 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term83785, 0, term90149);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term83785;
        try {
            callMethod(klass, "printRecord", argTypes, term89855, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


