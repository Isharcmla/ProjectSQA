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
import java.util.ArrayList;
import java.lang.Object;

public class ExtendedProperties_subset_483178658485 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128376;
     Object term128807;

    public ExtendedProperties_subset_483178658485() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term128466 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term128428 = new ArrayList();
        ((ArrayList) term128428).add(term128466);
        term128376 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term128376, term128376.getClass(), "keysAsListed", term128428);
        Object term128810 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term128808 = new ArrayList();
        ((ArrayList) term128808).add(term128810);
        term128807 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term128807, term128807.getClass(), "defaults", null);
        setField(term128807, term128807.getClass(), "file", null);
        setField(term128807, term128807.getClass(), "basePath", null);
        setField(term128807, term128807.getClass(), "fileSeparator", null);
        setBooleanField(term128807, term128807.getClass(), "isInitialized", false);
        setField(term128807, term128807.getClass(), "includePropertyName", null);
        setField(term128807, term128807.getClass(), "keysAsListed", term128808);
        setField(term128807, term128807.getClass(), "table", null);
        setIntField(term128807, term128807.getClass(), "count", 0);
        setIntField(term128807, term128807.getClass(), "threshold", 0);
        setFloatField(term128807, term128807.getClass(), "loadFactor", 0.0F);
        setIntField(term128807, term128807.getClass(), "modCount", 0);
        setField(term128807, term128807.getClass(), "keySet", null);
        setField(term128807, term128807.getClass(), "entrySet", null);
        setField(term128807, term128807.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "subset", argTypes, term128376, args);
        assertTrue(recursiveEquals(term128376, term128807));
        assertTrue(recursiveEquals(retValue, null));
    }

};


