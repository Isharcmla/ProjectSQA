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
import java.lang.StackOverflowError;
import static org.apache.commons.collections.set.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ListOrderedSet_add_1831621656141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25554;

    public ListOrderedSet_add_1831621656141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25554 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term25658 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        Object term25762 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        setField(term25762, term25762.getClass(), "collection", term25762);
        setField(term25658, term25658.getClass(), "collection", term25762);
        setField(term25554, term25554.getClass(), "collection", term25658);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.set.ListOrderedSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "add", argTypes, term25554, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


