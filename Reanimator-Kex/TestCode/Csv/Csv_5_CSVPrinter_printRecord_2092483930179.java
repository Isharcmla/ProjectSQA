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

public class CSVPrinter_printRecord_2092483930179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term194061;
     Object term178432;

    public CSVPrinter_printRecord_2092483930179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term194183 = new Character((char) 48895);
        Class<? extends Object> term194891 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term194890 = ((Class) term194891).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term194890).setAccessible(true);
        Object enum154 = ((Field) term194890).get((Object) null);
        term194061 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term194131 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term194061, term194061.getClass(), "newRecord", true);
        setField(term194131, term194131.getClass(), "quoteChar", term194183);
        setCharField(term194131, term194131.getClass(), "delimiter", (char) 49151);
        setField(term194131, term194131.getClass(), "quotePolicy", enum154);
        setField(term194061, term194061.getClass(), "format", term194131);
        term178432 = (Object[]) newArray("java.lang.Object", 1);
        Object term194359 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term178432, 0, term194359);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term178432;
        try {
            callMethod(klass, "printRecord", argTypes, term194061, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


