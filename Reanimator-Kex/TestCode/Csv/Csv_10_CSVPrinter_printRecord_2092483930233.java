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
     Object term253218;
     Object term252537;

    public CSVPrinter_printRecord_2092483930233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term253340 = new Character((char) 0);
        Class<? extends Object> term253987 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term253986 = ((Class) term253987).getDeclaredField((String) "ALL");
        ((Field) term253986).setAccessible(true);
        Object enum193 = ((Field) term253986).get((Object) null);
        term253218 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term253288 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term253218, term253218.getClass(), "newRecord", true);
        setField(term253288, term253288.getClass(), "quoteChar", term253340);
        setCharField(term253288, term253288.getClass(), "delimiter", (char) 0);
        setField(term253288, term253288.getClass(), "quotePolicy", enum193);
        setField(term253218, term253218.getClass(), "format", term253288);
        term252537 = (Object[]) newArray("java.lang.Object", 1);
        Object term253512 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term252537, 0, term253512);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term252537;
        try {
            callMethod(klass, "printRecord", argTypes, term253218, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


