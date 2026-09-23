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
import java.util.LinkedList;

public class IteratorUtils_toArray_1321955988481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84816;
     Object term85409;
     Object term85408;

    public IteratorUtils_toArray_1321955988481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term84976 = new LinkedList();
        term84816 = newInstance(Class.forName("org.apache.commons.collections4.iterators.IteratorChain"));
        Object term84922 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap$KeyIterator"));
        Object term85130 = newInstance(Class.forName("org.apache.commons.collections4.list.AbstractLinkedList$LinkedListIterator"));
        setBooleanField(term84816, term84816.getClass(), "isLocked", false);
        setField(term84816, term84816.getClass(), "currentIterator", term84922);
        setField(term84816, term84816.getClass(), "iteratorChain", term84976);
        setField(term84816, term84816.getClass(), "lastUsedIterator", term85130);
        LinkedList term85410 = new LinkedList();
        term85409 = newInstance(Class.forName("org.apache.commons.collections4.iterators.IteratorChain"));
        Object term85411 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap$KeyIterator"));
        setField(term85409, term85409.getClass(), "iteratorChain", term85410);
        setField(term85411, term85411.getClass(), "map", null);
        setField(term85411, term85411.getClass(), "lastReturned", null);
        setField(term85411, term85411.getClass(), "tab", null);
        setField(term85411, term85411.getClass(), "next", null);
        setField(term85411, term85411.getClass(), "stack", null);
        setField(term85411, term85411.getClass(), "spare", null);
        setIntField(term85411, term85411.getClass(), "index", 0);
        setIntField(term85411, term85411.getClass(), "baseIndex", 0);
        setIntField(term85411, term85411.getClass(), "baseLimit", 0);
        setIntField(term85411, term85411.getClass(), "baseSize", 0);
        setField(term85409, term85409.getClass(), "currentIterator", term85411);
        setField(term85409, term85409.getClass(), "lastUsedIterator", term85411);
        setBooleanField(term85409, term85409.getClass(), "isLocked", true);
        term85408 = (Object[]) newArray("java.lang.Object", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Iterator");
        Object[] args = new Object[1];
        args[0] = term84816;
        Object retValue = callMethod(klass, "toArray", argTypes, null, args);
        assertTrue(recursiveEquals(term84816, term85409));
        assertTrue(recursiveEquals(retValue, term85408));
    }

};


