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

public class CSVFormat_getQuoteMode_56885578691 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6164;
     Object term49993;
     Object enum102;

    public CSVFormat_getQuoteMode_56885578691() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term6166 = new Character('b');
        Character term6169 = new Character('z');
        Character term6284 = new Character('j');
        Class<? extends Object> term50125 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term50124 = ((Class) term50125).getDeclaredField((String) "MINIMAL");
        ((Field) term50124).setAccessible(true);
        Object enum100 = ((Field) term50124).get((Object) null);
        term6164 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term6171 = (Object[]) newArray("java.lang.String", 2);
        Object[] term6196 = (Object[]) newArray("java.lang.String", 6);
        setBooleanField(term6164, term6164.getClass(), "allowMissingColumnNames", true);
        setField(term6164, term6164.getClass(), "commentMarker", term6166);
        setCharField(term6164, term6164.getClass(), "delimiter", 'S');
        setField(term6164, term6164.getClass(), "escapeCharacter", term6169);
        setElement(term6171, 0, "LWyEaeIyAo");
        setElement(term6171, 1, "yVMkkQhvmN");
        setField(term6164, term6164.getClass(), "header", term6171);
        setElement(term6196, 0, "mvrkADEgpp");
        setElement(term6196, 1, "pXOkjyeIRb");
        setElement(term6196, 2, "GgZWSjxjyE");
        setElement(term6196, 3, "EeBVbzjcCI");
        setElement(term6196, 4, "UfQtPRyWRC");
        setElement(term6196, 5, "FPvxVzzSvD");
        setField(term6164, term6164.getClass(), "headerComments", term6196);
        setBooleanField(term6164, term6164.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term6164, term6164.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term6164, term6164.getClass(), "ignoreSurroundingSpaces", true);
        setField(term6164, term6164.getClass(), "nullString", "WHcwFgsGFC");
        setField(term6164, term6164.getClass(), "quoteCharacter", term6284);
        setField(term6164, term6164.getClass(), "quoteMode", enum100);
        setField(term6164, term6164.getClass(), "recordSeparator", "HzqpegHiRq");
        setBooleanField(term6164, term6164.getClass(), "skipHeaderRecord", false);
        setBooleanField(term6164, term6164.getClass(), "trailingDelimiter", false);
        setBooleanField(term6164, term6164.getClass(), "trim", true);
        Character term49994 = new Character('b');
        Character term49995 = new Character('z');
        Character term50016 = new Character('j');
        Class<? extends Object> term50556 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term50555 = ((Class) term50556).getDeclaredField((String) "MINIMAL");
        ((Field) term50555).setAccessible(true);
        Object enum101 = ((Field) term50555).get((Object) null);
        term49993 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term49996 = (Object[]) newArray("java.lang.String", 2);
        Object[] term50001 = (Object[]) newArray("java.lang.String", 6);
        setBooleanField(term49993, term49993.getClass(), "allowMissingColumnNames", true);
        setField(term49993, term49993.getClass(), "commentMarker", term49994);
        setCharField(term49993, term49993.getClass(), "delimiter", 'S');
        setField(term49993, term49993.getClass(), "escapeCharacter", term49995);
        setElement(term49996, 0, "LWyEaeIyAo");
        setElement(term49996, 1, "yVMkkQhvmN");
        setField(term49993, term49993.getClass(), "header", term49996);
        setElement(term50001, 0, "mvrkADEgpp");
        setElement(term50001, 1, "pXOkjyeIRb");
        setElement(term50001, 2, "GgZWSjxjyE");
        setElement(term50001, 3, "EeBVbzjcCI");
        setElement(term50001, 4, "UfQtPRyWRC");
        setElement(term50001, 5, "FPvxVzzSvD");
        setField(term49993, term49993.getClass(), "headerComments", term50001);
        setBooleanField(term49993, term49993.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term49993, term49993.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term49993, term49993.getClass(), "ignoreSurroundingSpaces", true);
        setField(term49993, term49993.getClass(), "nullString", "WHcwFgsGFC");
        setField(term49993, term49993.getClass(), "quoteCharacter", term50016);
        setField(term49993, term49993.getClass(), "quoteMode", enum101);
        setField(term49993, term49993.getClass(), "recordSeparator", "HzqpegHiRq");
        setBooleanField(term49993, term49993.getClass(), "skipHeaderRecord", false);
        setBooleanField(term49993, term49993.getClass(), "trailingDelimiter", false);
        setBooleanField(term49993, term49993.getClass(), "trim", true);
        Class<? extends Object> term50754 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term50753 = ((Class) term50754).getDeclaredField((String) "MINIMAL");
        ((Field) term50753).setAccessible(true);
        enum102 = ((Field) term50753).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getQuoteMode", argTypes, term6164, args);
        assertTrue(recursiveEquals(term6164, term49993));
        assertTrue(recursiveEquals(retValue, enum102));
    }

};


