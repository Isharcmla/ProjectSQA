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

public class CSVPrinter_printRecord_2092483930111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50104;
     Object term49897;

    public CSVPrinter_printRecord_2092483930111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term50226 = new Character((char) 0);
        Class<? extends Object> term50801 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term50800 = ((Class) term50801).getDeclaredField((String) "ALL");
        ((Field) term50800).setAccessible(true);
        Object enum74 = ((Field) term50800).get((Object) null);
        term50104 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term50174 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term50104, term50104.getClass(), "newRecord", true);
        setField(term50174, term50174.getClass(), "quoteChar", term50226);
        setCharField(term50174, term50174.getClass(), "delimiter", (char) 0);
        setField(term50174, term50174.getClass(), "quotePolicy", enum74);
        setField(term50104, term50104.getClass(), "format", term50174);
        term49897 = (Object[]) newArray("java.lang.Object", 1);
        int[] term49898 = (int[]) newIntArray(0);
        setElement(term49897, 0, term49898);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term49897;
        try {
            callMethod(klass, "printRecord", argTypes, term50104, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


