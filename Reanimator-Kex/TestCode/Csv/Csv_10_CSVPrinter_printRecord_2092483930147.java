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

public class CSVPrinter_printRecord_2092483930147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100039;
     Object term99831;

    public CSVPrinter_printRecord_2092483930147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term100161 = new Character((char) 0);
        Class<? extends Object> term100893 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term100892 = ((Class) term100893).getDeclaredField((String) "NONE");
        ((Field) term100892).setAccessible(true);
        Object enum110 = ((Field) term100892).get((Object) null);
        term100039 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term100109 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object term100305 = newInstance(Class.forName("java.io.PipedWriter"));
        setBooleanField(term100039, term100039.getClass(), "newRecord", true);
        setField(term100109, term100109.getClass(), "quoteChar", term100161);
        setCharField(term100109, term100109.getClass(), "delimiter", (char) 0);
        setField(term100109, term100109.getClass(), "quotePolicy", enum110);
        setField(term100039, term100039.getClass(), "format", term100109);
        setField(term100039, term100039.getClass(), "out", term100305);
        term99831 = (Object[]) newArray("java.lang.Object", 1);
        Object term100381 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term99831, 0, term100381);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term99831;
        try {
            callMethod(klass, "printRecord", argTypes, term100039, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


