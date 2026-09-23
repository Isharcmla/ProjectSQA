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

public class ExtendedProperties_subset_483178658258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105423;
     Object term105639;

    public ExtendedProperties_subset_483178658258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term105475 = new ArrayList();
        ((ArrayList) term105475).add((Object)null);
        ((ArrayList) term105475).add((Object)null);
        term105423 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term105423, term105423.getClass(), "keysAsListed", term105475);
        ArrayList term105640 = new ArrayList();
        ((ArrayList) term105640).add((Object)null);
        ((ArrayList) term105640).add((Object)null);
        term105639 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term105639, term105639.getClass(), "defaults", null);
        setField(term105639, term105639.getClass(), "file", null);
        setField(term105639, term105639.getClass(), "basePath", null);
        setField(term105639, term105639.getClass(), "fileSeparator", null);
        setBooleanField(term105639, term105639.getClass(), "isInitialized", false);
        setField(term105639, term105639.getClass(), "includePropertyName", null);
        setField(term105639, term105639.getClass(), "keysAsListed", term105640);
        setField(term105639, term105639.getClass(), "table", null);
        setIntField(term105639, term105639.getClass(), "count", 0);
        setIntField(term105639, term105639.getClass(), "threshold", 0);
        setFloatField(term105639, term105639.getClass(), "loadFactor", 0.0F);
        setIntField(term105639, term105639.getClass(), "modCount", 0);
        setField(term105639, term105639.getClass(), "keySet", null);
        setField(term105639, term105639.getClass(), "entrySet", null);
        setField(term105639, term105639.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "subset", argTypes, term105423, args);
        assertTrue(recursiveEquals(term105423, term105639));
        assertTrue(recursiveEquals(retValue, null));
    }

};


