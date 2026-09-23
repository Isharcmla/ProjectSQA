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

public class CSVFormat_withEscape_158958405174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9674;
     Object term9750;
     Object term39121;
     Object term39137;
     Object term38912;

    public CSVFormat_withEscape_158958405174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term9676 = new Character('M');
        Class<? extends Object> term39139 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term39138 = ((Class) term39139).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term39138).setAccessible(true);
        Object enum99 = ((Field) term39138).get((Object) null);
        Character term9693 = new Character('x');
        Character term9695 = new Character('l');
        term9674 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term9724 = (Object[]) newArray("java.lang.String", 2);
        setCharField(term9674, term9674.getClass(), "delimiter", 'J');
        setField(term9674, term9674.getClass(), "quoteCharacter", term9676);
        setField(term9674, term9674.getClass(), "quoteMode", enum99);
        setField(term9674, term9674.getClass(), "commentMarker", term9693);
        setField(term9674, term9674.getClass(), "escapeCharacter", term9695);
        setBooleanField(term9674, term9674.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term9674, term9674.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term9674, term9674.getClass(), "ignoreEmptyLines", false);
        setField(term9674, term9674.getClass(), "recordSeparator", "sQvGcVjdEx");
        setField(term9674, term9674.getClass(), "nullString", "rLHAoqXgPh");
        setElement(term9724, 0, "zUlRdimJtU");
        setElement(term9724, 1, "vwbEQQNQrx");
        setField(term9674, term9674.getClass(), "header", term9724);
        setBooleanField(term9674, term9674.getClass(), "skipHeaderRecord", false);
        term9750 = new Character('s');
        Character term39122 = new Character('M');
        Class<? extends Object> term39379 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term39378 = ((Class) term39379).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term39378).setAccessible(true);
        Object enum100 = ((Field) term39378).get((Object) null);
        Character term39126 = new Character('x');
        Character term39127 = new Character('l');
        term39121 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term39132 = (Object[]) newArray("java.lang.String", 2);
        setCharField(term39121, term39121.getClass(), "delimiter", 'J');
        setField(term39121, term39121.getClass(), "quoteCharacter", term39122);
        setField(term39121, term39121.getClass(), "quoteMode", enum100);
        setField(term39121, term39121.getClass(), "commentMarker", term39126);
        setField(term39121, term39121.getClass(), "escapeCharacter", term39127);
        setBooleanField(term39121, term39121.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term39121, term39121.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term39121, term39121.getClass(), "ignoreEmptyLines", false);
        setField(term39121, term39121.getClass(), "recordSeparator", "sQvGcVjdEx");
        setField(term39121, term39121.getClass(), "nullString", "rLHAoqXgPh");
        setElement(term39132, 0, "zUlRdimJtU");
        setElement(term39132, 1, "vwbEQQNQrx");
        setField(term39121, term39121.getClass(), "header", term39132);
        setBooleanField(term39121, term39121.getClass(), "skipHeaderRecord", false);
        term39137 = new Character('s');
        Character term38914 = new Character('M');
        Class<? extends Object> term39619 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term39618 = ((Class) term39619).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term39618).setAccessible(true);
        Object enum101 = ((Field) term39618).get((Object) null);
        Character term38931 = new Character('x');
        Character term38933 = new Character('s');
        term38912 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term38962 = (Object[]) newArray("java.lang.String", 2);
        setCharField(term38912, term38912.getClass(), "delimiter", 'J');
        setField(term38912, term38912.getClass(), "quoteCharacter", term38914);
        setField(term38912, term38912.getClass(), "quoteMode", enum101);
        setField(term38912, term38912.getClass(), "commentMarker", term38931);
        setField(term38912, term38912.getClass(), "escapeCharacter", term38933);
        setBooleanField(term38912, term38912.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term38912, term38912.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term38912, term38912.getClass(), "ignoreEmptyLines", false);
        setField(term38912, term38912.getClass(), "recordSeparator", "sQvGcVjdEx");
        setField(term38912, term38912.getClass(), "nullString", "rLHAoqXgPh");
        setElement(term38962, 0, "zUlRdimJtU");
        setElement(term38962, 1, "vwbEQQNQrx");
        setField(term38912, term38912.getClass(), "header", term38962);
        setBooleanField(term38912, term38912.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Character");
        Object[] args = new Object[1];
        args[0] = term9750;
        Object retValue = callMethod(klass, "withEscape", argTypes, term9674, args);
        assertTrue(recursiveEquals(term9674, term39121));
        assertTrue(recursiveEquals(term9750, term39137));
        assertTrue(recursiveEquals(retValue, term38912));
    }

};


