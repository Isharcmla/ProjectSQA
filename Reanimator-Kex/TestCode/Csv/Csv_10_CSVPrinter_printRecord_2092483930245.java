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

public class CSVPrinter_printRecord_2092483930245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term271465;
     Object term270849;

    public CSVPrinter_printRecord_2092483930245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term271587 = new Character((char) 1);
        Class<? extends Object> term273027 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term273026 = ((Class) term273027).getDeclaredField((String) "NONE");
        ((Field) term273026).setAccessible(true);
        Object enum205 = ((Field) term273026).get((Object) null);
        term271465 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term271535 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term271465, term271465.getClass(), "newRecord", true);
        setField(term271535, term271535.getClass(), "quoteChar", term271587);
        setCharField(term271535, term271535.getClass(), "delimiter", (char) 64);
        setField(term271535, term271535.getClass(), "quotePolicy", enum205);
        setField(term271465, term271465.getClass(), "format", term271535);
        term270849 = (Object[]) newArray("java.lang.Object", 1);
        Object term271759 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term270849, 0, term271759);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term270849;
        try {
            callMethod(klass, "printRecord", argTypes, term271465, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


