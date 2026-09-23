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

public class CSVFormat_withTrailingDelimiter_81582313271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30876;

    public CSVFormat_withTrailingDelimiter_81582313271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term30878 = new Character('H');
        Character term30881 = new Character('o');
        Character term31008 = new Character('A');
        Class<? extends Object> term31135 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term31134 = ((Class) term31135).getDeclaredField((String) "NONE");
        ((Field) term31134).setAccessible(true);
        Object enum69 = ((Field) term31134).get((Object) null);
        term30876 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term30883 = (Object[]) newArray("java.lang.String", 1);
        Object[] term30896 = (Object[]) newArray("java.lang.String", 8);
        setBooleanField(term30876, term30876.getClass(), "allowMissingColumnNames", true);
        setField(term30876, term30876.getClass(), "commentMarker", term30878);
        setCharField(term30876, term30876.getClass(), "delimiter", 'I');
        setField(term30876, term30876.getClass(), "escapeCharacter", term30881);
        setElement(term30883, 0, "bVbexZPmwW");
        setField(term30876, term30876.getClass(), "header", term30883);
        setElement(term30896, 0, "tvxYdqiyGc");
        setElement(term30896, 1, "ZEXFoMSKeG");
        setElement(term30896, 2, "HvxahUfZcJ");
        setElement(term30896, 3, "WkLpmqoQxy");
        setElement(term30896, 4, "XiNoscmYhd");
        setElement(term30896, 5, "asMqnMNrZp");
        setElement(term30896, 6, "pqFUMTCKJd");
        setElement(term30896, 7, "PTEndmPMzk");
        setField(term30876, term30876.getClass(), "headerComments", term30896);
        setBooleanField(term30876, term30876.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term30876, term30876.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term30876, term30876.getClass(), "ignoreSurroundingSpaces", false);
        setField(term30876, term30876.getClass(), "nullString", "aJQuCOCvZs");
        setField(term30876, term30876.getClass(), "quoteCharacter", term31008);
        setField(term30876, term30876.getClass(), "quoteMode", enum69);
        setField(term30876, term30876.getClass(), "recordSeparator", "lHYNCJRiOv");
        setBooleanField(term30876, term30876.getClass(), "skipHeaderRecord", true);
        setBooleanField(term30876, term30876.getClass(), "trailingDelimiter", true);
        setBooleanField(term30876, term30876.getClass(), "trim", true);
        setBooleanField(term30876, term30876.getClass(), "autoFlush", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "withTrailingDelimiter", argTypes, term30876, args);
    }

};


