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

public class ListOrderedSet_add_1835306602121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21314;

    public ListOrderedSet_add_1835306602121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21314 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term21418 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        setField(term21314, term21314.getClass(), "collection", term21418);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.set.ListOrderedSet");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = 0;
        args[1] = null;
        try {
            callMethod(klass, "add", argTypes, term21314, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


