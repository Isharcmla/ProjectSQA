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

public class UnmodifiableBoundedCollection_iterator_163289850140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6896;

    public UnmodifiableBoundedCollection_iterator_163289850140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6896 = newInstance(Class.forName("org.apache.commons.collections4.collection.UnmodifiableBoundedCollection"));
        setField(term6896, term6896.getClass(), "collection", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.collection.UnmodifiableBoundedCollection");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "iterator", argTypes, term6896, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


