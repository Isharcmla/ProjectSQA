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

public class CSVPrinter_printRecord_209248393067 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28239;
     Object term27525;

    public CSVPrinter_printRecord_209248393067() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term28361 = new Character((char) 0);
        Class<? extends Object> term29109 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term29108 = ((Class) term29109).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term29108).setAccessible(true);
        Object enum48 = ((Field) term29108).get((Object) null);
        term28239 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term28309 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term28239, term28239.getClass(), "newRecord", true);
        setField(term28309, term28309.getClass(), "quoteChar", term28361);
        setCharField(term28309, term28309.getClass(), "delimiter", (char) 0);
        setField(term28309, term28309.getClass(), "quotePolicy", enum48);
        setField(term28239, term28239.getClass(), "format", term28309);
        term27525 = (Object[]) newArray("java.lang.Object", 2);
        Object term28537 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term27525, 0, term28537);
        setElement(term27525, 1, "NONE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term27525;
        try {
            callMethod(klass, "printRecord", argTypes, term28239, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


