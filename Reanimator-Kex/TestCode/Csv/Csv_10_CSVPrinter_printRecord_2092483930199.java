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

public class CSVPrinter_printRecord_2092483930199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term190894;
     Object term190665;

    public CSVPrinter_printRecord_2092483930199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term191016 = new Character((char) 0);
        Class<? extends Object> term191922 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term191921 = ((Class) term191922).getDeclaredField((String) "NONE");
        ((Field) term191921).setAccessible(true);
        Object enum162 = ((Field) term191921).get((Object) null);
        term190894 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term190964 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term190894, term190894.getClass(), "newRecord", true);
        setField(term190964, term190964.getClass(), "quoteChar", term191016);
        setCharField(term190964, term190964.getClass(), "delimiter", (char) 0);
        setField(term190964, term190964.getClass(), "quotePolicy", enum162);
        setField(term190894, term190894.getClass(), "format", term190964);
        Class<? extends Object> term192081 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term192080 = ((Class) term192081).getDeclaredField((String) "ALL");
        ((Field) term192080).setAccessible(true);
        Object enum163 = ((Field) term192080).get((Object) null);
        term190665 = (Object[]) newArray("java.lang.Object", 2);
        setElement(term190665, 0, "");
        setElement(term190665, 1, enum163);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term190665;
        try {
            callMethod(klass, "printRecord", argTypes, term190894, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


