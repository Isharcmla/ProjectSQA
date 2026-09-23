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

public class CSVPrinter_printRecord_2092483930341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term981584;
     Object term975848;

    public CSVPrinter_printRecord_2092483930341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term981706 = new Character((char) 8192);
        Class<? extends Object> term982394 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term982393 = ((Class) term982394).getDeclaredField((String) "NONE");
        ((Field) term982393).setAccessible(true);
        Object enum331 = ((Field) term982393).get((Object) null);
        term981584 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term981654 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term981584, term981584.getClass(), "newRecord", true);
        setField(term981654, term981654.getClass(), "quoteChar", term981706);
        setCharField(term981654, term981654.getClass(), "delimiter", (char) 256);
        setField(term981654, term981654.getClass(), "quotePolicy", enum331);
        setField(term981584, term981584.getClass(), "format", term981654);
        term975848 = (Object[]) newArray("java.lang.Object", 1);
        Object term981882 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term975848, 0, term981882);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term975848;
        try {
            callMethod(klass, "printRecord", argTypes, term981584, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


