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

public class CSVPrinter_printRecord_2092483930277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term325871;
     Object term321061;

    public CSVPrinter_printRecord_2092483930277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term325993 = new Character((char) 4096);
        Class<? extends Object> term326689 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term326688 = ((Class) term326689).getDeclaredField((String) "ALL");
        ((Field) term326688).setAccessible(true);
        Object enum241 = ((Field) term326688).get((Object) null);
        term325871 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term325941 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term325871, term325871.getClass(), "newRecord", true);
        setField(term325941, term325941.getClass(), "quoteChar", term325993);
        setCharField(term325941, term325941.getClass(), "delimiter", (char) 61407);
        setField(term325941, term325941.getClass(), "quotePolicy", enum241);
        setField(term325871, term325871.getClass(), "format", term325941);
        term321061 = (Object[]) newArray("java.lang.Object", 2);
        Object term326165 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term321061, 0, term326165);
        setElement(term321061, 1, "NON_NUMERIC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term321061;
        try {
            callMethod(klass, "printRecord", argTypes, term325871, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


