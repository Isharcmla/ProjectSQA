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
import java.lang.UnsupportedOperationException;
import static org.apache.commons.collections4.collection.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class UnmodifiableBoundedCollection_remove_148872238620 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20;
     Object term25;

    public UnmodifiableBoundedCollection_remove_148872238620() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term21 = new ArrayList();
        term20 = newInstance(Class.forName("org.apache.commons.collections4.collection.UnmodifiableBoundedCollection"));
        setField(term20, term20.getClass(), "collection", term21);
        term25 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.collection.UnmodifiableBoundedCollection");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term25;
        try {
            callMethod(klass, "remove", argTypes, term20, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


