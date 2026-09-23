package org.apache.commons.collections.set;

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
import static org.apache.commons.collections.set.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.set.EqualityUtils.*;
import java.util.ArrayList;

public class ListOrderedSet_addAll_2024571788102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16092;
     Object term16395;
     Object term16398;

    public ListOrderedSet_addAll_2024571788102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term16118 = new ArrayList();
        term16092 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        setField(term16092, term16092.getClass(), "setOrder", term16118);
        ArrayList term16396 = new ArrayList();
        term16395 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        setField(term16395, term16395.getClass(), "setOrder", term16396);
        setField(term16395, term16395.getClass(), "collection", null);
        ArrayList term16399 = new ArrayList();
        term16398 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        setField(term16398, term16398.getClass(), "setOrder", term16399);
        setField(term16398, term16398.getClass(), "collection", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.set.ListOrderedSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = term16092;
        Object retValue = callMethod(klass, "addAll", argTypes, term16092, args);
        assertTrue(recursiveEquals(term16092, term16395));
        assertTrue(recursiveEquals(term16092, term16398));
        assertTrue(recursiveEquals(retValue, false));
    }

};


