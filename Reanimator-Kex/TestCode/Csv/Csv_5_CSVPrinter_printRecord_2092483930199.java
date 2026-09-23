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

public class CSVPrinter_printRecord_2092483930199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term237503;
     Object term236853;

    public CSVPrinter_printRecord_2092483930199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term237625 = new Character((char) 0);
        Class<? extends Object> term238324 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term238323 = ((Class) term238324).getDeclaredField((String) "NONE");
        ((Field) term238323).setAccessible(true);
        Object enum178 = ((Field) term238323).get((Object) null);
        term237503 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term237573 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term237503, term237503.getClass(), "newRecord", true);
        setField(term237573, term237573.getClass(), "quoteChar", term237625);
        setCharField(term237573, term237573.getClass(), "delimiter", (char) 0);
        setField(term237573, term237573.getClass(), "quotePolicy", enum178);
        setField(term237503, term237503.getClass(), "format", term237573);
        term236853 = (Object[]) newArray("java.lang.Object", 1);
        Object term237801 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term236853, 0, term237801);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term236853;
        try {
            callMethod(klass, "printRecord", argTypes, term237503, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


