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

public class CSVPrinter_printRecord_2092483930276 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term856277;
     Object term850718;

    public CSVPrinter_printRecord_2092483930276() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term856399 = new Character((char) 0);
        Class<? extends Object> term860622 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term860621 = ((Class) term860622).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term860621).setAccessible(true);
        Object enum268 = ((Field) term860621).get((Object) null);
        Character term856551 = new Character((char) 4096);
        term856277 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term856347 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term856277, term856277.getClass(), "newRecord", true);
        setField(term856347, term856347.getClass(), "quoteChar", term856399);
        setCharField(term856347, term856347.getClass(), "delimiter", (char) 512);
        setField(term856347, term856347.getClass(), "quotePolicy", enum268);
        setField(term856347, term856347.getClass(), "escape", term856551);
        setField(term856277, term856277.getClass(), "format", term856347);
        term850718 = (Object[]) newArray("java.lang.Object", 1);
        Object term856627 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term850718, 0, term856627);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term850718;
        try {
            callMethod(klass, "printRecord", argTypes, term856277, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


