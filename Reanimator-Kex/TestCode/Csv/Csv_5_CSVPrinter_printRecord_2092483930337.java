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

public class CSVPrinter_printRecord_2092483930337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term972802;
     Object term972331;

    public CSVPrinter_printRecord_2092483930337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term972924 = new Character((char) 0);
        Class<? extends Object> term973635 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term973634 = ((Class) term973635).getDeclaredField((String) "ALL");
        ((Field) term973634).setAccessible(true);
        Object enum327 = ((Field) term973634).get((Object) null);
        Character term973076 = new Character((char) 65511);
        term972802 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term972872 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term972802, term972802.getClass(), "newRecord", true);
        setField(term972872, term972872.getClass(), "quoteChar", term972924);
        setCharField(term972872, term972872.getClass(), "delimiter", (char) 32768);
        setField(term972872, term972872.getClass(), "quotePolicy", enum327);
        setField(term972872, term972872.getClass(), "escape", term973076);
        setField(term972802, term972802.getClass(), "format", term972872);
        term972331 = (Object[]) newArray("java.lang.Object", 1);
        Object term973152 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term972331, 0, term973152);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term972331;
        try {
            callMethod(klass, "printRecord", argTypes, term972802, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


