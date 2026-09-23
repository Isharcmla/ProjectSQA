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
import static org.apache.commons.collections4.collection.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections4.collection.EqualityUtils.*;
import java.lang.Object;

public class UnmodifiableBoundedCollection_isFull_134230402458 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9733;
     Object term15484;

    public UnmodifiableBoundedCollection_isFull_134230402458() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9733 = newInstance(Class.forName("org.apache.commons.collections4.collection.UnmodifiableBoundedCollection"));
        Object term9839 = newInstance(Class.forName("org.apache.commons.collections4.list.FixedSizeList"));
        setField(term9733, term9733.getClass(), "collection", term9839);
        term15484 = newInstance(Class.forName("org.apache.commons.collections4.collection.UnmodifiableBoundedCollection"));
        Object term15485 = newInstance(Class.forName("org.apache.commons.collections4.list.FixedSizeList"));
        setField(term15485, term15485.getClass(), "collection", null);
        setField(term15484, term15484.getClass(), "collection", term15485);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.collection.UnmodifiableBoundedCollection");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isFull", argTypes, term9733, args);
        assertTrue(recursiveEquals(term9733, term15484));
    }

};


