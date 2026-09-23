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

public class CSVFormat_getHeader_180582740849 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1901;
     Object term18785;
     Object term18589;

    public CSVFormat_getHeader_180582740849() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term1903 = new Character('q');
        Class<? extends Object> term18810 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term18809 = ((Class) term18810).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term18809).setAccessible(true);
        Object enum51 = ((Field) term18809).get((Object) null);
        Character term1920 = new Character('z');
        Character term1922 = new Character('x');
        term1901 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term1950 = (Object[]) newArray("java.lang.String", 6);
        setCharField(term1901, term1901.getClass(), "delimiter", 'g');
        setField(term1901, term1901.getClass(), "quoteChar", term1903);
        setField(term1901, term1901.getClass(), "quotePolicy", enum51);
        setField(term1901, term1901.getClass(), "commentStart", term1920);
        setField(term1901, term1901.getClass(), "escape", term1922);
        setBooleanField(term1901, term1901.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term1901, term1901.getClass(), "ignoreEmptyLines", false);
        setField(term1901, term1901.getClass(), "recordSeparator", "SbAoxhfrkn");
        setField(term1901, term1901.getClass(), "nullString", "kuTXqwMtDB");
        setElement(term1950, 0, "Ghbwtircqb");
        setElement(term1950, 1, "xrwlQZdwCp");
        setElement(term1950, 2, "IDCWpPLRkE");
        setElement(term1950, 3, "nyiiPDVjAc");
        setElement(term1950, 4, "aKnKipADSo");
        setElement(term1950, 5, "wSQxaModmm");
        setField(term1901, term1901.getClass(), "header", term1950);
        setBooleanField(term1901, term1901.getClass(), "skipHeaderRecord", true);
        Character term18786 = new Character('q');
        Class<? extends Object> term19070 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term19069 = ((Class) term19070).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term19069).setAccessible(true);
        Object enum52 = ((Field) term19069).get((Object) null);
        Character term18790 = new Character('z');
        Character term18791 = new Character('x');
        term18785 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term18796 = (Object[]) newArray("java.lang.String", 6);
        setCharField(term18785, term18785.getClass(), "delimiter", 'g');
        setField(term18785, term18785.getClass(), "quoteChar", term18786);
        setField(term18785, term18785.getClass(), "quotePolicy", enum52);
        setField(term18785, term18785.getClass(), "commentStart", term18790);
        setField(term18785, term18785.getClass(), "escape", term18791);
        setBooleanField(term18785, term18785.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term18785, term18785.getClass(), "ignoreEmptyLines", false);
        setField(term18785, term18785.getClass(), "recordSeparator", "SbAoxhfrkn");
        setField(term18785, term18785.getClass(), "nullString", "kuTXqwMtDB");
        setElement(term18796, 0, "Ghbwtircqb");
        setElement(term18796, 1, "xrwlQZdwCp");
        setElement(term18796, 2, "IDCWpPLRkE");
        setElement(term18796, 3, "nyiiPDVjAc");
        setElement(term18796, 4, "aKnKipADSo");
        setElement(term18796, 5, "wSQxaModmm");
        setField(term18785, term18785.getClass(), "header", term18796);
        setBooleanField(term18785, term18785.getClass(), "skipHeaderRecord", true);
        term18589 = (Object[]) newArray("java.lang.String", 6);
        setElement(term18589, 0, "Ghbwtircqb");
        setElement(term18589, 1, "xrwlQZdwCp");
        setElement(term18589, 2, "IDCWpPLRkE");
        setElement(term18589, 3, "nyiiPDVjAc");
        setElement(term18589, 4, "aKnKipADSo");
        setElement(term18589, 5, "wSQxaModmm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getHeader", argTypes, term1901, args);
        assertTrue(recursiveEquals(term1901, term18785));
        assertTrue(recursiveEquals(retValue, term18589));
    }

};


