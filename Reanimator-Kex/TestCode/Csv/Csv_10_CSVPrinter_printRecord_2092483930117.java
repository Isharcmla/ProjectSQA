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

public class CSVPrinter_printRecord_2092483930117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53963;
     Object term53477;

    public CSVPrinter_printRecord_2092483930117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term54085 = new Character((char) 8192);
        Class<? extends Object> term55238 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term55237 = ((Class) term55238).getDeclaredField((String) "MINIMAL");
        ((Field) term55237).setAccessible(true);
        Object enum79 = ((Field) term55237).get((Object) null);
        term53963 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term54033 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term53963, term53963.getClass(), "newRecord", true);
        setField(term54033, term54033.getClass(), "quoteChar", term54085);
        setCharField(term54033, term54033.getClass(), "delimiter", (char) 16);
        setField(term54033, term54033.getClass(), "quotePolicy", enum79);
        setField(term53963, term53963.getClass(), "format", term54033);
        Class<? extends Object> term55406 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term55405 = ((Class) term55406).getDeclaredField((String) "ALL");
        ((Field) term55405).setAccessible(true);
        Object enum80 = ((Field) term55405).get((Object) null);
        term53477 = (Object[]) newArray("java.lang.Object", 2);
        Object term54257 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term53477, 0, term54257);
        setElement(term53477, 1, enum80);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term53477;
        try {
            callMethod(klass, "printRecord", argTypes, term53963, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


