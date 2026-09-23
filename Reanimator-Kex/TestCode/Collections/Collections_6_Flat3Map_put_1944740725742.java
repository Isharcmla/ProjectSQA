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

public class Flat3Map_put_1944740725742 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176967;
     Object term177335;
     Object term188730;

    public Flat3Map_put_1944740725742() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176967 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term177059 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term177151 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term177243 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term176967, term176967.getClass(), "delegateMap", null);
        setIntField(term176967, term176967.getClass(), "size", 3);
        setIntField(term176967, term176967.getClass(), "hash3", 0);
        setField(term177059, term177059.getClass(), "delegateMap", null);
        setIntField(term177059, term177059.getClass(), "size", 3);
        setField(term177059, term177059.getClass(), "key3", term177151);
        setField(term177059, term177059.getClass(), "key2", null);
        setField(term177059, term177059.getClass(), "value2", null);
        setIntField(term177059, term177059.getClass(), "hash3", -1);
        setIntField(term177059, term177059.getClass(), "hash2", -1);
        setIntField(term177059, term177059.getClass(), "hash1", -1);
        setField(term176967, term176967.getClass(), "key3", term177059);
        setIntField(term176967, term176967.getClass(), "hash2", 0);
        setField(term176967, term176967.getClass(), "key2", term177243);
        term177335 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term177375 = newInstance(Class.forName("java.io.Console$1"));
        setField(term177335, term177335.getClass(), "delegateMap", null);
        setIntField(term177335, term177335.getClass(), "size", 3);
        setIntField(term177335, term177335.getClass(), "hash3", 0);
        setField(term177335, term177335.getClass(), "value3", null);
        setIntField(term177335, term177335.getClass(), "hash2", 0);
        setField(term177335, term177335.getClass(), "value2", null);
        setIntField(term177335, term177335.getClass(), "hash1", 0);
        setField(term177335, term177335.getClass(), "value1", null);
        setField(term177335, term177335.getClass(), "key3", null);
        setField(term177335, term177335.getClass(), "key2", term177375);
        term188730 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setFloatField(term188730, term188730.getClass(), "loadFactor", 0.0F);
        setIntField(term188730, term188730.getClass(), "size", 0);
        setField(term188730, term188730.getClass(), "data", null);
        setIntField(term188730, term188730.getClass(), "threshold", 0);
        setIntField(term188730, term188730.getClass(), "modCount", 0);
        setField(term188730, term188730.getClass(), "entrySet", null);
        setField(term188730, term188730.getClass(), "keySet", null);
        setField(term188730, term188730.getClass(), "values", null);
        setField(term188730, term188730.getClass(), "keySet", null);
        setField(term188730, term188730.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term177335;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term176967, args);
        assertTrue(recursiveEquals(term176967, term188730));
        assertTrue(recursiveEquals(term177335, (short) 2));
        assertTrue(recursiveEquals(retValue, null));
    }

};


