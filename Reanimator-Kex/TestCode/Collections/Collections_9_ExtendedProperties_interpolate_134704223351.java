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

public class ExtendedProperties_interpolate_134704223351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149383;
     Object term149688;

    public ExtendedProperties_interpolate_134704223351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149383 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        term149688 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term149688, term149688.getClass(), "defaults", null);
        setField(term149688, term149688.getClass(), "file", null);
        setField(term149688, term149688.getClass(), "basePath", null);
        setField(term149688, term149688.getClass(), "fileSeparator", null);
        setBooleanField(term149688, term149688.getClass(), "isInitialized", false);
        setField(term149688, term149688.getClass(), "includePropertyName", null);
        setField(term149688, term149688.getClass(), "keysAsListed", null);
        setField(term149688, term149688.getClass(), "table", null);
        setIntField(term149688, term149688.getClass(), "count", 0);
        setIntField(term149688, term149688.getClass(), "threshold", 0);
        setFloatField(term149688, term149688.getClass(), "loadFactor", 0.0F);
        setIntField(term149688, term149688.getClass(), "modCount", 0);
        setField(term149688, term149688.getClass(), "keySet", null);
        setField(term149688, term149688.getClass(), "entrySet", null);
        setField(term149688, term149688.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "interpolate", argTypes, term149383, args);
        assertTrue(recursiveEquals(term149383, term149688));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


