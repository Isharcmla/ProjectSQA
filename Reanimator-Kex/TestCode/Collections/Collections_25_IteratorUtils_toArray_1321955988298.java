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

public class IteratorUtils_toArray_1321955988298 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39942;
     Object term40283;
     Object term40282;

    public IteratorUtils_toArray_1321955988298() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term39996 = new LinkedList();
        term39942 = newInstance(Class.forName("org.apache.commons.collections4.iterators.IteratorChain"));
        setBooleanField(term39942, term39942.getClass(), "isLocked", false);
        setField(term39942, term39942.getClass(), "currentIterator", null);
        setField(term39942, term39942.getClass(), "iteratorChain", term39996);
        LinkedList term40284 = new LinkedList();
        term40283 = newInstance(Class.forName("org.apache.commons.collections4.iterators.IteratorChain"));
        Object term40285 = newInstance(Class.forName("org.apache.commons.collections4.iterators.EmptyIterator"));
        setField(term40283, term40283.getClass(), "iteratorChain", term40284);
        setField(term40283, term40283.getClass(), "currentIterator", term40285);
        setField(term40283, term40283.getClass(), "lastUsedIterator", term40285);
        setBooleanField(term40283, term40283.getClass(), "isLocked", true);
        term40282 = (Object[]) newArray("java.lang.Object", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Iterator");
        Object[] args = new Object[1];
        args[0] = term39942;
        Object retValue = callMethod(klass, "toArray", argTypes, null, args);
        assertTrue(recursiveEquals(term39942, term40283));
        assertTrue(recursiveEquals(retValue, term40282));
    }

};


