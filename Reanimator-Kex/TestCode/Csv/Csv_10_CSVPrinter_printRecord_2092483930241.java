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

public class CSVPrinter_printRecord_2092483930241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term262473;
     Object term261661;

    public CSVPrinter_printRecord_2092483930241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term262595 = new Character((char) 512);
        Class<? extends Object> term263242 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term263241 = ((Class) term263242).getDeclaredField((String) "ALL");
        ((Field) term263241).setAccessible(true);
        Object enum201 = ((Field) term263241).get((Object) null);
        term262473 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term262543 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term262473, term262473.getClass(), "newRecord", true);
        setField(term262543, term262543.getClass(), "quoteChar", term262595);
        setCharField(term262543, term262543.getClass(), "delimiter", (char) 4);
        setField(term262543, term262543.getClass(), "quotePolicy", enum201);
        setField(term262473, term262473.getClass(), "format", term262543);
        term261661 = (Object[]) newArray("java.lang.Object", 1);
        Object term262767 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term261661, 0, term262767);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term261661;
        try {
            callMethod(klass, "printRecord", argTypes, term262473, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


