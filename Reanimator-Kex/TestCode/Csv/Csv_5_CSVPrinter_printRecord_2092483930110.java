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

public class CSVPrinter_printRecord_2092483930110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64945;
     Object term59839;

    public CSVPrinter_printRecord_2092483930110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term65067 = new Character((char) 32768);
        Class<? extends Object> term66400 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term66399 = ((Class) term66400).getDeclaredField((String) "MINIMAL");
        ((Field) term66399).setAccessible(true);
        Object enum79 = ((Field) term66399).get((Object) null);
        term64945 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term65015 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term64945, term64945.getClass(), "newRecord", true);
        setField(term65015, term65015.getClass(), "quoteChar", term65067);
        setCharField(term65015, term65015.getClass(), "delimiter", (char) 1);
        setField(term65015, term65015.getClass(), "quotePolicy", enum79);
        setField(term64945, term64945.getClass(), "format", term65015);
        Class<? extends Object> term66579 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term66578 = ((Class) term66579).getDeclaredField((String) "ALL");
        ((Field) term66578).setAccessible(true);
        Object enum80 = ((Field) term66578).get((Object) null);
        term59839 = (Object[]) newArray("java.lang.Object", 4);
        Object term65243 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        Object term65419 = newInstance(Class.forName("java.lang.Object"));
        setElement(term59839, 0, term65243);
        setElement(term59839, 1, "NON_NUMERIC");
        setElement(term59839, 2, enum80);
        setElement(term59839, 3, term65419);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term59839;
        try {
            callMethod(klass, "printRecord", argTypes, term64945, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


