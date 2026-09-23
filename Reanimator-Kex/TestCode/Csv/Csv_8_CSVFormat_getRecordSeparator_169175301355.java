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
import java.lang.Character;
import java.lang.String;
import java.lang.Object;

public class CSVFormat_getRecordSeparator_169175301355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4007;
     Object term22678;

    public CSVFormat_getRecordSeparator_169175301355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term4009 = new Character('t');
        Class<? extends Object> term22695 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term22694 = ((Class) term22695).getDeclaredField((String) "MINIMAL");
        ((Field) term22694).setAccessible(true);
        Object enum64 = ((Field) term22694).get((Object) null);
        Character term4022 = new Character('D');
        Character term4024 = new Character('I');
        term4007 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term4052 = (Object[]) newArray("java.lang.String", 2);
        setCharField(term4007, term4007.getClass(), "delimiter", 'G');
        setField(term4007, term4007.getClass(), "quoteChar", term4009);
        setField(term4007, term4007.getClass(), "quotePolicy", enum64);
        setField(term4007, term4007.getClass(), "commentStart", term4022);
        setField(term4007, term4007.getClass(), "escape", term4024);
        setBooleanField(term4007, term4007.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term4007, term4007.getClass(), "ignoreEmptyLines", true);
        setField(term4007, term4007.getClass(), "recordSeparator", "MAcUBcBckh");
        setField(term4007, term4007.getClass(), "nullString", "oVgzLbrsFr");
        setElement(term4052, 0, "vQVyKLdtaz");
        setElement(term4052, 1, "OWKQODBLzb");
        setField(term4007, term4007.getClass(), "header", term4052);
        setBooleanField(term4007, term4007.getClass(), "skipHeaderRecord", true);
        Character term22679 = new Character('t');
        Class<? extends Object> term22903 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term22902 = ((Class) term22903).getDeclaredField((String) "MINIMAL");
        ((Field) term22902).setAccessible(true);
        Object enum65 = ((Field) term22902).get((Object) null);
        Character term22683 = new Character('D');
        Character term22684 = new Character('I');
        term22678 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term22689 = (Object[]) newArray("java.lang.String", 2);
        setCharField(term22678, term22678.getClass(), "delimiter", 'G');
        setField(term22678, term22678.getClass(), "quoteChar", term22679);
        setField(term22678, term22678.getClass(), "quotePolicy", enum65);
        setField(term22678, term22678.getClass(), "commentStart", term22683);
        setField(term22678, term22678.getClass(), "escape", term22684);
        setBooleanField(term22678, term22678.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term22678, term22678.getClass(), "ignoreEmptyLines", true);
        setField(term22678, term22678.getClass(), "recordSeparator", "MAcUBcBckh");
        setField(term22678, term22678.getClass(), "nullString", "oVgzLbrsFr");
        setElement(term22689, 0, "vQVyKLdtaz");
        setElement(term22689, 1, "OWKQODBLzb");
        setField(term22678, term22678.getClass(), "header", term22689);
        setBooleanField(term22678, term22678.getClass(), "skipHeaderRecord", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRecordSeparator", argTypes, term4007, args);
        assertTrue(recursiveEquals(term4007, term22678));
        assertTrue(recursiveEquals(retValue, "MAcUBcBckh"));
    }

};


