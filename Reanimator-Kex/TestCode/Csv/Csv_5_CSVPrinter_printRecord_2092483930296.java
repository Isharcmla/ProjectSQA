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

public class CSVPrinter_printRecord_2092483930296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term890253;
     Object term889954;

    public CSVPrinter_printRecord_2092483930296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term890375 = new Character((char) 0);
        Class<? extends Object> term895134 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term895133 = ((Class) term895134).getDeclaredField((String) "MINIMAL");
        ((Field) term895133).setAccessible(true);
        Object enum288 = ((Field) term895133).get((Object) null);
        term890253 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term890323 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term890253, term890253.getClass(), "newRecord", true);
        setField(term890323, term890323.getClass(), "quoteChar", term890375);
        setCharField(term890323, term890323.getClass(), "delimiter", (char) 0);
        setField(term890323, term890323.getClass(), "quotePolicy", enum288);
        setField(term890253, term890253.getClass(), "format", term890323);
        term889954 = (Object[]) newArray("java.lang.Object", 1);
        Object term890547 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term889954, 0, term890547);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term889954;
        try {
            callMethod(klass, "printRecord", argTypes, term890253, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


