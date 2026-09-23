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
import java.lang.Integer;

public class CSVFormat_printAndEscape_133925285436 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15121;
     Object term15242;
     Object term15244;

    public CSVFormat_printAndEscape_133925285436() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term15123 = new Character('Q');
        Character term15126 = new Character('p');
        Character term15217 = new Character('a');
        Class<? extends Object> term15317 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term15316 = ((Class) term15317).getDeclaredField((String) "ALL");
        ((Field) term15316).setAccessible(true);
        Object enum33 = ((Field) term15316).get((Object) null);
        term15121 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term15128 = (Object[]) newArray("java.lang.String", 6);
        Object[] term15201 = (Object[]) newArray("java.lang.String", 0);
        setBooleanField(term15121, term15121.getClass(), "allowMissingColumnNames", true);
        setField(term15121, term15121.getClass(), "commentMarker", term15123);
        setCharField(term15121, term15121.getClass(), "delimiter", 'F');
        setField(term15121, term15121.getClass(), "escapeCharacter", term15126);
        setElement(term15128, 0, "GNEmuHPNcU");
        setElement(term15128, 1, "IoSfuKDFRe");
        setElement(term15128, 2, "AWYyZiNfsm");
        setElement(term15128, 3, "ITRRYiuDwH");
        setElement(term15128, 4, "llRfwANcVF");
        setElement(term15128, 5, "sUEeHQTWkA");
        setField(term15121, term15121.getClass(), "header", term15128);
        setField(term15121, term15121.getClass(), "headerComments", term15201);
        setBooleanField(term15121, term15121.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term15121, term15121.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term15121, term15121.getClass(), "ignoreSurroundingSpaces", false);
        setField(term15121, term15121.getClass(), "nullString", "BDIRCxAWLA");
        setField(term15121, term15121.getClass(), "quoteCharacter", term15217);
        setField(term15121, term15121.getClass(), "quoteMode", enum33);
        setField(term15121, term15121.getClass(), "recordSeparator", "eOJfbiZLnb");
        setBooleanField(term15121, term15121.getClass(), "skipHeaderRecord", false);
        setBooleanField(term15121, term15121.getClass(), "trailingDelimiter", false);
        setBooleanField(term15121, term15121.getClass(), "trim", false);
        setBooleanField(term15121, term15121.getClass(), "autoFlush", true);
        term15242 = new Integer(391863371);
        term15244 = new Integer(-1922583790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.CharSequence");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("java.lang.Appendable");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term15242;
        args[2] = term15244;
        args[3] = null;
        callMethod(klass, "printAndEscape", argTypes, term15121, args);
    }

};


