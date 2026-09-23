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

public class IteratorUtils_boundedIterator_867119908321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44319;
     Object term44481;
     Object term44471;

    public IteratorUtils_boundedIterator_867119908321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44319 = newInstance(Class.forName("org.apache.commons.collections4.iterators.BoundedIterator"));
        term44481 = newInstance(Class.forName("org.apache.commons.collections4.iterators.BoundedIterator"));
        setField(term44481, term44481.getClass(), "iterator", null);
        setLongField(term44481, term44481.getClass(), "offset", 0L);
        setLongField(term44481, term44481.getClass(), "max", 0L);
        setLongField(term44481, term44481.getClass(), "pos", 0L);
        term44471 = newInstance(Class.forName("org.apache.commons.collections4.iterators.BoundedIterator"));
        Object term44472 = newInstance(Class.forName("org.apache.commons.collections4.iterators.BoundedIterator"));
        setField(term44472, term44472.getClass(), "iterator", null);
        setLongField(term44472, term44472.getClass(), "offset", 0L);
        setLongField(term44472, term44472.getClass(), "max", 0L);
        setLongField(term44472, term44472.getClass(), "pos", 0L);
        setField(term44471, term44471.getClass(), "iterator", term44472);
        setLongField(term44471, term44471.getClass(), "offset", 2147483648L);
        setLongField(term44471, term44471.getClass(), "max", 0L);
        setLongField(term44471, term44471.getClass(), "pos", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.Iterator");
        argTypes[1] = long.class;
        argTypes[2] = long.class;
        Object[] args = new Object[3];
        args[0] = term44319;
        args[1] = 2147483648L;
        args[2] = 0L;
        Object retValue = callMethod(klass, "boundedIterator", argTypes, null, args);
        assertTrue(recursiveEquals(term44319, term44481));
        assertTrue(recursiveEquals(retValue, term44471));
    }

};


