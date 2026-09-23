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

public class CSVPrinter_printRecord_2092483930299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term355944;
     Object term354793;

    public CSVPrinter_printRecord_2092483930299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term356066 = new Character((char) 8512);
        Class<? extends Object> term357219 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term357218 = ((Class) term357219).getDeclaredField((String) "MINIMAL");
        ((Field) term357218).setAccessible(true);
        Object enum262 = ((Field) term357218).get((Object) null);
        term355944 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term356014 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term355944, term355944.getClass(), "newRecord", true);
        setField(term356014, term356014.getClass(), "quoteChar", term356066);
        setCharField(term356014, term356014.getClass(), "delimiter", (char) 3058);
        setField(term356014, term356014.getClass(), "quotePolicy", enum262);
        setField(term355944, term355944.getClass(), "format", term356014);
        Class<? extends Object> term357387 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term357386 = ((Class) term357387).getDeclaredField((String) "ALL");
        ((Field) term357386).setAccessible(true);
        Object enum263 = ((Field) term357386).get((Object) null);
        term354793 = (Object[]) newArray("java.lang.Object", 2);
        Object term356238 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term354793, 0, term356238);
        setElement(term354793, 1, enum263);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term354793;
        try {
            callMethod(klass, "printRecord", argTypes, term355944, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


