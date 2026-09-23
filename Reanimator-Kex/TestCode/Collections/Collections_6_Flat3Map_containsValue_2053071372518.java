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

public class Flat3Map_containsValue_2053071372518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98431;
     Object term98633;
     Object term99078;
     Object term99080;

    public Flat3Map_containsValue_2053071372518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98431 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term98541 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term98431, term98431.getClass(), "delegateMap", null);
        setIntField(term98431, term98431.getClass(), "size", 3);
        setIntField(term98541, term98541.getClass(), "size", -1);
        setField(term98431, term98431.getClass(), "value3", term98541);
        term98633 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term98743 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term98743, term98743.getClass(), "size", 0);
        setField(term98633, term98633.getClass(), "delegateMap", term98743);
        term99078 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term99079 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term99078, term99078.getClass(), "size", 3);
        setIntField(term99078, term99078.getClass(), "hash1", 0);
        setIntField(term99078, term99078.getClass(), "hash2", 0);
        setIntField(term99078, term99078.getClass(), "hash3", 0);
        setField(term99078, term99078.getClass(), "key1", null);
        setField(term99078, term99078.getClass(), "key2", null);
        setField(term99078, term99078.getClass(), "key3", null);
        setField(term99078, term99078.getClass(), "value1", null);
        setField(term99078, term99078.getClass(), "value2", null);
        setFloatField(term99079, term99079.getClass(), "loadFactor", 0.0F);
        setIntField(term99079, term99079.getClass(), "size", -1);
        setField(term99079, term99079.getClass(), "data", null);
        setIntField(term99079, term99079.getClass(), "threshold", 0);
        setIntField(term99079, term99079.getClass(), "modCount", 0);
        setField(term99079, term99079.getClass(), "entrySet", null);
        setField(term99079, term99079.getClass(), "keySet", null);
        setField(term99079, term99079.getClass(), "values", null);
        setField(term99079, term99079.getClass(), "keySet", null);
        setField(term99079, term99079.getClass(), "values", null);
        setField(term99078, term99078.getClass(), "value3", term99079);
        setField(term99078, term99078.getClass(), "delegateMap", null);
        term99080 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term99081 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term99080, term99080.getClass(), "size", 0);
        setIntField(term99080, term99080.getClass(), "hash1", 0);
        setIntField(term99080, term99080.getClass(), "hash2", 0);
        setIntField(term99080, term99080.getClass(), "hash3", 0);
        setField(term99080, term99080.getClass(), "key1", null);
        setField(term99080, term99080.getClass(), "key2", null);
        setField(term99080, term99080.getClass(), "key3", null);
        setField(term99080, term99080.getClass(), "value1", null);
        setField(term99080, term99080.getClass(), "value2", null);
        setField(term99080, term99080.getClass(), "value3", null);
        setFloatField(term99081, term99081.getClass(), "loadFactor", 0.0F);
        setIntField(term99081, term99081.getClass(), "size", 0);
        setField(term99081, term99081.getClass(), "data", null);
        setIntField(term99081, term99081.getClass(), "threshold", 0);
        setIntField(term99081, term99081.getClass(), "modCount", 0);
        setField(term99081, term99081.getClass(), "entrySet", null);
        setField(term99081, term99081.getClass(), "keySet", null);
        setField(term99081, term99081.getClass(), "values", null);
        setField(term99081, term99081.getClass(), "keySet", null);
        setField(term99081, term99081.getClass(), "values", null);
        setField(term99080, term99080.getClass(), "delegateMap", term99081);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term98633;
        callMethod(klass, "containsValue", argTypes, term98431, args);
        assertTrue(recursiveEquals(term98431, term99078));
        assertTrue(recursiveEquals(term98633, term99080));
    }

};


