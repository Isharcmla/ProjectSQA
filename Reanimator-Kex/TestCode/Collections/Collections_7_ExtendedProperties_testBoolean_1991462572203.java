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

public class ExtendedProperties_testBoolean_1991462572203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45870;
     Object term46173;

    public ExtendedProperties_testBoolean_1991462572203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45870 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        term46173 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term46173, term46173.getClass(), "defaults", null);
        setField(term46173, term46173.getClass(), "file", null);
        setField(term46173, term46173.getClass(), "basePath", null);
        setField(term46173, term46173.getClass(), "fileSeparator", null);
        setBooleanField(term46173, term46173.getClass(), "isInitialized", false);
        setField(term46173, term46173.getClass(), "includePropertyName", null);
        setField(term46173, term46173.getClass(), "keysAsListed", null);
        setField(term46173, term46173.getClass(), "table", null);
        setIntField(term46173, term46173.getClass(), "count", 0);
        setIntField(term46173, term46173.getClass(), "threshold", 0);
        setFloatField(term46173, term46173.getClass(), "loadFactor", 0.0F);
        setIntField(term46173, term46173.getClass(), "modCount", 0);
        setField(term46173, term46173.getClass(), "keySet", null);
        setField(term46173, term46173.getClass(), "entrySet", null);
        setField(term46173, term46173.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "testBoolean", argTypes, term45870, args);
        assertTrue(recursiveEquals(term45870, term46173));
        assertTrue(recursiveEquals(retValue, null));
    }

};


