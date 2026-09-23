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

public class CSVFormat_getSkipHeaderRecord_128768154160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4870;
     Object term28243;

    public CSVFormat_getSkipHeaderRecord_128768154160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term4872 = new Character('S');
        Class<? extends Object> term28258 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term28257 = ((Class) term28258).getDeclaredField((String) "MINIMAL");
        ((Field) term28257).setAccessible(true);
        Object enum71 = ((Field) term28257).get((Object) null);
        Character term4885 = new Character('z');
        Character term4887 = new Character('j');
        term4870 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term4916 = (Object[]) newArray("java.lang.String", 1);
        setCharField(term4870, term4870.getClass(), "delimiter", 'b');
        setField(term4870, term4870.getClass(), "quoteCharacter", term4872);
        setField(term4870, term4870.getClass(), "quoteMode", enum71);
        setField(term4870, term4870.getClass(), "commentMarker", term4885);
        setField(term4870, term4870.getClass(), "escapeCharacter", term4887);
        setBooleanField(term4870, term4870.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term4870, term4870.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term4870, term4870.getClass(), "ignoreEmptyLines", false);
        setField(term4870, term4870.getClass(), "recordSeparator", "cAPeiZHKGJ");
        setField(term4870, term4870.getClass(), "nullString", "LvJFtLBaxj");
        setElement(term4916, 0, "PHvxnGHptP");
        setField(term4870, term4870.getClass(), "header", term4916);
        setBooleanField(term4870, term4870.getClass(), "skipHeaderRecord", false);
        Character term28244 = new Character('S');
        Class<? extends Object> term28476 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term28475 = ((Class) term28476).getDeclaredField((String) "MINIMAL");
        ((Field) term28475).setAccessible(true);
        Object enum72 = ((Field) term28475).get((Object) null);
        Character term28248 = new Character('z');
        Character term28249 = new Character('j');
        term28243 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term28254 = (Object[]) newArray("java.lang.String", 1);
        setCharField(term28243, term28243.getClass(), "delimiter", 'b');
        setField(term28243, term28243.getClass(), "quoteCharacter", term28244);
        setField(term28243, term28243.getClass(), "quoteMode", enum72);
        setField(term28243, term28243.getClass(), "commentMarker", term28248);
        setField(term28243, term28243.getClass(), "escapeCharacter", term28249);
        setBooleanField(term28243, term28243.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term28243, term28243.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term28243, term28243.getClass(), "ignoreEmptyLines", false);
        setField(term28243, term28243.getClass(), "recordSeparator", "cAPeiZHKGJ");
        setField(term28243, term28243.getClass(), "nullString", "LvJFtLBaxj");
        setElement(term28254, 0, "PHvxnGHptP");
        setField(term28243, term28243.getClass(), "header", term28254);
        setBooleanField(term28243, term28243.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSkipHeaderRecord", argTypes, term4870, args);
        assertTrue(recursiveEquals(term4870, term28243));
    }

};


