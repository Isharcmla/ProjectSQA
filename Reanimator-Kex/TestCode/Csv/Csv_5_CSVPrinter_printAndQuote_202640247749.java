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
import java.nio.ReadOnlyBufferException;
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Character;
import java.lang.String;

public class CSVPrinter_printAndQuote_202640247749 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19357;
     Object term19727;

    public CSVPrinter_printAndQuote_202640247749() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term19479 = new Character((char) 0);
        Class<? extends Object> term20208 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term20207 = ((Class) term20208).getDeclaredField((String) "MINIMAL");
        ((Field) term20207).setAccessible(true);
        Object enum38 = ((Field) term20207).get((Object) null);
        term19357 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term19427 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object term19651 = newInstance(Class.forName("java.nio.ByteBufferAsCharBufferRB"));
        setCharField(term19427, term19427.getClass(), "delimiter", (char) 0);
        setField(term19427, term19427.getClass(), "quoteChar", term19479);
        setField(term19427, term19427.getClass(), "quotePolicy", enum38);
        setField(term19357, term19357.getClass(), "format", term19427);
        setField(term19357, term19357.getClass(), "out", term19651);
        term19727 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.CharSequence");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term19727;
        args[1] = null;
        args[2] = 0;
        args[3] = 0;
        try {
            callMethod(klass, "printAndQuote", argTypes, term19357, args);
            assertTrue(false);
        }
        catch (ReadOnlyBufferException e) {
        }

    }

};


