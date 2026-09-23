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

public class CSVPrinter_getOut_32765493929 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4567;
     Object term13415;

    public CSVPrinter_getOut_32765493929() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term4570 = new Character('S');
        Class<? extends Object> term13429 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term13428 = ((Class) term13429).getDeclaredField((String) "MINIMAL");
        ((Field) term13428).setAccessible(true);
        Object enum31 = ((Field) term13428).get((Object) null);
        Character term4583 = new Character('S');
        Character term4585 = new Character('b');
        term4567 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term4568 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term4613 = (Object[]) newArray("java.lang.String", 0);
        setField(term4567, term4567.getClass(), "out", null);
        setCharField(term4568, term4568.getClass(), "delimiter", 'b');
        setField(term4568, term4568.getClass(), "quoteChar", term4570);
        setField(term4568, term4568.getClass(), "quotePolicy", enum31);
        setField(term4568, term4568.getClass(), "commentStart", term4583);
        setField(term4568, term4568.getClass(), "escape", term4585);
        setBooleanField(term4568, term4568.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term4568, term4568.getClass(), "ignoreEmptyLines", false);
        setField(term4568, term4568.getClass(), "recordSeparator", "jUbSRrkrYZ");
        setField(term4568, term4568.getClass(), "nullString", "bWWfajKbEX");
        setField(term4568, term4568.getClass(), "header", term4613);
        setBooleanField(term4568, term4568.getClass(), "skipHeaderRecord", true);
        setField(term4567, term4567.getClass(), "format", term4568);
        setBooleanField(term4567, term4567.getClass(), "newRecord", false);
        Character term13417 = new Character('S');
        Class<? extends Object> term13617 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term13616 = ((Class) term13617).getDeclaredField((String) "MINIMAL");
        ((Field) term13616).setAccessible(true);
        Object enum32 = ((Field) term13616).get((Object) null);
        Character term13421 = new Character('S');
        Character term13422 = new Character('b');
        term13415 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term13416 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term13427 = (Object[]) newArray("java.lang.String", 0);
        setField(term13415, term13415.getClass(), "out", null);
        setCharField(term13416, term13416.getClass(), "delimiter", 'b');
        setField(term13416, term13416.getClass(), "quoteChar", term13417);
        setField(term13416, term13416.getClass(), "quotePolicy", enum32);
        setField(term13416, term13416.getClass(), "commentStart", term13421);
        setField(term13416, term13416.getClass(), "escape", term13422);
        setBooleanField(term13416, term13416.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term13416, term13416.getClass(), "ignoreEmptyLines", false);
        setField(term13416, term13416.getClass(), "recordSeparator", "jUbSRrkrYZ");
        setField(term13416, term13416.getClass(), "nullString", "bWWfajKbEX");
        setField(term13416, term13416.getClass(), "header", term13427);
        setBooleanField(term13416, term13416.getClass(), "skipHeaderRecord", true);
        setField(term13415, term13415.getClass(), "format", term13416);
        setBooleanField(term13415, term13415.getClass(), "newRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getOut", argTypes, term4567, args);
        assertTrue(recursiveEquals(term4567, term13415));
        assertTrue(recursiveEquals(retValue, null));
    }

};


