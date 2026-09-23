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

public class CSVFormat_getDelimiter_155525069582 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2206;
     Object term42951;

    public CSVFormat_getDelimiter_155525069582() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term2208 = new Character('c');
        Character term2211 = new Character('Q');
        Character term2350 = new Character('H');
        Class<? extends Object> term43095 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term43094 = ((Class) term43095).getDeclaredField((String) "NONE");
        ((Field) term43094).setAccessible(true);
        Object enum82 = ((Field) term43094).get((Object) null);
        term2206 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term2213 = (Object[]) newArray("java.lang.String", 5);
        Object[] term2274 = (Object[]) newArray("java.lang.String", 5);
        setBooleanField(term2206, term2206.getClass(), "allowMissingColumnNames", true);
        setField(term2206, term2206.getClass(), "commentMarker", term2208);
        setCharField(term2206, term2206.getClass(), "delimiter", 'g');
        setField(term2206, term2206.getClass(), "escapeCharacter", term2211);
        setElement(term2213, 0, "jDtqGUpnZN");
        setElement(term2213, 1, "nGKItKLYNC");
        setElement(term2213, 2, "UiUYnPrcCi");
        setElement(term2213, 3, "UoYtihxVaS");
        setElement(term2213, 4, "JDswTTCZHV");
        setField(term2206, term2206.getClass(), "header", term2213);
        setElement(term2274, 0, "onpbIeEKoi");
        setElement(term2274, 1, "YRHGsAkhxb");
        setElement(term2274, 2, "ffYhPOzlUs");
        setElement(term2274, 3, "MLqYREekMl");
        setElement(term2274, 4, "ytSBIKXogI");
        setField(term2206, term2206.getClass(), "headerComments", term2274);
        setBooleanField(term2206, term2206.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term2206, term2206.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term2206, term2206.getClass(), "ignoreSurroundingSpaces", true);
        setField(term2206, term2206.getClass(), "nullString", "nHXjMycHlU");
        setField(term2206, term2206.getClass(), "quoteCharacter", term2350);
        setField(term2206, term2206.getClass(), "quoteMode", enum82);
        setField(term2206, term2206.getClass(), "recordSeparator", "ieCtQFdkii");
        setBooleanField(term2206, term2206.getClass(), "skipHeaderRecord", false);
        setBooleanField(term2206, term2206.getClass(), "trailingDelimiter", false);
        setBooleanField(term2206, term2206.getClass(), "trim", false);
        Character term42952 = new Character('c');
        Character term42953 = new Character('Q');
        Character term42978 = new Character('H');
        Class<? extends Object> term43394 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term43393 = ((Class) term43394).getDeclaredField((String) "NONE");
        ((Field) term43393).setAccessible(true);
        Object enum83 = ((Field) term43393).get((Object) null);
        term42951 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term42954 = (Object[]) newArray("java.lang.String", 5);
        Object[] term42965 = (Object[]) newArray("java.lang.String", 5);
        setBooleanField(term42951, term42951.getClass(), "allowMissingColumnNames", true);
        setField(term42951, term42951.getClass(), "commentMarker", term42952);
        setCharField(term42951, term42951.getClass(), "delimiter", 'g');
        setField(term42951, term42951.getClass(), "escapeCharacter", term42953);
        setElement(term42954, 0, "jDtqGUpnZN");
        setElement(term42954, 1, "nGKItKLYNC");
        setElement(term42954, 2, "UiUYnPrcCi");
        setElement(term42954, 3, "UoYtihxVaS");
        setElement(term42954, 4, "JDswTTCZHV");
        setField(term42951, term42951.getClass(), "header", term42954);
        setElement(term42965, 0, "onpbIeEKoi");
        setElement(term42965, 1, "YRHGsAkhxb");
        setElement(term42965, 2, "ffYhPOzlUs");
        setElement(term42965, 3, "MLqYREekMl");
        setElement(term42965, 4, "ytSBIKXogI");
        setField(term42951, term42951.getClass(), "headerComments", term42965);
        setBooleanField(term42951, term42951.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term42951, term42951.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term42951, term42951.getClass(), "ignoreSurroundingSpaces", true);
        setField(term42951, term42951.getClass(), "nullString", "nHXjMycHlU");
        setField(term42951, term42951.getClass(), "quoteCharacter", term42978);
        setField(term42951, term42951.getClass(), "quoteMode", enum83);
        setField(term42951, term42951.getClass(), "recordSeparator", "ieCtQFdkii");
        setBooleanField(term42951, term42951.getClass(), "skipHeaderRecord", false);
        setBooleanField(term42951, term42951.getClass(), "trailingDelimiter", false);
        setBooleanField(term42951, term42951.getClass(), "trim", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDelimiter", argTypes, term2206, args);
        assertTrue(recursiveEquals(term2206, term42951));
        assertTrue(recursiveEquals(retValue, 'g'));
    }

};


