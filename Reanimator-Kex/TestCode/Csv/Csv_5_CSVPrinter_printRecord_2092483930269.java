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

public class CSVPrinter_printRecord_2092483930269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term845126;
     Object term843899;

    public CSVPrinter_printRecord_2092483930269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term845248 = new Character((char) 512);
        Class<? extends Object> term845899 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term845898 = ((Class) term845899).getDeclaredField((String) "ALL");
        ((Field) term845898).setAccessible(true);
        Object enum260 = ((Field) term845898).get((Object) null);
        term845126 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term845196 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term845126, term845126.getClass(), "newRecord", true);
        setField(term845196, term845196.getClass(), "quoteChar", term845248);
        setCharField(term845196, term845196.getClass(), "delimiter", (char) 32);
        setField(term845196, term845196.getClass(), "quotePolicy", enum260);
        setField(term845126, term845126.getClass(), "format", term845196);
        term843899 = (Object[]) newArray("java.lang.Object", 1);
        Object term845424 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term843899, 0, term845424);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term843899;
        try {
            callMethod(klass, "printRecord", argTypes, term845126, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


