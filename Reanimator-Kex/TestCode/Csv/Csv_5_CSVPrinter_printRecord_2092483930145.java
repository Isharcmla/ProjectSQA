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

public class CSVPrinter_printRecord_2092483930145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132116;
     Object term130718;

    public CSVPrinter_printRecord_2092483930145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term132238 = new Character((char) 45055);
        Class<? extends Object> term132946 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term132945 = ((Class) term132946).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term132945).setAccessible(true);
        Object enum120 = ((Field) term132945).get((Object) null);
        term132116 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term132186 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term132116, term132116.getClass(), "newRecord", true);
        setField(term132186, term132186.getClass(), "quoteChar", term132238);
        setCharField(term132186, term132186.getClass(), "delimiter", (char) 61439);
        setField(term132186, term132186.getClass(), "quotePolicy", enum120);
        setField(term132116, term132116.getClass(), "format", term132186);
        term130718 = (Object[]) newArray("java.lang.Object", 1);
        Object term132414 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term130718, 0, term132414);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term130718;
        try {
            callMethod(klass, "printRecord", argTypes, term132116, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


