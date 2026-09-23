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
import java.lang.String;

public class CSVPrinter_printRecords_1035483741145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119285;
     Object term118565;

    public CSVPrinter_printRecords_1035483741145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119285 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setBooleanField(term119285, term119285.getClass(), "newRecord", false);
        Class<? extends Object> term119789 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term119788 = ((Class) term119789).getDeclaredField((String) "ALL");
        ((Field) term119788).setAccessible(true);
        Object enum122 = ((Field) term119788).get((Object) null);
        term118565 = (Object[]) newArray("java.lang.Object", 10);
        setElement(term118565, 0, enum122);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term118565;
        try {
            callMethod(klass, "printRecords", argTypes, term119285, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


