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

public class CSVPrinter_printRecord_2092483930359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1017425;
     Object term1014147;

    public CSVPrinter_printRecord_2092483930359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term1017547 = new Character((char) 0);
        Class<? extends Object> term1018429 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term1018428 = ((Class) term1018429).getDeclaredField((String) "ALL");
        ((Field) term1018428).setAccessible(true);
        Object enum351 = ((Field) term1018428).get((Object) null);
        Character term1017699 = new Character((char) 8);
        term1017425 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term1017495 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term1017425, term1017425.getClass(), "newRecord", true);
        setField(term1017495, term1017495.getClass(), "quoteChar", term1017547);
        setCharField(term1017495, term1017495.getClass(), "delimiter", (char) 65007);
        setField(term1017495, term1017495.getClass(), "quotePolicy", enum351);
        setField(term1017495, term1017495.getClass(), "escape", term1017699);
        setField(term1017425, term1017425.getClass(), "format", term1017495);
        term1014147 = (Object[]) newArray("java.lang.Object", 512);
        Object term1017775 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        Object term1017813 = newInstance(Class.forName("java.lang.Object"));
        Object term1017851 = newInstance(Class.forName("java.lang.Object"));
        setElement(term1014147, 0, term1017775);
        setElement(term1014147, 8, term1017813);
        setElement(term1014147, 15, term1017851);
        setElement(term1014147, 21, enum351);
        setElement(term1014147, 28, "MINIMAL");
        setElement(term1014147, 35, enum351);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1014147;
        try {
            callMethod(klass, "printRecord", argTypes, term1017425, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


