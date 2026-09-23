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

public class CSVPrinter_printRecord_2092483930121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58878;
     Object term57420;

    public CSVPrinter_printRecord_2092483930121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term59000 = new Character((char) 32768);
        Class<? extends Object> term59647 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term59646 = ((Class) term59647).getDeclaredField((String) "ALL");
        ((Field) term59646).setAccessible(true);
        Object enum84 = ((Field) term59646).get((Object) null);
        term58878 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term58948 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term58878, term58878.getClass(), "newRecord", true);
        setField(term58948, term58948.getClass(), "quoteChar", term59000);
        setCharField(term58948, term58948.getClass(), "delimiter", (char) 2048);
        setField(term58948, term58948.getClass(), "quotePolicy", enum84);
        setField(term58878, term58878.getClass(), "format", term58948);
        term57420 = (Object[]) newArray("java.lang.Object", 1);
        Object term59172 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term57420, 0, term59172);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term57420;
        try {
            callMethod(klass, "printRecord", argTypes, term58878, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


