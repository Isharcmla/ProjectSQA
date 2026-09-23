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

public class ToStringStyle_getRegistry_1644012196283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42560;

    public ToStringStyle_getRegistry_1644012196283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42560 = newInstance(Class.forName("java.util.WeakHashMap"));
        Object[] term42561 = (Object[]) newArray("java.util.WeakHashMap$Entry", 16);
        Object term42562 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        Object term42564 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantReadWriteLock$Sync$ThreadLocalHoldCounter"));
        Object term42566 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term42567 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term42569 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        Object term42571 = newInstance(Class.forName("java.math.BigDecimal$1"));
        Object term42573 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        Object term42593 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        Object term42618 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        Object term42620 = newInstance(Class.forName("java.lang.StringCoding$1"));
        Object term42622 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        Object term42672 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        Object term42674 = newInstance(Class.forName("java.lang.ThreadLocal$SuppliedThreadLocal"));
        setField(term42562, term42562.getClass(), "value", null);
        setIntField(term42562, term42562.getClass(), "hash", 545543168);
        setField(term42562, term42562.getClass(), "next", null);
        setIntField(term42564, term42564.getClass(), "threadLocalHashCode", 0);
        setField(term42562, term42562.getClass(), "referent", term42564);
        setField(term42566, term42566.getClass(), "lock", term42567);
        setField(term42566, term42566.getClass(), "head", null);
        setLongField(term42566, term42566.getClass(), "queueLength", 0L);
        setField(term42562, term42562.getClass(), "queue", term42566);
        setField(term42562, term42562.getClass(), "next", null);
        setField(term42562, term42562.getClass(), "discovered", null);
        setElement(term42561, 0, term42562);
        setField(term42569, term42569.getClass(), "value", null);
        setIntField(term42569, term42569.getClass(), "hash", 1527518722);
        setField(term42569, term42569.getClass(), "next", null);
        setIntField(term42571, term42571.getClass(), "threadLocalHashCode", 0);
        setField(term42569, term42569.getClass(), "referent", term42571);
        setField(term42569, term42569.getClass(), "queue", term42566);
        setField(term42569, term42569.getClass(), "next", null);
        setField(term42569, term42569.getClass(), "discovered", null);
        setElement(term42561, 2, term42569);
        setField(term42573, term42573.getClass(), "value", null);
        setIntField(term42573, term42573.getClass(), "hash", 1021505828);
        setField(term42573, term42573.getClass(), "next", null);
        setField(term42573, term42573.getClass(), "referent", "java.lang.Object");
        setField(term42573, term42573.getClass(), "queue", term42566);
        setField(term42573, term42573.getClass(), "next", null);
        setField(term42573, term42573.getClass(), "discovered", null);
        setElement(term42561, 4, term42573);
        setField(term42593, term42593.getClass(), "value", null);
        setIntField(term42593, term42593.getClass(), "hash", 811269190);
        setField(term42593, term42593.getClass(), "next", null);
        setField(term42593, term42593.getClass(), "referent", "java.lang.ThreadLocal");
        setField(term42593, term42593.getClass(), "queue", term42566);
        setField(term42593, term42593.getClass(), "next", null);
        setField(term42593, term42593.getClass(), "discovered", null);
        setElement(term42561, 6, term42593);
        setField(term42618, term42618.getClass(), "value", null);
        setIntField(term42618, term42618.getClass(), "hash", 377015608);
        setField(term42618, term42618.getClass(), "next", null);
        setIntField(term42620, term42620.getClass(), "threadLocalHashCode", 0);
        setField(term42618, term42618.getClass(), "referent", term42620);
        setField(term42618, term42618.getClass(), "queue", term42566);
        setField(term42618, term42618.getClass(), "next", null);
        setField(term42618, term42618.getClass(), "discovered", null);
        setElement(term42561, 8, term42618);
        setField(term42622, term42622.getClass(), "value", null);
        setIntField(term42622, term42622.getClass(), "hash", -392758470);
        setField(term42622, term42622.getClass(), "next", null);
        setField(term42622, term42622.getClass(), "referent", "org.apache.commons.lang3.builder.ToStringStyle");
        setField(term42622, term42622.getClass(), "queue", term42566);
        setField(term42622, term42622.getClass(), "next", null);
        setField(term42622, term42622.getClass(), "discovered", null);
        setElement(term42561, 10, term42622);
        setField(term42672, term42672.getClass(), "value", null);
        setIntField(term42672, term42672.getClass(), "hash", 768192509);
        setField(term42672, term42672.getClass(), "next", null);
        setField(term42674, term42674.getClass(), "supplier", null);
        setIntField(term42674, term42674.getClass(), "threadLocalHashCode", 0);
        setField(term42672, term42672.getClass(), "referent", term42674);
        setField(term42672, term42672.getClass(), "queue", term42566);
        setField(term42672, term42672.getClass(), "next", null);
        setField(term42672, term42672.getClass(), "discovered", null);
        setElement(term42561, 13, term42672);
        setField(term42560, term42560.getClass(), "table", term42561);
        setIntField(term42560, term42560.getClass(), "size", 7);
        setIntField(term42560, term42560.getClass(), "threshold", 12);
        setFloatField(term42560, term42560.getClass(), "loadFactor", 0.75F);
        setField(term42560, term42560.getClass(), "queue", term42566);
        setIntField(term42560, term42560.getClass(), "modCount", 12);
        setField(term42560, term42560.getClass(), "entrySet", null);
        setField(term42560, term42560.getClass(), "keySet", null);
        setField(term42560, term42560.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.ToStringStyle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRegistry", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term42560));
    }

};


