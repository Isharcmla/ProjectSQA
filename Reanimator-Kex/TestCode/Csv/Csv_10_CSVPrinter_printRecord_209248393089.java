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

public class CSVPrinter_printRecord_209248393089 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36697;
     Object term36275;

    public CSVPrinter_printRecord_209248393089() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term36819 = new Character((char) 0);
        Class<? extends Object> term37572 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term37571 = ((Class) term37572).getDeclaredField((String) "ALL");
        ((Field) term37571).setAccessible(true);
        Object enum56 = ((Field) term37571).get((Object) null);
        term36697 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term36767 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term36697, term36697.getClass(), "newRecord", true);
        setField(term36767, term36767.getClass(), "quoteChar", term36819);
        setCharField(term36767, term36767.getClass(), "delimiter", (char) 0);
        setField(term36767, term36767.getClass(), "quotePolicy", enum56);
        setField(term36697, term36697.getClass(), "format", term36767);
        term36275 = (Object[]) newArray("java.lang.Object", 2);
        Object term36989 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setElement(term36275, 0, term36989);
        setElement(term36275, 1, "NON_NUMERIC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term36275;
        try {
            callMethod(klass, "printRecord", argTypes, term36697, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


