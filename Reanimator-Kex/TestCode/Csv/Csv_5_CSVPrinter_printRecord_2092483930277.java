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

public class CSVPrinter_printRecord_2092483930277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term859756;
     Object term856809;

    public CSVPrinter_printRecord_2092483930277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term859878 = new Character((char) 0);
        Class<? extends Object> term861174 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term861173 = ((Class) term861174).getDeclaredField((String) "ALL");
        ((Field) term861173).setAccessible(true);
        Object enum269 = ((Field) term861173).get((Object) null);
        Character term860030 = new Character((char) 64026);
        term859756 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term859826 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term859756, term859756.getClass(), "newRecord", true);
        setField(term859826, term859826.getClass(), "quoteChar", term859878);
        setCharField(term859826, term859826.getClass(), "delimiter", (char) 30939);
        setField(term859826, term859826.getClass(), "quotePolicy", enum269);
        setField(term859826, term859826.getClass(), "escape", term860030);
        setField(term859756, term859756.getClass(), "format", term859826);
        term856809 = (Object[]) newArray("java.lang.Object", 1);
        Object term860106 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term856809, 0, term860106);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term856809;
        try {
            callMethod(klass, "printRecord", argTypes, term859756, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


