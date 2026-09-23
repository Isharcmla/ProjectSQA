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

public class ExtendedProperties_subset_483178658581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3059760;
     Object term3059895;

    public ExtendedProperties_subset_483178658581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3059812 = new ArrayList();
        ((ArrayList) term3059812).add((Object)null);
        term3059760 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term3059760, term3059760.getClass(), "keysAsListed", term3059812);
        ArrayList term3059896 = new ArrayList();
        ((ArrayList) term3059896).add((Object)null);
        term3059895 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term3059895, term3059895.getClass(), "defaults", null);
        setField(term3059895, term3059895.getClass(), "file", null);
        setField(term3059895, term3059895.getClass(), "basePath", null);
        setField(term3059895, term3059895.getClass(), "fileSeparator", null);
        setBooleanField(term3059895, term3059895.getClass(), "isInitialized", false);
        setField(term3059895, term3059895.getClass(), "keysAsListed", term3059896);
        setField(term3059895, term3059895.getClass(), "table", null);
        setIntField(term3059895, term3059895.getClass(), "count", 0);
        setIntField(term3059895, term3059895.getClass(), "threshold", 0);
        setFloatField(term3059895, term3059895.getClass(), "loadFactor", 0.0F);
        setIntField(term3059895, term3059895.getClass(), "modCount", 0);
        setField(term3059895, term3059895.getClass(), "keySet", null);
        setField(term3059895, term3059895.getClass(), "entrySet", null);
        setField(term3059895, term3059895.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "subset", argTypes, term3059760, args);
        assertTrue(recursiveEquals(term3059760, term3059895));
        assertTrue(recursiveEquals(retValue, null));
    }

};


