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
import java.lang.ClassCastException;
import static org.apache.commons.collections4.collection.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class UnmodifiableBoundedCollection_decorated_124787741025 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38;

    public UnmodifiableBoundedCollection_decorated_124787741025() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term39 = new ArrayList();
        term38 = newInstance(Class.forName("org.apache.commons.collections4.collection.UnmodifiableBoundedCollection"));
        setField(term38, term38.getClass(), "collection", term39);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.collection.UnmodifiableBoundedCollection");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "decorated", argTypes, term38, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


