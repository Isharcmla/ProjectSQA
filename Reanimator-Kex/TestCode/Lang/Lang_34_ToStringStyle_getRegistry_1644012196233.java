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

public class ToStringStyle_getRegistry_1644012196233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36414;

    public ToStringStyle_getRegistry_1644012196233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36414 = newInstance(Class.forName("java.util.WeakHashMap"));
        Object[] term36415 = (Object[]) newArray("java.util.WeakHashMap$Entry", 16);
        Object term36416 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        Object term36418 = newInstance(Class.forName("java.lang.Object"));
        Object term36419 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term36420 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        setField(term36416, term36416.getClass(), "value", null);
        setIntField(term36416, term36416.getClass(), "hash", 600279532);
        setField(term36416, term36416.getClass(), "next", null);
        setField(term36416, term36416.getClass(), "referent", term36418);
        setField(term36419, term36419.getClass(), "lock", term36420);
        setField(term36419, term36419.getClass(), "head", null);
        setLongField(term36419, term36419.getClass(), "queueLength", 0L);
        setField(term36416, term36416.getClass(), "queue", term36419);
        setField(term36416, term36416.getClass(), "next", null);
        setField(term36416, term36416.getClass(), "discovered", null);
        setElement(term36415, 12, term36416);
        setField(term36414, term36414.getClass(), "table", term36415);
        setIntField(term36414, term36414.getClass(), "size", 1);
        setIntField(term36414, term36414.getClass(), "threshold", 12);
        setFloatField(term36414, term36414.getClass(), "loadFactor", 0.75F);
        setField(term36414, term36414.getClass(), "queue", term36419);
        setIntField(term36414, term36414.getClass(), "modCount", 3);
        setField(term36414, term36414.getClass(), "entrySet", null);
        setField(term36414, term36414.getClass(), "keySet", null);
        setField(term36414, term36414.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.ToStringStyle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRegistry", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term36414));
    }

};


