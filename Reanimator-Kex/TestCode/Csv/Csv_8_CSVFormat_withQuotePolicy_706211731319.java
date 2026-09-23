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
import java.lang.Object;
import java.lang.String;

public class CSVFormat_withQuotePolicy_706211731319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term197240;
     Object enum336;
     Object term197614;
     Object enum337;
     Object term197579;

    public CSVFormat_withQuotePolicy_706211731319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term197240 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term197127 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term197240, term197240.getClass(), "delimiter", (char) 0);
        setField(term197240, term197240.getClass(), "quoteChar", null);
        setField(term197240, term197240.getClass(), "commentStart", null);
        setField(term197240, term197240.getClass(), "escape", null);
        setBooleanField(term197240, term197240.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term197240, term197240.getClass(), "ignoreEmptyLines", false);
        setField(term197240, term197240.getClass(), "recordSeparator", "");
        setField(term197240, term197240.getClass(), "nullString", "");
        setField(term197240, term197240.getClass(), "header", term197127);
        setBooleanField(term197240, term197240.getClass(), "skipHeaderRecord", false);
        Class<? extends Object> term197624 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term197623 = ((Class) term197624).getDeclaredField((String) "ALL");
        ((Field) term197623).setAccessible(true);
        enum336 = ((Field) term197623).get((Object) null);
        term197614 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term197619 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term197614, term197614.getClass(), "delimiter", (char) 0);
        setField(term197614, term197614.getClass(), "quoteChar", null);
        setField(term197614, term197614.getClass(), "quotePolicy", null);
        setField(term197614, term197614.getClass(), "commentStart", null);
        setField(term197614, term197614.getClass(), "escape", null);
        setBooleanField(term197614, term197614.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term197614, term197614.getClass(), "ignoreEmptyLines", false);
        setField(term197614, term197614.getClass(), "recordSeparator", "");
        setField(term197614, term197614.getClass(), "nullString", "");
        setField(term197614, term197614.getClass(), "header", term197619);
        setBooleanField(term197614, term197614.getClass(), "skipHeaderRecord", false);
        Class<? extends Object> term197780 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term197779 = ((Class) term197780).getDeclaredField((String) "ALL");
        ((Field) term197779).setAccessible(true);
        enum337 = ((Field) term197779).get((Object) null);
        Class<? extends Object> term197936 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term197935 = ((Class) term197936).getDeclaredField((String) "ALL");
        ((Field) term197935).setAccessible(true);
        Object enum338 = ((Field) term197935).get((Object) null);
        term197579 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term197594 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term197579, term197579.getClass(), "delimiter", (char) 0);
        setField(term197579, term197579.getClass(), "quoteChar", null);
        setField(term197579, term197579.getClass(), "quotePolicy", enum338);
        setField(term197579, term197579.getClass(), "commentStart", null);
        setField(term197579, term197579.getClass(), "escape", null);
        setBooleanField(term197579, term197579.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term197579, term197579.getClass(), "ignoreEmptyLines", false);
        setField(term197579, term197579.getClass(), "recordSeparator", "");
        setField(term197579, term197579.getClass(), "nullString", "");
        setField(term197579, term197579.getClass(), "header", term197594);
        setBooleanField(term197579, term197579.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.csv.Quote");
        Object[] args = new Object[1];
        args[0] = enum336;
        Object retValue = callMethod(klass, "withQuotePolicy", argTypes, term197240, args);
        assertTrue(recursiveEquals(term197240, term197614));
        assertTrue(recursiveEquals(enum336, enum337));
        assertTrue(recursiveEquals(retValue, term197579));
    }

};


