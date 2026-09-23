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

public class CSVFormat_hashCode_48276777357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4575;
     Object term23706;

    public CSVFormat_hashCode_48276777357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term4577 = new Character('S');
        Class<? extends Object> term23721 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term23720 = ((Class) term23721).getDeclaredField((String) "MINIMAL");
        ((Field) term23720).setAccessible(true);
        Object enum68 = ((Field) term23720).get((Object) null);
        Character term4590 = new Character('z');
        Character term4592 = new Character('j');
        term4575 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term4620 = (Object[]) newArray("java.lang.String", 1);
        setCharField(term4575, term4575.getClass(), "delimiter", 'b');
        setField(term4575, term4575.getClass(), "quoteChar", term4577);
        setField(term4575, term4575.getClass(), "quotePolicy", enum68);
        setField(term4575, term4575.getClass(), "commentStart", term4590);
        setField(term4575, term4575.getClass(), "escape", term4592);
        setBooleanField(term4575, term4575.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term4575, term4575.getClass(), "ignoreEmptyLines", true);
        setField(term4575, term4575.getClass(), "recordSeparator", "cAPeiZHKGJ");
        setField(term4575, term4575.getClass(), "nullString", "LvJFtLBaxj");
        setElement(term4620, 0, "PHvxnGHptP");
        setField(term4575, term4575.getClass(), "header", term4620);
        setBooleanField(term4575, term4575.getClass(), "skipHeaderRecord", false);
        Character term23707 = new Character('S');
        Class<? extends Object> term23919 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term23918 = ((Class) term23919).getDeclaredField((String) "MINIMAL");
        ((Field) term23918).setAccessible(true);
        Object enum69 = ((Field) term23918).get((Object) null);
        Character term23711 = new Character('z');
        Character term23712 = new Character('j');
        term23706 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term23717 = (Object[]) newArray("java.lang.String", 1);
        setCharField(term23706, term23706.getClass(), "delimiter", 'b');
        setField(term23706, term23706.getClass(), "quoteChar", term23707);
        setField(term23706, term23706.getClass(), "quotePolicy", enum69);
        setField(term23706, term23706.getClass(), "commentStart", term23711);
        setField(term23706, term23706.getClass(), "escape", term23712);
        setBooleanField(term23706, term23706.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term23706, term23706.getClass(), "ignoreEmptyLines", true);
        setField(term23706, term23706.getClass(), "recordSeparator", "cAPeiZHKGJ");
        setField(term23706, term23706.getClass(), "nullString", "LvJFtLBaxj");
        setElement(term23717, 0, "PHvxnGHptP");
        setField(term23706, term23706.getClass(), "header", term23717);
        setBooleanField(term23706, term23706.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term4575, args);
        assertTrue(recursiveEquals(term4575, term23706));
        assertTrue(recursiveEquals(retValue, 1479141337));
    }

};


