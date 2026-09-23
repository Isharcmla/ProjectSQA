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

public class ExtendedProperties_setInclude_1704593043371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term400397;
     Object term400527;

    public ExtendedProperties_setInclude_1704593043371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term400397 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        term400527 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term400527, term400527.getClass(), "defaults", null);
        setField(term400527, term400527.getClass(), "file", null);
        setField(term400527, term400527.getClass(), "basePath", null);
        setField(term400527, term400527.getClass(), "fileSeparator", null);
        setBooleanField(term400527, term400527.getClass(), "isInitialized", false);
        setField(term400527, term400527.getClass(), "includePropertyName", "");
        setField(term400527, term400527.getClass(), "keysAsListed", null);
        setField(term400527, term400527.getClass(), "table", null);
        setIntField(term400527, term400527.getClass(), "count", 0);
        setIntField(term400527, term400527.getClass(), "threshold", 0);
        setFloatField(term400527, term400527.getClass(), "loadFactor", 0.0F);
        setIntField(term400527, term400527.getClass(), "modCount", 0);
        setField(term400527, term400527.getClass(), "keySet", null);
        setField(term400527, term400527.getClass(), "entrySet", null);
        setField(term400527, term400527.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setInclude", argTypes, term400397, args);
        assertTrue(recursiveEquals(term400397, term400527));
    }

};


