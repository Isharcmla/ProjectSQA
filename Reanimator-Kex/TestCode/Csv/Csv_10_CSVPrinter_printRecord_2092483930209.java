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

public class CSVPrinter_printRecord_2092483930209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term208228;
     Object term205117;

    public CSVPrinter_printRecord_2092483930209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term208350 = new Character((char) 0);
        Class<? extends Object> term209072 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term209071 = ((Class) term209072).getDeclaredField((String) "NONE");
        ((Field) term209071).setAccessible(true);
        Object enum171 = ((Field) term209071).get((Object) null);
        term208228 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term208298 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term208228, term208228.getClass(), "newRecord", true);
        setField(term208298, term208298.getClass(), "quoteChar", term208350);
        setCharField(term208298, term208298.getClass(), "delimiter", (char) 0);
        setField(term208298, term208298.getClass(), "quotePolicy", enum171);
        setField(term208228, term208228.getClass(), "format", term208298);
        term205117 = (Object[]) newArray("java.lang.Object", 2);
        Object term208522 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term208560 = newInstance(Class.forName("java.lang.Object"));
        setElement(term205117, 0, term208522);
        setElement(term205117, 1, term208560);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term205117;
        try {
            callMethod(klass, "printRecord", argTypes, term208228, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


