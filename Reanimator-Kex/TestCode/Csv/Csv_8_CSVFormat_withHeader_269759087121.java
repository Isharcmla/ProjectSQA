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
import java.lang.IllegalArgumentException;
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class CSVFormat_withHeader_269759087121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56231;

    public CSVFormat_withHeader_269759087121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term56779 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term56778 = ((Class) term56779).getDeclaredField((String) "ALL");
        ((Field) term56778).setAccessible(true);
        Object enum146 = ((Field) term56778).get((Object) null);
        term56231 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term56231, term56231.getClass(), "delimiter", (char) 10);
        setField(term56231, term56231.getClass(), "quoteChar", null);
        setField(term56231, term56231.getClass(), "quotePolicy", enum146);
        setField(term56231, term56231.getClass(), "commentStart", null);
        setField(term56231, term56231.getClass(), "escape", null);
        setBooleanField(term56231, term56231.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term56231, term56231.getClass(), "ignoreEmptyLines", false);
        setField(term56231, term56231.getClass(), "recordSeparator", null);
        setField(term56231, term56231.getClass(), "nullString", null);
        setBooleanField(term56231, term56231.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "withHeader", argTypes, term56231, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


