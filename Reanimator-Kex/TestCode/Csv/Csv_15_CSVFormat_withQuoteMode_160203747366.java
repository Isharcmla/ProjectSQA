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
import java.lang.Character;
import java.lang.Object;
import java.lang.String;

public class CSVFormat_withQuoteMode_160203747366 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28494;
     Object enum64;

    public CSVFormat_withQuoteMode_160203747366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term28496 = new Character('J');
        Character term28499 = new Character('f');
        Character term28650 = new Character('l');
        Class<? extends Object> term28820 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term28819 = ((Class) term28820).getDeclaredField((String) "ALL_NON_NULL");
        ((Field) term28819).setAccessible(true);
        Object enum63 = ((Field) term28819).get((Object) null);
        term28494 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term28501 = (Object[]) newArray("java.lang.String", 5);
        Object[] term28562 = (Object[]) newArray("java.lang.String", 6);
        setBooleanField(term28494, term28494.getClass(), "allowMissingColumnNames", false);
        setField(term28494, term28494.getClass(), "commentMarker", term28496);
        setCharField(term28494, term28494.getClass(), "delimiter", 'X');
        setField(term28494, term28494.getClass(), "escapeCharacter", term28499);
        setElement(term28501, 0, "fRujHWvXjJ");
        setElement(term28501, 1, "EAIAAStlTz");
        setElement(term28501, 2, "yIWXcOQTgy");
        setElement(term28501, 3, "xAWekqanqc");
        setElement(term28501, 4, "GSOWFHMlbF");
        setField(term28494, term28494.getClass(), "header", term28501);
        setElement(term28562, 0, "vpZIqpFbKM");
        setElement(term28562, 1, "dAbwpJCDif");
        setElement(term28562, 2, "ATSXJPySio");
        setElement(term28562, 3, "XZkOUcbfFg");
        setElement(term28562, 4, "TGiJfagfky");
        setElement(term28562, 5, "BJklinBmhN");
        setField(term28494, term28494.getClass(), "headerComments", term28562);
        setBooleanField(term28494, term28494.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term28494, term28494.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term28494, term28494.getClass(), "ignoreSurroundingSpaces", true);
        setField(term28494, term28494.getClass(), "nullString", "IOddzvEWcl");
        setField(term28494, term28494.getClass(), "quoteCharacter", term28650);
        setField(term28494, term28494.getClass(), "quoteMode", enum63);
        setField(term28494, term28494.getClass(), "recordSeparator", "bIrtpkYJWT");
        setBooleanField(term28494, term28494.getClass(), "skipHeaderRecord", true);
        setBooleanField(term28494, term28494.getClass(), "trailingDelimiter", false);
        setBooleanField(term28494, term28494.getClass(), "trim", true);
        setBooleanField(term28494, term28494.getClass(), "autoFlush", true);
        Class<? extends Object> term29033 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term29032 = ((Class) term29033).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term29032).setAccessible(true);
        enum64 = ((Field) term29032).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.csv.QuoteMode");
        Object[] args = new Object[1];
        args[0] = enum64;
        callMethod(klass, "withQuoteMode", argTypes, term28494, args);
    }

};


