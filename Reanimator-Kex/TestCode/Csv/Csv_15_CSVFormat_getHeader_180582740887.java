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

public class CSVFormat_getHeader_180582740887 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3136;
     Object term45651;
     Object term45576;

    public CSVFormat_getHeader_180582740887() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term3138 = new Character('x');
        Character term3141 = new Character('l');
        Character term3172 = new Character('P');
        Class<? extends Object> term45687 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term45686 = ((Class) term45687).getDeclaredField((String) "NONE");
        ((Field) term45686).setAccessible(true);
        Object enum89 = ((Field) term45686).get((Object) null);
        term3136 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term3143 = (Object[]) newArray("java.lang.String", 1);
        Object[] term3156 = (Object[]) newArray("java.lang.String", 0);
        setBooleanField(term3136, term3136.getClass(), "allowMissingColumnNames", false);
        setField(term3136, term3136.getClass(), "commentMarker", term3138);
        setCharField(term3136, term3136.getClass(), "delimiter", 't');
        setField(term3136, term3136.getClass(), "escapeCharacter", term3141);
        setElement(term3143, 0, "tPlsykYBqO");
        setField(term3136, term3136.getClass(), "header", term3143);
        setField(term3136, term3136.getClass(), "headerComments", term3156);
        setBooleanField(term3136, term3136.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term3136, term3136.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term3136, term3136.getClass(), "ignoreSurroundingSpaces", false);
        setField(term3136, term3136.getClass(), "nullString", "bLPjGVBhlX");
        setField(term3136, term3136.getClass(), "quoteCharacter", term3172);
        setField(term3136, term3136.getClass(), "quoteMode", enum89);
        setField(term3136, term3136.getClass(), "recordSeparator", "whBvTVIIlC");
        setBooleanField(term3136, term3136.getClass(), "skipHeaderRecord", false);
        setBooleanField(term3136, term3136.getClass(), "trailingDelimiter", false);
        setBooleanField(term3136, term3136.getClass(), "trim", true);
        setBooleanField(term3136, term3136.getClass(), "autoFlush", true);
        Character term45652 = new Character('x');
        Character term45653 = new Character('l');
        Character term45660 = new Character('P');
        Class<? extends Object> term45896 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term45895 = ((Class) term45896).getDeclaredField((String) "NONE");
        ((Field) term45895).setAccessible(true);
        Object enum90 = ((Field) term45895).get((Object) null);
        term45651 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term45654 = (Object[]) newArray("java.lang.String", 1);
        Object[] term45657 = (Object[]) newArray("java.lang.String", 0);
        setBooleanField(term45651, term45651.getClass(), "allowMissingColumnNames", false);
        setField(term45651, term45651.getClass(), "commentMarker", term45652);
        setCharField(term45651, term45651.getClass(), "delimiter", 't');
        setField(term45651, term45651.getClass(), "escapeCharacter", term45653);
        setElement(term45654, 0, "tPlsykYBqO");
        setField(term45651, term45651.getClass(), "header", term45654);
        setField(term45651, term45651.getClass(), "headerComments", term45657);
        setBooleanField(term45651, term45651.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term45651, term45651.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term45651, term45651.getClass(), "ignoreSurroundingSpaces", false);
        setField(term45651, term45651.getClass(), "nullString", "bLPjGVBhlX");
        setField(term45651, term45651.getClass(), "quoteCharacter", term45660);
        setField(term45651, term45651.getClass(), "quoteMode", enum90);
        setField(term45651, term45651.getClass(), "recordSeparator", "whBvTVIIlC");
        setBooleanField(term45651, term45651.getClass(), "skipHeaderRecord", false);
        setBooleanField(term45651, term45651.getClass(), "trailingDelimiter", false);
        setBooleanField(term45651, term45651.getClass(), "trim", true);
        setBooleanField(term45651, term45651.getClass(), "autoFlush", true);
        term45576 = (Object[]) newArray("java.lang.String", 1);
        setElement(term45576, 0, "tPlsykYBqO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getHeader", argTypes, term3136, args);
        assertTrue(recursiveEquals(term3136, term45651));
        assertTrue(recursiveEquals(retValue, term45576));
    }

};


