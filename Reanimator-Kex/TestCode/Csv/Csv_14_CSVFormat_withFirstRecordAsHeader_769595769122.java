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

public class CSVFormat_withFirstRecordAsHeader_769595769122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20700;
     Object term83060;
     Object term82983;

    public CSVFormat_withFirstRecordAsHeader_769595769122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term20702 = new Character('B');
        Character term20705 = new Character('p');
        Character term20820 = new Character('C');
        Class<? extends Object> term83180 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term83179 = ((Class) term83180).getDeclaredField((String) "NONE");
        ((Field) term83179).setAccessible(true);
        Object enum166 = ((Field) term83179).get((Object) null);
        term20700 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term20707 = (Object[]) newArray("java.lang.String", 5);
        Object[] term20768 = (Object[]) newArray("java.lang.String", 3);
        setBooleanField(term20700, term20700.getClass(), "allowMissingColumnNames", true);
        setField(term20700, term20700.getClass(), "commentMarker", term20702);
        setCharField(term20700, term20700.getClass(), "delimiter", 'e');
        setField(term20700, term20700.getClass(), "escapeCharacter", term20705);
        setElement(term20707, 0, "jiCGTTzKGB");
        setElement(term20707, 1, "MqICFYzDJj");
        setElement(term20707, 2, "YgQvdcBQKw");
        setElement(term20707, 3, "FiYYLuailz");
        setElement(term20707, 4, "XebAeSnCKZ");
        setField(term20700, term20700.getClass(), "header", term20707);
        setElement(term20768, 0, "GeddnXjHGy");
        setElement(term20768, 1, "vLTbaoAxBm");
        setElement(term20768, 2, "BXTjEyEZxD");
        setField(term20700, term20700.getClass(), "headerComments", term20768);
        setBooleanField(term20700, term20700.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term20700, term20700.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term20700, term20700.getClass(), "ignoreSurroundingSpaces", true);
        setField(term20700, term20700.getClass(), "nullString", "oKhVzOKUFW");
        setField(term20700, term20700.getClass(), "quoteCharacter", term20820);
        setField(term20700, term20700.getClass(), "quoteMode", enum166);
        setField(term20700, term20700.getClass(), "recordSeparator", "mNHyqmOAFy");
        setBooleanField(term20700, term20700.getClass(), "skipHeaderRecord", false);
        setBooleanField(term20700, term20700.getClass(), "trailingDelimiter", false);
        setBooleanField(term20700, term20700.getClass(), "trim", true);
        Character term83061 = new Character('B');
        Character term83062 = new Character('p');
        Character term83083 = new Character('C');
        Class<? extends Object> term83459 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term83458 = ((Class) term83459).getDeclaredField((String) "NONE");
        ((Field) term83458).setAccessible(true);
        Object enum167 = ((Field) term83458).get((Object) null);
        term83060 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term83063 = (Object[]) newArray("java.lang.String", 5);
        Object[] term83074 = (Object[]) newArray("java.lang.String", 3);
        setBooleanField(term83060, term83060.getClass(), "allowMissingColumnNames", true);
        setField(term83060, term83060.getClass(), "commentMarker", term83061);
        setCharField(term83060, term83060.getClass(), "delimiter", 'e');
        setField(term83060, term83060.getClass(), "escapeCharacter", term83062);
        setElement(term83063, 0, "jiCGTTzKGB");
        setElement(term83063, 1, "MqICFYzDJj");
        setElement(term83063, 2, "YgQvdcBQKw");
        setElement(term83063, 3, "FiYYLuailz");
        setElement(term83063, 4, "XebAeSnCKZ");
        setField(term83060, term83060.getClass(), "header", term83063);
        setElement(term83074, 0, "GeddnXjHGy");
        setElement(term83074, 1, "vLTbaoAxBm");
        setElement(term83074, 2, "BXTjEyEZxD");
        setField(term83060, term83060.getClass(), "headerComments", term83074);
        setBooleanField(term83060, term83060.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term83060, term83060.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term83060, term83060.getClass(), "ignoreSurroundingSpaces", true);
        setField(term83060, term83060.getClass(), "nullString", "oKhVzOKUFW");
        setField(term83060, term83060.getClass(), "quoteCharacter", term83083);
        setField(term83060, term83060.getClass(), "quoteMode", enum167);
        setField(term83060, term83060.getClass(), "recordSeparator", "mNHyqmOAFy");
        setBooleanField(term83060, term83060.getClass(), "skipHeaderRecord", false);
        setBooleanField(term83060, term83060.getClass(), "trailingDelimiter", false);
        setBooleanField(term83060, term83060.getClass(), "trim", true);
        Character term82985 = new Character('B');
        Character term82988 = new Character('p');
        Character term83043 = new Character('C');
        Class<? extends Object> term83688 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term83687 = ((Class) term83688).getDeclaredField((String) "NONE");
        ((Field) term83687).setAccessible(true);
        Object enum168 = ((Field) term83687).get((Object) null);
        term82983 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term82990 = (Object[]) newArray("java.lang.String", 0);
        Object[] term82991 = (Object[]) newArray("java.lang.String", 3);
        setBooleanField(term82983, term82983.getClass(), "allowMissingColumnNames", true);
        setField(term82983, term82983.getClass(), "commentMarker", term82985);
        setCharField(term82983, term82983.getClass(), "delimiter", 'e');
        setField(term82983, term82983.getClass(), "escapeCharacter", term82988);
        setField(term82983, term82983.getClass(), "header", term82990);
        setElement(term82991, 0, "GeddnXjHGy");
        setElement(term82991, 1, "vLTbaoAxBm");
        setElement(term82991, 2, "BXTjEyEZxD");
        setField(term82983, term82983.getClass(), "headerComments", term82991);
        setBooleanField(term82983, term82983.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term82983, term82983.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term82983, term82983.getClass(), "ignoreSurroundingSpaces", true);
        setField(term82983, term82983.getClass(), "nullString", "oKhVzOKUFW");
        setField(term82983, term82983.getClass(), "quoteCharacter", term83043);
        setField(term82983, term82983.getClass(), "quoteMode", enum168);
        setField(term82983, term82983.getClass(), "recordSeparator", "mNHyqmOAFy");
        setBooleanField(term82983, term82983.getClass(), "skipHeaderRecord", true);
        setBooleanField(term82983, term82983.getClass(), "trailingDelimiter", false);
        setBooleanField(term82983, term82983.getClass(), "trim", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "withFirstRecordAsHeader", argTypes, term20700, args);
        assertTrue(recursiveEquals(term20700, term83060));
        assertTrue(recursiveEquals(retValue, term82983));
    }

};


