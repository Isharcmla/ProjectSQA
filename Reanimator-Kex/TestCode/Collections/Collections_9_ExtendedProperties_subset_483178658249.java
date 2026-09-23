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

public class ExtendedProperties_subset_483178658249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125314;
     Object term125694;

    public ExtendedProperties_subset_483178658249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term125404 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term125366 = new ArrayList();
        ((ArrayList) term125366).add(term125404);
        term125314 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term125314, term125314.getClass(), "keysAsListed", term125366);
        Object term125697 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term125695 = new ArrayList();
        ((ArrayList) term125695).add(term125697);
        term125694 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term125694, term125694.getClass(), "defaults", null);
        setField(term125694, term125694.getClass(), "file", null);
        setField(term125694, term125694.getClass(), "basePath", null);
        setField(term125694, term125694.getClass(), "fileSeparator", null);
        setBooleanField(term125694, term125694.getClass(), "isInitialized", false);
        setField(term125694, term125694.getClass(), "includePropertyName", null);
        setField(term125694, term125694.getClass(), "keysAsListed", term125695);
        setField(term125694, term125694.getClass(), "table", null);
        setIntField(term125694, term125694.getClass(), "count", 0);
        setIntField(term125694, term125694.getClass(), "threshold", 0);
        setFloatField(term125694, term125694.getClass(), "loadFactor", 0.0F);
        setIntField(term125694, term125694.getClass(), "modCount", 0);
        setField(term125694, term125694.getClass(), "keySet", null);
        setField(term125694, term125694.getClass(), "entrySet", null);
        setField(term125694, term125694.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "subset", argTypes, term125314, args);
        assertTrue(recursiveEquals(term125314, term125694));
        assertTrue(recursiveEquals(retValue, null));
    }

};


