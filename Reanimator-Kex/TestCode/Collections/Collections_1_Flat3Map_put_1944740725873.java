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

public class Flat3Map_put_1944740725873 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175805;
     Object term176409;
     Object term176411;

    public Flat3Map_put_1944740725873() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term175805 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term175860 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term175805, term175805.getClass(), "delegateMap", null);
        setIntField(term175805, term175805.getClass(), "size", 1);
        setIntField(term175805, term175805.getClass(), "hash1", 0);
        setIntField(term175860, term175860.getClass(), "size", 0);
        setField(term175805, term175805.getClass(), "value1", term175860);
        term176409 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term176410 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term176409, term176409.getClass(), "size", 2);
        setIntField(term176409, term176409.getClass(), "hash1", 0);
        setIntField(term176409, term176409.getClass(), "hash2", 0);
        setIntField(term176409, term176409.getClass(), "hash3", 0);
        setField(term176409, term176409.getClass(), "key1", null);
        setField(term176409, term176409.getClass(), "key2", term176409);
        setField(term176409, term176409.getClass(), "key3", null);
        setFloatField(term176410, term176410.getClass(), "loadFactor", 0.0F);
        setIntField(term176410, term176410.getClass(), "size", 0);
        setField(term176410, term176410.getClass(), "data", null);
        setIntField(term176410, term176410.getClass(), "threshold", 0);
        setIntField(term176410, term176410.getClass(), "modCount", 0);
        setField(term176410, term176410.getClass(), "entrySet", null);
        setField(term176410, term176410.getClass(), "keySet", null);
        setField(term176410, term176410.getClass(), "values", null);
        setField(term176410, term176410.getClass(), "keySet", null);
        setField(term176410, term176410.getClass(), "values", null);
        setField(term176409, term176409.getClass(), "value1", term176410);
        setField(term176409, term176409.getClass(), "value2", null);
        setField(term176409, term176409.getClass(), "value3", null);
        setField(term176409, term176409.getClass(), "delegateMap", null);
        term176411 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term176412 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term176411, term176411.getClass(), "size", 2);
        setIntField(term176411, term176411.getClass(), "hash1", 0);
        setIntField(term176411, term176411.getClass(), "hash2", 0);
        setIntField(term176411, term176411.getClass(), "hash3", 0);
        setField(term176411, term176411.getClass(), "key1", null);
        setField(term176411, term176411.getClass(), "key2", term176411);
        setField(term176411, term176411.getClass(), "key3", null);
        setFloatField(term176412, term176412.getClass(), "loadFactor", 0.0F);
        setIntField(term176412, term176412.getClass(), "size", 0);
        setField(term176412, term176412.getClass(), "data", null);
        setIntField(term176412, term176412.getClass(), "threshold", 0);
        setIntField(term176412, term176412.getClass(), "modCount", 0);
        setField(term176412, term176412.getClass(), "entrySet", null);
        setField(term176412, term176412.getClass(), "keySet", null);
        setField(term176412, term176412.getClass(), "values", null);
        setField(term176412, term176412.getClass(), "keySet", null);
        setField(term176412, term176412.getClass(), "values", null);
        setField(term176411, term176411.getClass(), "value1", term176412);
        setField(term176411, term176411.getClass(), "value2", null);
        setField(term176411, term176411.getClass(), "value3", null);
        setField(term176411, term176411.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term175805;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term175805, args);
        assertTrue(recursiveEquals(term175805, term176409));
        assertTrue(recursiveEquals(term175805, term176411));
        assertTrue(recursiveEquals(retValue, null));
    }

};
