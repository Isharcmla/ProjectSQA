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

public class IteratorUtils_toArray_1321955988475 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83676;
     Object term83903;
     Object term83904;
     Object term83902;

    public IteratorUtils_toArray_1321955988475() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term83874 = new LinkedList();
        term83676 = newInstance(Class.forName("org.apache.commons.collections4.iterators.IteratorChain"));
        Object term83820 = newInstance(Class.forName("org.apache.commons.collections4.map.AbstractHashedMap$HashMapIterator"));
        setBooleanField(term83676, term83676.getClass(), "isLocked", false);
        setField(term83676, term83676.getClass(), "currentIterator", term83820);
        setField(term83676, term83676.getClass(), "iteratorChain", term83874);
        term83903 = newInstance(Class.forName("org.apache.commons.collections4.map.AbstractHashedMap$HashMapIterator"));
        setField(term83903, term83903.getClass(), "parent", null);
        setIntField(term83903, term83903.getClass(), "hashIndex", 0);
        setField(term83903, term83903.getClass(), "last", null);
        setField(term83903, term83903.getClass(), "next", null);
        setIntField(term83903, term83903.getClass(), "expectedModCount", 0);
        LinkedList term83905 = new LinkedList();
        term83904 = newInstance(Class.forName("org.apache.commons.collections4.iterators.IteratorChain"));
        Object term83906 = newInstance(Class.forName("org.apache.commons.collections4.map.AbstractHashedMap$HashMapIterator"));
        setField(term83904, term83904.getClass(), "iteratorChain", term83905);
        setField(term83906, term83906.getClass(), "parent", null);
        setIntField(term83906, term83906.getClass(), "hashIndex", 0);
        setField(term83906, term83906.getClass(), "last", null);
        setField(term83906, term83906.getClass(), "next", null);
        setIntField(term83906, term83906.getClass(), "expectedModCount", 0);
        setField(term83904, term83904.getClass(), "currentIterator", term83906);
        setField(term83904, term83904.getClass(), "lastUsedIterator", term83906);
        setBooleanField(term83904, term83904.getClass(), "isLocked", true);
        term83902 = (Object[]) newArray("java.lang.Object", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Iterator");
        Object[] args = new Object[1];
        args[0] = term83676;
        Object retValue = callMethod(klass, "toArray", argTypes, null, args);
        assertTrue(recursiveEquals(term83676, term83904));
        assertTrue(recursiveEquals(retValue, term83902));
    }

};


