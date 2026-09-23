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

public class CSVPrinter_printRecord_2092483930138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121770;
     Object term121474;

    public CSVPrinter_printRecord_2092483930138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term121892 = new Character((char) 0);
        Class<? extends Object> term123521 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term123520 = ((Class) term123521).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term123520).setAccessible(true);
        Object enum111 = ((Field) term123520).get((Object) null);
        term121770 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term121840 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term121770, term121770.getClass(), "newRecord", true);
        setField(term121840, term121840.getClass(), "quoteChar", term121892);
        setCharField(term121840, term121840.getClass(), "delimiter", (char) 2048);
        setField(term121840, term121840.getClass(), "quotePolicy", enum111);
        setField(term121770, term121770.getClass(), "format", term121840);
        term121474 = (Object[]) newArray("java.lang.Object", 1);
        Object term122068 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term121474, 0, term122068);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term121474;
        try {
            callMethod(klass, "printRecord", argTypes, term121770, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


