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

public class CSVPrinter_printRecord_2092483930145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98869;
     Object term97769;

    public CSVPrinter_printRecord_2092483930145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term98991 = new Character((char) 32896);
        Class<? extends Object> term99638 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term99637 = ((Class) term99638).getDeclaredField((String) "ALL");
        ((Field) term99637).setAccessible(true);
        Object enum108 = ((Field) term99637).get((Object) null);
        term98869 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term98939 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term98869, term98869.getClass(), "newRecord", true);
        setField(term98939, term98939.getClass(), "quoteChar", term98991);
        setCharField(term98939, term98939.getClass(), "delimiter", (char) 32768);
        setField(term98939, term98939.getClass(), "quotePolicy", enum108);
        setField(term98869, term98869.getClass(), "format", term98939);
        term97769 = (Object[]) newArray("java.lang.Object", 1);
        Object term99163 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term97769, 0, term99163);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term97769;
        try {
            callMethod(klass, "printRecord", argTypes, term98869, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


