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

public class CSVPrinter_printRecord_209248393089 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40325;
     Object term39035;

    public CSVPrinter_printRecord_209248393089() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term40447 = new Character((char) 128);
        Class<? extends Object> term41096 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term41095 = ((Class) term41096).getDeclaredField((String) "ALL");
        ((Field) term41095).setAccessible(true);
        Object enum60 = ((Field) term41095).get((Object) null);
        term40325 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term40395 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term40325, term40325.getClass(), "newRecord", true);
        setField(term40395, term40395.getClass(), "quoteChar", term40447);
        setCharField(term40395, term40395.getClass(), "delimiter", (char) 16);
        setField(term40395, term40395.getClass(), "quotePolicy", enum60);
        setField(term40325, term40325.getClass(), "format", term40395);
        term39035 = (Object[]) newArray("java.lang.Object", 1);
        Object term40623 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term39035, 0, term40623);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term39035;
        try {
            callMethod(klass, "printRecord", argTypes, term40325, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


