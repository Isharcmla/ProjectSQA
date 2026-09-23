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
import java.lang.Integer;

public class CSVPrinter_printAndQuote_202640247721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1950;
     Object term2027;
     Object term2028;
     Object term2030;

    public CSVPrinter_printAndQuote_202640247721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term1953 = new Character('Q');
        Class<? extends Object> term8822 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term8821 = ((Class) term8822).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term8821).setAccessible(true);
        Object enum23 = ((Field) term8821).get((Object) null);
        Character term1970 = new Character('H');
        Character term1972 = new Character('g');
        term1950 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term1951 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term2000 = (Object[]) newArray("java.lang.String", 2);
        setField(term1950, term1950.getClass(), "out", null);
        setCharField(term1951, term1951.getClass(), "delimiter", 'g');
        setField(term1951, term1951.getClass(), "quoteChar", term1953);
        setField(term1951, term1951.getClass(), "quotePolicy", enum23);
        setField(term1951, term1951.getClass(), "commentStart", term1970);
        setField(term1951, term1951.getClass(), "escape", term1972);
        setBooleanField(term1951, term1951.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term1951, term1951.getClass(), "ignoreEmptyLines", true);
        setField(term1951, term1951.getClass(), "recordSeparator", "Ghbwtircqb");
        setField(term1951, term1951.getClass(), "nullString", "xrwlQZdwCp");
        setElement(term2000, 0, "IDCWpPLRkE");
        setElement(term2000, 1, "nyiiPDVjAc");
        setField(term1951, term1951.getClass(), "header", term2000);
        setBooleanField(term1951, term1951.getClass(), "skipHeaderRecord", false);
        setField(term1950, term1950.getClass(), "format", term1951);
        setBooleanField(term1950, term1950.getClass(), "newRecord", false);
        term2027 = newInstance(Class.forName("java.lang.Object"));
        term2028 = new Integer(-1922583790);
        term2030 = new Integer(-616727354);
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
        args[0] = term2027;
        args[1] = null;
        args[2] = term2028;
        args[3] = term2030;
        try {
            callMethod(klass, "printAndQuote", argTypes, term1950, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


