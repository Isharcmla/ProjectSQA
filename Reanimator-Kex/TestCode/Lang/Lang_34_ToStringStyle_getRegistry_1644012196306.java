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

public class ToStringStyle_getRegistry_1644012196306 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45038;

    public ToStringStyle_getRegistry_1644012196306() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45038 = newInstance(Class.forName("java.util.WeakHashMap"));
        Object[] term45039 = (Object[]) newArray("java.util.WeakHashMap$Entry", 16);
        Object term45040 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        Object term45042 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantReadWriteLock$Sync$ThreadLocalHoldCounter"));
        Object term45044 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term45045 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term45047 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        Object term45049 = newInstance(Class.forName("java.math.BigDecimal$1"));
        Object term45051 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        Object term45053 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        Object term45055 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        Object term45058 = newInstance(Class.forName("java.lang.InheritableThreadLocal"));
        Object term45060 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        Object term45062 = newInstance(Class.forName("java.lang.StringCoding$1"));
        Object term45064 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        Object term45066 = newInstance(Class.forName("java.lang.ThreadLocal$SuppliedThreadLocal"));
        setField(term45040, term45040.getClass(), "value", null);
        setIntField(term45040, term45040.getClass(), "hash", 545543168);
        setField(term45040, term45040.getClass(), "next", null);
        setIntField(term45042, term45042.getClass(), "threadLocalHashCode", 0);
        setField(term45040, term45040.getClass(), "referent", term45042);
        setField(term45044, term45044.getClass(), "lock", term45045);
        setField(term45044, term45044.getClass(), "head", null);
        setLongField(term45044, term45044.getClass(), "queueLength", 0L);
        setField(term45040, term45040.getClass(), "queue", term45044);
        setField(term45040, term45040.getClass(), "next", null);
        setField(term45040, term45040.getClass(), "discovered", null);
        setElement(term45039, 0, term45040);
        setField(term45047, term45047.getClass(), "value", null);
        setIntField(term45047, term45047.getClass(), "hash", 1527518722);
        setField(term45047, term45047.getClass(), "next", null);
        setIntField(term45049, term45049.getClass(), "threadLocalHashCode", 0);
        setField(term45047, term45047.getClass(), "referent", term45049);
        setField(term45047, term45047.getClass(), "queue", term45044);
        setField(term45047, term45047.getClass(), "next", null);
        setField(term45047, term45047.getClass(), "discovered", null);
        setElement(term45039, 2, term45047);
        setField(term45051, term45051.getClass(), "value", null);
        setIntField(term45051, term45051.getClass(), "hash", 1309095366);
        setField(term45053, term45053.getClass(), "value", null);
        setIntField(term45053, term45053.getClass(), "hash", 101798);
        setField(term45055, term45055.getClass(), "value", null);
        setIntField(term45055, term45055.getClass(), "hash", 811269190);
        setField(term45055, term45055.getClass(), "next", null);
        setField(term45055, term45055.getClass(), "referent", null);
        setField(term45055, term45055.getClass(), "queue", term45044);
        setField(term45055, term45055.getClass(), "next", null);
        setField(term45055, term45055.getClass(), "discovered", null);
        setField(term45053, term45053.getClass(), "next", term45055);
        setField(term45053, term45053.getClass(), "referent", "");
        setField(term45053, term45053.getClass(), "queue", term45044);
        setField(term45053, term45053.getClass(), "next", null);
        setField(term45053, term45053.getClass(), "discovered", null);
        setField(term45051, term45051.getClass(), "next", term45053);
        setIntField(term45058, term45058.getClass(), "threadLocalHashCode", 0);
        setField(term45051, term45051.getClass(), "referent", term45058);
        setField(term45051, term45051.getClass(), "queue", term45044);
        setField(term45051, term45051.getClass(), "next", null);
        setField(term45051, term45051.getClass(), "discovered", null);
        setElement(term45039, 6, term45051);
        setField(term45060, term45060.getClass(), "value", null);
        setIntField(term45060, term45060.getClass(), "hash", 377015608);
        setField(term45060, term45060.getClass(), "next", null);
        setIntField(term45062, term45062.getClass(), "threadLocalHashCode", 0);
        setField(term45060, term45060.getClass(), "referent", term45062);
        setField(term45060, term45060.getClass(), "queue", term45044);
        setField(term45060, term45060.getClass(), "next", null);
        setField(term45060, term45060.getClass(), "discovered", null);
        setElement(term45039, 8, term45060);
        setField(term45064, term45064.getClass(), "value", null);
        setIntField(term45064, term45064.getClass(), "hash", 768192509);
        setField(term45064, term45064.getClass(), "next", null);
        setField(term45066, term45066.getClass(), "supplier", null);
        setIntField(term45066, term45066.getClass(), "threadLocalHashCode", 0);
        setField(term45064, term45064.getClass(), "referent", term45066);
        setField(term45064, term45064.getClass(), "queue", term45044);
        setField(term45064, term45064.getClass(), "next", null);
        setField(term45064, term45064.getClass(), "discovered", null);
        setElement(term45039, 13, term45064);
        setField(term45038, term45038.getClass(), "table", term45039);
        setIntField(term45038, term45038.getClass(), "size", 7);
        setIntField(term45038, term45038.getClass(), "threshold", 12);
        setFloatField(term45038, term45038.getClass(), "loadFactor", 0.75F);
        setField(term45038, term45038.getClass(), "queue", term45044);
        setIntField(term45038, term45038.getClass(), "modCount", 16);
        setField(term45038, term45038.getClass(), "entrySet", null);
        setField(term45038, term45038.getClass(), "keySet", null);
        setField(term45038, term45038.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.ToStringStyle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRegistry", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term45038));
    }

};


