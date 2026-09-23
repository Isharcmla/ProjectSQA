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

public class ToStringStyle_getRegistry_1644012196295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44054;

    public ToStringStyle_getRegistry_1644012196295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44054 = newInstance(Class.forName("java.util.WeakHashMap"));
        Object[] term44055 = (Object[]) newArray("java.util.WeakHashMap$Entry", 16);
        Object term44056 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        Object term44058 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantReadWriteLock$Sync$ThreadLocalHoldCounter"));
        Object term44060 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term44061 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term44063 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        Object term44065 = newInstance(Class.forName("java.math.BigDecimal$1"));
        Object term44067 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        Object term44092 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        Object term44094 = newInstance(Class.forName("java.lang.StringCoding$1"));
        Object term44096 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        Object term44098 = newInstance(Class.forName("java.lang.ThreadLocal$SuppliedThreadLocal"));
        setField(term44056, term44056.getClass(), "value", null);
        setIntField(term44056, term44056.getClass(), "hash", 545543168);
        setField(term44056, term44056.getClass(), "next", null);
        setIntField(term44058, term44058.getClass(), "threadLocalHashCode", 0);
        setField(term44056, term44056.getClass(), "referent", term44058);
        setField(term44060, term44060.getClass(), "lock", term44061);
        setField(term44060, term44060.getClass(), "head", null);
        setLongField(term44060, term44060.getClass(), "queueLength", 0L);
        setField(term44056, term44056.getClass(), "queue", term44060);
        setField(term44056, term44056.getClass(), "next", null);
        setField(term44056, term44056.getClass(), "discovered", null);
        setElement(term44055, 0, term44056);
        setField(term44063, term44063.getClass(), "value", null);
        setIntField(term44063, term44063.getClass(), "hash", 1527518722);
        setField(term44063, term44063.getClass(), "next", null);
        setIntField(term44065, term44065.getClass(), "threadLocalHashCode", 0);
        setField(term44063, term44063.getClass(), "referent", term44065);
        setField(term44063, term44063.getClass(), "queue", term44060);
        setField(term44063, term44063.getClass(), "next", null);
        setField(term44063, term44063.getClass(), "discovered", null);
        setElement(term44055, 2, term44063);
        setField(term44067, term44067.getClass(), "value", null);
        setIntField(term44067, term44067.getClass(), "hash", 811269190);
        setField(term44067, term44067.getClass(), "next", null);
        setField(term44067, term44067.getClass(), "referent", "java.lang.ThreadLocal");
        setField(term44067, term44067.getClass(), "queue", term44060);
        setField(term44067, term44067.getClass(), "next", null);
        setField(term44067, term44067.getClass(), "discovered", null);
        setElement(term44055, 6, term44067);
        setField(term44092, term44092.getClass(), "value", null);
        setIntField(term44092, term44092.getClass(), "hash", 377015608);
        setField(term44092, term44092.getClass(), "next", null);
        setIntField(term44094, term44094.getClass(), "threadLocalHashCode", 0);
        setField(term44092, term44092.getClass(), "referent", term44094);
        setField(term44092, term44092.getClass(), "queue", term44060);
        setField(term44092, term44092.getClass(), "next", null);
        setField(term44092, term44092.getClass(), "discovered", null);
        setElement(term44055, 8, term44092);
        setField(term44096, term44096.getClass(), "value", null);
        setIntField(term44096, term44096.getClass(), "hash", 768192509);
        setField(term44096, term44096.getClass(), "next", null);
        setField(term44098, term44098.getClass(), "supplier", null);
        setIntField(term44098, term44098.getClass(), "threadLocalHashCode", 0);
        setField(term44096, term44096.getClass(), "referent", term44098);
        setField(term44096, term44096.getClass(), "queue", term44060);
        setField(term44096, term44096.getClass(), "next", null);
        setField(term44096, term44096.getClass(), "discovered", null);
        setElement(term44055, 13, term44096);
        setField(term44054, term44054.getClass(), "table", term44055);
        setIntField(term44054, term44054.getClass(), "size", 5);
        setIntField(term44054, term44054.getClass(), "threshold", 12);
        setFloatField(term44054, term44054.getClass(), "loadFactor", 0.75F);
        setField(term44054, term44054.getClass(), "queue", term44060);
        setIntField(term44054, term44054.getClass(), "modCount", 14);
        setField(term44054, term44054.getClass(), "entrySet", null);
        setField(term44054, term44054.getClass(), "keySet", null);
        setField(term44054, term44054.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.ToStringStyle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRegistry", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term44054));
    }

};


