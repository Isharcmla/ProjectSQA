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

public class CSVFormat_validate_725288942197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93468;
     Object term93763;

    public CSVFormat_validate_725288942197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term93769 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term93768 = ((Class) term93769).getDeclaredField((String) "MINIMAL");
        ((Field) term93768).setAccessible(true);
        Object enum174 = ((Field) term93768).get((Object) null);
        term93468 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term93352 = (Object[]) newArray("java.lang.String", 0);
        setField(term93468, term93468.getClass(), "quoteChar", null);
        setField(term93468, term93468.getClass(), "escape", null);
        setField(term93468, term93468.getClass(), "commentStart", null);
        setField(term93468, term93468.getClass(), "quotePolicy", enum174);
        setField(term93468, term93468.getClass(), "header", term93352);
        Class<? extends Object> term93937 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term93936 = ((Class) term93937).getDeclaredField((String) "MINIMAL");
        ((Field) term93936).setAccessible(true);
        Object enum175 = ((Field) term93936).get((Object) null);
        term93763 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term93767 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term93763, term93763.getClass(), "delimiter", (char) 0);
        setField(term93763, term93763.getClass(), "quoteChar", null);
        setField(term93763, term93763.getClass(), "quotePolicy", enum175);
        setField(term93763, term93763.getClass(), "commentStart", null);
        setField(term93763, term93763.getClass(), "escape", null);
        setBooleanField(term93763, term93763.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term93763, term93763.getClass(), "ignoreEmptyLines", false);
        setField(term93763, term93763.getClass(), "recordSeparator", null);
        setField(term93763, term93763.getClass(), "nullString", null);
        setField(term93763, term93763.getClass(), "header", term93767);
        setBooleanField(term93763, term93763.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "validate", argTypes, term93468, args);
        assertTrue(recursiveEquals(term93468, term93763));
    }

};


