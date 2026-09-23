package org.apache.commons.collections4.collection;

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
import static org.apache.commons.collections4.collection.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections4.collection.EqualityUtils.*;
import java.lang.Object;

public class UnmodifiableBoundedCollection_isFull_134230402457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9455;
     Object term15219;

    public UnmodifiableBoundedCollection_isFull_134230402457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9455 = newInstance(Class.forName("org.apache.commons.collections4.collection.UnmodifiableBoundedCollection"));
        Object term9571 = newInstance(Class.forName("org.apache.commons.collections4.queue.CircularFifoQueue"));
        setField(term9455, term9455.getClass(), "collection", term9571);
        term15219 = newInstance(Class.forName("org.apache.commons.collections4.collection.UnmodifiableBoundedCollection"));
        Object term15220 = newInstance(Class.forName("org.apache.commons.collections4.queue.CircularFifoQueue"));
        setField(term15220, term15220.getClass(), "elements", null);
        setIntField(term15220, term15220.getClass(), "start", 0);
        setIntField(term15220, term15220.getClass(), "end", 0);
        setBooleanField(term15220, term15220.getClass(), "full", false);
        setIntField(term15220, term15220.getClass(), "maxElements", 0);
        setField(term15219, term15219.getClass(), "collection", term15220);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.collection.UnmodifiableBoundedCollection");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isFull", argTypes, term9455, args);
        assertTrue(recursiveEquals(term9455, term15219));
    }

};


