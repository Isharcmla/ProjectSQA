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

public class Flat3Map_put_1944740725655 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146098;
     Object term146422;
     Object term147244;
     Object term147254;

    public Flat3Map_put_1944740725655() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term146238 = new HashMap();
        term146098 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term146190 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object[] term145662 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 0);
        Object term146330 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term146098, term146098.getClass(), "delegateMap", null);
        setIntField(term146098, term146098.getClass(), "size", 3);
        setIntField(term146098, term146098.getClass(), "hash3", 1506379270);
        setField(term146190, term146190.getClass(), "delegateMap", null);
        setIntField(term146190, term146190.getClass(), "size", 3);
        setField(term146190, term146190.getClass(), "key3", term145662);
        setField(term146190, term146190.getClass(), "key2", null);
        setField(term146190, term146190.getClass(), "value2", null);
        setIntField(term146190, term146190.getClass(), "hash3", -789053440);
        setIntField(term146190, term146190.getClass(), "hash2", -1061158912);
        setIntField(term146190, term146190.getClass(), "hash1", -2147057664);
        setField(term146190, term146190.getClass(), "value3", null);
        setField(term146190, term146190.getClass(), "value1", null);
        setField(term146098, term146098.getClass(), "key3", term146190);
        setIntField(term146098, term146098.getClass(), "hash2", 1506379270);
        setField(term146098, term146098.getClass(), "key2", null);
        setIntField(term146098, term146098.getClass(), "hash1", 1506379270);
        setField(term146098, term146098.getClass(), "key1", null);
        setField(term146098, term146098.getClass(), "value3", null);
        setField(term146098, term146098.getClass(), "value2", term146238);
        setField(term146098, term146098.getClass(), "value1", term146330);
        term146422 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term146462 = newInstance(Class.forName("java.io.Console$1"));
        setField(term146422, term146422.getClass(), "delegateMap", null);
        setIntField(term146422, term146422.getClass(), "size", 3);
        setIntField(term146422, term146422.getClass(), "hash3", 1388511238);
        setField(term146422, term146422.getClass(), "value3", null);
        setIntField(term146422, term146422.getClass(), "hash2", 268861440);
        setField(term146422, term146422.getClass(), "value2", null);
        setIntField(term146422, term146422.getClass(), "hash1", -150993408);
        setField(term146422, term146422.getClass(), "value1", null);
        setField(term146422, term146422.getClass(), "key3", null);
        setField(term146422, term146422.getClass(), "key2", term146462);
        term147244 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term147245 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term147246 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term147247 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term147248 = newInstance(Class.forName("java.lang.Object"));
        Object term147249 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term147250 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term147251 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term147252 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term147253 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term147244, term147244.getClass(), "size", 0);
        setIntField(term147244, term147244.getClass(), "hash1", 0);
        setIntField(term147244, term147244.getClass(), "hash2", 0);
        setIntField(term147244, term147244.getClass(), "hash3", 0);
        setField(term147244, term147244.getClass(), "key1", null);
        setField(term147244, term147244.getClass(), "key2", null);
        setField(term147244, term147244.getClass(), "key3", null);
        setField(term147244, term147244.getClass(), "value1", null);
        setField(term147244, term147244.getClass(), "value2", null);
        setField(term147244, term147244.getClass(), "value3", null);
        setFloatField(term147245, term147245.getClass(), "loadFactor", 0.75F);
        setIntField(term147245, term147245.getClass(), "size", 3);
        setField(term147247, term147247.getClass(), "next", null);
        setField(term147247, term147247.getClass(), "key", term147248);
        setIntField(term147249, term147249.getClass(), "size", 0);
        setIntField(term147249, term147249.getClass(), "hash1", 0);
        setIntField(term147249, term147249.getClass(), "hash2", 0);
        setIntField(term147249, term147249.getClass(), "hash3", 0);
        setField(term147249, term147249.getClass(), "key1", null);
        setField(term147249, term147249.getClass(), "key2", null);
        setField(term147249, term147249.getClass(), "key3", null);
        setField(term147249, term147249.getClass(), "value1", null);
        setField(term147249, term147249.getClass(), "value2", null);
        setField(term147249, term147249.getClass(), "value3", null);
        setField(term147249, term147249.getClass(), "delegateMap", null);
        setField(term147247, term147247.getClass(), "value", term147249);
        setElement(term147246, 5, term147247);
        setField(term147250, term147250.getClass(), "next", null);
        setIntField(term147251, term147251.getClass(), "size", 3);
        setIntField(term147251, term147251.getClass(), "hash1", -2147057664);
        setIntField(term147251, term147251.getClass(), "hash2", -1061158912);
        setIntField(term147251, term147251.getClass(), "hash3", -789053440);
        setField(term147251, term147251.getClass(), "key1", null);
        setField(term147251, term147251.getClass(), "key2", null);
        setField(term147251, term147251.getClass(), "key3", null);
        setField(term147251, term147251.getClass(), "value1", null);
        setField(term147251, term147251.getClass(), "value2", null);
        setField(term147251, term147251.getClass(), "value3", null);
        setField(term147251, term147251.getClass(), "delegateMap", null);
        setField(term147250, term147250.getClass(), "key", term147251);
        setField(term147250, term147250.getClass(), "value", null);
        setElement(term147246, 9, term147250);
        setField(term147252, term147252.getClass(), "next", null);
        setIntField(term147253, term147253.getClass(), "size", 3);
        setIntField(term147253, term147253.getClass(), "hash1", -150993408);
        setIntField(term147253, term147253.getClass(), "hash2", 268861440);
        setIntField(term147253, term147253.getClass(), "hash3", 1388511238);
        setField(term147253, term147253.getClass(), "key1", null);
        setField(term147253, term147253.getClass(), "key2", null);
        setField(term147253, term147253.getClass(), "key3", null);
        setField(term147253, term147253.getClass(), "value1", null);
        setField(term147253, term147253.getClass(), "value2", null);
        setField(term147253, term147253.getClass(), "value3", null);
        setField(term147253, term147253.getClass(), "delegateMap", null);
        setField(term147252, term147252.getClass(), "key", term147253);
        setField(term147252, term147252.getClass(), "value", null);
        setElement(term147246, 11, term147252);
        setField(term147245, term147245.getClass(), "data", term147246);
        setIntField(term147245, term147245.getClass(), "threshold", 12);
        setIntField(term147245, term147245.getClass(), "modCount", 3);
        setField(term147245, term147245.getClass(), "entrySet", null);
        setField(term147245, term147245.getClass(), "keySet", null);
        setField(term147245, term147245.getClass(), "values", null);
        setField(term147245, term147245.getClass(), "keySet", null);
        setField(term147245, term147245.getClass(), "values", null);
        setField(term147244, term147244.getClass(), "delegateMap", term147245);
        term147254 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term147254, term147254.getClass(), "size", 3);
        setIntField(term147254, term147254.getClass(), "hash1", -150993408);
        setIntField(term147254, term147254.getClass(), "hash2", 268861440);
        setIntField(term147254, term147254.getClass(), "hash3", 1388511238);
        setField(term147254, term147254.getClass(), "key1", null);
        setField(term147254, term147254.getClass(), "key2", null);
        setField(term147254, term147254.getClass(), "key3", null);
        setField(term147254, term147254.getClass(), "value1", null);
        setField(term147254, term147254.getClass(), "value2", null);
        setField(term147254, term147254.getClass(), "value3", null);
        setField(term147254, term147254.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term146422;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term146098, args);
        assertTrue(recursiveEquals(term146098, term147244));
        assertTrue(recursiveEquals(term146422, term147254));
        assertTrue(recursiveEquals(retValue, null));
    }

};


