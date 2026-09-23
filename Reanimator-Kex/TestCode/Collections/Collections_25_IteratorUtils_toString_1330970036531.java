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

public class IteratorUtils_toString_1330970036531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100846;
     Object term101293;
     Object term101294;

    public IteratorUtils_toString_1330970036531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100846 = newInstance(Class.forName("org.apache.commons.collections4.map.AbstractHashedMap$KeySetIterator"));
        term101293 = newInstance(Class.forName("org.apache.commons.collections4.map.AbstractHashedMap$KeySetIterator"));
        setField(term101293, term101293.getClass(), "parent", null);
        setIntField(term101293, term101293.getClass(), "hashIndex", 0);
        setField(term101293, term101293.getClass(), "last", null);
        setField(term101293, term101293.getClass(), "next", null);
        setIntField(term101293, term101293.getClass(), "expectedModCount", 0);
        term101294 = newInstance(Class.forName("org.apache.commons.collections4.map.AbstractHashedMap$KeySetIterator"));
        setField(term101294, term101294.getClass(), "parent", null);
        setIntField(term101294, term101294.getClass(), "hashIndex", 0);
        setField(term101294, term101294.getClass(), "last", null);
        setField(term101294, term101294.getClass(), "next", null);
        setIntField(term101294, term101294.getClass(), "expectedModCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Iterator");
        Object[] args = new Object[1];
        args[0] = term100846;
        Object retValue = callMethod(klass, "toString", argTypes, null, args);
        assertTrue(recursiveEquals(term100846, term101294));
        assertTrue(recursiveEquals(retValue, "[]"));
    }

};


