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

public class CSVPrinter_printRecord_2092483930313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term923203;
     Object term921543;

    public CSVPrinter_printRecord_2092483930313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term923325 = new Character((char) 0);
        Class<? extends Object> term924036 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term924035 = ((Class) term924036).getDeclaredField((String) "ALL");
        ((Field) term924035).setAccessible(true);
        Object enum305 = ((Field) term924035).get((Object) null);
        Character term923477 = new Character((char) 60348);
        term923203 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term923273 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term923203, term923203.getClass(), "newRecord", true);
        setField(term923273, term923273.getClass(), "quoteChar", term923325);
        setCharField(term923273, term923273.getClass(), "delimiter", (char) 2);
        setField(term923273, term923273.getClass(), "quotePolicy", enum305);
        setField(term923273, term923273.getClass(), "escape", term923477);
        setField(term923203, term923203.getClass(), "format", term923273);
        term921543 = (Object[]) newArray("java.lang.Object", 1);
        Object term923553 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term921543, 0, term923553);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term921543;
        try {
            callMethod(klass, "printRecord", argTypes, term923203, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


