package org.apache.commons.collections4.collection;

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
import static org.apache.commons.collections4.collection.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class UnmodifiableBoundedCollection_isFull_134230402427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4879;

    public UnmodifiableBoundedCollection_isFull_134230402427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4879 = newInstance(Class.forName("org.apache.commons.collections4.collection.UnmodifiableBoundedCollection"));
        Object term5029 = newInstance(Class.forName("org.apache.commons.collections4.collection.UnmodifiableBoundedCollection"));
        setField(term4879, term4879.getClass(), "collection", term5029);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.collection.UnmodifiableBoundedCollection");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "isFull", argTypes, term4879, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


