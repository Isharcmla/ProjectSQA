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

public class IteratorUtils_boundedIterator_867119908537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103803;
     Object term103821;
     Object term103811;

    public IteratorUtils_boundedIterator_867119908537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103803 = newInstance(Class.forName("org.apache.commons.collections4.iterators.BoundedIterator"));
        term103821 = newInstance(Class.forName("org.apache.commons.collections4.iterators.BoundedIterator"));
        setField(term103821, term103821.getClass(), "iterator", null);
        setLongField(term103821, term103821.getClass(), "offset", 0L);
        setLongField(term103821, term103821.getClass(), "max", 0L);
        setLongField(term103821, term103821.getClass(), "pos", 0L);
        term103811 = newInstance(Class.forName("org.apache.commons.collections4.iterators.BoundedIterator"));
        Object term103812 = newInstance(Class.forName("org.apache.commons.collections4.iterators.BoundedIterator"));
        setField(term103812, term103812.getClass(), "iterator", null);
        setLongField(term103812, term103812.getClass(), "offset", 0L);
        setLongField(term103812, term103812.getClass(), "max", 0L);
        setLongField(term103812, term103812.getClass(), "pos", 0L);
        setField(term103811, term103811.getClass(), "iterator", term103812);
        setLongField(term103811, term103811.getClass(), "offset", 0L);
        setLongField(term103811, term103811.getClass(), "max", 2147483648L);
        setLongField(term103811, term103811.getClass(), "pos", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.Iterator");
        argTypes[1] = long.class;
        argTypes[2] = long.class;
        Object[] args = new Object[3];
        args[0] = term103803;
        args[1] = 0L;
        args[2] = 2147483648L;
        Object retValue = callMethod(klass, "boundedIterator", argTypes, null, args);
        assertTrue(recursiveEquals(term103803, term103821));
        assertTrue(recursiveEquals(retValue, term103811));
    }

};


