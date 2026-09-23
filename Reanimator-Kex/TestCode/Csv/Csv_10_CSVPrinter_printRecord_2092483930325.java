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

public class CSVPrinter_printRecord_2092483930325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term404303;
     Object term404105;

    public CSVPrinter_printRecord_2092483930325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term404425 = new Character((char) 0);
        Class<? extends Object> term405037 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term405036 = ((Class) term405037).getDeclaredField((String) "NONE");
        ((Field) term405036).setAccessible(true);
        Object enum287 = ((Field) term405036).get((Object) null);
        term404303 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term404373 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term404303, term404303.getClass(), "newRecord", true);
        setField(term404373, term404373.getClass(), "quoteChar", term404425);
        setCharField(term404373, term404373.getClass(), "delimiter", (char) 0);
        setField(term404373, term404373.getClass(), "quotePolicy", enum287);
        setField(term404303, term404303.getClass(), "format", term404373);
        term404105 = (Object[]) newArray("java.lang.Object", 1);
        byte[] term404106 = (byte[]) newByteArray(0);
        setElement(term404105, 0, term404106);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term404105;
        try {
            callMethod(klass, "printRecord", argTypes, term404303, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


