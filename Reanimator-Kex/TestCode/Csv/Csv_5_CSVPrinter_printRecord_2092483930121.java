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

public class CSVPrinter_printRecord_2092483930121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88819;
     Object term87491;

    public CSVPrinter_printRecord_2092483930121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term88941 = new Character((char) 64);
        Class<? extends Object> term89592 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term89591 = ((Class) term89592).getDeclaredField((String) "ALL");
        ((Field) term89591).setAccessible(true);
        Object enum90 = ((Field) term89591).get((Object) null);
        term88819 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term88889 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term88819, term88819.getClass(), "newRecord", true);
        setField(term88889, term88889.getClass(), "quoteChar", term88941);
        setCharField(term88889, term88889.getClass(), "delimiter", (char) 16);
        setField(term88889, term88889.getClass(), "quotePolicy", enum90);
        setField(term88819, term88819.getClass(), "format", term88889);
        term87491 = (Object[]) newArray("java.lang.Object", 1);
        Object term89117 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term87491, 0, term89117);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term87491;
        try {
            callMethod(klass, "printRecord", argTypes, term88819, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


