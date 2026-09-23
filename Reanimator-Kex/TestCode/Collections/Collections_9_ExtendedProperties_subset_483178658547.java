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

public class ExtendedProperties_subset_483178658547 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term217114;
     Object term217458;

    public ExtendedProperties_subset_483178658547() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term217166 = new ArrayList();
        ((ArrayList) term217166).add((Object)null);
        ((ArrayList) term217166).add((Object)null);
        term217114 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term217114, term217114.getClass(), "keysAsListed", term217166);
        ArrayList term217459 = new ArrayList();
        ((ArrayList) term217459).add((Object)null);
        ((ArrayList) term217459).add((Object)null);
        term217458 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term217458, term217458.getClass(), "defaults", null);
        setField(term217458, term217458.getClass(), "file", null);
        setField(term217458, term217458.getClass(), "basePath", null);
        setField(term217458, term217458.getClass(), "fileSeparator", null);
        setBooleanField(term217458, term217458.getClass(), "isInitialized", false);
        setField(term217458, term217458.getClass(), "includePropertyName", null);
        setField(term217458, term217458.getClass(), "keysAsListed", term217459);
        setField(term217458, term217458.getClass(), "table", null);
        setIntField(term217458, term217458.getClass(), "count", 0);
        setIntField(term217458, term217458.getClass(), "threshold", 0);
        setFloatField(term217458, term217458.getClass(), "loadFactor", 0.0F);
        setIntField(term217458, term217458.getClass(), "modCount", 0);
        setField(term217458, term217458.getClass(), "keySet", null);
        setField(term217458, term217458.getClass(), "entrySet", null);
        setField(term217458, term217458.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "subset", argTypes, term217114, args);
        assertTrue(recursiveEquals(term217114, term217458));
        assertTrue(recursiveEquals(retValue, null));
    }

};


