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

public class CSVPrinter_printRecord_2092483930233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term333209;
     Object term332249;

    public CSVPrinter_printRecord_2092483930233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term333331 = new Character((char) 2048);
        Class<? extends Object> term334242 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term334241 = ((Class) term334242).getDeclaredField((String) "MINIMAL");
        ((Field) term334241).setAccessible(true);
        Object enum214 = ((Field) term334241).get((Object) null);
        term333209 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term333279 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term333209, term333209.getClass(), "newRecord", true);
        setField(term333279, term333279.getClass(), "quoteChar", term333331);
        setCharField(term333279, term333279.getClass(), "delimiter", (char) 2);
        setField(term333279, term333279.getClass(), "quotePolicy", enum214);
        setField(term333209, term333209.getClass(), "format", term333279);
        term332249 = (Object[]) newArray("java.lang.Object", 1);
        Object term333507 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term332249, 0, term333507);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term332249;
        try {
            callMethod(klass, "printRecord", argTypes, term333209, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


