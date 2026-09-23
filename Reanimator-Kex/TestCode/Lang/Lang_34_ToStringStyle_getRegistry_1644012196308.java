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

public class ToStringStyle_getRegistry_1644012196308 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45089;

    public ToStringStyle_getRegistry_1644012196308() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45089 = newInstance(Class.forName("java.util.WeakHashMap"));
        Object[] term45090 = (Object[]) newArray("java.util.WeakHashMap$Entry", 16);
        Object term45091 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        Object term45093 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantReadWriteLock$Sync$ThreadLocalHoldCounter"));
        Object term45095 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term45096 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term45098 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        Object term45100 = newInstance(Class.forName("java.math.BigDecimal$1"));
        Object term45102 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        Object term45104 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        Object term45106 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        Object term45109 = newInstance(Class.forName("java.lang.InheritableThreadLocal"));
        Object term45111 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        Object term45113 = newInstance(Class.forName("java.lang.StringCoding$1"));
        Object term45115 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        Object term45117 = newInstance(Class.forName("java.lang.ThreadLocal$SuppliedThreadLocal"));
        setField(term45091, term45091.getClass(), "value", null);
        setIntField(term45091, term45091.getClass(), "hash", 545543168);
        setField(term45091, term45091.getClass(), "next", null);
        setIntField(term45093, term45093.getClass(), "threadLocalHashCode", 0);
        setField(term45091, term45091.getClass(), "referent", term45093);
        setField(term45095, term45095.getClass(), "lock", term45096);
        setField(term45095, term45095.getClass(), "head", null);
        setLongField(term45095, term45095.getClass(), "queueLength", 0L);
        setField(term45091, term45091.getClass(), "queue", term45095);
        setField(term45091, term45091.getClass(), "next", null);
        setField(term45091, term45091.getClass(), "discovered", null);
        setElement(term45090, 0, term45091);
        setField(term45098, term45098.getClass(), "value", null);
        setIntField(term45098, term45098.getClass(), "hash", 1527518722);
        setField(term45098, term45098.getClass(), "next", null);
        setIntField(term45100, term45100.getClass(), "threadLocalHashCode", 0);
        setField(term45098, term45098.getClass(), "referent", term45100);
        setField(term45098, term45098.getClass(), "queue", term45095);
        setField(term45098, term45098.getClass(), "next", null);
        setField(term45098, term45098.getClass(), "discovered", null);
        setElement(term45090, 2, term45098);
        setField(term45102, term45102.getClass(), "value", null);
        setIntField(term45102, term45102.getClass(), "hash", 1309095366);
        setField(term45104, term45104.getClass(), "value", null);
        setIntField(term45104, term45104.getClass(), "hash", 101798);
        setField(term45106, term45106.getClass(), "value", null);
        setIntField(term45106, term45106.getClass(), "hash", 811269190);
        setField(term45106, term45106.getClass(), "next", null);
        setField(term45106, term45106.getClass(), "referent", null);
        setField(term45106, term45106.getClass(), "queue", term45095);
        setField(term45106, term45106.getClass(), "next", null);
        setField(term45106, term45106.getClass(), "discovered", null);
        setField(term45104, term45104.getClass(), "next", term45106);
        setField(term45104, term45104.getClass(), "referent", "");
        setField(term45104, term45104.getClass(), "queue", term45095);
        setField(term45104, term45104.getClass(), "next", null);
        setField(term45104, term45104.getClass(), "discovered", null);
        setField(term45102, term45102.getClass(), "next", term45104);
        setIntField(term45109, term45109.getClass(), "threadLocalHashCode", 0);
        setField(term45102, term45102.getClass(), "referent", term45109);
        setField(term45102, term45102.getClass(), "queue", term45095);
        setField(term45102, term45102.getClass(), "next", null);
        setField(term45102, term45102.getClass(), "discovered", null);
        setElement(term45090, 6, term45102);
        setField(term45111, term45111.getClass(), "value", null);
        setIntField(term45111, term45111.getClass(), "hash", 377015608);
        setField(term45111, term45111.getClass(), "next", null);
        setIntField(term45113, term45113.getClass(), "threadLocalHashCode", 0);
        setField(term45111, term45111.getClass(), "referent", term45113);
        setField(term45111, term45111.getClass(), "queue", term45095);
        setField(term45111, term45111.getClass(), "next", null);
        setField(term45111, term45111.getClass(), "discovered", null);
        setElement(term45090, 8, term45111);
        setField(term45115, term45115.getClass(), "value", null);
        setIntField(term45115, term45115.getClass(), "hash", 768192509);
        setField(term45115, term45115.getClass(), "next", null);
        setField(term45117, term45117.getClass(), "supplier", null);
        setIntField(term45117, term45117.getClass(), "threadLocalHashCode", 0);
        setField(term45115, term45115.getClass(), "referent", term45117);
        setField(term45115, term45115.getClass(), "queue", term45095);
        setField(term45115, term45115.getClass(), "next", null);
        setField(term45115, term45115.getClass(), "discovered", null);
        setElement(term45090, 13, term45115);
        setField(term45089, term45089.getClass(), "table", term45090);
        setIntField(term45089, term45089.getClass(), "size", 7);
        setIntField(term45089, term45089.getClass(), "threshold", 12);
        setFloatField(term45089, term45089.getClass(), "loadFactor", 0.75F);
        setField(term45089, term45089.getClass(), "queue", term45095);
        setIntField(term45089, term45089.getClass(), "modCount", 16);
        setField(term45089, term45089.getClass(), "entrySet", null);
        setField(term45089, term45089.getClass(), "keySet", null);
        setField(term45089, term45089.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.ToStringStyle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRegistry", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term45089));
    }

};


