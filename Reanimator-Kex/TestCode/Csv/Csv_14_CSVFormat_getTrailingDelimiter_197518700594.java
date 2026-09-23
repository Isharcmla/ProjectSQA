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

public class CSVFormat_getTrailingDelimiter_197518700594 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7472;
     Object term52491;

    public CSVFormat_getTrailingDelimiter_197518700594() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term7474 = new Character('j');
        Character term7477 = new Character('Y');
        Character term7616 = new Character('S');
        Class<? extends Object> term52635 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term52634 = ((Class) term52635).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term52634).setAccessible(true);
        Object enum107 = ((Field) term52634).get((Object) null);
        term7472 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term7479 = (Object[]) newArray("java.lang.String", 5);
        Object[] term7540 = (Object[]) newArray("java.lang.String", 5);
        setBooleanField(term7472, term7472.getClass(), "allowMissingColumnNames", false);
        setField(term7472, term7472.getClass(), "commentMarker", term7474);
        setCharField(term7472, term7472.getClass(), "delimiter", 'G');
        setField(term7472, term7472.getClass(), "escapeCharacter", term7477);
        setElement(term7479, 0, "sQvGcVjdEx");
        setElement(term7479, 1, "rLHAoqXgPh");
        setElement(term7479, 2, "zUlRdimJtU");
        setElement(term7479, 3, "vwbEQQNQrx");
        setElement(term7479, 4, "xtftXXMbem");
        setField(term7472, term7472.getClass(), "header", term7479);
        setElement(term7540, 0, "cudZvLMQon");
        setElement(term7540, 1, "lihXWlGDxk");
        setElement(term7540, 2, "JmcmxoGhIK");
        setElement(term7540, 3, "jXzmYyrnnT");
        setElement(term7540, 4, "igCAtimmYB");
        setField(term7472, term7472.getClass(), "headerComments", term7540);
        setBooleanField(term7472, term7472.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term7472, term7472.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term7472, term7472.getClass(), "ignoreSurroundingSpaces", false);
        setField(term7472, term7472.getClass(), "nullString", "DyiXbeYIaN");
        setField(term7472, term7472.getClass(), "quoteCharacter", term7616);
        setField(term7472, term7472.getClass(), "quoteMode", enum107);
        setField(term7472, term7472.getClass(), "recordSeparator", "VGizxZnyHX");
        setBooleanField(term7472, term7472.getClass(), "skipHeaderRecord", false);
        setBooleanField(term7472, term7472.getClass(), "trailingDelimiter", false);
        setBooleanField(term7472, term7472.getClass(), "trim", false);
        Character term52492 = new Character('j');
        Character term52493 = new Character('Y');
        Character term52518 = new Character('S');
        Class<? extends Object> term52955 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term52954 = ((Class) term52955).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term52954).setAccessible(true);
        Object enum108 = ((Field) term52954).get((Object) null);
        term52491 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term52494 = (Object[]) newArray("java.lang.String", 5);
        Object[] term52505 = (Object[]) newArray("java.lang.String", 5);
        setBooleanField(term52491, term52491.getClass(), "allowMissingColumnNames", false);
        setField(term52491, term52491.getClass(), "commentMarker", term52492);
        setCharField(term52491, term52491.getClass(), "delimiter", 'G');
        setField(term52491, term52491.getClass(), "escapeCharacter", term52493);
        setElement(term52494, 0, "sQvGcVjdEx");
        setElement(term52494, 1, "rLHAoqXgPh");
        setElement(term52494, 2, "zUlRdimJtU");
        setElement(term52494, 3, "vwbEQQNQrx");
        setElement(term52494, 4, "xtftXXMbem");
        setField(term52491, term52491.getClass(), "header", term52494);
        setElement(term52505, 0, "cudZvLMQon");
        setElement(term52505, 1, "lihXWlGDxk");
        setElement(term52505, 2, "JmcmxoGhIK");
        setElement(term52505, 3, "jXzmYyrnnT");
        setElement(term52505, 4, "igCAtimmYB");
        setField(term52491, term52491.getClass(), "headerComments", term52505);
        setBooleanField(term52491, term52491.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term52491, term52491.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term52491, term52491.getClass(), "ignoreSurroundingSpaces", false);
        setField(term52491, term52491.getClass(), "nullString", "DyiXbeYIaN");
        setField(term52491, term52491.getClass(), "quoteCharacter", term52518);
        setField(term52491, term52491.getClass(), "quoteMode", enum108);
        setField(term52491, term52491.getClass(), "recordSeparator", "VGizxZnyHX");
        setBooleanField(term52491, term52491.getClass(), "skipHeaderRecord", false);
        setBooleanField(term52491, term52491.getClass(), "trailingDelimiter", false);
        setBooleanField(term52491, term52491.getClass(), "trim", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTrailingDelimiter", argTypes, term7472, args);
        assertTrue(recursiveEquals(term7472, term52491));
    }

};


