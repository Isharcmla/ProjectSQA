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

public class ExtendedProperties_interpolate_134704223658 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term311464;
     Object term311637;

    public ExtendedProperties_interpolate_134704223658() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term311464 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        term311637 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term311637, term311637.getClass(), "defaults", null);
        setField(term311637, term311637.getClass(), "file", null);
        setField(term311637, term311637.getClass(), "basePath", null);
        setField(term311637, term311637.getClass(), "fileSeparator", null);
        setBooleanField(term311637, term311637.getClass(), "isInitialized", false);
        setField(term311637, term311637.getClass(), "includePropertyName", null);
        setField(term311637, term311637.getClass(), "keysAsListed", null);
        setField(term311637, term311637.getClass(), "table", null);
        setIntField(term311637, term311637.getClass(), "count", 0);
        setIntField(term311637, term311637.getClass(), "threshold", 0);
        setFloatField(term311637, term311637.getClass(), "loadFactor", 0.0F);
        setIntField(term311637, term311637.getClass(), "modCount", 0);
        setField(term311637, term311637.getClass(), "keySet", null);
        setField(term311637, term311637.getClass(), "entrySet", null);
        setField(term311637, term311637.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "interpolate", argTypes, term311464, args);
        assertTrue(recursiveEquals(term311464, term311637));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


