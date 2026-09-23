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

public class IteratorUtils_boundedIterator_867119908229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27186;
     Object term27204;
     Object term27194;

    public IteratorUtils_boundedIterator_867119908229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27186 = newInstance(Class.forName("org.apache.commons.collections4.iterators.BoundedIterator"));
        term27204 = newInstance(Class.forName("org.apache.commons.collections4.iterators.BoundedIterator"));
        setField(term27204, term27204.getClass(), "iterator", null);
        setLongField(term27204, term27204.getClass(), "offset", 0L);
        setLongField(term27204, term27204.getClass(), "max", 0L);
        setLongField(term27204, term27204.getClass(), "pos", 0L);
        term27194 = newInstance(Class.forName("org.apache.commons.collections4.iterators.BoundedIterator"));
        Object term27195 = newInstance(Class.forName("org.apache.commons.collections4.iterators.BoundedIterator"));
        setField(term27195, term27195.getClass(), "iterator", null);
        setLongField(term27195, term27195.getClass(), "offset", 0L);
        setLongField(term27195, term27195.getClass(), "max", 0L);
        setLongField(term27195, term27195.getClass(), "pos", 0L);
        setField(term27194, term27194.getClass(), "iterator", term27195);
        setLongField(term27194, term27194.getClass(), "offset", 0L);
        setLongField(term27194, term27194.getClass(), "max", 0L);
        setLongField(term27194, term27194.getClass(), "pos", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.Iterator");
        argTypes[1] = long.class;
        argTypes[2] = long.class;
        Object[] args = new Object[3];
        args[0] = term27186;
        args[1] = 0L;
        args[2] = 0L;
        Object retValue = callMethod(klass, "boundedIterator", argTypes, null, args);
        assertTrue(recursiveEquals(term27186, term27204));
        assertTrue(recursiveEquals(retValue, term27194));
    }

};


