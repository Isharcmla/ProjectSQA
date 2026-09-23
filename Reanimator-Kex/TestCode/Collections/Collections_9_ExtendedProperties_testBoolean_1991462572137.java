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

public class ExtendedProperties_testBoolean_1991462572137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81912;
     Object term81965;

    public ExtendedProperties_testBoolean_1991462572137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81912 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        term81965 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term81965, term81965.getClass(), "defaults", null);
        setField(term81965, term81965.getClass(), "file", null);
        setField(term81965, term81965.getClass(), "basePath", null);
        setField(term81965, term81965.getClass(), "fileSeparator", null);
        setBooleanField(term81965, term81965.getClass(), "isInitialized", false);
        setField(term81965, term81965.getClass(), "includePropertyName", null);
        setField(term81965, term81965.getClass(), "keysAsListed", null);
        setField(term81965, term81965.getClass(), "table", null);
        setIntField(term81965, term81965.getClass(), "count", 0);
        setIntField(term81965, term81965.getClass(), "threshold", 0);
        setFloatField(term81965, term81965.getClass(), "loadFactor", 0.0F);
        setIntField(term81965, term81965.getClass(), "modCount", 0);
        setField(term81965, term81965.getClass(), "keySet", null);
        setField(term81965, term81965.getClass(), "entrySet", null);
        setField(term81965, term81965.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "testBoolean", argTypes, term81912, args);
        assertTrue(recursiveEquals(term81912, term81965));
        assertTrue(recursiveEquals(retValue, null));
    }

};


