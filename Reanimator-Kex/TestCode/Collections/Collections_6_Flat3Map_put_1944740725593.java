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
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;

public class Flat3Map_put_1944740725593 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123688;
     Object term124152;
     Object term124505;
     Object term124518;

    public Flat3Map_put_1944740725593() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term123740 = new ArrayList();
        HashMap term123826 = new HashMap();
        term123688 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term123778 = newInstance(Class.forName("java.lang.Object"));
        Object term124060 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object[] term123321 = (Object[]) newArray("java.lang.Object", 0);
        setField(term123688, term123688.getClass(), "delegateMap", null);
        setIntField(term123688, term123688.getClass(), "size", 3);
        setIntField(term123688, term123688.getClass(), "hash3", 598249548);
        setField(term123688, term123688.getClass(), "key3", term123740);
        setIntField(term123688, term123688.getClass(), "hash2", 598249548);
        setField(term123688, term123688.getClass(), "key2", term123778);
        setIntField(term123688, term123688.getClass(), "hash1", 598249548);
        setField(term123688, term123688.getClass(), "key1", term123826);
        setField(term123688, term123688.getClass(), "value3", term124060);
        setField(term123688, term123688.getClass(), "value2", null);
        setField(term123688, term123688.getClass(), "value1", term123321);
        term124152 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term124152, term124152.getClass(), "delegateMap", null);
        setIntField(term124152, term124152.getClass(), "size", 3);
        setIntField(term124152, term124152.getClass(), "hash3", 561220);
        setField(term124152, term124152.getClass(), "value3", null);
        setIntField(term124152, term124152.getClass(), "hash2", -2142339064);
        setField(term124152, term124152.getClass(), "value2", null);
        setIntField(term124152, term124152.getClass(), "hash1", -1554939904);
        setField(term124152, term124152.getClass(), "value1", null);
        HashMap term124509 = new HashMap();
        ArrayList term124514 = new ArrayList();
        term124505 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term124506 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term124507 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term124508 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object[] term124510 = (Object[]) newArray("java.lang.Object", 0);
        Object term124511 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term124512 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term124513 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term124515 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term124516 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term124517 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term124505, term124505.getClass(), "size", 0);
        setIntField(term124505, term124505.getClass(), "hash1", 0);
        setIntField(term124505, term124505.getClass(), "hash2", 0);
        setIntField(term124505, term124505.getClass(), "hash3", 0);
        setField(term124505, term124505.getClass(), "key1", null);
        setField(term124505, term124505.getClass(), "key2", null);
        setField(term124505, term124505.getClass(), "key3", null);
        setField(term124505, term124505.getClass(), "value1", null);
        setField(term124505, term124505.getClass(), "value2", null);
        setField(term124505, term124505.getClass(), "value3", null);
        setFloatField(term124506, term124506.getClass(), "loadFactor", 0.75F);
        setIntField(term124506, term124506.getClass(), "size", 4);
        setField(term124508, term124508.getClass(), "next", null);
        setField(term124508, term124508.getClass(), "key", term124509);
        setField(term124508, term124508.getClass(), "value", term124510);
        setElement(term124507, 0, term124508);
        setField(term124511, term124511.getClass(), "next", null);
        setIntField(term124512, term124512.getClass(), "size", 3);
        setIntField(term124512, term124512.getClass(), "hash1", -1554939904);
        setIntField(term124512, term124512.getClass(), "hash2", -2142339064);
        setIntField(term124512, term124512.getClass(), "hash3", 561220);
        setField(term124512, term124512.getClass(), "key1", null);
        setField(term124512, term124512.getClass(), "key2", null);
        setField(term124512, term124512.getClass(), "key3", null);
        setField(term124512, term124512.getClass(), "value1", null);
        setField(term124512, term124512.getClass(), "value2", null);
        setField(term124512, term124512.getClass(), "value3", null);
        setField(term124512, term124512.getClass(), "delegateMap", null);
        setField(term124511, term124511.getClass(), "key", term124512);
        setField(term124511, term124511.getClass(), "value", null);
        setElement(term124507, 1, term124511);
        setField(term124513, term124513.getClass(), "next", null);
        setField(term124513, term124513.getClass(), "key", term124514);
        setField(term124515, term124515.getClass(), "next", null);
        setField(term124515, term124515.getClass(), "key", null);
        setField(term124515, term124515.getClass(), "value", null);
        setField(term124513, term124513.getClass(), "value", term124515);
        setElement(term124507, 7, term124513);
        setField(term124516, term124516.getClass(), "next", null);
        setField(term124516, term124516.getClass(), "key", term124517);
        setField(term124516, term124516.getClass(), "value", null);
        setElement(term124507, 14, term124516);
        setField(term124506, term124506.getClass(), "data", term124507);
        setIntField(term124506, term124506.getClass(), "threshold", 12);
        setIntField(term124506, term124506.getClass(), "modCount", 4);
        setField(term124506, term124506.getClass(), "entrySet", null);
        setField(term124506, term124506.getClass(), "keySet", null);
        setField(term124506, term124506.getClass(), "values", null);
        setField(term124506, term124506.getClass(), "keySet", null);
        setField(term124506, term124506.getClass(), "values", null);
        setField(term124505, term124505.getClass(), "delegateMap", term124506);
        term124518 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term124518, term124518.getClass(), "size", 3);
        setIntField(term124518, term124518.getClass(), "hash1", -1554939904);
        setIntField(term124518, term124518.getClass(), "hash2", -2142339064);
        setIntField(term124518, term124518.getClass(), "hash3", 561220);
        setField(term124518, term124518.getClass(), "key1", null);
        setField(term124518, term124518.getClass(), "key2", null);
        setField(term124518, term124518.getClass(), "key3", null);
        setField(term124518, term124518.getClass(), "value1", null);
        setField(term124518, term124518.getClass(), "value2", null);
        setField(term124518, term124518.getClass(), "value3", null);
        setField(term124518, term124518.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term124152;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term123688, args);
        assertTrue(recursiveEquals(term123688, term124505));
        assertTrue(recursiveEquals(term124152, term124518));
        assertTrue(recursiveEquals(retValue, null));
    }

};


