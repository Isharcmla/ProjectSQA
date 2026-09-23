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

public class CSVFormat_getTrailingDelimiter_197518700597 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7486;
     Object term53678;

    public CSVFormat_getTrailingDelimiter_197518700597() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term7488 = new Character('j');
        Character term7491 = new Character('Y');
        Character term7630 = new Character('S');
        Class<? extends Object> term53822 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term53821 = ((Class) term53822).getDeclaredField((String) "NONE");
        ((Field) term53821).setAccessible(true);
        Object enum110 = ((Field) term53821).get((Object) null);
        term7486 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term7493 = (Object[]) newArray("java.lang.String", 5);
        Object[] term7554 = (Object[]) newArray("java.lang.String", 5);
        setBooleanField(term7486, term7486.getClass(), "allowMissingColumnNames", false);
        setField(term7486, term7486.getClass(), "commentMarker", term7488);
        setCharField(term7486, term7486.getClass(), "delimiter", 'G');
        setField(term7486, term7486.getClass(), "escapeCharacter", term7491);
        setElement(term7493, 0, "sQvGcVjdEx");
        setElement(term7493, 1, "rLHAoqXgPh");
        setElement(term7493, 2, "zUlRdimJtU");
        setElement(term7493, 3, "vwbEQQNQrx");
        setElement(term7493, 4, "xtftXXMbem");
        setField(term7486, term7486.getClass(), "header", term7493);
        setElement(term7554, 0, "cudZvLMQon");
        setElement(term7554, 1, "lihXWlGDxk");
        setElement(term7554, 2, "JmcmxoGhIK");
        setElement(term7554, 3, "jXzmYyrnnT");
        setElement(term7554, 4, "igCAtimmYB");
        setField(term7486, term7486.getClass(), "headerComments", term7554);
        setBooleanField(term7486, term7486.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term7486, term7486.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term7486, term7486.getClass(), "ignoreSurroundingSpaces", true);
        setField(term7486, term7486.getClass(), "nullString", "DyiXbeYIaN");
        setField(term7486, term7486.getClass(), "quoteCharacter", term7630);
        setField(term7486, term7486.getClass(), "quoteMode", enum110);
        setField(term7486, term7486.getClass(), "recordSeparator", "VGizxZnyHX");
        setBooleanField(term7486, term7486.getClass(), "skipHeaderRecord", true);
        setBooleanField(term7486, term7486.getClass(), "trailingDelimiter", false);
        setBooleanField(term7486, term7486.getClass(), "trim", true);
        setBooleanField(term7486, term7486.getClass(), "autoFlush", false);
        Character term53679 = new Character('j');
        Character term53680 = new Character('Y');
        Character term53705 = new Character('S');
        Class<? extends Object> term54121 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term54120 = ((Class) term54121).getDeclaredField((String) "NONE");
        ((Field) term54120).setAccessible(true);
        Object enum111 = ((Field) term54120).get((Object) null);
        term53678 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term53681 = (Object[]) newArray("java.lang.String", 5);
        Object[] term53692 = (Object[]) newArray("java.lang.String", 5);
        setBooleanField(term53678, term53678.getClass(), "allowMissingColumnNames", false);
        setField(term53678, term53678.getClass(), "commentMarker", term53679);
        setCharField(term53678, term53678.getClass(), "delimiter", 'G');
        setField(term53678, term53678.getClass(), "escapeCharacter", term53680);
        setElement(term53681, 0, "sQvGcVjdEx");
        setElement(term53681, 1, "rLHAoqXgPh");
        setElement(term53681, 2, "zUlRdimJtU");
        setElement(term53681, 3, "vwbEQQNQrx");
        setElement(term53681, 4, "xtftXXMbem");
        setField(term53678, term53678.getClass(), "header", term53681);
        setElement(term53692, 0, "cudZvLMQon");
        setElement(term53692, 1, "lihXWlGDxk");
        setElement(term53692, 2, "JmcmxoGhIK");
        setElement(term53692, 3, "jXzmYyrnnT");
        setElement(term53692, 4, "igCAtimmYB");
        setField(term53678, term53678.getClass(), "headerComments", term53692);
        setBooleanField(term53678, term53678.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term53678, term53678.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term53678, term53678.getClass(), "ignoreSurroundingSpaces", true);
        setField(term53678, term53678.getClass(), "nullString", "DyiXbeYIaN");
        setField(term53678, term53678.getClass(), "quoteCharacter", term53705);
        setField(term53678, term53678.getClass(), "quoteMode", enum111);
        setField(term53678, term53678.getClass(), "recordSeparator", "VGizxZnyHX");
        setBooleanField(term53678, term53678.getClass(), "skipHeaderRecord", true);
        setBooleanField(term53678, term53678.getClass(), "trailingDelimiter", false);
        setBooleanField(term53678, term53678.getClass(), "trim", true);
        setBooleanField(term53678, term53678.getClass(), "autoFlush", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTrailingDelimiter", argTypes, term7486, args);
        assertTrue(recursiveEquals(term7486, term53678));
    }

};


