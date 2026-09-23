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

public class ExtendedProperties_testBoolean_1991462572161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84995;
     Object term85298;

    public ExtendedProperties_testBoolean_1991462572161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84995 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        term85298 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term85298, term85298.getClass(), "defaults", null);
        setField(term85298, term85298.getClass(), "file", null);
        setField(term85298, term85298.getClass(), "basePath", null);
        setField(term85298, term85298.getClass(), "fileSeparator", null);
        setBooleanField(term85298, term85298.getClass(), "isInitialized", false);
        setField(term85298, term85298.getClass(), "includePropertyName", null);
        setField(term85298, term85298.getClass(), "keysAsListed", null);
        setField(term85298, term85298.getClass(), "table", null);
        setIntField(term85298, term85298.getClass(), "count", 0);
        setIntField(term85298, term85298.getClass(), "threshold", 0);
        setFloatField(term85298, term85298.getClass(), "loadFactor", 0.0F);
        setIntField(term85298, term85298.getClass(), "modCount", 0);
        setField(term85298, term85298.getClass(), "keySet", null);
        setField(term85298, term85298.getClass(), "entrySet", null);
        setField(term85298, term85298.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "testBoolean", argTypes, term84995, args);
        assertTrue(recursiveEquals(term84995, term85298));
        assertTrue(recursiveEquals(retValue, null));
    }

};


