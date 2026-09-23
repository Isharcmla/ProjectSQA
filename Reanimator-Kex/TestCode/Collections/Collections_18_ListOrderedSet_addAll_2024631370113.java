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

public class ListOrderedSet_addAll_2024631370113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18709;
     Object term18761;
     Object term19162;
     Object term19163;

    public ListOrderedSet_addAll_2024631370113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18709 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        term18761 = new ArrayList();
        term19162 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        setField(term19162, term19162.getClass(), "setOrder", null);
        setField(term19162, term19162.getClass(), "collection", null);
        term19163 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.set.ListOrderedSet");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.util.Collection");
        Object[] args = new Object[2];
        args[0] = 0;
        args[1] = term18761;
        Object retValue = callMethod(klass, "addAll", argTypes, term18709, args);
        assertTrue(recursiveEquals(term18709, term19162));
        assertTrue(recursiveEquals(term18761, term19163));
        assertTrue(recursiveEquals(retValue, false));
    }

};


