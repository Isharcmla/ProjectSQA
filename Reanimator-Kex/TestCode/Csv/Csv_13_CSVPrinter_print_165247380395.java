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

public class CSVPrinter_print_165247380395 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68486;

    public CSVPrinter_print_165247380395() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term68608 = new Character((char) 0);
        Class<? extends Object> term69254 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term69253 = ((Class) term69254).getDeclaredField((String) "ALL");
        ((Field) term69253).setAccessible(true);
        Object enum80 = ((Field) term69253).get((Object) null);
        term68486 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term68556 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term68486, term68486.getClass(), "newRecord", true);
        setField(term68556, term68556.getClass(), "quoteCharacter", term68608);
        setCharField(term68556, term68556.getClass(), "delimiter", (char) 0);
        setField(term68556, term68556.getClass(), "quoteMode", enum80);
        setField(term68486, term68486.getClass(), "format", term68556);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = "";
        try {
            callMethod(klass, "print", argTypes, term68486, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


