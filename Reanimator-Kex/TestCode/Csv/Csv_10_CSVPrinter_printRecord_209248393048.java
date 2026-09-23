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

public class CSVPrinter_printRecord_209248393048 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19271;
     Object term19002;

    public CSVPrinter_printRecord_209248393048() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term19393 = new Character((char) 0);
        Class<? extends Object> term21197 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term21196 = ((Class) term21197).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term21196).setAccessible(true);
        Object enum39 = ((Field) term21196).get((Object) null);
        term19271 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term19341 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term19271, term19271.getClass(), "newRecord", true);
        setField(term19341, term19341.getClass(), "quoteChar", term19393);
        setCharField(term19341, term19341.getClass(), "delimiter", (char) 0);
        setField(term19341, term19341.getClass(), "quotePolicy", enum39);
        setField(term19271, term19271.getClass(), "format", term19341);
        term19002 = (Object[]) newArray("java.lang.Object", 1);
        Object term19565 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term19002, 0, term19565);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term19002;
        try {
            callMethod(klass, "printRecord", argTypes, term19271, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


