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

public class CSVFormat_getDelimiter_155525069585 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2244;
     Object term44209;

    public CSVFormat_getDelimiter_155525069585() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term2246 = new Character('c');
        Character term2249 = new Character('Q');
        Character term2388 = new Character('H');
        Class<? extends Object> term44355 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term44354 = ((Class) term44355).getDeclaredField((String) "ALL_NON_NULL");
        ((Field) term44354).setAccessible(true);
        Object enum85 = ((Field) term44354).get((Object) null);
        term2244 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term2251 = (Object[]) newArray("java.lang.String", 5);
        Object[] term2312 = (Object[]) newArray("java.lang.String", 5);
        setBooleanField(term2244, term2244.getClass(), "allowMissingColumnNames", false);
        setField(term2244, term2244.getClass(), "commentMarker", term2246);
        setCharField(term2244, term2244.getClass(), "delimiter", 'g');
        setField(term2244, term2244.getClass(), "escapeCharacter", term2249);
        setElement(term2251, 0, "jDtqGUpnZN");
        setElement(term2251, 1, "nGKItKLYNC");
        setElement(term2251, 2, "UiUYnPrcCi");
        setElement(term2251, 3, "UoYtihxVaS");
        setElement(term2251, 4, "JDswTTCZHV");
        setField(term2244, term2244.getClass(), "header", term2251);
        setElement(term2312, 0, "onpbIeEKoi");
        setElement(term2312, 1, "YRHGsAkhxb");
        setElement(term2312, 2, "ffYhPOzlUs");
        setElement(term2312, 3, "MLqYREekMl");
        setElement(term2312, 4, "ytSBIKXogI");
        setField(term2244, term2244.getClass(), "headerComments", term2312);
        setBooleanField(term2244, term2244.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term2244, term2244.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term2244, term2244.getClass(), "ignoreSurroundingSpaces", true);
        setField(term2244, term2244.getClass(), "nullString", "nHXjMycHlU");
        setField(term2244, term2244.getClass(), "quoteCharacter", term2388);
        setField(term2244, term2244.getClass(), "quoteMode", enum85);
        setField(term2244, term2244.getClass(), "recordSeparator", "ieCtQFdkii");
        setBooleanField(term2244, term2244.getClass(), "skipHeaderRecord", false);
        setBooleanField(term2244, term2244.getClass(), "trailingDelimiter", true);
        setBooleanField(term2244, term2244.getClass(), "trim", true);
        setBooleanField(term2244, term2244.getClass(), "autoFlush", true);
        Character term44210 = new Character('c');
        Character term44211 = new Character('Q');
        Character term44236 = new Character('H');
        Class<? extends Object> term44794 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term44793 = ((Class) term44794).getDeclaredField((String) "ALL_NON_NULL");
        ((Field) term44793).setAccessible(true);
        Object enum86 = ((Field) term44793).get((Object) null);
        term44209 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term44212 = (Object[]) newArray("java.lang.String", 5);
        Object[] term44223 = (Object[]) newArray("java.lang.String", 5);
        setBooleanField(term44209, term44209.getClass(), "allowMissingColumnNames", false);
        setField(term44209, term44209.getClass(), "commentMarker", term44210);
        setCharField(term44209, term44209.getClass(), "delimiter", 'g');
        setField(term44209, term44209.getClass(), "escapeCharacter", term44211);
        setElement(term44212, 0, "jDtqGUpnZN");
        setElement(term44212, 1, "nGKItKLYNC");
        setElement(term44212, 2, "UiUYnPrcCi");
        setElement(term44212, 3, "UoYtihxVaS");
        setElement(term44212, 4, "JDswTTCZHV");
        setField(term44209, term44209.getClass(), "header", term44212);
        setElement(term44223, 0, "onpbIeEKoi");
        setElement(term44223, 1, "YRHGsAkhxb");
        setElement(term44223, 2, "ffYhPOzlUs");
        setElement(term44223, 3, "MLqYREekMl");
        setElement(term44223, 4, "ytSBIKXogI");
        setField(term44209, term44209.getClass(), "headerComments", term44223);
        setBooleanField(term44209, term44209.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term44209, term44209.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term44209, term44209.getClass(), "ignoreSurroundingSpaces", true);
        setField(term44209, term44209.getClass(), "nullString", "nHXjMycHlU");
        setField(term44209, term44209.getClass(), "quoteCharacter", term44236);
        setField(term44209, term44209.getClass(), "quoteMode", enum86);
        setField(term44209, term44209.getClass(), "recordSeparator", "ieCtQFdkii");
        setBooleanField(term44209, term44209.getClass(), "skipHeaderRecord", false);
        setBooleanField(term44209, term44209.getClass(), "trailingDelimiter", true);
        setBooleanField(term44209, term44209.getClass(), "trim", true);
        setBooleanField(term44209, term44209.getClass(), "autoFlush", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDelimiter", argTypes, term2244, args);
        assertTrue(recursiveEquals(term2244, term44209));
        assertTrue(recursiveEquals(retValue, 'g'));
    }

};


