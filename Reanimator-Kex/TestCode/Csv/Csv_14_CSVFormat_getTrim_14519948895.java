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
import java.lang.Object;
import java.lang.String;

public class CSVFormat_getTrim_14519948895 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7968;
     Object term53229;

    public CSVFormat_getTrim_14519948895() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term7970 = new Character('R');
        Character term7973 = new Character('T');
        Character term8004 = new Character('N');
        Class<? extends Object> term53265 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term53264 = ((Class) term53265).getDeclaredField((String) "MINIMAL");
        ((Field) term53264).setAccessible(true);
        Object enum109 = ((Field) term53264).get((Object) null);
        term7968 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term7975 = (Object[]) newArray("java.lang.String", 1);
        Object[] term7988 = (Object[]) newArray("java.lang.String", 0);
        setBooleanField(term7968, term7968.getClass(), "allowMissingColumnNames", true);
        setField(term7968, term7968.getClass(), "commentMarker", term7970);
        setCharField(term7968, term7968.getClass(), "delimiter", 'K');
        setField(term7968, term7968.getClass(), "escapeCharacter", term7973);
        setElement(term7975, 0, "kVEZMHmRtR");
        setField(term7968, term7968.getClass(), "header", term7975);
        setField(term7968, term7968.getClass(), "headerComments", term7988);
        setBooleanField(term7968, term7968.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term7968, term7968.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term7968, term7968.getClass(), "ignoreSurroundingSpaces", true);
        setField(term7968, term7968.getClass(), "nullString", "ekxGuOYIwi");
        setField(term7968, term7968.getClass(), "quoteCharacter", term8004);
        setField(term7968, term7968.getClass(), "quoteMode", enum109);
        setField(term7968, term7968.getClass(), "recordSeparator", "RbVQXSpxXy");
        setBooleanField(term7968, term7968.getClass(), "skipHeaderRecord", true);
        setBooleanField(term7968, term7968.getClass(), "trailingDelimiter", false);
        setBooleanField(term7968, term7968.getClass(), "trim", false);
        Character term53230 = new Character('R');
        Character term53231 = new Character('T');
        Character term53238 = new Character('N');
        Class<? extends Object> term53483 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term53482 = ((Class) term53483).getDeclaredField((String) "MINIMAL");
        ((Field) term53482).setAccessible(true);
        Object enum110 = ((Field) term53482).get((Object) null);
        term53229 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term53232 = (Object[]) newArray("java.lang.String", 1);
        Object[] term53235 = (Object[]) newArray("java.lang.String", 0);
        setBooleanField(term53229, term53229.getClass(), "allowMissingColumnNames", true);
        setField(term53229, term53229.getClass(), "commentMarker", term53230);
        setCharField(term53229, term53229.getClass(), "delimiter", 'K');
        setField(term53229, term53229.getClass(), "escapeCharacter", term53231);
        setElement(term53232, 0, "kVEZMHmRtR");
        setField(term53229, term53229.getClass(), "header", term53232);
        setField(term53229, term53229.getClass(), "headerComments", term53235);
        setBooleanField(term53229, term53229.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term53229, term53229.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term53229, term53229.getClass(), "ignoreSurroundingSpaces", true);
        setField(term53229, term53229.getClass(), "nullString", "ekxGuOYIwi");
        setField(term53229, term53229.getClass(), "quoteCharacter", term53238);
        setField(term53229, term53229.getClass(), "quoteMode", enum110);
        setField(term53229, term53229.getClass(), "recordSeparator", "RbVQXSpxXy");
        setBooleanField(term53229, term53229.getClass(), "skipHeaderRecord", true);
        setBooleanField(term53229, term53229.getClass(), "trailingDelimiter", false);
        setBooleanField(term53229, term53229.getClass(), "trim", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTrim", argTypes, term7968, args);
        assertTrue(recursiveEquals(term7968, term53229));
    }

};


