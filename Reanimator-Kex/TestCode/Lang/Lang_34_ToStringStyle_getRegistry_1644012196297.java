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

public class ToStringStyle_getRegistry_1644012196297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44141;

    public ToStringStyle_getRegistry_1644012196297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44141 = newInstance(Class.forName("java.util.WeakHashMap"));
        Object[] term44142 = (Object[]) newArray("java.util.WeakHashMap$Entry", 16);
        Object term44143 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        Object term44145 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantReadWriteLock$Sync$ThreadLocalHoldCounter"));
        Object term44147 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term44148 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term44150 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        Object term44152 = newInstance(Class.forName("java.math.BigDecimal$1"));
        Object term44154 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        Object term44179 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        Object term44181 = newInstance(Class.forName("java.lang.StringCoding$1"));
        Object term44183 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        Object term44185 = newInstance(Class.forName("java.lang.ThreadLocal$SuppliedThreadLocal"));
        setField(term44143, term44143.getClass(), "value", null);
        setIntField(term44143, term44143.getClass(), "hash", 545543168);
        setField(term44143, term44143.getClass(), "next", null);
        setIntField(term44145, term44145.getClass(), "threadLocalHashCode", 0);
        setField(term44143, term44143.getClass(), "referent", term44145);
        setField(term44147, term44147.getClass(), "lock", term44148);
        setField(term44147, term44147.getClass(), "head", null);
        setLongField(term44147, term44147.getClass(), "queueLength", 0L);
        setField(term44143, term44143.getClass(), "queue", term44147);
        setField(term44143, term44143.getClass(), "next", null);
        setField(term44143, term44143.getClass(), "discovered", null);
        setElement(term44142, 0, term44143);
        setField(term44150, term44150.getClass(), "value", null);
        setIntField(term44150, term44150.getClass(), "hash", 1527518722);
        setField(term44150, term44150.getClass(), "next", null);
        setIntField(term44152, term44152.getClass(), "threadLocalHashCode", 0);
        setField(term44150, term44150.getClass(), "referent", term44152);
        setField(term44150, term44150.getClass(), "queue", term44147);
        setField(term44150, term44150.getClass(), "next", null);
        setField(term44150, term44150.getClass(), "discovered", null);
        setElement(term44142, 2, term44150);
        setField(term44154, term44154.getClass(), "value", null);
        setIntField(term44154, term44154.getClass(), "hash", 811269190);
        setField(term44154, term44154.getClass(), "next", null);
        setField(term44154, term44154.getClass(), "referent", "java.lang.ThreadLocal");
        setField(term44154, term44154.getClass(), "queue", term44147);
        setField(term44154, term44154.getClass(), "next", null);
        setField(term44154, term44154.getClass(), "discovered", null);
        setElement(term44142, 6, term44154);
        setField(term44179, term44179.getClass(), "value", null);
        setIntField(term44179, term44179.getClass(), "hash", 377015608);
        setField(term44179, term44179.getClass(), "next", null);
        setIntField(term44181, term44181.getClass(), "threadLocalHashCode", 0);
        setField(term44179, term44179.getClass(), "referent", term44181);
        setField(term44179, term44179.getClass(), "queue", term44147);
        setField(term44179, term44179.getClass(), "next", null);
        setField(term44179, term44179.getClass(), "discovered", null);
        setElement(term44142, 8, term44179);
        setField(term44183, term44183.getClass(), "value", null);
        setIntField(term44183, term44183.getClass(), "hash", 768192509);
        setField(term44183, term44183.getClass(), "next", null);
        setField(term44185, term44185.getClass(), "supplier", null);
        setIntField(term44185, term44185.getClass(), "threadLocalHashCode", 0);
        setField(term44183, term44183.getClass(), "referent", term44185);
        setField(term44183, term44183.getClass(), "queue", term44147);
        setField(term44183, term44183.getClass(), "next", null);
        setField(term44183, term44183.getClass(), "discovered", null);
        setElement(term44142, 13, term44183);
        setField(term44141, term44141.getClass(), "table", term44142);
        setIntField(term44141, term44141.getClass(), "size", 5);
        setIntField(term44141, term44141.getClass(), "threshold", 12);
        setFloatField(term44141, term44141.getClass(), "loadFactor", 0.75F);
        setField(term44141, term44141.getClass(), "queue", term44147);
        setIntField(term44141, term44141.getClass(), "modCount", 14);
        setField(term44141, term44141.getClass(), "entrySet", null);
        setField(term44141, term44141.getClass(), "keySet", null);
        setField(term44141, term44141.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.ToStringStyle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRegistry", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term44141));
    }

};


