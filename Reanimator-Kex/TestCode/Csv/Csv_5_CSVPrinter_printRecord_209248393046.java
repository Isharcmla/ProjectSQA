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

public class CSVPrinter_printRecord_209248393046 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16856;
     Object term16587;

    public CSVPrinter_printRecord_209248393046() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term16978 = new Character((char) 0);
        Class<? extends Object> term18454 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term18453 = ((Class) term18454).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term18453).setAccessible(true);
        Object enum35 = ((Field) term18453).get((Object) null);
        term16856 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term16926 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term16856, term16856.getClass(), "newRecord", true);
        setField(term16926, term16926.getClass(), "quoteChar", term16978);
        setCharField(term16926, term16926.getClass(), "delimiter", (char) 0);
        setField(term16926, term16926.getClass(), "quotePolicy", enum35);
        setField(term16856, term16856.getClass(), "format", term16926);
        term16587 = (Object[]) newArray("java.lang.Object", 1);
        Object term17150 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term16587, 0, term17150);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term16587;
        try {
            callMethod(klass, "printRecord", argTypes, term16856, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


