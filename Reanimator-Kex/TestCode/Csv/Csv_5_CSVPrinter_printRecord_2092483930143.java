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

public class CSVPrinter_printRecord_2092483930143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129641;
     Object term128126;

    public CSVPrinter_printRecord_2092483930143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term129763 = new Character((char) 8192);
        Class<? extends Object> term130471 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term130470 = ((Class) term130471).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term130470).setAccessible(true);
        Object enum118 = ((Field) term130470).get((Object) null);
        term129641 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term129711 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term129641, term129641.getClass(), "newRecord", true);
        setField(term129711, term129711.getClass(), "quoteChar", term129763);
        setCharField(term129711, term129711.getClass(), "delimiter", (char) 4);
        setField(term129711, term129711.getClass(), "quotePolicy", enum118);
        setField(term129641, term129641.getClass(), "format", term129711);
        term128126 = (Object[]) newArray("java.lang.Object", 1);
        Object term129939 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term128126, 0, term129939);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term128126;
        try {
            callMethod(klass, "printRecord", argTypes, term129641, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


