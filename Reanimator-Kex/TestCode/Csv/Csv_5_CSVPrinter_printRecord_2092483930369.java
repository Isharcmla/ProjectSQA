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

public class CSVPrinter_printRecord_2092483930369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1035340;
     Object term1032607;

    public CSVPrinter_printRecord_2092483930369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term1035462 = new Character((char) 0);
        Class<? extends Object> term1036173 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term1036172 = ((Class) term1036173).getDeclaredField((String) "ALL");
        ((Field) term1036172).setAccessible(true);
        Object enum362 = ((Field) term1036172).get((Object) null);
        Character term1035614 = new Character((char) 21247);
        term1035340 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term1035410 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term1035340, term1035340.getClass(), "newRecord", true);
        setField(term1035410, term1035410.getClass(), "quoteChar", term1035462);
        setCharField(term1035410, term1035410.getClass(), "delimiter", (char) 1024);
        setField(term1035410, term1035410.getClass(), "quotePolicy", enum362);
        setField(term1035410, term1035410.getClass(), "escape", term1035614);
        setField(term1035340, term1035340.getClass(), "format", term1035410);
        term1032607 = (Object[]) newArray("java.lang.Object", 1);
        Object term1035690 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term1032607, 0, term1035690);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1032607;
        try {
            callMethod(klass, "printRecord", argTypes, term1035340, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


