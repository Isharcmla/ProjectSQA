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

public class CSVPrinter_printRecord_2092483930237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term258054;
     Object term257663;

    public CSVPrinter_printRecord_2092483930237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term258176 = new Character((char) 8192);
        Class<? extends Object> term259111 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term259110 = ((Class) term259111).getDeclaredField((String) "MINIMAL");
        ((Field) term259110).setAccessible(true);
        Object enum197 = ((Field) term259110).get((Object) null);
        term258054 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term258124 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term258054, term258054.getClass(), "newRecord", true);
        setField(term258124, term258124.getClass(), "quoteChar", term258176);
        setCharField(term258124, term258124.getClass(), "delimiter", (char) 2048);
        setField(term258124, term258124.getClass(), "quotePolicy", enum197);
        setField(term258054, term258054.getClass(), "format", term258124);
        term257663 = (Object[]) newArray("java.lang.Object", 2);
        Object term258348 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term258386 = newInstance(Class.forName("java.lang.Object"));
        setElement(term257663, 0, term258348);
        setElement(term257663, 1, term258386);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term257663;
        try {
            callMethod(klass, "printRecord", argTypes, term258054, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


