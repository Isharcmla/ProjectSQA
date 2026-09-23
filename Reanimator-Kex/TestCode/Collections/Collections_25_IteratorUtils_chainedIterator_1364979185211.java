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

public class IteratorUtils_chainedIterator_1364979185211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25414;
     Object term25449;
     Object term25441;

    public IteratorUtils_chainedIterator_1364979185211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25414 = new LinkedList();
        term25449 = new LinkedList();
        LinkedList term25442 = new LinkedList();
        term25441 = newInstance(Class.forName("org.apache.commons.collections4.iterators.IteratorChain"));
        setField(term25441, term25441.getClass(), "iteratorChain", term25442);
        setField(term25441, term25441.getClass(), "currentIterator", null);
        setField(term25441, term25441.getClass(), "lastUsedIterator", null);
        setBooleanField(term25441, term25441.getClass(), "isLocked", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = term25414;
        Object retValue = callMethod(klass, "chainedIterator", argTypes, null, args);
        assertTrue(recursiveEquals(term25414, term25449));
        assertTrue(recursiveEquals(retValue, term25441));
    }

};


