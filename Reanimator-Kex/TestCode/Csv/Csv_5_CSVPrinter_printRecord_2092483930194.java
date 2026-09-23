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

public class CSVPrinter_printRecord_2092483930194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term230719;
     Object term230445;

    public CSVPrinter_printRecord_2092483930194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term230841 = new Character((char) 0);
        Class<? extends Object> term233759 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term233758 = ((Class) term233759).getDeclaredField((String) "ALL");
        ((Field) term233758).setAccessible(true);
        Object enum171 = ((Field) term233758).get((Object) null);
        term230719 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term230789 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term230719, term230719.getClass(), "newRecord", true);
        setField(term230789, term230789.getClass(), "quoteChar", term230841);
        setCharField(term230789, term230789.getClass(), "delimiter", (char) 0);
        setField(term230789, term230789.getClass(), "quotePolicy", enum171);
        setField(term230719, term230719.getClass(), "format", term230789);
        term230445 = (Object[]) newArray("java.lang.Object", 2);
        Object term231017 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        Object term231055 = newInstance(Class.forName("java.lang.Object"));
        setElement(term230445, 0, term231017);
        setElement(term230445, 1, term231055);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term230445;
        try {
            callMethod(klass, "printRecord", argTypes, term230719, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


