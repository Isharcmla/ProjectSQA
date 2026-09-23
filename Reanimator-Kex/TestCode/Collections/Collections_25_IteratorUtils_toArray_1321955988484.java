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

public class IteratorUtils_toArray_1321955988484 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85674;
     Object term85911;
     Object term85910;

    public IteratorUtils_toArray_1321955988484() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term85728 = new LinkedList();
        term85674 = newInstance(Class.forName("org.apache.commons.collections4.iterators.IteratorChain"));
        setBooleanField(term85674, term85674.getClass(), "isLocked", true);
        setField(term85674, term85674.getClass(), "currentIterator", null);
        setField(term85674, term85674.getClass(), "iteratorChain", term85728);
        LinkedList term85912 = new LinkedList();
        term85911 = newInstance(Class.forName("org.apache.commons.collections4.iterators.IteratorChain"));
        Object term85913 = newInstance(Class.forName("org.apache.commons.collections4.iterators.EmptyIterator"));
        setField(term85911, term85911.getClass(), "iteratorChain", term85912);
        setField(term85911, term85911.getClass(), "currentIterator", term85913);
        setField(term85911, term85911.getClass(), "lastUsedIterator", term85913);
        setBooleanField(term85911, term85911.getClass(), "isLocked", true);
        term85910 = (Object[]) newArray("java.lang.Object", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Iterator");
        Object[] args = new Object[1];
        args[0] = term85674;
        Object retValue = callMethod(klass, "toArray", argTypes, null, args);
        assertTrue(recursiveEquals(term85674, term85911));
        assertTrue(recursiveEquals(retValue, term85910));
    }

};


