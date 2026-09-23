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

public class CSVPrinter_printRecord_2092483930257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term293952;
     Object term292555;

    public CSVPrinter_printRecord_2092483930257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term294074 = new Character((char) 33280);
        Class<? extends Object> term294721 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term294720 = ((Class) term294721).getDeclaredField((String) "ALL");
        ((Field) term294720).setAccessible(true);
        Object enum217 = ((Field) term294720).get((Object) null);
        term293952 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term294022 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term293952, term293952.getClass(), "newRecord", true);
        setField(term294022, term294022.getClass(), "quoteChar", term294074);
        setCharField(term294022, term294022.getClass(), "delimiter", (char) 0);
        setField(term294022, term294022.getClass(), "quotePolicy", enum217);
        setField(term293952, term293952.getClass(), "format", term294022);
        term292555 = (Object[]) newArray("java.lang.Object", 1);
        Object term294246 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term292555, 0, term294246);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term292555;
        try {
            callMethod(klass, "printRecord", argTypes, term293952, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


