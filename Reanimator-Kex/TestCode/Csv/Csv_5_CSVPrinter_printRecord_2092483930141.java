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

public class CSVPrinter_printRecord_2092483930141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126693;
     Object term124388;

    public CSVPrinter_printRecord_2092483930141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term126815 = new Character((char) 64);
        Class<? extends Object> term127759 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term127758 = ((Class) term127759).getDeclaredField((String) "NONE");
        ((Field) term127758).setAccessible(true);
        Object enum115 = ((Field) term127758).get((Object) null);
        term126693 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term126763 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term126693, term126693.getClass(), "newRecord", true);
        setField(term126763, term126763.getClass(), "quoteChar", term126815);
        setCharField(term126763, term126763.getClass(), "delimiter", (char) 512);
        setField(term126763, term126763.getClass(), "quotePolicy", enum115);
        setField(term126693, term126693.getClass(), "format", term126763);
        Class<? extends Object> term127918 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term127917 = ((Class) term127918).getDeclaredField((String) "ALL");
        ((Field) term127917).setAccessible(true);
        Object enum116 = ((Field) term127917).get((Object) null);
        term124388 = (Object[]) newArray("java.lang.Object", 2);
        Object term126991 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term124388, 0, term126991);
        setElement(term124388, 1, enum116);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term124388;
        try {
            callMethod(klass, "printRecord", argTypes, term126693, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


