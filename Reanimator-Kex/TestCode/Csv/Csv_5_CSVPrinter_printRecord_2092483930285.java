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

public class CSVPrinter_printRecord_2092483930285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term874879;
     Object term867624;

    public CSVPrinter_printRecord_2092483930285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term875001 = new Character((char) 30719);
        Class<? extends Object> term875717 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term875716 = ((Class) term875717).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term875716).setAccessible(true);
        Object enum277 = ((Field) term875716).get((Object) null);
        term874879 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term874949 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term874879, term874879.getClass(), "newRecord", true);
        setField(term874949, term874949.getClass(), "quoteChar", term875001);
        setCharField(term874949, term874949.getClass(), "delimiter", (char) 63423);
        setField(term874949, term874949.getClass(), "quotePolicy", enum277);
        setField(term874949, term874949.getClass(), "escape", term875001);
        setField(term874879, term874879.getClass(), "format", term874949);
        term867624 = (Object[]) newArray("java.lang.Object", 1);
        Object term875177 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term867624, 0, term875177);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term867624;
        try {
            callMethod(klass, "printRecord", argTypes, term874879, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


