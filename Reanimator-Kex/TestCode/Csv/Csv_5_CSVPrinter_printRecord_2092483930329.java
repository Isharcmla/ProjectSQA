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

public class CSVPrinter_printRecord_2092483930329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term955869;
     Object term948900;

    public CSVPrinter_printRecord_2092483930329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term955991 = new Character((char) 0);
        Class<? extends Object> term956702 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term956701 = ((Class) term956702).getDeclaredField((String) "ALL");
        ((Field) term956701).setAccessible(true);
        Object enum321 = ((Field) term956701).get((Object) null);
        Character term956143 = new Character((char) 12864);
        term955869 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term955939 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term955869, term955869.getClass(), "newRecord", true);
        setField(term955939, term955939.getClass(), "quoteChar", term955991);
        setCharField(term955939, term955939.getClass(), "delimiter", (char) 52623);
        setField(term955939, term955939.getClass(), "quotePolicy", enum321);
        setField(term955939, term955939.getClass(), "escape", term956143);
        setField(term955869, term955869.getClass(), "format", term955939);
        term948900 = (Object[]) newArray("java.lang.Object", 1);
        Object term956219 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term948900, 0, term956219);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term948900;
        try {
            callMethod(klass, "printRecord", argTypes, term955869, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


