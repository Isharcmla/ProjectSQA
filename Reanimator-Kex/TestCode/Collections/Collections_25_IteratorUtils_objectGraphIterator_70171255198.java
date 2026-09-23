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

public class IteratorUtils_objectGraphIterator_70171255198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78;
     Object term6191;
     Object term6184;

    public IteratorUtils_objectGraphIterator_70171255198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78 = newInstance(Class.forName("java.lang.Object"));
        term6191 = newInstance(Class.forName("java.lang.Object"));
        ArrayDeque term6185 = new ArrayDeque();
        term6184 = newInstance(Class.forName("org.apache.commons.collections4.iterators.ObjectGraphIterator"));
        Object term6189 = newInstance(Class.forName("java.lang.Object"));
        setField(term6184, term6184.getClass(), "stack", term6185);
        setField(term6184, term6184.getClass(), "root", term6189);
        setField(term6184, term6184.getClass(), "transformer", null);
        setBooleanField(term6184, term6184.getClass(), "hasNext", false);
        setField(term6184, term6184.getClass(), "currentIterator", null);
        setField(term6184, term6184.getClass(), "currentValue", null);
        setField(term6184, term6184.getClass(), "lastUsedIterator", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("org.apache.commons.collections4.Transformer");
        Object[] args = new Object[2];
        args[0] = term78;
        args[1] = null;
        Object retValue = callMethod(klass, "objectGraphIterator", argTypes, null, args);
        assertTrue(recursiveEquals(term78, term6191));
        assertTrue(recursiveEquals(retValue, term6184));
    }

};


