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

public class CSVFormat_withSkipHeaderRecord_82658794070 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30459;
     Object term30596;

    public CSVFormat_withSkipHeaderRecord_82658794070() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term30461 = new Character('Y');
        Character term30464 = new Character('k');
        Character term30567 = new Character('c');
        Class<? extends Object> term30679 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term30678 = ((Class) term30679).getDeclaredField((String) "MINIMAL");
        ((Field) term30678).setAccessible(true);
        Object enum68 = ((Field) term30678).get((Object) null);
        term30459 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term30466 = (Object[]) newArray("java.lang.String", 2);
        Object[] term30491 = (Object[]) newArray("java.lang.String", 5);
        setBooleanField(term30459, term30459.getClass(), "allowMissingColumnNames", true);
        setField(term30459, term30459.getClass(), "commentMarker", term30461);
        setCharField(term30459, term30459.getClass(), "delimiter", 'P');
        setField(term30459, term30459.getClass(), "escapeCharacter", term30464);
        setElement(term30466, 0, "ANHjlWPmZG");
        setElement(term30466, 1, "SibzENsyyy");
        setField(term30459, term30459.getClass(), "header", term30466);
        setElement(term30491, 0, "mrqGHotaef");
        setElement(term30491, 1, "UbZGBpQZQW");
        setElement(term30491, 2, "SvGTualQPa");
        setElement(term30491, 3, "mdxcgZwsaP");
        setElement(term30491, 4, "XildIRoZHG");
        setField(term30459, term30459.getClass(), "headerComments", term30491);
        setBooleanField(term30459, term30459.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term30459, term30459.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term30459, term30459.getClass(), "ignoreSurroundingSpaces", false);
        setField(term30459, term30459.getClass(), "nullString", "lEcrFlxJXH");
        setField(term30459, term30459.getClass(), "quoteCharacter", term30567);
        setField(term30459, term30459.getClass(), "quoteMode", enum68);
        setField(term30459, term30459.getClass(), "recordSeparator", "VNdDwXMYxR");
        setBooleanField(term30459, term30459.getClass(), "skipHeaderRecord", true);
        setBooleanField(term30459, term30459.getClass(), "trailingDelimiter", true);
        setBooleanField(term30459, term30459.getClass(), "trim", false);
        setBooleanField(term30459, term30459.getClass(), "autoFlush", true);
        term30596 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term30596;
        callMethod(klass, "withSkipHeaderRecord", argTypes, term30459, args);
    }

};


