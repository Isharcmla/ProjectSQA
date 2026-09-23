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
import java.util.HashMap;

public class Flat3Map_put_1944740725575 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116936;
     Object term117548;
     Object term118324;
     Object term118335;

    public Flat3Map_put_1944740725575() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term117168 = new HashMap();
        HashMap term117326 = new HashMap();
        term116936 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term117028 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term117120 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term117278 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term117456 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        setField(term116936, term116936.getClass(), "delegateMap", null);
        setIntField(term116936, term116936.getClass(), "size", 3);
        setIntField(term116936, term116936.getClass(), "hash3", -1812940062);
        setField(term117028, term117028.getClass(), "delegateMap", null);
        setIntField(term117028, term117028.getClass(), "size", 3);
        setField(term117028, term117028.getClass(), "key3", term117120);
        setField(term117028, term117028.getClass(), "key2", null);
        setField(term117028, term117028.getClass(), "value2", term117168);
        setIntField(term117028, term117028.getClass(), "hash3", 1342406656);
        setField(term117028, term117028.getClass(), "value3", null);
        setIntField(term117028, term117028.getClass(), "hash2", -1843256525);
        setIntField(term117028, term117028.getClass(), "hash1", 807440512);
        setField(term117028, term117028.getClass(), "value1", null);
        setField(term116936, term116936.getClass(), "key3", term117028);
        setIntField(term116936, term116936.getClass(), "hash2", -1812940062);
        setField(term116936, term116936.getClass(), "key2", null);
        setIntField(term116936, term116936.getClass(), "hash1", -1812940062);
        setField(term116936, term116936.getClass(), "key1", null);
        setField(term116936, term116936.getClass(), "value3", term117278);
        setField(term116936, term116936.getClass(), "value2", term117326);
        setField(term116936, term116936.getClass(), "value1", term117456);
        term117548 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term117548, term117548.getClass(), "delegateMap", null);
        setIntField(term117548, term117548.getClass(), "size", 3);
        setIntField(term117548, term117548.getClass(), "hash3", -1251958784);
        setField(term117548, term117548.getClass(), "value3", null);
        setIntField(term117548, term117548.getClass(), "hash2", -587202334);
        setField(term117548, term117548.getClass(), "value2", null);
        setIntField(term117548, term117548.getClass(), "hash1", 26221056);
        setField(term117548, term117548.getClass(), "value1", null);
        setField(term117548, term117548.getClass(), "key3", null);
        term118324 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term118325 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term118326 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term118327 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term118328 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term118329 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term118330 = newInstance(Class.forName("java.lang.Object"));
        Object term118331 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term118332 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term118333 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term118334 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term118324, term118324.getClass(), "size", 0);
        setIntField(term118324, term118324.getClass(), "hash1", 0);
        setIntField(term118324, term118324.getClass(), "hash2", 0);
        setIntField(term118324, term118324.getClass(), "hash3", 0);
        setField(term118324, term118324.getClass(), "key1", null);
        setField(term118324, term118324.getClass(), "key2", null);
        setField(term118324, term118324.getClass(), "key3", null);
        setField(term118324, term118324.getClass(), "value1", null);
        setField(term118324, term118324.getClass(), "value2", null);
        setField(term118324, term118324.getClass(), "value3", null);
        setFloatField(term118325, term118325.getClass(), "loadFactor", 0.75F);
        setIntField(term118325, term118325.getClass(), "size", 3);
        setField(term118327, term118327.getClass(), "next", null);
        setIntField(term118328, term118328.getClass(), "size", 3);
        setIntField(term118328, term118328.getClass(), "hash1", 26221056);
        setIntField(term118328, term118328.getClass(), "hash2", -587202334);
        setIntField(term118328, term118328.getClass(), "hash3", -1251958784);
        setField(term118328, term118328.getClass(), "key1", null);
        setField(term118328, term118328.getClass(), "key2", null);
        setField(term118328, term118328.getClass(), "key3", null);
        setField(term118328, term118328.getClass(), "value1", null);
        setField(term118328, term118328.getClass(), "value2", null);
        setField(term118328, term118328.getClass(), "value3", null);
        setField(term118328, term118328.getClass(), "delegateMap", null);
        setField(term118327, term118327.getClass(), "key", term118328);
        setField(term118327, term118327.getClass(), "value", null);
        setElement(term118326, 1, term118327);
        setField(term118329, term118329.getClass(), "next", null);
        setField(term118329, term118329.getClass(), "key", term118330);
        setField(term118331, term118331.getClass(), "next", null);
        setField(term118331, term118331.getClass(), "key", null);
        setField(term118331, term118331.getClass(), "value", null);
        setField(term118329, term118329.getClass(), "value", term118331);
        setElement(term118326, 5, term118329);
        setField(term118332, term118332.getClass(), "next", null);
        setIntField(term118333, term118333.getClass(), "size", 3);
        setIntField(term118333, term118333.getClass(), "hash1", 807440512);
        setIntField(term118333, term118333.getClass(), "hash2", -1843256525);
        setIntField(term118333, term118333.getClass(), "hash3", 1342406656);
        setField(term118333, term118333.getClass(), "key1", null);
        setField(term118333, term118333.getClass(), "key2", null);
        setField(term118333, term118333.getClass(), "key3", null);
        setField(term118333, term118333.getClass(), "value1", null);
        setField(term118333, term118333.getClass(), "value2", null);
        setField(term118333, term118333.getClass(), "value3", null);
        setField(term118333, term118333.getClass(), "delegateMap", null);
        setField(term118332, term118332.getClass(), "key", term118333);
        setFloatField(term118334, term118334.getClass(), "loadFactor", 0.0F);
        setIntField(term118334, term118334.getClass(), "size", 0);
        setField(term118334, term118334.getClass(), "data", null);
        setIntField(term118334, term118334.getClass(), "threshold", 0);
        setIntField(term118334, term118334.getClass(), "modCount", 0);
        setField(term118334, term118334.getClass(), "entrySet", null);
        setField(term118334, term118334.getClass(), "keySet", null);
        setField(term118334, term118334.getClass(), "values", null);
        setField(term118334, term118334.getClass(), "keySet", null);
        setField(term118334, term118334.getClass(), "values", null);
        setField(term118332, term118332.getClass(), "value", term118334);
        setElement(term118326, 8, term118332);
        setField(term118325, term118325.getClass(), "data", term118326);
        setIntField(term118325, term118325.getClass(), "threshold", 12);
        setIntField(term118325, term118325.getClass(), "modCount", 3);
        setField(term118325, term118325.getClass(), "entrySet", null);
        setField(term118325, term118325.getClass(), "keySet", null);
        setField(term118325, term118325.getClass(), "values", null);
        setField(term118325, term118325.getClass(), "keySet", null);
        setField(term118325, term118325.getClass(), "values", null);
        setField(term118324, term118324.getClass(), "delegateMap", term118325);
        term118335 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term118335, term118335.getClass(), "size", 3);
        setIntField(term118335, term118335.getClass(), "hash1", 26221056);
        setIntField(term118335, term118335.getClass(), "hash2", -587202334);
        setIntField(term118335, term118335.getClass(), "hash3", -1251958784);
        setField(term118335, term118335.getClass(), "key1", null);
        setField(term118335, term118335.getClass(), "key2", null);
        setField(term118335, term118335.getClass(), "key3", null);
        setField(term118335, term118335.getClass(), "value1", null);
        setField(term118335, term118335.getClass(), "value2", null);
        setField(term118335, term118335.getClass(), "value3", null);
        setField(term118335, term118335.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term117548;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term116936, args);
        assertTrue(recursiveEquals(term116936, term118324));
        assertTrue(recursiveEquals(term117548, term118335));
        assertTrue(recursiveEquals(retValue, null));
    }

};


