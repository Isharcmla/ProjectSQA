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
import java.util.ArrayDeque;

public class IteratorUtils_pushbackIterator_1023175456494 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88224;
     Object term88655;
     Object term88650;

    public IteratorUtils_pushbackIterator_1023175456494() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88224 = newInstance(Class.forName("org.apache.commons.collections4.list.CursorableLinkedList$SubCursor"));
        term88655 = newInstance(Class.forName("org.apache.commons.collections4.list.CursorableLinkedList$SubCursor"));
        setField(term88655, term88655.getClass(), "sub", null);
        setBooleanField(term88655, term88655.getClass(), "valid", false);
        setBooleanField(term88655, term88655.getClass(), "nextIndexValid", false);
        setBooleanField(term88655, term88655.getClass(), "currentRemovedByAnother", false);
        setField(term88655, term88655.getClass(), "parent", null);
        setField(term88655, term88655.getClass(), "next", null);
        setIntField(term88655, term88655.getClass(), "nextIndex", 0);
        setField(term88655, term88655.getClass(), "current", null);
        setIntField(term88655, term88655.getClass(), "expectedModCount", 0);
        ArrayDeque term88651 = new ArrayDeque();
        term88650 = newInstance(Class.forName("org.apache.commons.collections4.iterators.PushbackIterator"));
        Object term88633 = newInstance(Class.forName("org.apache.commons.collections4.list.CursorableLinkedList$SubCursor"));
        setField(term88633, term88633.getClass(), "sub", null);
        setBooleanField(term88633, term88633.getClass(), "valid", false);
        setBooleanField(term88633, term88633.getClass(), "nextIndexValid", false);
        setBooleanField(term88633, term88633.getClass(), "currentRemovedByAnother", false);
        setField(term88633, term88633.getClass(), "parent", null);
        setField(term88633, term88633.getClass(), "next", null);
        setIntField(term88633, term88633.getClass(), "nextIndex", 0);
        setField(term88633, term88633.getClass(), "current", null);
        setIntField(term88633, term88633.getClass(), "expectedModCount", 0);
        setField(term88650, term88650.getClass(), "iterator", term88633);
        setField(term88650, term88650.getClass(), "items", term88651);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Iterator");
        Object[] args = new Object[1];
        args[0] = term88224;
        Object retValue = callMethod(klass, "pushbackIterator", argTypes, null, args);
        assertTrue(recursiveEquals(term88224, term88655));
        assertTrue(recursiveEquals(retValue, term88650));
    }

};


