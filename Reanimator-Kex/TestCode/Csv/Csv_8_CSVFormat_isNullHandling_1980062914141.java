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

public class CSVFormat_isNullHandling_1980062914141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65756;
     Object term65764;

    public CSVFormat_isNullHandling_1980062914141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65756 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setField(term65756, term65756.getClass(), "nullString", null);
        term65764 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term65764, term65764.getClass(), "delimiter", (char) 0);
        setField(term65764, term65764.getClass(), "quoteChar", null);
        setField(term65764, term65764.getClass(), "quotePolicy", null);
        setField(term65764, term65764.getClass(), "commentStart", null);
        setField(term65764, term65764.getClass(), "escape", null);
        setBooleanField(term65764, term65764.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term65764, term65764.getClass(), "ignoreEmptyLines", false);
        setField(term65764, term65764.getClass(), "recordSeparator", null);
        setField(term65764, term65764.getClass(), "nullString", null);
        setField(term65764, term65764.getClass(), "header", null);
        setBooleanField(term65764, term65764.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isNullHandling", argTypes, term65756, args);
        assertTrue(recursiveEquals(term65756, term65764));
        assertTrue(recursiveEquals(retValue, false));
    }

};


