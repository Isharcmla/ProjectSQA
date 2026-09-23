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

public class CSVFormat_hashCode_482767773236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119782;
     Object term120822;

    public CSVFormat_hashCode_482767773236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term120827 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term120826 = ((Class) term120827).getDeclaredField((String) "ALL");
        ((Field) term120826).setAccessible(true);
        Object enum210 = ((Field) term120826).get((Object) null);
        term119782 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term119782, term119782.getClass(), "delimiter", (char) 0);
        setField(term119782, term119782.getClass(), "quotePolicy", enum210);
        setField(term119782, term119782.getClass(), "quoteChar", null);
        setField(term119782, term119782.getClass(), "commentStart", null);
        setField(term119782, term119782.getClass(), "escape", null);
        setField(term119782, term119782.getClass(), "nullString", null);
        setBooleanField(term119782, term119782.getClass(), "ignoreSurroundingSpaces", true);
        Class<? extends Object> term120983 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term120982 = ((Class) term120983).getDeclaredField((String) "ALL");
        ((Field) term120982).setAccessible(true);
        Object enum211 = ((Field) term120982).get((Object) null);
        term120822 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term120822, term120822.getClass(), "delimiter", (char) 0);
        setField(term120822, term120822.getClass(), "quoteChar", null);
        setField(term120822, term120822.getClass(), "quotePolicy", enum211);
        setField(term120822, term120822.getClass(), "commentStart", null);
        setField(term120822, term120822.getClass(), "escape", null);
        setBooleanField(term120822, term120822.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term120822, term120822.getClass(), "ignoreEmptyLines", false);
        setField(term120822, term120822.getClass(), "recordSeparator", null);
        setField(term120822, term120822.getClass(), "nullString", null);
        setField(term120822, term120822.getClass(), "header", null);
        setBooleanField(term120822, term120822.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term119782, args);
        assertTrue(recursiveEquals(term119782, term120822));
        assertTrue(recursiveEquals(retValue, 885138723));
    }

};


