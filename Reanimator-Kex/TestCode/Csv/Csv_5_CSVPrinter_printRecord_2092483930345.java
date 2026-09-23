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

public class CSVPrinter_printRecord_2092483930345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term985938;
     Object term984799;

    public CSVPrinter_printRecord_2092483930345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term986060 = new Character((char) 128);
        Class<? extends Object> term986782 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term986781 = ((Class) term986782).getDeclaredField((String) "NONE");
        ((Field) term986781).setAccessible(true);
        Object enum335 = ((Field) term986781).get((Object) null);
        term985938 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term986008 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term985938, term985938.getClass(), "newRecord", true);
        setField(term986008, term986008.getClass(), "quoteChar", term986060);
        setCharField(term986008, term986008.getClass(), "delimiter", (char) 4096);
        setField(term986008, term986008.getClass(), "quotePolicy", enum335);
        setField(term985938, term985938.getClass(), "format", term986008);
        term984799 = (Object[]) newArray("java.lang.Object", 2);
        Object term986232 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term986270 = newInstance(Class.forName("java.lang.Object"));
        setElement(term984799, 0, term986232);
        setElement(term984799, 1, term986270);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term984799;
        try {
            callMethod(klass, "printRecord", argTypes, term985938, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


