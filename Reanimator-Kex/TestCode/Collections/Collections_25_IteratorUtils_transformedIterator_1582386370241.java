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

public class IteratorUtils_transformedIterator_1582386370241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29026;
     Object term29154;
     Object term29438;
     Object term29439;
     Object term29432;

    public IteratorUtils_transformedIterator_1582386370241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29026 = newInstance(Class.forName("org.apache.commons.collections4.iterators.ArrayIterator"));
        term29154 = newInstance(Class.forName("org.apache.commons.collections4.functors.ExceptionTransformer"));
        term29438 = newInstance(Class.forName("org.apache.commons.collections4.iterators.ArrayIterator"));
        setField(term29438, term29438.getClass(), "array", null);
        setIntField(term29438, term29438.getClass(), "startIndex", 0);
        setIntField(term29438, term29438.getClass(), "endIndex", 0);
        setIntField(term29438, term29438.getClass(), "index", 0);
        term29439 = newInstance(Class.forName("org.apache.commons.collections4.functors.ExceptionTransformer"));
        term29432 = newInstance(Class.forName("org.apache.commons.collections4.iterators.TransformIterator"));
        Object term29433 = newInstance(Class.forName("org.apache.commons.collections4.iterators.ArrayIterator"));
        Object term29437 = newInstance(Class.forName("org.apache.commons.collections4.functors.ExceptionTransformer"));
        setField(term29433, term29433.getClass(), "array", null);
        setIntField(term29433, term29433.getClass(), "startIndex", 0);
        setIntField(term29433, term29433.getClass(), "endIndex", 0);
        setIntField(term29433, term29433.getClass(), "index", 0);
        setField(term29432, term29432.getClass(), "iterator", term29433);
        setField(term29432, term29432.getClass(), "transformer", term29437);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Iterator");
        argTypes[1] = Class.forName("org.apache.commons.collections4.Transformer");
        Object[] args = new Object[2];
        args[0] = term29026;
        args[1] = term29154;
        Object retValue = callMethod(klass, "transformedIterator", argTypes, null, args);
        assertTrue(recursiveEquals(term29026, term29438));
        assertTrue(recursiveEquals(term29154, term29439));
        assertTrue(recursiveEquals(retValue, term29432));
    }

};


