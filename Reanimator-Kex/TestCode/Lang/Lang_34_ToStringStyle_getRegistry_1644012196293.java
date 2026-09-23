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

public class ToStringStyle_getRegistry_1644012196293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43967;

    public ToStringStyle_getRegistry_1644012196293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43967 = newInstance(Class.forName("java.util.WeakHashMap"));
        Object[] term43968 = (Object[]) newArray("java.util.WeakHashMap$Entry", 16);
        Object term43969 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        Object term43971 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantReadWriteLock$Sync$ThreadLocalHoldCounter"));
        Object term43973 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term43974 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term43976 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        Object term43978 = newInstance(Class.forName("java.math.BigDecimal$1"));
        Object term43980 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        Object term44005 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        Object term44007 = newInstance(Class.forName("java.lang.StringCoding$1"));
        Object term44009 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        Object term44011 = newInstance(Class.forName("java.lang.ThreadLocal$SuppliedThreadLocal"));
        setField(term43969, term43969.getClass(), "value", null);
        setIntField(term43969, term43969.getClass(), "hash", 545543168);
        setField(term43969, term43969.getClass(), "next", null);
        setIntField(term43971, term43971.getClass(), "threadLocalHashCode", 0);
        setField(term43969, term43969.getClass(), "referent", term43971);
        setField(term43973, term43973.getClass(), "lock", term43974);
        setField(term43973, term43973.getClass(), "head", null);
        setLongField(term43973, term43973.getClass(), "queueLength", 0L);
        setField(term43969, term43969.getClass(), "queue", term43973);
        setField(term43969, term43969.getClass(), "next", null);
        setField(term43969, term43969.getClass(), "discovered", null);
        setElement(term43968, 0, term43969);
        setField(term43976, term43976.getClass(), "value", null);
        setIntField(term43976, term43976.getClass(), "hash", 1527518722);
        setField(term43976, term43976.getClass(), "next", null);
        setIntField(term43978, term43978.getClass(), "threadLocalHashCode", 0);
        setField(term43976, term43976.getClass(), "referent", term43978);
        setField(term43976, term43976.getClass(), "queue", term43973);
        setField(term43976, term43976.getClass(), "next", null);
        setField(term43976, term43976.getClass(), "discovered", null);
        setElement(term43968, 2, term43976);
        setField(term43980, term43980.getClass(), "value", null);
        setIntField(term43980, term43980.getClass(), "hash", 811269190);
        setField(term43980, term43980.getClass(), "next", null);
        setField(term43980, term43980.getClass(), "referent", "java.lang.ThreadLocal");
        setField(term43980, term43980.getClass(), "queue", term43973);
        setField(term43980, term43980.getClass(), "next", null);
        setField(term43980, term43980.getClass(), "discovered", null);
        setElement(term43968, 6, term43980);
        setField(term44005, term44005.getClass(), "value", null);
        setIntField(term44005, term44005.getClass(), "hash", 377015608);
        setField(term44005, term44005.getClass(), "next", null);
        setIntField(term44007, term44007.getClass(), "threadLocalHashCode", 0);
        setField(term44005, term44005.getClass(), "referent", term44007);
        setField(term44005, term44005.getClass(), "queue", term43973);
        setField(term44005, term44005.getClass(), "next", null);
        setField(term44005, term44005.getClass(), "discovered", null);
        setElement(term43968, 8, term44005);
        setField(term44009, term44009.getClass(), "value", null);
        setIntField(term44009, term44009.getClass(), "hash", 768192509);
        setField(term44009, term44009.getClass(), "next", null);
        setField(term44011, term44011.getClass(), "supplier", null);
        setIntField(term44011, term44011.getClass(), "threadLocalHashCode", 0);
        setField(term44009, term44009.getClass(), "referent", term44011);
        setField(term44009, term44009.getClass(), "queue", term43973);
        setField(term44009, term44009.getClass(), "next", null);
        setField(term44009, term44009.getClass(), "discovered", null);
        setElement(term43968, 13, term44009);
        setField(term43967, term43967.getClass(), "table", term43968);
        setIntField(term43967, term43967.getClass(), "size", 5);
        setIntField(term43967, term43967.getClass(), "threshold", 12);
        setFloatField(term43967, term43967.getClass(), "loadFactor", 0.75F);
        setField(term43967, term43967.getClass(), "queue", term43973);
        setIntField(term43967, term43967.getClass(), "modCount", 14);
        setField(term43967, term43967.getClass(), "entrySet", null);
        setField(term43967, term43967.getClass(), "keySet", null);
        setField(term43967, term43967.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.ToStringStyle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRegistry", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term43967));
    }

};


