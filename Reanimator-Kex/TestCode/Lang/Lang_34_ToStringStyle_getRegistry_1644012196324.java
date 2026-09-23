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

public class ToStringStyle_getRegistry_1644012196324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45501;

    public ToStringStyle_getRegistry_1644012196324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45501 = newInstance(Class.forName("java.util.WeakHashMap"));
        Object[] term45502 = (Object[]) newArray("java.util.WeakHashMap$Entry", 16);
        Object term45503 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        Object term45505 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantReadWriteLock$Sync$ThreadLocalHoldCounter"));
        Object term45507 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term45508 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term45510 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        Object term45512 = newInstance(Class.forName("java.math.BigDecimal$1"));
        Object term45514 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        Object term45516 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        Object term45518 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        Object term45521 = newInstance(Class.forName("java.lang.InheritableThreadLocal"));
        Object term45523 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        Object term45525 = newInstance(Class.forName("java.lang.StringCoding$1"));
        Object term45527 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        Object term45529 = newInstance(Class.forName("java.lang.ThreadLocal$SuppliedThreadLocal"));
        setField(term45503, term45503.getClass(), "value", null);
        setIntField(term45503, term45503.getClass(), "hash", 545543168);
        setField(term45503, term45503.getClass(), "next", null);
        setIntField(term45505, term45505.getClass(), "threadLocalHashCode", 0);
        setField(term45503, term45503.getClass(), "referent", term45505);
        setField(term45507, term45507.getClass(), "lock", term45508);
        setField(term45507, term45507.getClass(), "head", null);
        setLongField(term45507, term45507.getClass(), "queueLength", 0L);
        setField(term45503, term45503.getClass(), "queue", term45507);
        setField(term45503, term45503.getClass(), "next", null);
        setField(term45503, term45503.getClass(), "discovered", null);
        setElement(term45502, 0, term45503);
        setField(term45510, term45510.getClass(), "value", null);
        setIntField(term45510, term45510.getClass(), "hash", 1527518722);
        setField(term45510, term45510.getClass(), "next", null);
        setIntField(term45512, term45512.getClass(), "threadLocalHashCode", 0);
        setField(term45510, term45510.getClass(), "referent", term45512);
        setField(term45510, term45510.getClass(), "queue", term45507);
        setField(term45510, term45510.getClass(), "next", null);
        setField(term45510, term45510.getClass(), "discovered", null);
        setElement(term45502, 2, term45510);
        setField(term45514, term45514.getClass(), "value", null);
        setIntField(term45514, term45514.getClass(), "hash", 1309095366);
        setField(term45516, term45516.getClass(), "value", null);
        setIntField(term45516, term45516.getClass(), "hash", 101798);
        setField(term45518, term45518.getClass(), "value", null);
        setIntField(term45518, term45518.getClass(), "hash", 811269190);
        setField(term45518, term45518.getClass(), "next", null);
        setField(term45518, term45518.getClass(), "referent", null);
        setField(term45518, term45518.getClass(), "queue", term45507);
        setField(term45518, term45518.getClass(), "next", null);
        setField(term45518, term45518.getClass(), "discovered", null);
        setField(term45516, term45516.getClass(), "next", term45518);
        setField(term45516, term45516.getClass(), "referent", "");
        setField(term45516, term45516.getClass(), "queue", term45507);
        setField(term45516, term45516.getClass(), "next", null);
        setField(term45516, term45516.getClass(), "discovered", null);
        setField(term45514, term45514.getClass(), "next", term45516);
        setIntField(term45521, term45521.getClass(), "threadLocalHashCode", 0);
        setField(term45514, term45514.getClass(), "referent", term45521);
        setField(term45514, term45514.getClass(), "queue", term45507);
        setField(term45514, term45514.getClass(), "next", null);
        setField(term45514, term45514.getClass(), "discovered", null);
        setElement(term45502, 6, term45514);
        setField(term45523, term45523.getClass(), "value", null);
        setIntField(term45523, term45523.getClass(), "hash", 377015608);
        setField(term45523, term45523.getClass(), "next", null);
        setIntField(term45525, term45525.getClass(), "threadLocalHashCode", 0);
        setField(term45523, term45523.getClass(), "referent", term45525);
        setField(term45523, term45523.getClass(), "queue", term45507);
        setField(term45523, term45523.getClass(), "next", null);
        setField(term45523, term45523.getClass(), "discovered", null);
        setElement(term45502, 8, term45523);
        setField(term45527, term45527.getClass(), "value", null);
        setIntField(term45527, term45527.getClass(), "hash", 768192509);
        setField(term45527, term45527.getClass(), "next", null);
        setField(term45529, term45529.getClass(), "supplier", null);
        setIntField(term45529, term45529.getClass(), "threadLocalHashCode", 0);
        setField(term45527, term45527.getClass(), "referent", term45529);
        setField(term45527, term45527.getClass(), "queue", term45507);
        setField(term45527, term45527.getClass(), "next", null);
        setField(term45527, term45527.getClass(), "discovered", null);
        setElement(term45502, 13, term45527);
        setField(term45501, term45501.getClass(), "table", term45502);
        setIntField(term45501, term45501.getClass(), "size", 7);
        setIntField(term45501, term45501.getClass(), "threshold", 12);
        setFloatField(term45501, term45501.getClass(), "loadFactor", 0.75F);
        setField(term45501, term45501.getClass(), "queue", term45507);
        setIntField(term45501, term45501.getClass(), "modCount", 16);
        setField(term45501, term45501.getClass(), "entrySet", null);
        setField(term45501, term45501.getClass(), "keySet", null);
        setField(term45501, term45501.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.ToStringStyle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRegistry", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term45501));
    }

};


