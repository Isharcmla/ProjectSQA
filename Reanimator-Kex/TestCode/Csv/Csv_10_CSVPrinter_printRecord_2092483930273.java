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

public class CSVPrinter_printRecord_2092483930273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term317989;
     Object term316884;

    public CSVPrinter_printRecord_2092483930273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term318111 = new Character((char) 332);
        Class<? extends Object> term318815 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term318814 = ((Class) term318815).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term318814).setAccessible(true);
        Object enum235 = ((Field) term318814).get((Object) null);
        term317989 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term318059 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term317989, term317989.getClass(), "newRecord", true);
        setField(term318059, term318059.getClass(), "quoteChar", term318111);
        setCharField(term318059, term318059.getClass(), "delimiter", (char) 268);
        setField(term318059, term318059.getClass(), "quotePolicy", enum235);
        setField(term317989, term317989.getClass(), "format", term318059);
        term316884 = (Object[]) newArray("java.lang.Object", 1);
        Object term318283 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term316884, 0, term318283);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term316884;
        try {
            callMethod(klass, "printRecord", argTypes, term317989, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


