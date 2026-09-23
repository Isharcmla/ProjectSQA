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

public class ExtendedProperties_testBoolean_1991462572227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72301;
     Object term72391;

    public ExtendedProperties_testBoolean_1991462572227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72301 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        term72391 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term72391, term72391.getClass(), "defaults", null);
        setField(term72391, term72391.getClass(), "file", null);
        setField(term72391, term72391.getClass(), "basePath", null);
        setField(term72391, term72391.getClass(), "fileSeparator", null);
        setBooleanField(term72391, term72391.getClass(), "isInitialized", false);
        setField(term72391, term72391.getClass(), "keysAsListed", null);
        setField(term72391, term72391.getClass(), "table", null);
        setIntField(term72391, term72391.getClass(), "count", 0);
        setIntField(term72391, term72391.getClass(), "threshold", 0);
        setFloatField(term72391, term72391.getClass(), "loadFactor", 0.0F);
        setIntField(term72391, term72391.getClass(), "modCount", 0);
        setField(term72391, term72391.getClass(), "keySet", null);
        setField(term72391, term72391.getClass(), "entrySet", null);
        setField(term72391, term72391.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "false";
        Object retValue = callMethod(klass, "testBoolean", argTypes, term72301, args);
        assertTrue(recursiveEquals(term72301, term72391));
        assertTrue(recursiveEquals(retValue, "false"));
    }

};


