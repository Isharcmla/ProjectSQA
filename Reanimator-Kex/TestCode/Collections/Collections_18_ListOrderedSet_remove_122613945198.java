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

public class ListOrderedSet_remove_122613945198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14843;

    public ListOrderedSet_remove_122613945198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14843 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term14947 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term15051 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        setField(term14947, term14947.getClass(), "collection", term15051);
        setField(term14843, term14843.getClass(), "collection", term14947);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.set.ListOrderedSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "remove", argTypes, term14843, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


