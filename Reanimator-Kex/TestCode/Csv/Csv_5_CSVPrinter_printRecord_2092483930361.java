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

public class CSVPrinter_printRecord_2092483930361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1018960;
     Object term1018601;

    public CSVPrinter_printRecord_2092483930361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term1019082 = new Character((char) 0);
        Class<? extends Object> term1020053 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term1020052 = ((Class) term1020053).getDeclaredField((String) "MINIMAL");
        ((Field) term1020052).setAccessible(true);
        Object enum353 = ((Field) term1020052).get((Object) null);
        Character term1019234 = new Character((char) 1);
        term1018960 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term1019030 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term1018960, term1018960.getClass(), "newRecord", true);
        setField(term1019030, term1019030.getClass(), "quoteChar", term1019082);
        setCharField(term1019030, term1019030.getClass(), "delimiter", (char) 128);
        setField(term1019030, term1019030.getClass(), "quotePolicy", enum353);
        setField(term1019030, term1019030.getClass(), "escape", term1019234);
        setField(term1018960, term1018960.getClass(), "format", term1019030);
        term1018601 = (Object[]) newArray("java.lang.Object", 1);
        Object term1019310 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term1018601, 0, term1019310);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1018601;
        try {
            callMethod(klass, "printRecord", argTypes, term1018960, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


