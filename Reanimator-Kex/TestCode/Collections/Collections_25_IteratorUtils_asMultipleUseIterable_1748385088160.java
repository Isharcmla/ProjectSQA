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
import java.util.ArrayList;

public class IteratorUtils_asMultipleUseIterable_1748385088160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19506;
     Object term20276;
     Object term20265;

    public IteratorUtils_asMultipleUseIterable_1748385088160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19506 = newInstance(Class.forName("java.util.Spliterators$2Adapter"));
        term20276 = newInstance(Class.forName("java.util.Spliterators$2Adapter"));
        setBooleanField(term20276, term20276.getClass(), "valueReady", false);
        setIntField(term20276, term20276.getClass(), "nextElement", 0);
        setField(term20276, term20276.getClass(), "val$spliterator", null);
        ArrayList term20267 = new ArrayList();
        term20265 = newInstance(Class.forName("org.apache.commons.collections4.iterators.IteratorIterable"));
        Object term20266 = newInstance(Class.forName("org.apache.commons.collections4.iterators.ListIteratorWrapper"));
        Object term20250 = newInstance(Class.forName("java.util.Spliterators$2Adapter"));
        Object term20274 = newInstance(Class.forName("org.apache.commons.collections4.iterators.IteratorIterable$1"));
        setBooleanField(term20250, term20250.getClass(), "valueReady", false);
        setIntField(term20250, term20250.getClass(), "nextElement", 0);
        setField(term20250, term20250.getClass(), "val$spliterator", null);
        setField(term20266, term20266.getClass(), "iterator", term20250);
        setField(term20266, term20266.getClass(), "list", term20267);
        setIntField(term20266, term20266.getClass(), "currentIndex", 0);
        setIntField(term20266, term20266.getClass(), "wrappedIteratorIndex", 0);
        setBooleanField(term20266, term20266.getClass(), "removeState", false);
        setField(term20265, term20265.getClass(), "iterator", term20266);
        setField(term20274, term20274.getClass(), "val$iterator", term20266);
        setField(term20265, term20265.getClass(), "typeSafeIterator", term20274);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Iterator");
        Object[] args = new Object[1];
        args[0] = term19506;
        Object retValue = callMethod(klass, "asMultipleUseIterable", argTypes, null, args);
        assertTrue(recursiveEquals(term19506, term20276));
        assertTrue(recursiveEquals(retValue, term20265));
    }

};


