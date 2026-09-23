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

public class CSVPrinter_printRecord_2092483930281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term864689;
     Object term863120;

    public CSVPrinter_printRecord_2092483930281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term864811 = new Character((char) 0);
        Class<? extends Object> term865522 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term865521 = ((Class) term865522).getDeclaredField((String) "ALL");
        ((Field) term865521).setAccessible(true);
        Object enum273 = ((Field) term865521).get((Object) null);
        Character term864963 = new Character((char) 0);
        term864689 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term864759 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term864689, term864689.getClass(), "newRecord", true);
        setField(term864759, term864759.getClass(), "quoteChar", term864811);
        setCharField(term864759, term864759.getClass(), "delimiter", (char) 0);
        setField(term864759, term864759.getClass(), "quotePolicy", enum273);
        setField(term864759, term864759.getClass(), "escape", term864963);
        setField(term864689, term864689.getClass(), "format", term864759);
        term863120 = (Object[]) newArray("java.lang.Object", 1);
        Object term865039 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term863120, 0, term865039);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term863120;
        try {
            callMethod(klass, "printRecord", argTypes, term864689, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


