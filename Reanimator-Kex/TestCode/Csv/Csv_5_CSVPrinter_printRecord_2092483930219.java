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

public class CSVPrinter_printRecord_2092483930219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term302719;
     Object term278781;

    public CSVPrinter_printRecord_2092483930219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term302841 = new Character((char) 65532);
        Class<? extends Object> term303492 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term303491 = ((Class) term303492).getDeclaredField((String) "ALL");
        ((Field) term303491).setAccessible(true);
        Object enum198 = ((Field) term303491).get((Object) null);
        term302719 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term302789 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term302719, term302719.getClass(), "newRecord", true);
        setField(term302789, term302789.getClass(), "quoteChar", term302841);
        setCharField(term302789, term302789.getClass(), "delimiter", (char) 49149);
        setField(term302789, term302789.getClass(), "quotePolicy", enum198);
        setField(term302719, term302719.getClass(), "format", term302789);
        term278781 = (Object[]) newArray("java.lang.Object", 1);
        Object term303017 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term278781, 0, term303017);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term278781;
        try {
            callMethod(klass, "printRecord", argTypes, term302719, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


