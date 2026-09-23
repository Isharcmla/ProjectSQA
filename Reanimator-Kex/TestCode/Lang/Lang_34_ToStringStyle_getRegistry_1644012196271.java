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

public class ToStringStyle_getRegistry_1644012196271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41176;

    public ToStringStyle_getRegistry_1644012196271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41176 = newInstance(Class.forName("java.util.WeakHashMap"));
        Object[] term41177 = (Object[]) newArray("java.util.WeakHashMap$Entry", 16);
        Object term41178 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        Object term41180 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantReadWriteLock$Sync$ThreadLocalHoldCounter"));
        Object term41182 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term41183 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term41185 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        Object term41187 = newInstance(Class.forName("java.math.BigDecimal$1"));
        Object term41189 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        Object term41214 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        Object term41216 = newInstance(Class.forName("java.lang.StringCoding$1"));
        Object term41218 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        setField(term41178, term41178.getClass(), "value", null);
        setIntField(term41178, term41178.getClass(), "hash", 545543168);
        setField(term41178, term41178.getClass(), "next", null);
        setIntField(term41180, term41180.getClass(), "threadLocalHashCode", 0);
        setField(term41178, term41178.getClass(), "referent", term41180);
        setField(term41182, term41182.getClass(), "lock", term41183);
        setField(term41182, term41182.getClass(), "head", null);
        setLongField(term41182, term41182.getClass(), "queueLength", 0L);
        setField(term41178, term41178.getClass(), "queue", term41182);
        setField(term41178, term41178.getClass(), "next", null);
        setField(term41178, term41178.getClass(), "discovered", null);
        setElement(term41177, 0, term41178);
        setField(term41185, term41185.getClass(), "value", null);
        setIntField(term41185, term41185.getClass(), "hash", 1527518722);
        setField(term41185, term41185.getClass(), "next", null);
        setIntField(term41187, term41187.getClass(), "threadLocalHashCode", 0);
        setField(term41185, term41185.getClass(), "referent", term41187);
        setField(term41185, term41185.getClass(), "queue", term41182);
        setField(term41185, term41185.getClass(), "next", null);
        setField(term41185, term41185.getClass(), "discovered", null);
        setElement(term41177, 2, term41185);
        setField(term41189, term41189.getClass(), "value", null);
        setIntField(term41189, term41189.getClass(), "hash", 811269190);
        setField(term41189, term41189.getClass(), "next", null);
        setField(term41189, term41189.getClass(), "referent", "java.lang.ThreadLocal");
        setField(term41189, term41189.getClass(), "queue", term41182);
        setField(term41189, term41189.getClass(), "next", null);
        setField(term41189, term41189.getClass(), "discovered", null);
        setElement(term41177, 6, term41189);
        setField(term41214, term41214.getClass(), "value", null);
        setIntField(term41214, term41214.getClass(), "hash", 377015608);
        setField(term41214, term41214.getClass(), "next", null);
        setIntField(term41216, term41216.getClass(), "threadLocalHashCode", 0);
        setField(term41214, term41214.getClass(), "referent", term41216);
        setField(term41214, term41214.getClass(), "queue", term41182);
        setField(term41214, term41214.getClass(), "next", null);
        setField(term41214, term41214.getClass(), "discovered", null);
        setElement(term41177, 8, term41214);
        setField(term41218, term41218.getClass(), "value", null);
        setIntField(term41218, term41218.getClass(), "hash", -392758470);
        setField(term41218, term41218.getClass(), "next", null);
        setField(term41218, term41218.getClass(), "referent", "org.apache.commons.lang3.builder.ToStringStyle");
        setField(term41218, term41218.getClass(), "queue", term41182);
        setField(term41218, term41218.getClass(), "next", null);
        setField(term41218, term41218.getClass(), "discovered", null);
        setElement(term41177, 10, term41218);
        setField(term41176, term41176.getClass(), "table", term41177);
        setIntField(term41176, term41176.getClass(), "size", 5);
        setIntField(term41176, term41176.getClass(), "threshold", 12);
        setFloatField(term41176, term41176.getClass(), "loadFactor", 0.75F);
        setField(term41176, term41176.getClass(), "queue", term41182);
        setIntField(term41176, term41176.getClass(), "modCount", 10);
        setField(term41176, term41176.getClass(), "entrySet", null);
        setField(term41176, term41176.getClass(), "keySet", null);
        setField(term41176, term41176.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.ToStringStyle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRegistry", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term41176));
    }

};


