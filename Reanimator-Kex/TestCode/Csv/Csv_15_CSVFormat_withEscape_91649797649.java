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

public class CSVFormat_withEscape_91649797649 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20815;
     Object term20964;

    public CSVFormat_withEscape_91649797649() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term20817 = new Character('Q');
        Character term20820 = new Character('B');
        Character term20935 = new Character('e');
        Class<? extends Object> term21057 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term21056 = ((Class) term21057).getDeclaredField((String) "MINIMAL");
        ((Field) term21056).setAccessible(true);
        Object enum46 = ((Field) term21056).get((Object) null);
        term20815 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term20822 = (Object[]) newArray("java.lang.String", 5);
        Object[] term20883 = (Object[]) newArray("java.lang.String", 3);
        setBooleanField(term20815, term20815.getClass(), "allowMissingColumnNames", false);
        setField(term20815, term20815.getClass(), "commentMarker", term20817);
        setCharField(term20815, term20815.getClass(), "delimiter", 'Y');
        setField(term20815, term20815.getClass(), "escapeCharacter", term20820);
        setElement(term20822, 0, "kVAmKknVln");
        setElement(term20822, 1, "MRFLbEGYKG");
        setElement(term20822, 2, "BYrGukTyof");
        setElement(term20822, 3, "jiCGTTzKGB");
        setElement(term20822, 4, "MqICFYzDJj");
        setField(term20815, term20815.getClass(), "header", term20822);
        setElement(term20883, 0, "YgQvdcBQKw");
        setElement(term20883, 1, "FiYYLuailz");
        setElement(term20883, 2, "XebAeSnCKZ");
        setField(term20815, term20815.getClass(), "headerComments", term20883);
        setBooleanField(term20815, term20815.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term20815, term20815.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term20815, term20815.getClass(), "ignoreSurroundingSpaces", false);
        setField(term20815, term20815.getClass(), "nullString", "GeddnXjHGy");
        setField(term20815, term20815.getClass(), "quoteCharacter", term20935);
        setField(term20815, term20815.getClass(), "quoteMode", enum46);
        setField(term20815, term20815.getClass(), "recordSeparator", "vLTbaoAxBm");
        setBooleanField(term20815, term20815.getClass(), "skipHeaderRecord", true);
        setBooleanField(term20815, term20815.getClass(), "trailingDelimiter", false);
        setBooleanField(term20815, term20815.getClass(), "trim", true);
        setBooleanField(term20815, term20815.getClass(), "autoFlush", false);
        term20964 = new Character('p');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term20964;
        callMethod(klass, "withEscape", argTypes, term20815, args);
    }

};


