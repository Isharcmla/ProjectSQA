package org.apache.commons.collections.map;

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
import static org.apache.commons.collections.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.map.EqualityUtils.*;
import java.lang.Object;

public class CaseInsensitiveMap_clone_100371986276 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13039;
     Object term13795;
     Object term13789;

    public CaseInsensitiveMap_clone_100371986276() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13039 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        Object[] term12893 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 0);
        setField(term13039, term13039.getClass(), "data", term12893);
        term13795 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        Object[] term13796 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 0);
        setFloatField(term13795, term13795.getClass(), "loadFactor", 0.0F);
        setIntField(term13795, term13795.getClass(), "size", 0);
        setField(term13795, term13795.getClass(), "data", term13796);
        setIntField(term13795, term13795.getClass(), "threshold", 0);
        setIntField(term13795, term13795.getClass(), "modCount", 0);
        setField(term13795, term13795.getClass(), "entrySet", null);
        setField(term13795, term13795.getClass(), "keySet", null);
        setField(term13795, term13795.getClass(), "values", null);
        setField(term13795, term13795.getClass(), "keySet", null);
        setField(term13795, term13795.getClass(), "values", null);
        term13789 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        Object[] term13792 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 0);
        setFloatField(term13789, term13789.getClass(), "loadFactor", 0.0F);
        setIntField(term13789, term13789.getClass(), "size", 0);
        setField(term13789, term13789.getClass(), "data", term13792);
        setIntField(term13789, term13789.getClass(), "threshold", 0);
        setIntField(term13789, term13789.getClass(), "modCount", 0);
        setField(term13789, term13789.getClass(), "entrySet", null);
        setField(term13789, term13789.getClass(), "keySet", null);
        setField(term13789, term13789.getClass(), "values", null);
        setField(term13789, term13789.getClass(), "keySet", null);
        setField(term13789, term13789.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "clone", argTypes, term13039, args);
        assertTrue(recursiveEquals(term13039, term13795));
        assertTrue(recursiveEquals(retValue, term13789));
    }

};


