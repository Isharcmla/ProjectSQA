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

public class CSVFormat_withSkipHeaderRecord_82658701069 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30100;

    public CSVFormat_withSkipHeaderRecord_82658701069() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term30102 = new Character('c');
        Character term30105 = new Character('P');
        Character term30184 = new Character('b');
        Class<? extends Object> term30271 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term30270 = ((Class) term30271).getDeclaredField((String) "NONE");
        ((Field) term30270).setAccessible(true);
        Object enum67 = ((Field) term30270).get((Object) null);
        term30100 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term30107 = (Object[]) newArray("java.lang.String", 2);
        Object[] term30132 = (Object[]) newArray("java.lang.String", 3);
        setBooleanField(term30100, term30100.getClass(), "allowMissingColumnNames", true);
        setField(term30100, term30100.getClass(), "commentMarker", term30102);
        setCharField(term30100, term30100.getClass(), "delimiter", 'l');
        setField(term30100, term30100.getClass(), "escapeCharacter", term30105);
        setElement(term30107, 0, "pxokrVaeMd");
        setElement(term30107, 1, "ujxmmZZcbT");
        setField(term30100, term30100.getClass(), "header", term30107);
        setElement(term30132, 0, "BOvgwHfoHQ");
        setElement(term30132, 1, "hPpFNeDBIb");
        setElement(term30132, 2, "DNOtiLPAIY");
        setField(term30100, term30100.getClass(), "headerComments", term30132);
        setBooleanField(term30100, term30100.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term30100, term30100.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term30100, term30100.getClass(), "ignoreSurroundingSpaces", false);
        setField(term30100, term30100.getClass(), "nullString", "FnEkAHBfyV");
        setField(term30100, term30100.getClass(), "quoteCharacter", term30184);
        setField(term30100, term30100.getClass(), "quoteMode", enum67);
        setField(term30100, term30100.getClass(), "recordSeparator", "VfmNFpEuax");
        setBooleanField(term30100, term30100.getClass(), "skipHeaderRecord", false);
        setBooleanField(term30100, term30100.getClass(), "trailingDelimiter", true);
        setBooleanField(term30100, term30100.getClass(), "trim", false);
        setBooleanField(term30100, term30100.getClass(), "autoFlush", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "withSkipHeaderRecord", argTypes, term30100, args);
    }

};


