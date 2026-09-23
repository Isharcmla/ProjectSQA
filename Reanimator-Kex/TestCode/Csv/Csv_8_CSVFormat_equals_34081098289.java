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
import java.lang.String;
import java.lang.Object;

public class CSVFormat_equals_34081098289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156045;
     Object term156180;
     Object term156420;
     Object term156424;

    public CSVFormat_equals_34081098289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term156431 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term156430 = ((Class) term156431).getDeclaredField((String) "ALL");
        ((Field) term156430).setAccessible(true);
        Object enum288 = ((Field) term156430).get((Object) null);
        term156045 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term156045, term156045.getClass(), "delimiter", (char) 0);
        setField(term156045, term156045.getClass(), "quotePolicy", enum288);
        setField(term156045, term156045.getClass(), "quoteChar", null);
        setField(term156045, term156045.getClass(), "commentStart", null);
        setField(term156045, term156045.getClass(), "escape", null);
        setField(term156045, term156045.getClass(), "nullString", null);
        setField(term156045, term156045.getClass(), "header", null);
        setBooleanField(term156045, term156045.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term156045, term156045.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term156045, term156045.getClass(), "skipHeaderRecord", false);
        term156180 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term155900 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term156180, term156180.getClass(), "delimiter", (char) 0);
        setField(term156180, term156180.getClass(), "quotePolicy", enum288);
        setField(term156180, term156180.getClass(), "quoteChar", null);
        setField(term156180, term156180.getClass(), "commentStart", null);
        setField(term156180, term156180.getClass(), "escape", null);
        setField(term156180, term156180.getClass(), "nullString", null);
        setField(term156180, term156180.getClass(), "header", term155900);
        setBooleanField(term156180, term156180.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term156180, term156180.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term156180, term156180.getClass(), "skipHeaderRecord", true);
        Class<? extends Object> term156587 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term156586 = ((Class) term156587).getDeclaredField((String) "ALL");
        ((Field) term156586).setAccessible(true);
        Object enum289 = ((Field) term156586).get((Object) null);
        term156420 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term156420, term156420.getClass(), "delimiter", (char) 0);
        setField(term156420, term156420.getClass(), "quoteChar", null);
        setField(term156420, term156420.getClass(), "quotePolicy", enum289);
        setField(term156420, term156420.getClass(), "commentStart", null);
        setField(term156420, term156420.getClass(), "escape", null);
        setBooleanField(term156420, term156420.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term156420, term156420.getClass(), "ignoreEmptyLines", true);
        setField(term156420, term156420.getClass(), "recordSeparator", null);
        setField(term156420, term156420.getClass(), "nullString", null);
        setField(term156420, term156420.getClass(), "header", null);
        setBooleanField(term156420, term156420.getClass(), "skipHeaderRecord", false);
        Class<? extends Object> term156743 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term156742 = ((Class) term156743).getDeclaredField((String) "ALL");
        ((Field) term156742).setAccessible(true);
        Object enum290 = ((Field) term156742).get((Object) null);
        term156424 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term156428 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term156424, term156424.getClass(), "delimiter", (char) 0);
        setField(term156424, term156424.getClass(), "quoteChar", null);
        setField(term156424, term156424.getClass(), "quotePolicy", enum290);
        setField(term156424, term156424.getClass(), "commentStart", null);
        setField(term156424, term156424.getClass(), "escape", null);
        setBooleanField(term156424, term156424.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term156424, term156424.getClass(), "ignoreEmptyLines", true);
        setField(term156424, term156424.getClass(), "recordSeparator", null);
        setField(term156424, term156424.getClass(), "nullString", null);
        setField(term156424, term156424.getClass(), "header", term156428);
        setBooleanField(term156424, term156424.getClass(), "skipHeaderRecord", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term156180;
        Object retValue = callMethod(klass, "equals", argTypes, term156045, args);
        assertTrue(recursiveEquals(term156045, term156420));
        assertTrue(recursiveEquals(term156180, term156424));
        assertTrue(recursiveEquals(retValue, false));
    }

};


