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

public class CSVPrinter_printRecord_2092483930129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75965;
     Object term74332;

    public CSVPrinter_printRecord_2092483930129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term76087 = new Character((char) 45055);
        Class<? extends Object> term76734 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term76733 = ((Class) term76734).getDeclaredField((String) "ALL");
        ((Field) term76733).setAccessible(true);
        Object enum92 = ((Field) term76733).get((Object) null);
        term75965 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term76035 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term75965, term75965.getClass(), "newRecord", true);
        setField(term76035, term76035.getClass(), "quoteChar", term76087);
        setCharField(term76035, term76035.getClass(), "delimiter", (char) 45055);
        setField(term76035, term76035.getClass(), "quotePolicy", enum92);
        setField(term75965, term75965.getClass(), "format", term76035);
        term74332 = (Object[]) newArray("java.lang.Object", 1);
        Object term76259 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term74332, 0, term76259);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term74332;
        try {
            callMethod(klass, "printRecord", argTypes, term75965, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


