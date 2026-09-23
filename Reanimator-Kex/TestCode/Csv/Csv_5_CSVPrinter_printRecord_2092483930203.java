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

public class CSVPrinter_printRecord_2092483930203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term262620;
     Object term261058;

    public CSVPrinter_printRecord_2092483930203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term262742 = new Character((char) 8192);
        Class<? extends Object> term264448 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term264447 = ((Class) term264448).getDeclaredField((String) "MINIMAL");
        ((Field) term264447).setAccessible(true);
        Object enum182 = ((Field) term264447).get((Object) null);
        term262620 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term262690 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term262620, term262620.getClass(), "newRecord", true);
        setField(term262690, term262690.getClass(), "quoteChar", term262742);
        setCharField(term262690, term262690.getClass(), "delimiter", (char) 57339);
        setField(term262690, term262690.getClass(), "quotePolicy", enum182);
        setField(term262620, term262620.getClass(), "format", term262690);
        term261058 = (Object[]) newArray("java.lang.Object", 2);
        Object term262918 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        Object term262956 = newInstance(Class.forName("java.lang.Object"));
        setElement(term261058, 0, term262918);
        setElement(term261058, 1, term262956);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term261058;
        try {
            callMethod(klass, "printRecord", argTypes, term262620, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


