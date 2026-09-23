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

public class IteratorUtils_skippingIterator_1371482584269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34534;
     Object term34697;
     Object term34686;

    public IteratorUtils_skippingIterator_1371482584269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34534 = newInstance(Class.forName("org.apache.commons.collections4.iterators.SkippingIterator"));
        term34697 = newInstance(Class.forName("org.apache.commons.collections4.iterators.SkippingIterator"));
        setLongField(term34697, term34697.getClass(), "offset", 0L);
        setLongField(term34697, term34697.getClass(), "pos", 0L);
        setField(term34697, term34697.getClass(), "iterator", null);
        term34686 = newInstance(Class.forName("org.apache.commons.collections4.iterators.SkippingIterator"));
        Object term34689 = newInstance(Class.forName("org.apache.commons.collections4.iterators.SkippingIterator"));
        setLongField(term34686, term34686.getClass(), "offset", 0L);
        setLongField(term34686, term34686.getClass(), "pos", 0L);
        setLongField(term34689, term34689.getClass(), "offset", 0L);
        setLongField(term34689, term34689.getClass(), "pos", 0L);
        setField(term34689, term34689.getClass(), "iterator", null);
        setField(term34686, term34686.getClass(), "iterator", term34689);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Iterator");
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = term34534;
        args[1] = 0L;
        Object retValue = callMethod(klass, "skippingIterator", argTypes, null, args);
        assertTrue(recursiveEquals(term34534, term34697));
        assertTrue(recursiveEquals(retValue, term34686));
    }

};


