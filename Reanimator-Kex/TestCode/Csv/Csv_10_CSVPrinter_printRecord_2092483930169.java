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

public class CSVPrinter_printRecord_2092483930169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129908;
     Object term129501;

    public CSVPrinter_printRecord_2092483930169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term130030 = new Character((char) 0);
        Class<? extends Object> term130715 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term130714 = ((Class) term130715).getDeclaredField((String) "ALL");
        ((Field) term130714).setAccessible(true);
        Object enum130 = ((Field) term130714).get((Object) null);
        term129908 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term129978 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term129908, term129908.getClass(), "newRecord", true);
        setField(term129978, term129978.getClass(), "quoteChar", term130030);
        setCharField(term129978, term129978.getClass(), "delimiter", (char) 0);
        setField(term129978, term129978.getClass(), "quotePolicy", enum130);
        setField(term129908, term129908.getClass(), "format", term129978);
        term129501 = (Object[]) newArray("java.lang.Object", 2);
        Object term130202 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term130240 = newInstance(Class.forName("java.lang.Object"));
        setElement(term129501, 0, term130202);
        setElement(term129501, 1, term130240);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term129501;
        try {
            callMethod(klass, "printRecord", argTypes, term129908, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


