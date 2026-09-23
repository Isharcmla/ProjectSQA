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
import java.lang.NullPointerException;
import static org.apache.commons.collections.set.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ListOrderedSet_retainAll_1880074664117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19288;

    public ListOrderedSet_retainAll_1880074664117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19288 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term19392 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term19496 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term19600 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        setField(term19496, term19496.getClass(), "collection", term19600);
        setField(term19392, term19392.getClass(), "collection", term19496);
        setField(term19288, term19288.getClass(), "collection", term19392);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.set.ListOrderedSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "retainAll", argTypes, term19288, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


