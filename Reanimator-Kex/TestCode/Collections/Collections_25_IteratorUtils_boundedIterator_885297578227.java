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

public class IteratorUtils_boundedIterator_885297578227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26736;
     Object term27053;
     Object term27049;

    public IteratorUtils_boundedIterator_885297578227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26736 = newInstance(Class.forName("org.apache.commons.collections4.iterators.BoundedIterator"));
        term27053 = newInstance(Class.forName("org.apache.commons.collections4.iterators.BoundedIterator"));
        setField(term27053, term27053.getClass(), "iterator", null);
        setLongField(term27053, term27053.getClass(), "offset", 0L);
        setLongField(term27053, term27053.getClass(), "max", 0L);
        setLongField(term27053, term27053.getClass(), "pos", 0L);
        term27049 = newInstance(Class.forName("org.apache.commons.collections4.iterators.BoundedIterator"));
        Object term27043 = newInstance(Class.forName("org.apache.commons.collections4.iterators.BoundedIterator"));
        setField(term27043, term27043.getClass(), "iterator", null);
        setLongField(term27043, term27043.getClass(), "offset", 0L);
        setLongField(term27043, term27043.getClass(), "max", 0L);
        setLongField(term27043, term27043.getClass(), "pos", 0L);
        setField(term27049, term27049.getClass(), "iterator", term27043);
        setLongField(term27049, term27049.getClass(), "offset", 0L);
        setLongField(term27049, term27049.getClass(), "max", 0L);
        setLongField(term27049, term27049.getClass(), "pos", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Iterator");
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = term26736;
        args[1] = 0L;
        Object retValue = callMethod(klass, "boundedIterator", argTypes, null, args);
        assertTrue(recursiveEquals(term26736, term27053));
        assertTrue(recursiveEquals(retValue, term27049));
    }

};


