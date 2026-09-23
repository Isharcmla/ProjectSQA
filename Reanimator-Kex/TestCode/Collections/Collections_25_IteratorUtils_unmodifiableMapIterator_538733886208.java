package org.apache.commons.collections4;

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
import static org.apache.commons.collections4.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections4.EqualityUtils.*;
import java.lang.Object;

public class IteratorUtils_unmodifiableMapIterator_538733886208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25239;
     Object term25328;
     Object term25327;

    public IteratorUtils_unmodifiableMapIterator_538733886208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25239 = newInstance(Class.forName("org.apache.commons.collections4.map.AbstractLinkedMap$LinkMapIterator"));
        term25328 = newInstance(Class.forName("org.apache.commons.collections4.map.AbstractLinkedMap$LinkMapIterator"));
        setField(term25328, term25328.getClass(), "parent", null);
        setField(term25328, term25328.getClass(), "last", null);
        setField(term25328, term25328.getClass(), "next", null);
        setIntField(term25328, term25328.getClass(), "expectedModCount", 0);
        term25327 = newInstance(Class.forName("org.apache.commons.collections4.iterators.UnmodifiableMapIterator"));
        Object term25322 = newInstance(Class.forName("org.apache.commons.collections4.map.AbstractLinkedMap$LinkMapIterator"));
        setField(term25322, term25322.getClass(), "parent", null);
        setField(term25322, term25322.getClass(), "last", null);
        setField(term25322, term25322.getClass(), "next", null);
        setIntField(term25322, term25322.getClass(), "expectedModCount", 0);
        setField(term25327, term25327.getClass(), "iterator", term25322);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.collections4.MapIterator");
        Object[] args = new Object[1];
        args[0] = term25239;
        Object retValue = callMethod(klass, "unmodifiableMapIterator", argTypes, null, args);
        assertTrue(recursiveEquals(term25239, term25328));
        assertTrue(recursiveEquals(retValue, term25327));
    }

};


