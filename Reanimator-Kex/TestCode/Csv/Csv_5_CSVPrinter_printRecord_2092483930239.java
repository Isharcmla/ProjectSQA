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

public class CSVPrinter_printRecord_2092483930239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term339715;
     Object term339524;

    public CSVPrinter_printRecord_2092483930239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term339837 = new Character((char) 0);
        Class<? extends Object> term340500 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term340499 = ((Class) term340500).getDeclaredField((String) "ALL");
        ((Field) term340499).setAccessible(true);
        Object enum220 = ((Field) term340499).get((Object) null);
        term339715 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term339785 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term339715, term339715.getClass(), "newRecord", true);
        setField(term339785, term339785.getClass(), "quoteChar", term339837);
        setCharField(term339785, term339785.getClass(), "delimiter", (char) 0);
        setField(term339785, term339785.getClass(), "quotePolicy", enum220);
        setField(term339715, term339715.getClass(), "format", term339785);
        term339524 = (Object[]) newArray("java.lang.Object", 2);
        setElement(term339524, 0, "");
        setElement(term339524, 1, enum220);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term339524;
        try {
            callMethod(klass, "printRecord", argTypes, term339715, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


