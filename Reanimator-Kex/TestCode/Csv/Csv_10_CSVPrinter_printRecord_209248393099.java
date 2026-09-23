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

public class CSVPrinter_printRecord_209248393099 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43872;
     Object term43680;

    public CSVPrinter_printRecord_209248393099() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term43994 = new Character((char) 0);
        Class<? extends Object> term45359 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term45358 = ((Class) term45359).getDeclaredField((String) "ALL");
        ((Field) term45358).setAccessible(true);
        Object enum68 = ((Field) term45358).get((Object) null);
        term43872 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term43942 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term43872, term43872.getClass(), "newRecord", true);
        setField(term43942, term43942.getClass(), "quoteChar", term43994);
        setCharField(term43942, term43942.getClass(), "delimiter", (char) 0);
        setField(term43942, term43942.getClass(), "quotePolicy", enum68);
        setField(term43872, term43872.getClass(), "format", term43942);
        term43680 = (Object[]) newArray("java.lang.Object", 2);
        Object term44170 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term43680, 0, term44170);
        setElement(term43680, 1, "NON_NUMERIC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term43680;
        try {
            callMethod(klass, "printRecord", argTypes, term43872, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


