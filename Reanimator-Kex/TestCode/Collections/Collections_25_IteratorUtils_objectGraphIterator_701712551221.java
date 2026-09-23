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
import java.util.ArrayDeque;
import java.lang.Object;

public class IteratorUtils_objectGraphIterator_701712551221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26283;
     Object term26363;
     Object term26356;

    public IteratorUtils_objectGraphIterator_701712551221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26283 = newInstance(Class.forName("java.util.AbstractMap$1$1"));
        term26363 = newInstance(Class.forName("java.util.AbstractMap$1$1"));
        setField(term26363, term26363.getClass(), "i", null);
        setField(term26363, term26363.getClass(), "this$1", null);
        ArrayDeque term26357 = new ArrayDeque();
        term26356 = newInstance(Class.forName("org.apache.commons.collections4.iterators.ObjectGraphIterator"));
        Object term26362 = newInstance(Class.forName("java.util.AbstractMap$1$1"));
        setField(term26356, term26356.getClass(), "stack", term26357);
        setField(term26356, term26356.getClass(), "root", null);
        setField(term26356, term26356.getClass(), "transformer", null);
        setBooleanField(term26356, term26356.getClass(), "hasNext", false);
        setField(term26362, term26362.getClass(), "i", null);
        setField(term26362, term26362.getClass(), "this$1", null);
        setField(term26356, term26356.getClass(), "currentIterator", term26362);
        setField(term26356, term26356.getClass(), "currentValue", null);
        setField(term26356, term26356.getClass(), "lastUsedIterator", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("org.apache.commons.collections4.Transformer");
        Object[] args = new Object[2];
        args[0] = term26283;
        args[1] = null;
        Object retValue = callMethod(klass, "objectGraphIterator", argTypes, null, args);
        assertTrue(recursiveEquals(term26283, term26363));
        assertTrue(recursiveEquals(retValue, term26356));
    }

};


