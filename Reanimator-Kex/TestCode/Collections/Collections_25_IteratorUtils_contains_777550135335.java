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

public class IteratorUtils_contains_777550135335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47285;
     Object term47323;
     Object term47651;
     Object term47652;

    public IteratorUtils_contains_777550135335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47285 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap$KeyIterator"));
        term47323 = newInstance(Class.forName("java.lang.Object"));
        term47651 = newInstance(Class.forName("java.lang.Object"));
        term47652 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap$KeyIterator"));
        setField(term47652, term47652.getClass(), "map", null);
        setField(term47652, term47652.getClass(), "lastReturned", null);
        setField(term47652, term47652.getClass(), "tab", null);
        setField(term47652, term47652.getClass(), "next", null);
        setField(term47652, term47652.getClass(), "stack", null);
        setField(term47652, term47652.getClass(), "spare", null);
        setIntField(term47652, term47652.getClass(), "index", 0);
        setIntField(term47652, term47652.getClass(), "baseIndex", 0);
        setIntField(term47652, term47652.getClass(), "baseLimit", 0);
        setIntField(term47652, term47652.getClass(), "baseSize", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Iterator");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term47285;
        args[1] = term47323;
        callMethod(klass, "contains", argTypes, null, args);
        assertTrue(recursiveEquals(term47285, term47651));
        assertTrue(recursiveEquals(term47323, term47652));
    }

};


