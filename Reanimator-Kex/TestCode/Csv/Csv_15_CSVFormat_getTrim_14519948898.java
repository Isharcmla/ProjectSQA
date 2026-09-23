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

public class CSVFormat_getTrim_14519948898 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7955;
     Object term54372;

    public CSVFormat_getTrim_14519948898() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term7957 = new Character('R');
        Character term7960 = new Character('T');
        Character term7991 = new Character('N');
        Class<? extends Object> term54408 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term54407 = ((Class) term54408).getDeclaredField((String) "NONE");
        ((Field) term54407).setAccessible(true);
        Object enum112 = ((Field) term54407).get((Object) null);
        term7955 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term7962 = (Object[]) newArray("java.lang.String", 1);
        Object[] term7975 = (Object[]) newArray("java.lang.String", 0);
        setBooleanField(term7955, term7955.getClass(), "allowMissingColumnNames", false);
        setField(term7955, term7955.getClass(), "commentMarker", term7957);
        setCharField(term7955, term7955.getClass(), "delimiter", 'K');
        setField(term7955, term7955.getClass(), "escapeCharacter", term7960);
        setElement(term7962, 0, "kVEZMHmRtR");
        setField(term7955, term7955.getClass(), "header", term7962);
        setField(term7955, term7955.getClass(), "headerComments", term7975);
        setBooleanField(term7955, term7955.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term7955, term7955.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term7955, term7955.getClass(), "ignoreSurroundingSpaces", false);
        setField(term7955, term7955.getClass(), "nullString", "ekxGuOYIwi");
        setField(term7955, term7955.getClass(), "quoteCharacter", term7991);
        setField(term7955, term7955.getClass(), "quoteMode", enum112);
        setField(term7955, term7955.getClass(), "recordSeparator", "RbVQXSpxXy");
        setBooleanField(term7955, term7955.getClass(), "skipHeaderRecord", false);
        setBooleanField(term7955, term7955.getClass(), "trailingDelimiter", true);
        setBooleanField(term7955, term7955.getClass(), "trim", true);
        setBooleanField(term7955, term7955.getClass(), "autoFlush", false);
        Character term54373 = new Character('R');
        Character term54374 = new Character('T');
        Character term54381 = new Character('N');
        Class<? extends Object> term54617 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term54616 = ((Class) term54617).getDeclaredField((String) "NONE");
        ((Field) term54616).setAccessible(true);
        Object enum113 = ((Field) term54616).get((Object) null);
        term54372 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term54375 = (Object[]) newArray("java.lang.String", 1);
        Object[] term54378 = (Object[]) newArray("java.lang.String", 0);
        setBooleanField(term54372, term54372.getClass(), "allowMissingColumnNames", false);
        setField(term54372, term54372.getClass(), "commentMarker", term54373);
        setCharField(term54372, term54372.getClass(), "delimiter", 'K');
        setField(term54372, term54372.getClass(), "escapeCharacter", term54374);
        setElement(term54375, 0, "kVEZMHmRtR");
        setField(term54372, term54372.getClass(), "header", term54375);
        setField(term54372, term54372.getClass(), "headerComments", term54378);
        setBooleanField(term54372, term54372.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term54372, term54372.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term54372, term54372.getClass(), "ignoreSurroundingSpaces", false);
        setField(term54372, term54372.getClass(), "nullString", "ekxGuOYIwi");
        setField(term54372, term54372.getClass(), "quoteCharacter", term54381);
        setField(term54372, term54372.getClass(), "quoteMode", enum113);
        setField(term54372, term54372.getClass(), "recordSeparator", "RbVQXSpxXy");
        setBooleanField(term54372, term54372.getClass(), "skipHeaderRecord", false);
        setBooleanField(term54372, term54372.getClass(), "trailingDelimiter", true);
        setBooleanField(term54372, term54372.getClass(), "trim", true);
        setBooleanField(term54372, term54372.getClass(), "autoFlush", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTrim", argTypes, term7955, args);
        assertTrue(recursiveEquals(term7955, term54372));
    }

};


