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

public class ExtendedProperties_testBoolean_1991462572323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119096;
     Object term119411;

    public ExtendedProperties_testBoolean_1991462572323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119096 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        term119411 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term119411, term119411.getClass(), "defaults", null);
        setField(term119411, term119411.getClass(), "file", null);
        setField(term119411, term119411.getClass(), "basePath", null);
        setField(term119411, term119411.getClass(), "fileSeparator", null);
        setBooleanField(term119411, term119411.getClass(), "isInitialized", false);
        setField(term119411, term119411.getClass(), "includePropertyName", null);
        setField(term119411, term119411.getClass(), "keysAsListed", null);
        setField(term119411, term119411.getClass(), "table", null);
        setIntField(term119411, term119411.getClass(), "count", 0);
        setIntField(term119411, term119411.getClass(), "threshold", 0);
        setFloatField(term119411, term119411.getClass(), "loadFactor", 0.0F);
        setIntField(term119411, term119411.getClass(), "modCount", 0);
        setField(term119411, term119411.getClass(), "keySet", null);
        setField(term119411, term119411.getClass(), "entrySet", null);
        setField(term119411, term119411.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "off";
        Object retValue = callMethod(klass, "testBoolean", argTypes, term119096, args);
        assertTrue(recursiveEquals(term119096, term119411));
        assertTrue(recursiveEquals(retValue, "false"));
    }

};


