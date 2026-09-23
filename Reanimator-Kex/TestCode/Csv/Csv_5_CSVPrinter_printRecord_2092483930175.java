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

public class CSVPrinter_printRecord_2092483930175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174651;
     Object term174361;

    public CSVPrinter_printRecord_2092483930175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term174773 = new Character((char) 32768);
        Class<? extends Object> term175684 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term175683 = ((Class) term175684).getDeclaredField((String) "MINIMAL");
        ((Field) term175683).setAccessible(true);
        Object enum150 = ((Field) term175683).get((Object) null);
        term174651 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term174721 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term174651, term174651.getClass(), "newRecord", true);
        setField(term174721, term174721.getClass(), "quoteChar", term174773);
        setCharField(term174721, term174721.getClass(), "delimiter", (char) 512);
        setField(term174721, term174721.getClass(), "quotePolicy", enum150);
        setField(term174651, term174651.getClass(), "format", term174721);
        term174361 = (Object[]) newArray("java.lang.Object", 1);
        Object term174949 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term174361, 0, term174949);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term174361;
        try {
            callMethod(klass, "printRecord", argTypes, term174651, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


