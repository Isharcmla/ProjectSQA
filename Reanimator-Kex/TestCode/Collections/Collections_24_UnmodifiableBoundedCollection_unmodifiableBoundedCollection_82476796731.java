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

public class UnmodifiableBoundedCollection_unmodifiableBoundedCollection_82476796731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5754;
     Object term6012;
     Object term6010;

    public UnmodifiableBoundedCollection_unmodifiableBoundedCollection_82476796731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5754 = newInstance(Class.forName("org.apache.commons.collections4.collection.UnmodifiableBoundedCollection"));
        term6012 = newInstance(Class.forName("org.apache.commons.collections4.collection.UnmodifiableBoundedCollection"));
        setField(term6012, term6012.getClass(), "collection", null);
        term6010 = newInstance(Class.forName("org.apache.commons.collections4.collection.UnmodifiableBoundedCollection"));
        Object term6011 = newInstance(Class.forName("org.apache.commons.collections4.collection.UnmodifiableBoundedCollection"));
        setField(term6011, term6011.getClass(), "collection", null);
        setField(term6010, term6010.getClass(), "collection", term6011);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.collection.UnmodifiableBoundedCollection");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.collections4.BoundedCollection");
        Object[] args = new Object[1];
        args[0] = term5754;
        Object retValue = callMethod(klass, "unmodifiableBoundedCollection", argTypes, null, args);
        assertTrue(recursiveEquals(term5754, term6012));
        assertTrue(recursiveEquals(retValue, term6010));
    }

};


