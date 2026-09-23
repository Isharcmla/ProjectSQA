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
     Object term13414;

    public CSVPrinter_getOut_32765493929() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term4570 = new Character('S');
        Class<? extends Object> term13428 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term13427 = ((Class) term13428).getDeclaredField((String) "MINIMAL");
        ((Field) term13427).setAccessible(true);
        Object enum31 = ((Field) term13427).get((Object) null);
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
        Character term13416 = new Character('S');
        Class<? extends Object> term13616 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term13615 = ((Class) term13616).getDeclaredField((String) "MINIMAL");
        ((Field) term13615).setAccessible(true);
        Object enum32 = ((Field) term13615).get((Object) null);
        Character term13420 = new Character('S');
        Character term13421 = new Character('b');
        term13414 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term13415 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term13426 = (Object[]) newArray("java.lang.String", 0);
        setField(term13414, term13414.getClass(), "out", null);
        setCharField(term13415, term13415.getClass(), "delimiter", 'b');
        setField(term13415, term13415.getClass(), "quoteChar", term13416);
        setField(term13415, term13415.getClass(), "quotePolicy", enum32);
        setField(term13415, term13415.getClass(), "commentStart", term13420);
        setField(term13415, term13415.getClass(), "escape", term13421);
        setBooleanField(term13415, term13415.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term13415, term13415.getClass(), "ignoreEmptyLines", false);
        setField(term13415, term13415.getClass(), "recordSeparator", "jUbSRrkrYZ");
        setField(term13415, term13415.getClass(), "nullString", "bWWfajKbEX");
        setField(term13415, term13415.getClass(), "header", term13426);
        setBooleanField(term13415, term13415.getClass(), "skipHeaderRecord", true);
        setField(term13414, term13414.getClass(), "format", term13415);
        setBooleanField(term13414, term13414.getClass(), "newRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getOut", argTypes, term4567, args);
        assertTrue(recursiveEquals(term4567, term13414));
        assertTrue(recursiveEquals(retValue, null));
    }

};


