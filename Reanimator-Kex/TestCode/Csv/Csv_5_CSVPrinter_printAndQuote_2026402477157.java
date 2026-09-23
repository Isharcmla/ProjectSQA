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

public class CSVPrinter_printAndQuote_2026402477157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151698;

    public CSVPrinter_printAndQuote_2026402477157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term151820 = new Character((char) 0);
        Class<? extends Object> term152422 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term152421 = ((Class) term152422).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term152421).setAccessible(true);
        Object enum132 = ((Field) term152421).get((Object) null);
        term151698 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term151768 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term151768, term151768.getClass(), "delimiter", (char) 0);
        setField(term151768, term151768.getClass(), "quoteChar", term151820);
        setField(term151768, term151768.getClass(), "quotePolicy", enum132);
        setField(term151698, term151698.getClass(), "format", term151768);
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
            callMethod(klass, "printAndQuote", argTypes, term151698, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


