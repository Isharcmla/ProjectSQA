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

public class ExtendedProperties_testBoolean_1991462572429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term411709;
     Object term411879;

    public ExtendedProperties_testBoolean_1991462572429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term411709 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        term411879 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term411879, term411879.getClass(), "defaults", null);
        setField(term411879, term411879.getClass(), "file", null);
        setField(term411879, term411879.getClass(), "basePath", null);
        setField(term411879, term411879.getClass(), "fileSeparator", null);
        setBooleanField(term411879, term411879.getClass(), "isInitialized", false);
        setField(term411879, term411879.getClass(), "includePropertyName", null);
        setField(term411879, term411879.getClass(), "keysAsListed", null);
        setField(term411879, term411879.getClass(), "table", null);
        setIntField(term411879, term411879.getClass(), "count", 0);
        setIntField(term411879, term411879.getClass(), "threshold", 0);
        setFloatField(term411879, term411879.getClass(), "loadFactor", 0.0F);
        setIntField(term411879, term411879.getClass(), "modCount", 0);
        setField(term411879, term411879.getClass(), "keySet", null);
        setField(term411879, term411879.getClass(), "entrySet", null);
        setField(term411879, term411879.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "testBoolean", argTypes, term411709, args);
        assertTrue(recursiveEquals(term411709, term411879));
        assertTrue(recursiveEquals(retValue, null));
    }

};


