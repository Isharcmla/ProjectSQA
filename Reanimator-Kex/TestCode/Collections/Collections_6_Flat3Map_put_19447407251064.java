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

public class Flat3Map_put_19447407251064 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term307973;
     Object term308487;
     Object term310072;
     Object term310083;

    public Flat3Map_put_19447407251064() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term308205 = new HashMap();
        term307973 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term308065 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term308157 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term308315 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term308395 = newInstance(Class.forName("java.util.stream.ReduceOps$ReduceTask"));
        setField(term307973, term307973.getClass(), "delegateMap", null);
        setIntField(term307973, term307973.getClass(), "size", 3);
        setIntField(term307973, term307973.getClass(), "hash3", -279008231);
        setField(term308065, term308065.getClass(), "delegateMap", null);
        setIntField(term308065, term308065.getClass(), "size", 3);
        setField(term308157, term308157.getClass(), "delegateMap", null);
        setIntField(term308157, term308157.getClass(), "size", 0);
        setField(term308065, term308065.getClass(), "key3", term308157);
        setField(term308065, term308065.getClass(), "key2", null);
        setField(term308065, term308065.getClass(), "value2", null);
        setIntField(term308065, term308065.getClass(), "hash3", 1694578688);
        setField(term308065, term308065.getClass(), "value3", null);
        setIntField(term308065, term308065.getClass(), "hash2", 536915968);
        setIntField(term308065, term308065.getClass(), "hash1", 136321024);
        setField(term308065, term308065.getClass(), "value1", null);
        setField(term307973, term307973.getClass(), "key3", term308065);
        setIntField(term307973, term307973.getClass(), "hash2", -279008231);
        setField(term307973, term307973.getClass(), "key2", null);
        setIntField(term307973, term307973.getClass(), "hash1", -279008231);
        setField(term307973, term307973.getClass(), "key1", null);
        setField(term307973, term307973.getClass(), "value3", term308205);
        setField(term307973, term307973.getClass(), "value2", term308315);
        setField(term307973, term307973.getClass(), "value1", term308395);
        term308487 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term308579 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term308659 = newInstance(Class.forName("java.util.stream.ReduceOps$ReduceTask"));
        setField(term308487, term308487.getClass(), "delegateMap", null);
        setIntField(term308487, term308487.getClass(), "size", 3);
        setIntField(term308487, term308487.getClass(), "hash3", -1945361383);
        setField(term308487, term308487.getClass(), "value3", null);
        setIntField(term308487, term308487.getClass(), "hash2", 537460736);
        setField(term308487, term308487.getClass(), "value2", null);
        setIntField(term308487, term308487.getClass(), "hash1", 1128892416);
        setField(term308487, term308487.getClass(), "value1", null);
        setField(term308487, term308487.getClass(), "key3", null);
        setField(term308579, term308579.getClass(), "delegateMap", null);
        setIntField(term308579, term308579.getClass(), "size", 0);
        setField(term308487, term308487.getClass(), "key2", term308579);
        setField(term308487, term308487.getClass(), "key1", term308659);
        HashMap term310082 = new HashMap();
        term310072 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term310073 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term310074 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term310075 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term310076 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term310077 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term310078 = newInstance(Class.forName("java.lang.Object"));
        Object term310079 = newInstance(Class.forName("java.util.stream.ReduceOps$ReduceTask"));
        Object term310080 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term310081 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term310072, term310072.getClass(), "size", 0);
        setIntField(term310072, term310072.getClass(), "hash1", 0);
        setIntField(term310072, term310072.getClass(), "hash2", 0);
        setIntField(term310072, term310072.getClass(), "hash3", 0);
        setField(term310072, term310072.getClass(), "key1", null);
        setField(term310072, term310072.getClass(), "key2", null);
        setField(term310072, term310072.getClass(), "key3", null);
        setField(term310072, term310072.getClass(), "value1", null);
        setField(term310072, term310072.getClass(), "value2", null);
        setField(term310072, term310072.getClass(), "value3", null);
        setFloatField(term310073, term310073.getClass(), "loadFactor", 0.75F);
        setIntField(term310073, term310073.getClass(), "size", 3);
        setField(term310075, term310075.getClass(), "next", null);
        setIntField(term310076, term310076.getClass(), "size", 3);
        setIntField(term310076, term310076.getClass(), "hash1", 1128892416);
        setIntField(term310076, term310076.getClass(), "hash2", 537460736);
        setIntField(term310076, term310076.getClass(), "hash3", -1945361383);
        setField(term310076, term310076.getClass(), "key1", null);
        setField(term310076, term310076.getClass(), "key2", null);
        setField(term310076, term310076.getClass(), "key3", null);
        setField(term310076, term310076.getClass(), "value1", null);
        setField(term310076, term310076.getClass(), "value2", null);
        setField(term310076, term310076.getClass(), "value3", null);
        setField(term310076, term310076.getClass(), "delegateMap", null);
        setField(term310075, term310075.getClass(), "key", term310076);
        setField(term310075, term310075.getClass(), "value", null);
        setElement(term310074, 5, term310075);
        setField(term310077, term310077.getClass(), "next", null);
        setField(term310077, term310077.getClass(), "key", term310078);
        setField(term310079, term310079.getClass(), "op", null);
        setField(term310079, term310079.getClass(), "helper", null);
        setField(term310079, term310079.getClass(), "spliterator", null);
        setLongField(term310079, term310079.getClass(), "targetSize", 0L);
        setField(term310079, term310079.getClass(), "leftChild", null);
        setField(term310079, term310079.getClass(), "rightChild", null);
        setField(term310079, term310079.getClass(), "localResult", null);
        setField(term310079, term310079.getClass(), "completer", null);
        setIntField(term310079, term310079.getClass(), "pending", 0);
        setIntField(term310079, term310079.getClass(), "status", 0);
        setField(term310077, term310077.getClass(), "value", term310079);
        setElement(term310074, 6, term310077);
        setField(term310080, term310080.getClass(), "next", null);
        setIntField(term310081, term310081.getClass(), "size", 3);
        setIntField(term310081, term310081.getClass(), "hash1", 136321024);
        setIntField(term310081, term310081.getClass(), "hash2", 536915968);
        setIntField(term310081, term310081.getClass(), "hash3", 1694578688);
        setField(term310081, term310081.getClass(), "key1", null);
        setField(term310081, term310081.getClass(), "key2", null);
        setField(term310081, term310081.getClass(), "key3", null);
        setField(term310081, term310081.getClass(), "value1", null);
        setField(term310081, term310081.getClass(), "value2", null);
        setField(term310081, term310081.getClass(), "value3", null);
        setField(term310081, term310081.getClass(), "delegateMap", null);
        setField(term310080, term310080.getClass(), "key", term310081);
        setField(term310080, term310080.getClass(), "value", term310082);
        setElement(term310074, 12, term310080);
        setField(term310073, term310073.getClass(), "data", term310074);
        setIntField(term310073, term310073.getClass(), "threshold", 12);
        setIntField(term310073, term310073.getClass(), "modCount", 3);
        setField(term310073, term310073.getClass(), "entrySet", null);
        setField(term310073, term310073.getClass(), "keySet", null);
        setField(term310073, term310073.getClass(), "values", null);
        setField(term310073, term310073.getClass(), "keySet", null);
        setField(term310073, term310073.getClass(), "values", null);
        setField(term310072, term310072.getClass(), "delegateMap", term310073);
        term310083 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term310083, term310083.getClass(), "size", 3);
        setIntField(term310083, term310083.getClass(), "hash1", 1128892416);
        setIntField(term310083, term310083.getClass(), "hash2", 537460736);
        setIntField(term310083, term310083.getClass(), "hash3", -1945361383);
        setField(term310083, term310083.getClass(), "key1", null);
        setField(term310083, term310083.getClass(), "key2", null);
        setField(term310083, term310083.getClass(), "key3", null);
        setField(term310083, term310083.getClass(), "value1", null);
        setField(term310083, term310083.getClass(), "value2", null);
        setField(term310083, term310083.getClass(), "value3", null);
        setField(term310083, term310083.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term308487;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term307973, args);
        assertTrue(recursiveEquals(term307973, term310072));
        assertTrue(recursiveEquals(term308487, term310083));
        assertTrue(recursiveEquals(retValue, null));
    }

};


