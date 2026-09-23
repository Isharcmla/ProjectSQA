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

public class CSVFormat_withQuoteMode_160203747382 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12527;
     Object enum120;
     Object term46339;
     Object enum122;
     Object term46207;

    public CSVFormat_withQuoteMode_160203747382() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term12529 = new Character('C');
        Class<? extends Object> term46355 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term46354 = ((Class) term46355).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term46354).setAccessible(true);
        Object enum119 = ((Field) term46354).get((Object) null);
        Character term12546 = new Character('F');
        Character term12548 = new Character('V');
        term12527 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term12577 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term12527, term12527.getClass(), "delimiter", 'e');
        setField(term12527, term12527.getClass(), "quoteCharacter", term12529);
        setField(term12527, term12527.getClass(), "quoteMode", enum119);
        setField(term12527, term12527.getClass(), "commentMarker", term12546);
        setField(term12527, term12527.getClass(), "escapeCharacter", term12548);
        setBooleanField(term12527, term12527.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term12527, term12527.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term12527, term12527.getClass(), "ignoreEmptyLines", true);
        setField(term12527, term12527.getClass(), "recordSeparator", "WXMWFDGcLB");
        setField(term12527, term12527.getClass(), "nullString", "wKWbJssZuG");
        setField(term12527, term12527.getClass(), "header", term12577);
        setBooleanField(term12527, term12527.getClass(), "skipHeaderRecord", true);
        Class<? extends Object> term46575 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term46574 = ((Class) term46575).getDeclaredField((String) "NONE");
        ((Field) term46574).setAccessible(true);
        enum120 = ((Field) term46574).get((Object) null);
        Character term46340 = new Character('C');
        Class<? extends Object> term46754 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term46753 = ((Class) term46754).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term46753).setAccessible(true);
        Object enum121 = ((Field) term46753).get((Object) null);
        Character term46344 = new Character('F');
        Character term46345 = new Character('V');
        term46339 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term46350 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term46339, term46339.getClass(), "delimiter", 'e');
        setField(term46339, term46339.getClass(), "quoteCharacter", term46340);
        setField(term46339, term46339.getClass(), "quoteMode", enum121);
        setField(term46339, term46339.getClass(), "commentMarker", term46344);
        setField(term46339, term46339.getClass(), "escapeCharacter", term46345);
        setBooleanField(term46339, term46339.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term46339, term46339.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term46339, term46339.getClass(), "ignoreEmptyLines", true);
        setField(term46339, term46339.getClass(), "recordSeparator", "WXMWFDGcLB");
        setField(term46339, term46339.getClass(), "nullString", "wKWbJssZuG");
        setField(term46339, term46339.getClass(), "header", term46350);
        setBooleanField(term46339, term46339.getClass(), "skipHeaderRecord", true);
        Class<? extends Object> term46974 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term46973 = ((Class) term46974).getDeclaredField((String) "NONE");
        ((Field) term46973).setAccessible(true);
        enum122 = ((Field) term46973).get((Object) null);
        Character term46209 = new Character('C');
        Class<? extends Object> term47153 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term47152 = ((Class) term47153).getDeclaredField((String) "NONE");
        ((Field) term47152).setAccessible(true);
        Object enum123 = ((Field) term47152).get((Object) null);
        Character term46219 = new Character('F');
        Character term46221 = new Character('V');
        term46207 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term46250 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term46207, term46207.getClass(), "delimiter", 'e');
        setField(term46207, term46207.getClass(), "quoteCharacter", term46209);
        setField(term46207, term46207.getClass(), "quoteMode", enum123);
        setField(term46207, term46207.getClass(), "commentMarker", term46219);
        setField(term46207, term46207.getClass(), "escapeCharacter", term46221);
        setBooleanField(term46207, term46207.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term46207, term46207.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term46207, term46207.getClass(), "ignoreEmptyLines", true);
        setField(term46207, term46207.getClass(), "recordSeparator", "WXMWFDGcLB");
        setField(term46207, term46207.getClass(), "nullString", "wKWbJssZuG");
        setField(term46207, term46207.getClass(), "header", term46250);
        setBooleanField(term46207, term46207.getClass(), "skipHeaderRecord", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.csv.QuoteMode");
        Object[] args = new Object[1];
        args[0] = enum120;
        Object retValue = callMethod(klass, "withQuoteMode", argTypes, term12527, args);
        assertTrue(recursiveEquals(term12527, term46339));
        assertTrue(recursiveEquals(enum120, enum122));
        assertTrue(recursiveEquals(retValue, term46207));
    }

};


