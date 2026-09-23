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
import java.lang.Long;

public class CSVPrinter_print_165247380337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20326;
     Object term20598;

    public CSVPrinter_print_165247380337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term20448 = new Character((char) 0);
        Class<? extends Object> term21362 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term21361 = ((Class) term21362).getDeclaredField((String) "ALL");
        ((Field) term21361).setAccessible(true);
        Object enum34 = ((Field) term21361).get((Object) null);
        term20326 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term20396 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term20326, term20326.getClass(), "newRecord", true);
        setField(term20396, term20396.getClass(), "quoteCharacter", term20448);
        setCharField(term20396, term20396.getClass(), "delimiter", (char) 0);
        setField(term20396, term20396.getClass(), "quoteMode", enum34);
        setField(term20326, term20326.getClass(), "format", term20396);
        term20598 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term20598;
        try {
            callMethod(klass, "print", argTypes, term20326, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


