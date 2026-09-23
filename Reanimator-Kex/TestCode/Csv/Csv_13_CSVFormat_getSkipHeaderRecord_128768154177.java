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

public class CSVFormat_getSkipHeaderRecord_128768154177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7547;
     Object term51911;

    public CSVFormat_getSkipHeaderRecord_128768154177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term7549 = new Character('G');
        Class<? extends Object> term51937 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term51936 = ((Class) term51937).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term51936).setAccessible(true);
        Object enum88 = ((Field) term51936).get((Object) null);
        Character term7566 = new Character('Y');
        Character term7568 = new Character('S');
        term7547 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term7597 = (Object[]) newArray("java.lang.String", 5);
        Object[] term7658 = (Object[]) newArray("java.lang.String", 1);
        setCharField(term7547, term7547.getClass(), "delimiter", 'j');
        setField(term7547, term7547.getClass(), "quoteCharacter", term7549);
        setField(term7547, term7547.getClass(), "quoteMode", enum88);
        setField(term7547, term7547.getClass(), "commentMarker", term7566);
        setField(term7547, term7547.getClass(), "escapeCharacter", term7568);
        setBooleanField(term7547, term7547.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term7547, term7547.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term7547, term7547.getClass(), "ignoreEmptyLines", false);
        setField(term7547, term7547.getClass(), "recordSeparator", "cudZvLMQon");
        setField(term7547, term7547.getClass(), "nullString", "lihXWlGDxk");
        setElement(term7597, 0, "JmcmxoGhIK");
        setElement(term7597, 1, "jXzmYyrnnT");
        setElement(term7597, 2, "igCAtimmYB");
        setElement(term7597, 3, "DyiXbeYIaN");
        setElement(term7597, 4, "VGizxZnyHX");
        setField(term7547, term7547.getClass(), "header", term7597);
        setElement(term7658, 0, "kVEZMHmRtR");
        setField(term7547, term7547.getClass(), "headerComments", term7658);
        setBooleanField(term7547, term7547.getClass(), "skipHeaderRecord", false);
        setBooleanField(term7547, term7547.getClass(), "ignoreHeaderCase", true);
        Character term51912 = new Character('G');
        Class<? extends Object> term52413 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term52412 = ((Class) term52413).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term52412).setAccessible(true);
        Object enum89 = ((Field) term52412).get((Object) null);
        Character term51916 = new Character('Y');
        Character term51917 = new Character('S');
        term51911 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term51922 = (Object[]) newArray("java.lang.String", 5);
        Object[] term51933 = (Object[]) newArray("java.lang.String", 1);
        setCharField(term51911, term51911.getClass(), "delimiter", 'j');
        setField(term51911, term51911.getClass(), "quoteCharacter", term51912);
        setField(term51911, term51911.getClass(), "quoteMode", enum89);
        setField(term51911, term51911.getClass(), "commentMarker", term51916);
        setField(term51911, term51911.getClass(), "escapeCharacter", term51917);
        setBooleanField(term51911, term51911.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term51911, term51911.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term51911, term51911.getClass(), "ignoreEmptyLines", false);
        setField(term51911, term51911.getClass(), "recordSeparator", "cudZvLMQon");
        setField(term51911, term51911.getClass(), "nullString", "lihXWlGDxk");
        setElement(term51922, 0, "JmcmxoGhIK");
        setElement(term51922, 1, "jXzmYyrnnT");
        setElement(term51922, 2, "igCAtimmYB");
        setElement(term51922, 3, "DyiXbeYIaN");
        setElement(term51922, 4, "VGizxZnyHX");
        setField(term51911, term51911.getClass(), "header", term51922);
        setElement(term51933, 0, "kVEZMHmRtR");
        setField(term51911, term51911.getClass(), "headerComments", term51933);
        setBooleanField(term51911, term51911.getClass(), "skipHeaderRecord", false);
        setBooleanField(term51911, term51911.getClass(), "ignoreHeaderCase", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSkipHeaderRecord", argTypes, term7547, args);
        assertTrue(recursiveEquals(term7547, term51911));
    }

};


