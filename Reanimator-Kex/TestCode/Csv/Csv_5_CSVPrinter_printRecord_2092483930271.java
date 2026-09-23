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
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.csv.EqualityUtils.*;
import java.lang.Object;
import java.lang.Character;
import java.lang.String;

public class CSVPrinter_printRecord_2092483930271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term846436;
     Object term846112;
     Object term847074;
     Object term847081;

    public CSVPrinter_printRecord_2092483930271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term846558 = new Character((char) 0);
        Class<? extends Object> term847084 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term847083 = ((Class) term847084).getDeclaredField((String) "ALL");
        ((Field) term847083).setAccessible(true);
        Object enum262 = ((Field) term847083).get((Object) null);
        term846436 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term846506 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object term846696 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term846436, term846436.getClass(), "newRecord", true);
        setField(term846506, term846506.getClass(), "quoteChar", term846558);
        setCharField(term846506, term846506.getClass(), "delimiter", (char) 0);
        setField(term846506, term846506.getClass(), "quotePolicy", enum262);
        setField(term846436, term846436.getClass(), "format", term846506);
        setField(term846436, term846436.getClass(), "out", term846696);
        term846112 = (Object[]) newArray("java.lang.Object", 1);
        Object term846734 = newInstance(Class.forName("java.lang.Object"));
        setElement(term846112, 0, term846734);
        Character term847077 = new Character((char) 0);
        Class<? extends Object> term847240 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term847239 = ((Class) term847240).getDeclaredField((String) "ALL");
        ((Field) term847239).setAccessible(true);
        Object enum263 = ((Field) term847239).get((Object) null);
        term847074 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term847075 = newInstance(Class.forName("java.io.Writer$1"));
        Object term847076 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term847075, term847075.getClass(), "closed", false);
        setField(term847075, term847075.getClass(), "writeBuffer", null);
        setField(term847075, term847075.getClass(), "lock", null);
        setField(term847074, term847074.getClass(), "out", term847075);
        setCharField(term847076, term847076.getClass(), "delimiter", (char) 0);
        setField(term847076, term847076.getClass(), "quoteChar", term847077);
        setField(term847076, term847076.getClass(), "quotePolicy", enum263);
        setField(term847076, term847076.getClass(), "commentStart", null);
        setField(term847076, term847076.getClass(), "escape", null);
        setBooleanField(term847076, term847076.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term847076, term847076.getClass(), "ignoreEmptyLines", false);
        setField(term847076, term847076.getClass(), "recordSeparator", null);
        setField(term847076, term847076.getClass(), "nullString", null);
        setField(term847076, term847076.getClass(), "header", null);
        setBooleanField(term847076, term847076.getClass(), "skipHeaderRecord", false);
        setField(term847074, term847074.getClass(), "format", term847076);
        setBooleanField(term847074, term847074.getClass(), "newRecord", true);
        term847081 = (Object[]) newArray("java.lang.Object", 1);
        Object term847082 = newInstance(Class.forName("java.lang.Object"));
        setElement(term847081, 0, term847082);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term846112;
        callMethod(klass, "printRecord", argTypes, term846436, args);
        assertTrue(recursiveEquals(term846436, term847074));
        assertTrue(recursiveEquals(term846112, term847081));
    }

};


