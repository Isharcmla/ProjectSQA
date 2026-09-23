package org.apache.commons.lang3.builder;

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
import static org.apache.commons.lang3.builder.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.builder.EqualityUtils.*;
import java.lang.Object;

public class ToStringStyle_getRegistry_1644012196263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40303;

    public ToStringStyle_getRegistry_1644012196263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40303 = newInstance(Class.forName("java.util.WeakHashMap"));
        Object[] term40304 = (Object[]) newArray("java.util.WeakHashMap$Entry", 16);
        Object term40305 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        Object term40307 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantReadWriteLock$Sync$ThreadLocalHoldCounter"));
        Object term40309 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term40310 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term40312 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        Object term40314 = newInstance(Class.forName("java.math.BigDecimal$1"));
        Object term40316 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        Object term40336 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        Object term40338 = newInstance(Class.forName("java.lang.StringCoding$1"));
        Object term40340 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        setField(term40305, term40305.getClass(), "value", null);
        setIntField(term40305, term40305.getClass(), "hash", 545543168);
        setField(term40305, term40305.getClass(), "next", null);
        setIntField(term40307, term40307.getClass(), "threadLocalHashCode", 0);
        setField(term40305, term40305.getClass(), "referent", term40307);
        setField(term40309, term40309.getClass(), "lock", term40310);
        setField(term40309, term40309.getClass(), "head", null);
        setLongField(term40309, term40309.getClass(), "queueLength", 0L);
        setField(term40305, term40305.getClass(), "queue", term40309);
        setField(term40305, term40305.getClass(), "next", null);
        setField(term40305, term40305.getClass(), "discovered", null);
        setElement(term40304, 0, term40305);
        setField(term40312, term40312.getClass(), "value", null);
        setIntField(term40312, term40312.getClass(), "hash", 1527518722);
        setField(term40312, term40312.getClass(), "next", null);
        setIntField(term40314, term40314.getClass(), "threadLocalHashCode", 0);
        setField(term40312, term40312.getClass(), "referent", term40314);
        setField(term40312, term40312.getClass(), "queue", term40309);
        setField(term40312, term40312.getClass(), "next", null);
        setField(term40312, term40312.getClass(), "discovered", null);
        setElement(term40304, 2, term40312);
        setField(term40316, term40316.getClass(), "value", null);
        setIntField(term40316, term40316.getClass(), "hash", 1021505828);
        setField(term40316, term40316.getClass(), "next", null);
        setField(term40316, term40316.getClass(), "referent", "java.lang.Object");
        setField(term40316, term40316.getClass(), "queue", term40309);
        setField(term40316, term40316.getClass(), "next", null);
        setField(term40316, term40316.getClass(), "discovered", null);
        setElement(term40304, 4, term40316);
        setField(term40336, term40336.getClass(), "value", null);
        setIntField(term40336, term40336.getClass(), "hash", 377015608);
        setField(term40336, term40336.getClass(), "next", null);
        setIntField(term40338, term40338.getClass(), "threadLocalHashCode", 0);
        setField(term40336, term40336.getClass(), "referent", term40338);
        setField(term40336, term40336.getClass(), "queue", term40309);
        setField(term40336, term40336.getClass(), "next", null);
        setField(term40336, term40336.getClass(), "discovered", null);
        setElement(term40304, 8, term40336);
        setField(term40340, term40340.getClass(), "value", null);
        setIntField(term40340, term40340.getClass(), "hash", -392758470);
        setField(term40340, term40340.getClass(), "next", null);
        setField(term40340, term40340.getClass(), "referent", "org.apache.commons.lang3.builder.ToStringStyle");
        setField(term40340, term40340.getClass(), "queue", term40309);
        setField(term40340, term40340.getClass(), "next", null);
        setField(term40340, term40340.getClass(), "discovered", null);
        setElement(term40304, 10, term40340);
        setField(term40303, term40303.getClass(), "table", term40304);
        setIntField(term40303, term40303.getClass(), "size", 5);
        setIntField(term40303, term40303.getClass(), "threshold", 12);
        setFloatField(term40303, term40303.getClass(), "loadFactor", 0.75F);
        setField(term40303, term40303.getClass(), "queue", term40309);
        setIntField(term40303, term40303.getClass(), "modCount", 8);
        setField(term40303, term40303.getClass(), "entrySet", null);
        setField(term40303, term40303.getClass(), "keySet", null);
        setField(term40303, term40303.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.ToStringStyle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRegistry", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term40303));
    }

};


