package org.apache.commons.collections;

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
import static org.apache.commons.collections.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.EqualityUtils.*;

public class ExtendedProperties_interpolate_134704223233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52100;
     Object term52405;

    public ExtendedProperties_interpolate_134704223233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52100 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        term52405 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term52405, term52405.getClass(), "defaults", null);
        setField(term52405, term52405.getClass(), "file", null);
        setField(term52405, term52405.getClass(), "basePath", null);
        setField(term52405, term52405.getClass(), "fileSeparator", null);
        setBooleanField(term52405, term52405.getClass(), "isInitialized", false);
        setField(term52405, term52405.getClass(), "includePropertyName", null);
        setField(term52405, term52405.getClass(), "keysAsListed", null);
        setField(term52405, term52405.getClass(), "table", null);
        setIntField(term52405, term52405.getClass(), "count", 0);
        setIntField(term52405, term52405.getClass(), "threshold", 0);
        setFloatField(term52405, term52405.getClass(), "loadFactor", 0.0F);
        setIntField(term52405, term52405.getClass(), "modCount", 0);
        setField(term52405, term52405.getClass(), "keySet", null);
        setField(term52405, term52405.getClass(), "entrySet", null);
        setField(term52405, term52405.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "interpolate", argTypes, term52100, args);
        assertTrue(recursiveEquals(term52100, term52405));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


