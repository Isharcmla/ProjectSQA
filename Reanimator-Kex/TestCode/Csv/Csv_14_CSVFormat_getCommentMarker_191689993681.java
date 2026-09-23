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

public class CSVFormat_getCommentMarker_191689993681 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1776;
     Object term42174;
     Object term41706;

    public CSVFormat_getCommentMarker_191689993681() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term1778 = new Character('b');
        Character term1781 = new Character('u');
        Character term1884 = new Character('L');
        Class<? extends Object> term42282 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term42281 = ((Class) term42282).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term42281).setAccessible(true);
        Object enum80 = ((Field) term42281).get((Object) null);
        term1776 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term1783 = (Object[]) newArray("java.lang.String", 1);
        Object[] term1796 = (Object[]) newArray("java.lang.String", 6);
        setBooleanField(term1776, term1776.getClass(), "allowMissingColumnNames", true);
        setField(term1776, term1776.getClass(), "commentMarker", term1778);
        setCharField(term1776, term1776.getClass(), "delimiter", 'M');
        setField(term1776, term1776.getClass(), "escapeCharacter", term1781);
        setElement(term1783, 0, "wSQxaModmm");
        setField(term1776, term1776.getClass(), "header", term1783);
        setElement(term1796, 0, "UlajhuVLaP");
        setElement(term1796, 1, "gGSMzuGICf");
        setElement(term1796, 2, "hxCBltsObl");
        setElement(term1796, 3, "BndsHwAFMv");
        setElement(term1796, 4, "GzFkzHGYFt");
        setElement(term1796, 5, "tShwQLRGNe");
        setField(term1776, term1776.getClass(), "headerComments", term1796);
        setBooleanField(term1776, term1776.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term1776, term1776.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term1776, term1776.getClass(), "ignoreSurroundingSpaces", true);
        setField(term1776, term1776.getClass(), "nullString", "LvtrsXUliU");
        setField(term1776, term1776.getClass(), "quoteCharacter", term1884);
        setField(term1776, term1776.getClass(), "quoteMode", enum80);
        setField(term1776, term1776.getClass(), "recordSeparator", "xLbjWUgOIL");
        setBooleanField(term1776, term1776.getClass(), "skipHeaderRecord", true);
        setBooleanField(term1776, term1776.getClass(), "trailingDelimiter", true);
        setBooleanField(term1776, term1776.getClass(), "trim", false);
        Character term42175 = new Character('b');
        Character term42176 = new Character('u');
        Character term42195 = new Character('L');
        Class<? extends Object> term42573 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term42572 = ((Class) term42573).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term42572).setAccessible(true);
        Object enum81 = ((Field) term42572).get((Object) null);
        term42174 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term42177 = (Object[]) newArray("java.lang.String", 1);
        Object[] term42180 = (Object[]) newArray("java.lang.String", 6);
        setBooleanField(term42174, term42174.getClass(), "allowMissingColumnNames", true);
        setField(term42174, term42174.getClass(), "commentMarker", term42175);
        setCharField(term42174, term42174.getClass(), "delimiter", 'M');
        setField(term42174, term42174.getClass(), "escapeCharacter", term42176);
        setElement(term42177, 0, "wSQxaModmm");
        setField(term42174, term42174.getClass(), "header", term42177);
        setElement(term42180, 0, "UlajhuVLaP");
        setElement(term42180, 1, "gGSMzuGICf");
        setElement(term42180, 2, "hxCBltsObl");
        setElement(term42180, 3, "BndsHwAFMv");
        setElement(term42180, 4, "GzFkzHGYFt");
        setElement(term42180, 5, "tShwQLRGNe");
        setField(term42174, term42174.getClass(), "headerComments", term42180);
        setBooleanField(term42174, term42174.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term42174, term42174.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term42174, term42174.getClass(), "ignoreSurroundingSpaces", true);
        setField(term42174, term42174.getClass(), "nullString", "LvtrsXUliU");
        setField(term42174, term42174.getClass(), "quoteCharacter", term42195);
        setField(term42174, term42174.getClass(), "quoteMode", enum81);
        setField(term42174, term42174.getClass(), "recordSeparator", "xLbjWUgOIL");
        setBooleanField(term42174, term42174.getClass(), "skipHeaderRecord", true);
        setBooleanField(term42174, term42174.getClass(), "trailingDelimiter", true);
        setBooleanField(term42174, term42174.getClass(), "trim", false);
        term41706 = new Character('b');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCommentMarker", argTypes, term1776, args);
        assertTrue(recursiveEquals(term1776, term42174));
        assertTrue(recursiveEquals(retValue, term41706));
    }

};


