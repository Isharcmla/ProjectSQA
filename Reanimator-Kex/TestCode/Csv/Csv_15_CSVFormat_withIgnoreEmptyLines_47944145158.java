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
import java.lang.Boolean;

public class CSVFormat_withIgnoreEmptyLines_47944145158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24882;
     Object term25028;

    public CSVFormat_withIgnoreEmptyLines_47944145158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term24884 = new Character('z');
        Character term24887 = new Character('A');
        Character term25002 = new Character('m');
        Class<? extends Object> term25121 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term25120 = ((Class) term25121).getDeclaredField((String) "NONE");
        ((Field) term25120).setAccessible(true);
        Object enum55 = ((Field) term25120).get((Object) null);
        term24882 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term24889 = (Object[]) newArray("java.lang.String", 8);
        Object[] term24986 = (Object[]) newArray("java.lang.String", 0);
        setBooleanField(term24882, term24882.getClass(), "allowMissingColumnNames", false);
        setField(term24882, term24882.getClass(), "commentMarker", term24884);
        setCharField(term24882, term24882.getClass(), "delimiter", 'G');
        setField(term24882, term24882.getClass(), "escapeCharacter", term24887);
        setElement(term24889, 0, "jlraKkBWFA");
        setElement(term24889, 1, "mRBtFTxVdE");
        setElement(term24889, 2, "IVacFDAZcj");
        setElement(term24889, 3, "EEYmuwyVDP");
        setElement(term24889, 4, "EWFbEDAVrE");
        setElement(term24889, 5, "EMiMtYgfvr");
        setElement(term24889, 6, "OyYyYYnJuF");
        setElement(term24889, 7, "aYLvcxZohT");
        setField(term24882, term24882.getClass(), "header", term24889);
        setField(term24882, term24882.getClass(), "headerComments", term24986);
        setBooleanField(term24882, term24882.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term24882, term24882.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term24882, term24882.getClass(), "ignoreSurroundingSpaces", true);
        setField(term24882, term24882.getClass(), "nullString", "mnHyQbMyld");
        setField(term24882, term24882.getClass(), "quoteCharacter", term25002);
        setField(term24882, term24882.getClass(), "quoteMode", enum55);
        setField(term24882, term24882.getClass(), "recordSeparator", "KHtaDOIcJZ");
        setBooleanField(term24882, term24882.getClass(), "skipHeaderRecord", true);
        setBooleanField(term24882, term24882.getClass(), "trailingDelimiter", false);
        setBooleanField(term24882, term24882.getClass(), "trim", false);
        setBooleanField(term24882, term24882.getClass(), "autoFlush", false);
        term25028 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term25028;
        callMethod(klass, "withIgnoreEmptyLines", argTypes, term24882, args);
    }

};


