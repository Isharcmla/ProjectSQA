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

public class ToStringStyle_getRegistry_1644012196229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36364;

    public ToStringStyle_getRegistry_1644012196229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36364 = newInstance(Class.forName("java.util.WeakHashMap"));
        Object[] term36365 = (Object[]) newArray("java.util.WeakHashMap$Entry", 16);
        Object term36366 = newInstance(Class.forName("java.util.WeakHashMap$Entry"));
        Object term36368 = newInstance(Class.forName("java.lang.Object"));
        Object term36369 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term36370 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        setField(term36366, term36366.getClass(), "value", null);
        setIntField(term36366, term36366.getClass(), "hash", 600279532);
        setField(term36366, term36366.getClass(), "next", null);
        setField(term36366, term36366.getClass(), "referent", term36368);
        setField(term36369, term36369.getClass(), "lock", term36370);
        setField(term36369, term36369.getClass(), "head", null);
        setLongField(term36369, term36369.getClass(), "queueLength", 0L);
        setField(term36366, term36366.getClass(), "queue", term36369);
        setField(term36366, term36366.getClass(), "next", null);
        setField(term36366, term36366.getClass(), "discovered", null);
        setElement(term36365, 12, term36366);
        setField(term36364, term36364.getClass(), "table", term36365);
        setIntField(term36364, term36364.getClass(), "size", 1);
        setIntField(term36364, term36364.getClass(), "threshold", 12);
        setFloatField(term36364, term36364.getClass(), "loadFactor", 0.75F);
        setField(term36364, term36364.getClass(), "queue", term36369);
        setIntField(term36364, term36364.getClass(), "modCount", 3);
        setField(term36364, term36364.getClass(), "entrySet", null);
        setField(term36364, term36364.getClass(), "keySet", null);
        setField(term36364, term36364.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.ToStringStyle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRegistry", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term36364));
    }

};


