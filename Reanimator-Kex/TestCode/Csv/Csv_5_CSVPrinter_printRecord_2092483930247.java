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

public class CSVPrinter_printRecord_2092483930247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term345569;
     Object term345028;

    public CSVPrinter_printRecord_2092483930247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term345691 = new Character((char) 49151);
        Class<? extends Object> term346602 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term346601 = ((Class) term346602).getDeclaredField((String) "MINIMAL");
        ((Field) term346601).setAccessible(true);
        Object enum230 = ((Field) term346601).get((Object) null);
        term345569 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term345639 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term345569, term345569.getClass(), "newRecord", true);
        setField(term345639, term345639.getClass(), "quoteChar", term345691);
        setCharField(term345639, term345639.getClass(), "delimiter", (char) 23725);
        setField(term345639, term345639.getClass(), "quotePolicy", enum230);
        setField(term345569, term345569.getClass(), "format", term345639);
        term345028 = (Object[]) newArray("java.lang.Object", 1);
        Object term345867 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term345028, 0, term345867);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term345028;
        try {
            callMethod(klass, "printRecord", argTypes, term345569, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


