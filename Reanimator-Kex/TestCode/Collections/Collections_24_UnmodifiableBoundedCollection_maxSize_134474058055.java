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

public class UnmodifiableBoundedCollection_maxSize_134474058055 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8865;
     Object term14940;

    public UnmodifiableBoundedCollection_maxSize_134474058055() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8865 = newInstance(Class.forName("org.apache.commons.collections4.collection.UnmodifiableBoundedCollection"));
        Object term8981 = newInstance(Class.forName("org.apache.commons.collections4.queue.CircularFifoQueue"));
        setField(term8865, term8865.getClass(), "collection", term8981);
        term14940 = newInstance(Class.forName("org.apache.commons.collections4.collection.UnmodifiableBoundedCollection"));
        Object term14941 = newInstance(Class.forName("org.apache.commons.collections4.queue.CircularFifoQueue"));
        setField(term14941, term14941.getClass(), "elements", null);
        setIntField(term14941, term14941.getClass(), "start", 0);
        setIntField(term14941, term14941.getClass(), "end", 0);
        setBooleanField(term14941, term14941.getClass(), "full", false);
        setIntField(term14941, term14941.getClass(), "maxElements", 0);
        setField(term14940, term14940.getClass(), "collection", term14941);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.collection.UnmodifiableBoundedCollection");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "maxSize", argTypes, term8865, args);
        assertTrue(recursiveEquals(term8865, term14940));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


