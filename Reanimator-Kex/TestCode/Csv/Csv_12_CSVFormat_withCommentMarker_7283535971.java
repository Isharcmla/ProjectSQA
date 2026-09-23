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

public class CSVFormat_withCommentMarker_7283535971 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8602;
     Object term8710;
     Object term36144;
     Object term36166;
     Object term35835;

    public CSVFormat_withCommentMarker_7283535971() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term8604 = new Character('J');
        Class<? extends Object> term36168 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term36167 = ((Class) term36168).getDeclaredField((String) "MINIMAL");
        ((Field) term36167).setAccessible(true);
        Object enum92 = ((Field) term36167).get((Object) null);
        Character term8617 = new Character('l');
        Character term8619 = new Character('h');
        term8602 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term8648 = (Object[]) newArray("java.lang.String", 5);
        setCharField(term8602, term8602.getClass(), "delimiter", 'g');
        setField(term8602, term8602.getClass(), "quoteCharacter", term8604);
        setField(term8602, term8602.getClass(), "quoteMode", enum92);
        setField(term8602, term8602.getClass(), "commentMarker", term8617);
        setField(term8602, term8602.getClass(), "escapeCharacter", term8619);
        setBooleanField(term8602, term8602.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term8602, term8602.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term8602, term8602.getClass(), "ignoreEmptyLines", false);
        setField(term8602, term8602.getClass(), "recordSeparator", "HzqpegHiRq");
        setField(term8602, term8602.getClass(), "nullString", "jwsfVjMoJT");
        setElement(term8648, 0, "ZfdXfCCFDf");
        setElement(term8648, 1, "MwwjNtdOFT");
        setElement(term8648, 2, "VYkqXKVlAJ");
        setElement(term8648, 3, "XkIoWJRNwN");
        setElement(term8648, 4, "aNWLJdrZMq");
        setField(term8602, term8602.getClass(), "header", term8648);
        setBooleanField(term8602, term8602.getClass(), "skipHeaderRecord", false);
        term8710 = new Character('k');
        Character term36145 = new Character('J');
        Class<? extends Object> term36426 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term36425 = ((Class) term36426).getDeclaredField((String) "MINIMAL");
        ((Field) term36425).setAccessible(true);
        Object enum93 = ((Field) term36425).get((Object) null);
        Character term36149 = new Character('l');
        Character term36150 = new Character('h');
        term36144 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term36155 = (Object[]) newArray("java.lang.String", 5);
        setCharField(term36144, term36144.getClass(), "delimiter", 'g');
        setField(term36144, term36144.getClass(), "quoteCharacter", term36145);
        setField(term36144, term36144.getClass(), "quoteMode", enum93);
        setField(term36144, term36144.getClass(), "commentMarker", term36149);
        setField(term36144, term36144.getClass(), "escapeCharacter", term36150);
        setBooleanField(term36144, term36144.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term36144, term36144.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term36144, term36144.getClass(), "ignoreEmptyLines", false);
        setField(term36144, term36144.getClass(), "recordSeparator", "HzqpegHiRq");
        setField(term36144, term36144.getClass(), "nullString", "jwsfVjMoJT");
        setElement(term36155, 0, "ZfdXfCCFDf");
        setElement(term36155, 1, "MwwjNtdOFT");
        setElement(term36155, 2, "VYkqXKVlAJ");
        setElement(term36155, 3, "XkIoWJRNwN");
        setElement(term36155, 4, "aNWLJdrZMq");
        setField(term36144, term36144.getClass(), "header", term36155);
        setBooleanField(term36144, term36144.getClass(), "skipHeaderRecord", false);
        term36166 = new Character('k');
        Character term35837 = new Character('J');
        Class<? extends Object> term36684 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term36683 = ((Class) term36684).getDeclaredField((String) "MINIMAL");
        ((Field) term36683).setAccessible(true);
        Object enum94 = ((Field) term36683).get((Object) null);
        Character term35850 = new Character('k');
        Character term35852 = new Character('h');
        term35835 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term35881 = (Object[]) newArray("java.lang.String", 5);
        setCharField(term35835, term35835.getClass(), "delimiter", 'g');
        setField(term35835, term35835.getClass(), "quoteCharacter", term35837);
        setField(term35835, term35835.getClass(), "quoteMode", enum94);
        setField(term35835, term35835.getClass(), "commentMarker", term35850);
        setField(term35835, term35835.getClass(), "escapeCharacter", term35852);
        setBooleanField(term35835, term35835.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term35835, term35835.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term35835, term35835.getClass(), "ignoreEmptyLines", false);
        setField(term35835, term35835.getClass(), "recordSeparator", "HzqpegHiRq");
        setField(term35835, term35835.getClass(), "nullString", "jwsfVjMoJT");
        setElement(term35881, 0, "ZfdXfCCFDf");
        setElement(term35881, 1, "MwwjNtdOFT");
        setElement(term35881, 2, "VYkqXKVlAJ");
        setElement(term35881, 3, "XkIoWJRNwN");
        setElement(term35881, 4, "aNWLJdrZMq");
        setField(term35835, term35835.getClass(), "header", term35881);
        setBooleanField(term35835, term35835.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Character");
        Object[] args = new Object[1];
        args[0] = term8710;
        Object retValue = callMethod(klass, "withCommentMarker", argTypes, term8602, args);
        assertTrue(recursiveEquals(term8602, term36144));
        assertTrue(recursiveEquals(term8710, term36166));
        assertTrue(recursiveEquals(retValue, term35835));
    }

};


