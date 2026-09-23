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

public class CSVPrinter_printRecord_209248393091 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37962;
     Object term37753;

    public CSVPrinter_printRecord_209248393091() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term38084 = new Character((char) 0);
        Class<? extends Object> term39385 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term39384 = ((Class) term39385).getDeclaredField((String) "MINIMAL");
        ((Field) term39384).setAccessible(true);
        Object enum59 = ((Field) term39384).get((Object) null);
        term37962 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term38032 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object term38228 = newInstance(Class.forName("java.io.PrintWriter"));
        setBooleanField(term37962, term37962.getClass(), "newRecord", true);
        setField(term38032, term38032.getClass(), "quoteChar", term38084);
        setCharField(term38032, term38032.getClass(), "delimiter", (char) 0);
        setField(term38032, term38032.getClass(), "quotePolicy", enum59);
        setField(term37962, term37962.getClass(), "format", term38032);
        setField(term37962, term37962.getClass(), "out", term38228);
        Class<? extends Object> term39553 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term39552 = ((Class) term39553).getDeclaredField((String) "ALL");
        ((Field) term39552).setAccessible(true);
        Object enum60 = ((Field) term39552).get((Object) null);
        term37753 = (Object[]) newArray("java.lang.Object", 2);
        Object term38300 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term37753, 0, term38300);
        setElement(term37753, 1, enum60);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term37753;
        try {
            callMethod(klass, "printRecord", argTypes, term37962, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


