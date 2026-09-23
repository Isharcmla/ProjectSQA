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

public class ToStringStyle_getRegistry_1644012196259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39772;

    public ToStringStyle_getRegistry_1644012196259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39772 = newInstance(Class.forName("java.util.WeakHashMap"));
        Object[] term39773 = (Object[]) newArray("java.util.WeakHashMap$Entry", 16);
        Object term39774 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        Object term39776 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantReadWriteLock$Sync$ThreadLocalHoldCounter"));
        Object term39778 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term39779 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term39781 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        Object term39783 = newInstance(Class.forName("java.math.BigDecimal$1"));
        Object term39785 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        Object term39805 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        setField(term39774, term39774.getClass(), "value", null);
        setIntField(term39774, term39774.getClass(), "hash", 545543168);
        setField(term39774, term39774.getClass(), "next", null);
        setIntField(term39776, term39776.getClass(), "threadLocalHashCode", 0);
        setField(term39774, term39774.getClass(), "referent", term39776);
        setField(term39778, term39778.getClass(), "lock", term39779);
        setField(term39778, term39778.getClass(), "head", null);
        setLongField(term39778, term39778.getClass(), "queueLength", 0L);
        setField(term39774, term39774.getClass(), "queue", term39778);
        setField(term39774, term39774.getClass(), "next", null);
        setField(term39774, term39774.getClass(), "discovered", null);
        setElement(term39773, 0, term39774);
        setField(term39781, term39781.getClass(), "value", null);
        setIntField(term39781, term39781.getClass(), "hash", 1527518722);
        setField(term39781, term39781.getClass(), "next", null);
        setIntField(term39783, term39783.getClass(), "threadLocalHashCode", 0);
        setField(term39781, term39781.getClass(), "referent", term39783);
        setField(term39781, term39781.getClass(), "queue", term39778);
        setField(term39781, term39781.getClass(), "next", null);
        setField(term39781, term39781.getClass(), "discovered", null);
        setElement(term39773, 2, term39781);
        setField(term39785, term39785.getClass(), "value", null);
        setIntField(term39785, term39785.getClass(), "hash", 1021505828);
        setField(term39785, term39785.getClass(), "next", null);
        setField(term39785, term39785.getClass(), "referent", "java.lang.Object");
        setField(term39785, term39785.getClass(), "queue", term39778);
        setField(term39785, term39785.getClass(), "next", null);
        setField(term39785, term39785.getClass(), "discovered", null);
        setElement(term39773, 4, term39785);
        setField(term39805, term39805.getClass(), "value", null);
        setIntField(term39805, term39805.getClass(), "hash", -392758470);
        setField(term39805, term39805.getClass(), "next", null);
        setField(term39805, term39805.getClass(), "referent", "org.apache.commons.lang3.builder.ToStringStyle");
        setField(term39805, term39805.getClass(), "queue", term39778);
        setField(term39805, term39805.getClass(), "next", null);
        setField(term39805, term39805.getClass(), "discovered", null);
        setElement(term39773, 10, term39805);
        setField(term39772, term39772.getClass(), "table", term39773);
        setIntField(term39772, term39772.getClass(), "size", 4);
        setIntField(term39772, term39772.getClass(), "threshold", 12);
        setFloatField(term39772, term39772.getClass(), "loadFactor", 0.75F);
        setField(term39772, term39772.getClass(), "queue", term39778);
        setIntField(term39772, term39772.getClass(), "modCount", 7);
        setField(term39772, term39772.getClass(), "entrySet", null);
        setField(term39772, term39772.getClass(), "keySet", null);
        setField(term39772, term39772.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.ToStringStyle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRegistry", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term39772));
    }

};


