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

public class IteratorUtils_toArray_1321955988394 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60460;
     Object term60911;
     Object term60910;

    public IteratorUtils_toArray_1321955988394() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term60620 = new LinkedList();
        term60460 = newInstance(Class.forName("org.apache.commons.collections4.iterators.IteratorChain"));
        Object term60566 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap$KeyIterator"));
        setBooleanField(term60460, term60460.getClass(), "isLocked", false);
        setField(term60460, term60460.getClass(), "currentIterator", term60566);
        setField(term60460, term60460.getClass(), "iteratorChain", term60620);
        LinkedList term60912 = new LinkedList();
        term60911 = newInstance(Class.forName("org.apache.commons.collections4.iterators.IteratorChain"));
        Object term60913 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap$KeyIterator"));
        setField(term60911, term60911.getClass(), "iteratorChain", term60912);
        setField(term60913, term60913.getClass(), "map", null);
        setField(term60913, term60913.getClass(), "lastReturned", null);
        setField(term60913, term60913.getClass(), "tab", null);
        setField(term60913, term60913.getClass(), "next", null);
        setField(term60913, term60913.getClass(), "stack", null);
        setField(term60913, term60913.getClass(), "spare", null);
        setIntField(term60913, term60913.getClass(), "index", 0);
        setIntField(term60913, term60913.getClass(), "baseIndex", 0);
        setIntField(term60913, term60913.getClass(), "baseLimit", 0);
        setIntField(term60913, term60913.getClass(), "baseSize", 0);
        setField(term60911, term60911.getClass(), "currentIterator", term60913);
        setField(term60911, term60911.getClass(), "lastUsedIterator", term60913);
        setBooleanField(term60911, term60911.getClass(), "isLocked", true);
        term60910 = (Object[]) newArray("java.lang.Object", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Iterator");
        Object[] args = new Object[1];
        args[0] = term60460;
        Object retValue = callMethod(klass, "toArray", argTypes, null, args);
        assertTrue(recursiveEquals(term60460, term60911));
        assertTrue(recursiveEquals(retValue, term60910));
    }

};


