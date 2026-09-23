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

public class CSVPrinter_printRecord_2092483930159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term153813;
     Object term152686;

    public CSVPrinter_printRecord_2092483930159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term153935 = new Character((char) 4952);
        Class<? extends Object> term154586 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term154585 = ((Class) term154586).getDeclaredField((String) "ALL");
        ((Field) term154585).setAccessible(true);
        Object enum134 = ((Field) term154585).get((Object) null);
        term153813 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term153883 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term153813, term153813.getClass(), "newRecord", true);
        setField(term153883, term153883.getClass(), "quoteChar", term153935);
        setCharField(term153883, term153883.getClass(), "delimiter", (char) 32953);
        setField(term153883, term153883.getClass(), "quotePolicy", enum134);
        setField(term153813, term153813.getClass(), "format", term153883);
        term152686 = (Object[]) newArray("java.lang.Object", 1);
        Object term154111 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term152686, 0, term154111);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term152686;
        try {
            callMethod(klass, "printRecord", argTypes, term153813, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


