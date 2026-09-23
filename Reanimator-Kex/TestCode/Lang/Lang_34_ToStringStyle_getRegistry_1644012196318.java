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

public class ToStringStyle_getRegistry_1644012196318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45346;

    public ToStringStyle_getRegistry_1644012196318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45346 = newInstance(Class.forName("java.util.WeakHashMap"));
        Object[] term45347 = (Object[]) newArray("java.util.WeakHashMap$Entry", 16);
        Object term45348 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        Object term45350 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantReadWriteLock$Sync$ThreadLocalHoldCounter"));
        Object term45352 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term45353 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term45355 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        Object term45357 = newInstance(Class.forName("java.math.BigDecimal$1"));
        Object term45359 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        Object term45361 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        Object term45363 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        Object term45366 = newInstance(Class.forName("java.lang.InheritableThreadLocal"));
        Object term45368 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        Object term45370 = newInstance(Class.forName("java.lang.StringCoding$1"));
        Object term45372 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        Object term45374 = newInstance(Class.forName("java.lang.ThreadLocal$SuppliedThreadLocal"));
        setField(term45348, term45348.getClass(), "value", null);
        setIntField(term45348, term45348.getClass(), "hash", 545543168);
        setField(term45348, term45348.getClass(), "next", null);
        setIntField(term45350, term45350.getClass(), "threadLocalHashCode", 0);
        setField(term45348, term45348.getClass(), "referent", term45350);
        setField(term45352, term45352.getClass(), "lock", term45353);
        setField(term45352, term45352.getClass(), "head", null);
        setLongField(term45352, term45352.getClass(), "queueLength", 0L);
        setField(term45348, term45348.getClass(), "queue", term45352);
        setField(term45348, term45348.getClass(), "next", null);
        setField(term45348, term45348.getClass(), "discovered", null);
        setElement(term45347, 0, term45348);
        setField(term45355, term45355.getClass(), "value", null);
        setIntField(term45355, term45355.getClass(), "hash", 1527518722);
        setField(term45355, term45355.getClass(), "next", null);
        setIntField(term45357, term45357.getClass(), "threadLocalHashCode", 0);
        setField(term45355, term45355.getClass(), "referent", term45357);
        setField(term45355, term45355.getClass(), "queue", term45352);
        setField(term45355, term45355.getClass(), "next", null);
        setField(term45355, term45355.getClass(), "discovered", null);
        setElement(term45347, 2, term45355);
        setField(term45359, term45359.getClass(), "value", null);
        setIntField(term45359, term45359.getClass(), "hash", 1309095366);
        setField(term45361, term45361.getClass(), "value", null);
        setIntField(term45361, term45361.getClass(), "hash", 101798);
        setField(term45363, term45363.getClass(), "value", null);
        setIntField(term45363, term45363.getClass(), "hash", 811269190);
        setField(term45363, term45363.getClass(), "next", null);
        setField(term45363, term45363.getClass(), "referent", null);
        setField(term45363, term45363.getClass(), "queue", term45352);
        setField(term45363, term45363.getClass(), "next", null);
        setField(term45363, term45363.getClass(), "discovered", null);
        setField(term45361, term45361.getClass(), "next", term45363);
        setField(term45361, term45361.getClass(), "referent", "");
        setField(term45361, term45361.getClass(), "queue", term45352);
        setField(term45361, term45361.getClass(), "next", null);
        setField(term45361, term45361.getClass(), "discovered", null);
        setField(term45359, term45359.getClass(), "next", term45361);
        setIntField(term45366, term45366.getClass(), "threadLocalHashCode", 0);
        setField(term45359, term45359.getClass(), "referent", term45366);
        setField(term45359, term45359.getClass(), "queue", term45352);
        setField(term45359, term45359.getClass(), "next", null);
        setField(term45359, term45359.getClass(), "discovered", null);
        setElement(term45347, 6, term45359);
        setField(term45368, term45368.getClass(), "value", null);
        setIntField(term45368, term45368.getClass(), "hash", 377015608);
        setField(term45368, term45368.getClass(), "next", null);
        setIntField(term45370, term45370.getClass(), "threadLocalHashCode", 0);
        setField(term45368, term45368.getClass(), "referent", term45370);
        setField(term45368, term45368.getClass(), "queue", term45352);
        setField(term45368, term45368.getClass(), "next", null);
        setField(term45368, term45368.getClass(), "discovered", null);
        setElement(term45347, 8, term45368);
        setField(term45372, term45372.getClass(), "value", null);
        setIntField(term45372, term45372.getClass(), "hash", 768192509);
        setField(term45372, term45372.getClass(), "next", null);
        setField(term45374, term45374.getClass(), "supplier", null);
        setIntField(term45374, term45374.getClass(), "threadLocalHashCode", 0);
        setField(term45372, term45372.getClass(), "referent", term45374);
        setField(term45372, term45372.getClass(), "queue", term45352);
        setField(term45372, term45372.getClass(), "next", null);
        setField(term45372, term45372.getClass(), "discovered", null);
        setElement(term45347, 13, term45372);
        setField(term45346, term45346.getClass(), "table", term45347);
        setIntField(term45346, term45346.getClass(), "size", 7);
        setIntField(term45346, term45346.getClass(), "threshold", 12);
        setFloatField(term45346, term45346.getClass(), "loadFactor", 0.75F);
        setField(term45346, term45346.getClass(), "queue", term45352);
        setIntField(term45346, term45346.getClass(), "modCount", 16);
        setField(term45346, term45346.getClass(), "entrySet", null);
        setField(term45346, term45346.getClass(), "keySet", null);
        setField(term45346, term45346.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.ToStringStyle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRegistry", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term45346));
    }

};


