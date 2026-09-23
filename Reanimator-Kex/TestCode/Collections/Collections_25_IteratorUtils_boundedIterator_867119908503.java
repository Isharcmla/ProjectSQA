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

public class IteratorUtils_boundedIterator_867119908503 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92713;
     Object term93095;
     Object term93085;

    public IteratorUtils_boundedIterator_867119908503() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92713 = newInstance(Class.forName("java.lang.invoke.AbstractConstantGroup$AsIterator"));
        term93095 = newInstance(Class.forName("java.lang.invoke.AbstractConstantGroup$AsIterator"));
        setField(term93095, term93095.getClass(), "self", null);
        setIntField(term93095, term93095.getClass(), "end", 0);
        setBooleanField(term93095, term93095.getClass(), "resolving", false);
        setField(term93095, term93095.getClass(), "ifNotPresent", null);
        setIntField(term93095, term93095.getClass(), "index", 0);
        term93085 = newInstance(Class.forName("org.apache.commons.collections4.iterators.BoundedIterator"));
        Object term93086 = newInstance(Class.forName("java.lang.invoke.AbstractConstantGroup$AsIterator"));
        setField(term93086, term93086.getClass(), "self", null);
        setIntField(term93086, term93086.getClass(), "end", 0);
        setBooleanField(term93086, term93086.getClass(), "resolving", false);
        setField(term93086, term93086.getClass(), "ifNotPresent", null);
        setIntField(term93086, term93086.getClass(), "index", 0);
        setField(term93085, term93085.getClass(), "iterator", term93086);
        setLongField(term93085, term93085.getClass(), "offset", 4611686018427387904L);
        setLongField(term93085, term93085.getClass(), "max", 0L);
        setLongField(term93085, term93085.getClass(), "pos", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.Iterator");
        argTypes[1] = long.class;
        argTypes[2] = long.class;
        Object[] args = new Object[3];
        args[0] = term92713;
        args[1] = 4611686018427387904L;
        args[2] = 0L;
        Object retValue = callMethod(klass, "boundedIterator", argTypes, null, args);
        assertTrue(recursiveEquals(term92713, term93095));
        assertTrue(recursiveEquals(retValue, term93085));
    }

};


