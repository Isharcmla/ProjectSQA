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
     Object term51616;
     Object term49119;

    public CSVPrinter_printRecord_209248393099() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term51738 = new Character((char) 2048);
        Class<? extends Object> term52425 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term52424 = ((Class) term52425).getDeclaredField((String) "ALL");
        ((Field) term52424).setAccessible(true);
        Object enum70 = ((Field) term52424).get((Object) null);
        term51616 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term51686 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term51616, term51616.getClass(), "newRecord", true);
        setField(term51686, term51686.getClass(), "quoteChar", term51738);
        setCharField(term51686, term51686.getClass(), "delimiter", (char) 32);
        setField(term51686, term51686.getClass(), "quotePolicy", enum70);
        setField(term51616, term51616.getClass(), "format", term51686);
        term49119 = (Object[]) newArray("java.lang.Object", 2);
        Object term51914 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        Object term51952 = newInstance(Class.forName("java.lang.Object"));
        setElement(term49119, 0, term51914);
        setElement(term49119, 1, term51952);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term49119;
        try {
            callMethod(klass, "printRecord", argTypes, term51616, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


