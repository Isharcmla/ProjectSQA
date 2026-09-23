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

public class CSVPrinter_printRecord_2092483930253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term350643;
     Object term350414;

    public CSVPrinter_printRecord_2092483930253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term350765 = new Character((char) 0);
        Class<? extends Object> term351742 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term351741 = ((Class) term351742).getDeclaredField((String) "NONE");
        ((Field) term351741).setAccessible(true);
        Object enum236 = ((Field) term351741).get((Object) null);
        Character term350917 = new Character((char) 0);
        term350643 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term350713 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term350643, term350643.getClass(), "newRecord", true);
        setField(term350713, term350713.getClass(), "quoteChar", term350765);
        setCharField(term350713, term350713.getClass(), "delimiter", (char) 0);
        setField(term350713, term350713.getClass(), "quotePolicy", enum236);
        setField(term350713, term350713.getClass(), "escape", term350917);
        setField(term350643, term350643.getClass(), "format", term350713);
        term350414 = (Object[]) newArray("java.lang.Object", 1);
        Object term350993 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term350414, 0, term350993);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term350414;
        try {
            callMethod(klass, "printRecord", argTypes, term350643, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


