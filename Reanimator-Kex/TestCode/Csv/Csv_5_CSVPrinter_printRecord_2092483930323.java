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

public class CSVPrinter_printRecord_2092483930323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term941879;
     Object term932902;

    public CSVPrinter_printRecord_2092483930323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term942001 = new Character((char) 16384);
        Class<? extends Object> term942652 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term942651 = ((Class) term942652).getDeclaredField((String) "ALL");
        ((Field) term942651).setAccessible(true);
        Object enum315 = ((Field) term942651).get((Object) null);
        term941879 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term941949 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term941879, term941879.getClass(), "newRecord", true);
        setField(term941949, term941949.getClass(), "quoteChar", term942001);
        setCharField(term941949, term941949.getClass(), "delimiter", (char) 2048);
        setField(term941949, term941949.getClass(), "quotePolicy", enum315);
        setField(term941879, term941879.getClass(), "format", term941949);
        term932902 = (Object[]) newArray("java.lang.Object", 1);
        Object term942177 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term932902, 0, term942177);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term932902;
        try {
            callMethod(klass, "printRecord", argTypes, term941879, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


