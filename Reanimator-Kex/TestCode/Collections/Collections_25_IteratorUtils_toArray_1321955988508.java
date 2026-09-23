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

public class IteratorUtils_toArray_1321955988508 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93527;
     Object term94433;
     Object term94432;

    public IteratorUtils_toArray_1321955988508() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term93687 = new LinkedList();
        term93527 = newInstance(Class.forName("org.apache.commons.collections4.iterators.IteratorChain"));
        Object term93633 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap$KeyIterator"));
        setBooleanField(term93527, term93527.getClass(), "isLocked", false);
        setField(term93527, term93527.getClass(), "currentIterator", term93633);
        setField(term93527, term93527.getClass(), "iteratorChain", term93687);
        LinkedList term94434 = new LinkedList();
        term94433 = newInstance(Class.forName("org.apache.commons.collections4.iterators.IteratorChain"));
        Object term94435 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap$KeyIterator"));
        setField(term94433, term94433.getClass(), "iteratorChain", term94434);
        setField(term94435, term94435.getClass(), "map", null);
        setField(term94435, term94435.getClass(), "lastReturned", null);
        setField(term94435, term94435.getClass(), "tab", null);
        setField(term94435, term94435.getClass(), "next", null);
        setField(term94435, term94435.getClass(), "stack", null);
        setField(term94435, term94435.getClass(), "spare", null);
        setIntField(term94435, term94435.getClass(), "index", 0);
        setIntField(term94435, term94435.getClass(), "baseIndex", 0);
        setIntField(term94435, term94435.getClass(), "baseLimit", 0);
        setIntField(term94435, term94435.getClass(), "baseSize", 0);
        setField(term94433, term94433.getClass(), "currentIterator", term94435);
        setField(term94433, term94433.getClass(), "lastUsedIterator", term94435);
        setBooleanField(term94433, term94433.getClass(), "isLocked", true);
        term94432 = (Object[]) newArray("java.lang.Object", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Iterator");
        Object[] args = new Object[1];
        args[0] = term93527;
        Object retValue = callMethod(klass, "toArray", argTypes, null, args);
        assertTrue(recursiveEquals(term93527, term94433));
        assertTrue(recursiveEquals(retValue, term94432));
    }

};


