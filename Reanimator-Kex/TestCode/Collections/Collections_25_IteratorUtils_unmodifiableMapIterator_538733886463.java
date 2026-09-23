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

public class IteratorUtils_unmodifiableMapIterator_538733886463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80932;
     Object term81113;
     Object term81112;

    public IteratorUtils_unmodifiableMapIterator_538733886463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80932 = newInstance(Class.forName("org.apache.commons.collections4.iterators.UnmodifiableOrderedMapIterator"));
        term81113 = newInstance(Class.forName("org.apache.commons.collections4.iterators.UnmodifiableOrderedMapIterator"));
        setField(term81113, term81113.getClass(), "iterator", null);
        term81112 = newInstance(Class.forName("org.apache.commons.collections4.iterators.UnmodifiableOrderedMapIterator"));
        setField(term81112, term81112.getClass(), "iterator", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.collections4.MapIterator");
        Object[] args = new Object[1];
        args[0] = term80932;
        Object retValue = callMethod(klass, "unmodifiableMapIterator", argTypes, null, args);
        assertTrue(recursiveEquals(term80932, term81113));
        assertTrue(recursiveEquals(retValue, term81112));
    }

};


