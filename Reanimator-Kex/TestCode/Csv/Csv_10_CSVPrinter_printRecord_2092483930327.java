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

public class CSVPrinter_printRecord_2092483930327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term407665;
     Object term405215;

    public CSVPrinter_printRecord_2092483930327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term407787 = new Character((char) 1);
        Class<? extends Object> term408476 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term408475 = ((Class) term408476).getDeclaredField((String) "ALL");
        ((Field) term408475).setAccessible(true);
        Object enum289 = ((Field) term408475).get((Object) null);
        term407665 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term407735 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object term407927 = newInstance(Class.forName("java.io.Console$3"));
        setBooleanField(term407665, term407665.getClass(), "newRecord", true);
        setField(term407735, term407735.getClass(), "quoteChar", term407787);
        setCharField(term407735, term407735.getClass(), "delimiter", (char) 256);
        setField(term407735, term407735.getClass(), "quotePolicy", enum289);
        setField(term407665, term407665.getClass(), "format", term407735);
        setField(term407665, term407665.getClass(), "out", term407927);
        term405215 = (Object[]) newArray("java.lang.Object", 1);
        Object term407999 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term405215, 0, term407999);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term405215;
        try {
            callMethod(klass, "printRecord", argTypes, term407665, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


