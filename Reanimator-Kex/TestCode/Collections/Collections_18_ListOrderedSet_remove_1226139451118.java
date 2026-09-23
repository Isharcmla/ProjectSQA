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

public class ListOrderedSet_remove_1226139451118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19720;

    public ListOrderedSet_remove_1226139451118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19720 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term19824 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term19928 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term20032 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        setField(term19928, term19928.getClass(), "collection", term20032);
        setField(term19824, term19824.getClass(), "collection", term19928);
        setField(term19720, term19720.getClass(), "collection", term19824);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.set.ListOrderedSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "remove", argTypes, term19720, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


