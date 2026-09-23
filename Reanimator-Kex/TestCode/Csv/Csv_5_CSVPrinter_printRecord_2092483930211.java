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

public class CSVPrinter_printRecord_2092483930211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term271066;
     Object term269990;

    public CSVPrinter_printRecord_2092483930211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term271188 = new Character((char) 512);
        Class<? extends Object> term272137 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term272136 = ((Class) term272137).getDeclaredField((String) "MINIMAL");
        ((Field) term272136).setAccessible(true);
        Object enum188 = ((Field) term272136).get((Object) null);
        term271066 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term271136 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term271066, term271066.getClass(), "newRecord", true);
        setField(term271136, term271136.getClass(), "quoteChar", term271188);
        setCharField(term271136, term271136.getClass(), "delimiter", (char) 65502);
        setField(term271136, term271136.getClass(), "quotePolicy", enum188);
        setField(term271066, term271066.getClass(), "format", term271136);
        term269990 = (Object[]) newArray("java.lang.Object", 2);
        Object term271364 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        Object term271402 = newInstance(Class.forName("java.lang.Object"));
        setElement(term269990, 0, term271364);
        setElement(term269990, 1, term271402);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term269990;
        try {
            callMethod(klass, "printRecord", argTypes, term271066, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


