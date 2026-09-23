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
import java.util.LinkedList;
import java.lang.Object;

public class IteratorUtils_chainedIterator_2069177813477 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84148;
     Object term84162;
     Object term84163;
     Object term84150;

    public IteratorUtils_chainedIterator_2069177813477() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84148 = newInstance(Class.forName("org.apache.commons.collections4.iterators.IteratorChain"));
        term84162 = newInstance(Class.forName("org.apache.commons.collections4.iterators.IteratorChain"));
        setField(term84162, term84162.getClass(), "iteratorChain", null);
        setField(term84162, term84162.getClass(), "currentIterator", null);
        setField(term84162, term84162.getClass(), "lastUsedIterator", null);
        setBooleanField(term84162, term84162.getClass(), "isLocked", false);
        term84163 = newInstance(Class.forName("org.apache.commons.collections4.iterators.IteratorChain"));
        setField(term84163, term84163.getClass(), "iteratorChain", null);
        setField(term84163, term84163.getClass(), "currentIterator", null);
        setField(term84163, term84163.getClass(), "lastUsedIterator", null);
        setBooleanField(term84163, term84163.getClass(), "isLocked", false);
        Object term84154 = newInstance(Class.forName("org.apache.commons.collections4.iterators.IteratorChain"));
        setField(term84154, term84154.getClass(), "iteratorChain", null);
        setField(term84154, term84154.getClass(), "currentIterator", null);
        setField(term84154, term84154.getClass(), "lastUsedIterator", null);
        setBooleanField(term84154, term84154.getClass(), "isLocked", false);
        LinkedList term84151 = new LinkedList();
        ((LinkedList) term84151).add(term84154);
        ((LinkedList) term84151).add(term84154);
        term84150 = newInstance(Class.forName("org.apache.commons.collections4.iterators.IteratorChain"));
        setField(term84150, term84150.getClass(), "iteratorChain", term84151);
        setField(term84150, term84150.getClass(), "currentIterator", null);
        setField(term84150, term84150.getClass(), "lastUsedIterator", null);
        setBooleanField(term84150, term84150.getClass(), "isLocked", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Iterator");
        argTypes[1] = Class.forName("java.util.Iterator");
        Object[] args = new Object[2];
        args[0] = term84148;
        args[1] = term84148;
        Object retValue = callMethod(klass, "chainedIterator", argTypes, null, args);
        assertTrue(recursiveEquals(term84148, term84162));
        assertTrue(recursiveEquals(term84148, term84163));
        assertTrue(recursiveEquals(retValue, term84150));
    }

};


