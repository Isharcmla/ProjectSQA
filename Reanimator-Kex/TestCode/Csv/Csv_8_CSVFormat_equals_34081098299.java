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

public class CSVFormat_equals_34081098299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163291;
     Object term163464;
     Object term164818;
     Object term164824;

    public CSVFormat_equals_34081098299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term164831 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term164830 = ((Class) term164831).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term164830).setAccessible(true);
        Object enum307 = ((Field) term164830).get((Object) null);
        term163291 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term163291, term163291.getClass(), "delimiter", (char) 0);
        setField(term163291, term163291.getClass(), "quotePolicy", enum307);
        setField(term163291, term163291.getClass(), "quoteChar", null);
        setField(term163291, term163291.getClass(), "commentStart", null);
        setField(term163291, term163291.getClass(), "escape", null);
        setField(term163291, term163291.getClass(), "nullString", null);
        setField(term163291, term163291.getClass(), "header", null);
        setBooleanField(term163291, term163291.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term163291, term163291.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term163291, term163291.getClass(), "skipHeaderRecord", true);
        setField(term163291, term163291.getClass(), "recordSeparator", "");
        term163464 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term163154 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term163464, term163464.getClass(), "delimiter", (char) 0);
        setField(term163464, term163464.getClass(), "quotePolicy", enum307);
        setField(term163464, term163464.getClass(), "quoteChar", null);
        setField(term163464, term163464.getClass(), "commentStart", null);
        setField(term163464, term163464.getClass(), "escape", null);
        setField(term163464, term163464.getClass(), "nullString", null);
        setField(term163464, term163464.getClass(), "header", term163154);
        setBooleanField(term163464, term163464.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term163464, term163464.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term163464, term163464.getClass(), "skipHeaderRecord", true);
        Class<? extends Object> term165011 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term165010 = ((Class) term165011).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term165010).setAccessible(true);
        Object enum308 = ((Field) term165010).get((Object) null);
        term164818 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term164818, term164818.getClass(), "delimiter", (char) 0);
        setField(term164818, term164818.getClass(), "quoteChar", null);
        setField(term164818, term164818.getClass(), "quotePolicy", enum308);
        setField(term164818, term164818.getClass(), "commentStart", null);
        setField(term164818, term164818.getClass(), "escape", null);
        setBooleanField(term164818, term164818.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term164818, term164818.getClass(), "ignoreEmptyLines", false);
        setField(term164818, term164818.getClass(), "recordSeparator", "");
        setField(term164818, term164818.getClass(), "nullString", null);
        setField(term164818, term164818.getClass(), "header", null);
        setBooleanField(term164818, term164818.getClass(), "skipHeaderRecord", true);
        Class<? extends Object> term165191 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term165190 = ((Class) term165191).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term165190).setAccessible(true);
        Object enum309 = ((Field) term165190).get((Object) null);
        term164824 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term164828 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term164824, term164824.getClass(), "delimiter", (char) 0);
        setField(term164824, term164824.getClass(), "quoteChar", null);
        setField(term164824, term164824.getClass(), "quotePolicy", enum309);
        setField(term164824, term164824.getClass(), "commentStart", null);
        setField(term164824, term164824.getClass(), "escape", null);
        setBooleanField(term164824, term164824.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term164824, term164824.getClass(), "ignoreEmptyLines", false);
        setField(term164824, term164824.getClass(), "recordSeparator", null);
        setField(term164824, term164824.getClass(), "nullString", null);
        setField(term164824, term164824.getClass(), "header", term164828);
        setBooleanField(term164824, term164824.getClass(), "skipHeaderRecord", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term163464;
        Object retValue = callMethod(klass, "equals", argTypes, term163291, args);
        assertTrue(recursiveEquals(term163291, term164818));
        assertTrue(recursiveEquals(term163464, term164824));
        assertTrue(recursiveEquals(retValue, false));
    }

};


