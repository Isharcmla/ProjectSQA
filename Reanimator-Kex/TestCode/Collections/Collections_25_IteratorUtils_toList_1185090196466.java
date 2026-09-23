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
import java.util.ArrayList;

public class IteratorUtils_toList_1185090196466 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81419;
     Object term81769;
     Object term81759;

    public IteratorUtils_toList_1185090196466() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81419 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap$EntryIterator"));
        term81769 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap$EntryIterator"));
        setField(term81769, term81769.getClass(), "map", null);
        setField(term81769, term81769.getClass(), "lastReturned", null);
        setField(term81769, term81769.getClass(), "tab", null);
        setField(term81769, term81769.getClass(), "next", null);
        setField(term81769, term81769.getClass(), "stack", null);
        setField(term81769, term81769.getClass(), "spare", null);
        setIntField(term81769, term81769.getClass(), "index", 0);
        setIntField(term81769, term81769.getClass(), "baseIndex", 0);
        setIntField(term81769, term81769.getClass(), "baseLimit", 0);
        setIntField(term81769, term81769.getClass(), "baseSize", 0);
        term81759 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Iterator");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term81419;
        args[1] = 2;
        Object retValue = callMethod(klass, "toList", argTypes, null, args);
        assertTrue(recursiveEquals(term81419, term81769));
        assertTrue(recursiveEquals(retValue, term81759));
    }

};


