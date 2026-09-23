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

public class ToStringStyle_getRegistry_1644012196301 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44916;

    public ToStringStyle_getRegistry_1644012196301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44916 = newInstance(Class.forName("java.util.WeakHashMap"));
        Object[] term44917 = (Object[]) newArray("java.util.WeakHashMap$Entry", 16);
        Object term44918 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        Object term44920 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantReadWriteLock$Sync$ThreadLocalHoldCounter"));
        Object term44922 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term44923 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term44925 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        Object term44927 = newInstance(Class.forName("java.math.BigDecimal$1"));
        Object term44929 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        Object term44954 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        Object term44956 = newInstance(Class.forName("java.lang.StringCoding$1"));
        Object term44958 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        Object term44960 = newInstance(Class.forName("java.lang.ThreadLocal$SuppliedThreadLocal"));
        setField(term44918, term44918.getClass(), "value", null);
        setIntField(term44918, term44918.getClass(), "hash", 545543168);
        setField(term44918, term44918.getClass(), "next", null);
        setIntField(term44920, term44920.getClass(), "threadLocalHashCode", 0);
        setField(term44918, term44918.getClass(), "referent", term44920);
        setField(term44922, term44922.getClass(), "lock", term44923);
        setField(term44922, term44922.getClass(), "head", null);
        setLongField(term44922, term44922.getClass(), "queueLength", 0L);
        setField(term44918, term44918.getClass(), "queue", term44922);
        setField(term44918, term44918.getClass(), "next", null);
        setField(term44918, term44918.getClass(), "discovered", null);
        setElement(term44917, 0, term44918);
        setField(term44925, term44925.getClass(), "value", null);
        setIntField(term44925, term44925.getClass(), "hash", 1527518722);
        setField(term44925, term44925.getClass(), "next", null);
        setIntField(term44927, term44927.getClass(), "threadLocalHashCode", 0);
        setField(term44925, term44925.getClass(), "referent", term44927);
        setField(term44925, term44925.getClass(), "queue", term44922);
        setField(term44925, term44925.getClass(), "next", null);
        setField(term44925, term44925.getClass(), "discovered", null);
        setElement(term44917, 2, term44925);
        setField(term44929, term44929.getClass(), "value", null);
        setIntField(term44929, term44929.getClass(), "hash", 811269190);
        setField(term44929, term44929.getClass(), "next", null);
        setField(term44929, term44929.getClass(), "referent", "java.lang.ThreadLocal");
        setField(term44929, term44929.getClass(), "queue", term44922);
        setField(term44929, term44929.getClass(), "next", null);
        setField(term44929, term44929.getClass(), "discovered", null);
        setElement(term44917, 6, term44929);
        setField(term44954, term44954.getClass(), "value", null);
        setIntField(term44954, term44954.getClass(), "hash", 377015608);
        setField(term44954, term44954.getClass(), "next", null);
        setIntField(term44956, term44956.getClass(), "threadLocalHashCode", 0);
        setField(term44954, term44954.getClass(), "referent", term44956);
        setField(term44954, term44954.getClass(), "queue", term44922);
        setField(term44954, term44954.getClass(), "next", null);
        setField(term44954, term44954.getClass(), "discovered", null);
        setElement(term44917, 8, term44954);
        setField(term44958, term44958.getClass(), "value", null);
        setIntField(term44958, term44958.getClass(), "hash", 768192509);
        setField(term44958, term44958.getClass(), "next", null);
        setField(term44960, term44960.getClass(), "supplier", null);
        setIntField(term44960, term44960.getClass(), "threadLocalHashCode", 0);
        setField(term44958, term44958.getClass(), "referent", term44960);
        setField(term44958, term44958.getClass(), "queue", term44922);
        setField(term44958, term44958.getClass(), "next", null);
        setField(term44958, term44958.getClass(), "discovered", null);
        setElement(term44917, 13, term44958);
        setField(term44916, term44916.getClass(), "table", term44917);
        setIntField(term44916, term44916.getClass(), "size", 5);
        setIntField(term44916, term44916.getClass(), "threshold", 12);
        setFloatField(term44916, term44916.getClass(), "loadFactor", 0.75F);
        setField(term44916, term44916.getClass(), "queue", term44922);
        setIntField(term44916, term44916.getClass(), "modCount", 14);
        setField(term44916, term44916.getClass(), "entrySet", null);
        setField(term44916, term44916.getClass(), "keySet", null);
        setField(term44916, term44916.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.ToStringStyle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRegistry", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term44916));
    }

};


