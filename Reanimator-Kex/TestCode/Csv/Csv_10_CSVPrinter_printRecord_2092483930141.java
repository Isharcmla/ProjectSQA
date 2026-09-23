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
     Object term91046;
     Object term90780;

    public CSVPrinter_printRecord_2092483930141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term91168 = new Character((char) 0);
        Class<? extends Object> term91785 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term91784 = ((Class) term91785).getDeclaredField((String) "ALL");
        ((Field) term91784).setAccessible(true);
        Object enum104 = ((Field) term91784).get((Object) null);
        term91046 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term91116 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term91046, term91046.getClass(), "newRecord", true);
        setField(term91116, term91116.getClass(), "quoteChar", term91168);
        setCharField(term91116, term91116.getClass(), "delimiter", (char) 0);
        setField(term91116, term91116.getClass(), "quotePolicy", enum104);
        setField(term91046, term91046.getClass(), "format", term91116);
        term90780 = (Object[]) newArray("java.lang.Object", 1);
        setElement(term90780, 0, "NONE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term90780;
        try {
            callMethod(klass, "printRecord", argTypes, term91046, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


