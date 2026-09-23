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

public class Flat3Map_put_19447407251069 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term311388;
     Object term311232;
     Object term311486;
     Object term311490;

    public Flat3Map_put_19447407251069() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term311388 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term311388, term311388.getClass(), "delegateMap", null);
        setIntField(term311388, term311388.getClass(), "size", 0);
        term311232 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term311342 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term311440 = newInstance(Class.forName("java.lang.Shutdown$Lock"));
        setField(term311232, term311232.getClass(), "delegateMap", null);
        setIntField(term311232, term311232.getClass(), "size", 3);
        setIntField(term311232, term311232.getClass(), "hash3", 0);
        setIntField(term311342, term311342.getClass(), "size", 0);
        setField(term311232, term311232.getClass(), "value3", term311342);
        setIntField(term311232, term311232.getClass(), "hash2", 0);
        setField(term311232, term311232.getClass(), "value2", term311388);
        setIntField(term311232, term311232.getClass(), "hash1", 0);
        setField(term311232, term311232.getClass(), "value1", term311440);
        term311486 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term311487 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term311488 = newInstance(Class.forName("java.lang.Shutdown$Lock"));
        Object term311489 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term311486, term311486.getClass(), "size", 1);
        setIntField(term311486, term311486.getClass(), "hash1", 1432738582);
        setIntField(term311486, term311486.getClass(), "hash2", 0);
        setIntField(term311486, term311486.getClass(), "hash3", 0);
        setIntField(term311487, term311487.getClass(), "size", 3);
        setIntField(term311487, term311487.getClass(), "hash1", 0);
        setIntField(term311487, term311487.getClass(), "hash2", 0);
        setIntField(term311487, term311487.getClass(), "hash3", 0);
        setField(term311487, term311487.getClass(), "key1", null);
        setField(term311487, term311487.getClass(), "key2", null);
        setField(term311487, term311487.getClass(), "key3", null);
        setField(term311487, term311487.getClass(), "value1", term311488);
        setField(term311487, term311487.getClass(), "value2", term311486);
        setFloatField(term311489, term311489.getClass(), "loadFactor", 0.0F);
        setIntField(term311489, term311489.getClass(), "size", 0);
        setField(term311489, term311489.getClass(), "data", null);
        setIntField(term311489, term311489.getClass(), "threshold", 0);
        setIntField(term311489, term311489.getClass(), "modCount", 0);
        setField(term311489, term311489.getClass(), "entrySet", null);
        setField(term311489, term311489.getClass(), "keySet", null);
        setField(term311489, term311489.getClass(), "values", null);
        setField(term311489, term311489.getClass(), "keySet", null);
        setField(term311489, term311489.getClass(), "values", null);
        setField(term311487, term311487.getClass(), "value3", term311489);
        setField(term311487, term311487.getClass(), "delegateMap", null);
        setField(term311486, term311486.getClass(), "key1", term311487);
        setField(term311486, term311486.getClass(), "key2", null);
        setField(term311486, term311486.getClass(), "key3", null);
        setField(term311486, term311486.getClass(), "value1", null);
        setField(term311486, term311486.getClass(), "value2", null);
        setField(term311486, term311486.getClass(), "value3", null);
        setField(term311486, term311486.getClass(), "delegateMap", null);
        term311490 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term311491 = newInstance(Class.forName("java.lang.Shutdown$Lock"));
        Object term311492 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term311493 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term311490, term311490.getClass(), "size", 3);
        setIntField(term311490, term311490.getClass(), "hash1", 0);
        setIntField(term311490, term311490.getClass(), "hash2", 0);
        setIntField(term311490, term311490.getClass(), "hash3", 0);
        setField(term311490, term311490.getClass(), "key1", null);
        setField(term311490, term311490.getClass(), "key2", null);
        setField(term311490, term311490.getClass(), "key3", null);
        setField(term311490, term311490.getClass(), "value1", term311491);
        setIntField(term311492, term311492.getClass(), "size", 1);
        setIntField(term311492, term311492.getClass(), "hash1", 1432738582);
        setIntField(term311492, term311492.getClass(), "hash2", 0);
        setIntField(term311492, term311492.getClass(), "hash3", 0);
        setField(term311492, term311492.getClass(), "key1", term311490);
        setField(term311492, term311492.getClass(), "key2", null);
        setField(term311492, term311492.getClass(), "key3", null);
        setField(term311492, term311492.getClass(), "value1", null);
        setField(term311492, term311492.getClass(), "value2", null);
        setField(term311492, term311492.getClass(), "value3", null);
        setField(term311492, term311492.getClass(), "delegateMap", null);
        setField(term311490, term311490.getClass(), "value2", term311492);
        setFloatField(term311493, term311493.getClass(), "loadFactor", 0.0F);
        setIntField(term311493, term311493.getClass(), "size", 0);
        setField(term311493, term311493.getClass(), "data", null);
        setIntField(term311493, term311493.getClass(), "threshold", 0);
        setIntField(term311493, term311493.getClass(), "modCount", 0);
        setField(term311493, term311493.getClass(), "entrySet", null);
        setField(term311493, term311493.getClass(), "keySet", null);
        setField(term311493, term311493.getClass(), "values", null);
        setField(term311493, term311493.getClass(), "keySet", null);
        setField(term311493, term311493.getClass(), "values", null);
        setField(term311490, term311490.getClass(), "value3", term311493);
        setField(term311490, term311490.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term311232;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term311388, args);
        assertTrue(recursiveEquals(term311388, term311486));
        assertTrue(recursiveEquals(term311232, term311490));
        assertTrue(recursiveEquals(retValue, null));
    }

};


