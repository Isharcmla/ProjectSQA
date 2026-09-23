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

public class CSVPrinter_printRecord_2092483930139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122672;
     Object term122250;

    public CSVPrinter_printRecord_2092483930139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term122794 = new Character((char) 0);
        Class<? extends Object> term124178 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term124177 = ((Class) term124178).getDeclaredField((String) "ALL");
        ((Field) term124177).setAccessible(true);
        Object enum112 = ((Field) term124177).get((Object) null);
        term122672 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term122742 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term122672, term122672.getClass(), "newRecord", true);
        setField(term122742, term122742.getClass(), "quoteChar", term122794);
        setCharField(term122742, term122742.getClass(), "delimiter", (char) 0);
        setField(term122742, term122742.getClass(), "quotePolicy", enum112);
        setField(term122672, term122672.getClass(), "format", term122742);
        term122250 = (Object[]) newArray("java.lang.Object", 2);
        Object term122964 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setElement(term122250, 0, term122964);
        setElement(term122250, 1, "NON_NUMERIC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term122250;
        try {
            callMethod(klass, "printRecord", argTypes, term122672, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


