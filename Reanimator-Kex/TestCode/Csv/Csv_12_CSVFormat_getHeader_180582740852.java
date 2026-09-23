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

public class CSVFormat_getHeader_180582740852 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2028;
     Object term22533;
     Object term22336;

    public CSVFormat_getHeader_180582740852() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term2030 = new Character('q');
        Class<? extends Object> term22558 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term22557 = ((Class) term22558).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term22557).setAccessible(true);
        Object enum53 = ((Field) term22557).get((Object) null);
        Character term2047 = new Character('z');
        Character term2049 = new Character('x');
        term2028 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term2078 = (Object[]) newArray("java.lang.String", 6);
        setCharField(term2028, term2028.getClass(), "delimiter", 'g');
        setField(term2028, term2028.getClass(), "quoteCharacter", term2030);
        setField(term2028, term2028.getClass(), "quoteMode", enum53);
        setField(term2028, term2028.getClass(), "commentMarker", term2047);
        setField(term2028, term2028.getClass(), "escapeCharacter", term2049);
        setBooleanField(term2028, term2028.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term2028, term2028.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term2028, term2028.getClass(), "ignoreEmptyLines", false);
        setField(term2028, term2028.getClass(), "recordSeparator", "SbAoxhfrkn");
        setField(term2028, term2028.getClass(), "nullString", "kuTXqwMtDB");
        setElement(term2078, 0, "Ghbwtircqb");
        setElement(term2078, 1, "xrwlQZdwCp");
        setElement(term2078, 2, "IDCWpPLRkE");
        setElement(term2078, 3, "nyiiPDVjAc");
        setElement(term2078, 4, "aKnKipADSo");
        setElement(term2078, 5, "wSQxaModmm");
        setField(term2028, term2028.getClass(), "header", term2078);
        setBooleanField(term2028, term2028.getClass(), "skipHeaderRecord", false);
        Character term22534 = new Character('q');
        Class<? extends Object> term22838 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term22837 = ((Class) term22838).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term22837).setAccessible(true);
        Object enum54 = ((Field) term22837).get((Object) null);
        Character term22538 = new Character('z');
        Character term22539 = new Character('x');
        term22533 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term22544 = (Object[]) newArray("java.lang.String", 6);
        setCharField(term22533, term22533.getClass(), "delimiter", 'g');
        setField(term22533, term22533.getClass(), "quoteCharacter", term22534);
        setField(term22533, term22533.getClass(), "quoteMode", enum54);
        setField(term22533, term22533.getClass(), "commentMarker", term22538);
        setField(term22533, term22533.getClass(), "escapeCharacter", term22539);
        setBooleanField(term22533, term22533.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term22533, term22533.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term22533, term22533.getClass(), "ignoreEmptyLines", false);
        setField(term22533, term22533.getClass(), "recordSeparator", "SbAoxhfrkn");
        setField(term22533, term22533.getClass(), "nullString", "kuTXqwMtDB");
        setElement(term22544, 0, "Ghbwtircqb");
        setElement(term22544, 1, "xrwlQZdwCp");
        setElement(term22544, 2, "IDCWpPLRkE");
        setElement(term22544, 3, "nyiiPDVjAc");
        setElement(term22544, 4, "aKnKipADSo");
        setElement(term22544, 5, "wSQxaModmm");
        setField(term22533, term22533.getClass(), "header", term22544);
        setBooleanField(term22533, term22533.getClass(), "skipHeaderRecord", false);
        term22336 = (Object[]) newArray("java.lang.String", 6);
        setElement(term22336, 0, "Ghbwtircqb");
        setElement(term22336, 1, "xrwlQZdwCp");
        setElement(term22336, 2, "IDCWpPLRkE");
        setElement(term22336, 3, "nyiiPDVjAc");
        setElement(term22336, 4, "aKnKipADSo");
        setElement(term22336, 5, "wSQxaModmm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getHeader", argTypes, term2028, args);
        assertTrue(recursiveEquals(term2028, term22533));
        assertTrue(recursiveEquals(retValue, term22336));
    }

};


