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

public class IteratorUtils_unmodifiableIterator_802293564284 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38452;
     Object term38461;
     Object term38460;

    public IteratorUtils_unmodifiableIterator_802293564284() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38452 = newInstance(Class.forName("java.util.concurrent.ConcurrentSkipListMap$ValueIterator"));
        term38461 = newInstance(Class.forName("java.util.concurrent.ConcurrentSkipListMap$ValueIterator"));
        setField(term38461, term38461.getClass(), "this$0", null);
        setField(term38461, term38461.getClass(), "lastReturned", null);
        setField(term38461, term38461.getClass(), "next", null);
        setField(term38461, term38461.getClass(), "nextValue", null);
        term38460 = newInstance(Class.forName("org.apache.commons.collections4.iterators.UnmodifiableIterator"));
        Object term38457 = newInstance(Class.forName("java.util.concurrent.ConcurrentSkipListMap$ValueIterator"));
        setField(term38457, term38457.getClass(), "this$0", null);
        setField(term38457, term38457.getClass(), "lastReturned", null);
        setField(term38457, term38457.getClass(), "next", null);
        setField(term38457, term38457.getClass(), "nextValue", null);
        setField(term38460, term38460.getClass(), "iterator", term38457);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Iterator");
        Object[] args = new Object[1];
        args[0] = term38452;
        Object retValue = callMethod(klass, "unmodifiableIterator", argTypes, null, args);
        assertTrue(recursiveEquals(term38452, term38461));
        assertTrue(recursiveEquals(retValue, term38460));
    }

};


