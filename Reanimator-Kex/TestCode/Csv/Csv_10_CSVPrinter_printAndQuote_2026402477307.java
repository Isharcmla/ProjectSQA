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

public class CSVPrinter_printAndQuote_2026402477307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term365317;

    public CSVPrinter_printAndQuote_2026402477307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term365439 = new Character((char) 0);
        Class<? extends Object> term366041 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term366040 = ((Class) term366041).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term366040).setAccessible(true);
        Object enum271 = ((Field) term366040).get((Object) null);
        term365317 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term365387 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term365387, term365387.getClass(), "delimiter", (char) 0);
        setField(term365387, term365387.getClass(), "quoteChar", term365439);
        setField(term365387, term365387.getClass(), "quotePolicy", enum271);
        setField(term365317, term365317.getClass(), "format", term365387);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.CharSequence");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = 0;
        args[3] = 0;
        try {
            callMethod(klass, "printAndQuote", argTypes, term365317, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


