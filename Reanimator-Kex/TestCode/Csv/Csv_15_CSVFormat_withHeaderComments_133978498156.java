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

public class CSVFormat_withHeaderComments_133978498156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24045;
     Object term24155;

    public CSVFormat_withHeaderComments_133978498156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term24047 = new Character('p');
        Character term24050 = new Character('b');
        Character term24129 = new Character('U');
        Class<? extends Object> term24219 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term24218 = ((Class) term24219).getDeclaredField((String) "NONE");
        ((Field) term24218).setAccessible(true);
        Object enum53 = ((Field) term24218).get((Object) null);
        term24045 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term24052 = (Object[]) newArray("java.lang.String", 3);
        Object[] term24089 = (Object[]) newArray("java.lang.String", 2);
        setBooleanField(term24045, term24045.getClass(), "allowMissingColumnNames", false);
        setField(term24045, term24045.getClass(), "commentMarker", term24047);
        setCharField(term24045, term24045.getClass(), "delimiter", 'y');
        setField(term24045, term24045.getClass(), "escapeCharacter", term24050);
        setElement(term24052, 0, "WaEcyVlcIx");
        setElement(term24052, 1, "ONcbPCQnHd");
        setElement(term24052, 2, "AobDaplFLl");
        setField(term24045, term24045.getClass(), "header", term24052);
        setElement(term24089, 0, "pDkMNnAGgv");
        setElement(term24089, 1, "PaCpFXGzdX");
        setField(term24045, term24045.getClass(), "headerComments", term24089);
        setBooleanField(term24045, term24045.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term24045, term24045.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term24045, term24045.getClass(), "ignoreSurroundingSpaces", false);
        setField(term24045, term24045.getClass(), "nullString", "FftYCNbnks");
        setField(term24045, term24045.getClass(), "quoteCharacter", term24129);
        setField(term24045, term24045.getClass(), "quoteMode", enum53);
        setField(term24045, term24045.getClass(), "recordSeparator", "lJoltmsadS");
        setBooleanField(term24045, term24045.getClass(), "skipHeaderRecord", true);
        setBooleanField(term24045, term24045.getClass(), "trailingDelimiter", false);
        setBooleanField(term24045, term24045.getClass(), "trim", false);
        setBooleanField(term24045, term24045.getClass(), "autoFlush", false);
        term24155 = (Object[]) newArray("java.lang.Object", 2);
        Object term24156 = newInstance(Class.forName("java.lang.Object"));
        Object term24157 = newInstance(Class.forName("java.lang.Object"));
        setElement(term24155, 0, term24156);
        setElement(term24155, 1, term24157);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term24155;
        callMethod(klass, "withHeaderComments", argTypes, term24045, args);
    }

};


