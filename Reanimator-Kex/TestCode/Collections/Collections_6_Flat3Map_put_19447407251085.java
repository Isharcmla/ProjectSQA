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

public class Flat3Map_put_19447407251085 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term317657;
     Object term318229;
     Object term318722;
     Object term318732;

    public Flat3Map_put_19447407251085() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term318183 = new HashMap();
        term317657 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term317749 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term317859 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object[] term317142 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 0);
        term318229 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term318275 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term318135 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term317657, term317657.getClass(), "delegateMap", null);
        setIntField(term317657, term317657.getClass(), "size", 3);
        setIntField(term317657, term317657.getClass(), "hash3", -1735198944);
        setField(term317749, term317749.getClass(), "delegateMap", null);
        setIntField(term317749, term317749.getClass(), "size", 3);
        setIntField(term317859, term317859.getClass(), "size", 0);
        setField(term317749, term317749.getClass(), "key3", term317859);
        setField(term317749, term317749.getClass(), "key2", null);
        setField(term317749, term317749.getClass(), "value2", null);
        setIntField(term317749, term317749.getClass(), "hash3", 16);
        setIntField(term317749, term317749.getClass(), "hash2", -1055389696);
        setIntField(term317749, term317749.getClass(), "hash1", 268571649);
        setField(term317749, term317749.getClass(), "key1", term317142);
        setField(term317749, term317749.getClass(), "value3", null);
        setField(term317749, term317749.getClass(), "value1", null);
        setField(term317657, term317657.getClass(), "key3", term317749);
        setIntField(term317657, term317657.getClass(), "hash2", -1735198944);
        setField(term317657, term317657.getClass(), "key2", null);
        setIntField(term317657, term317657.getClass(), "hash1", -1735198944);
        setField(term317657, term317657.getClass(), "key1", null);
        setField(term318229, term318229.getClass(), "delegateMap", null);
        setIntField(term318229, term318229.getClass(), "size", 3);
        setIntField(term318229, term318229.getClass(), "hash3", 94470144);
        setField(term318229, term318229.getClass(), "value3", null);
        setIntField(term318229, term318229.getClass(), "hash2", 1076887680);
        setField(term318229, term318229.getClass(), "value2", null);
        setIntField(term318229, term318229.getClass(), "hash1", 1388410528);
        setField(term318229, term318229.getClass(), "value1", null);
        setField(term318229, term318229.getClass(), "key3", null);
        setField(term318275, term318275.getClass(), "delegateMap", null);
        setIntField(term318275, term318275.getClass(), "size", 2);
        setIntField(term318275, term318275.getClass(), "hash2", 272959601);
        setField(term318275, term318275.getClass(), "value2", null);
        setIntField(term318275, term318275.getClass(), "hash1", 33585443);
        setField(term318275, term318275.getClass(), "value1", null);
        setField(term318229, term318229.getClass(), "key2", term318275);
        setField(term317657, term317657.getClass(), "value3", term318229);
        setField(term317657, term317657.getClass(), "value2", term318135);
        setField(term317657, term317657.getClass(), "value1", term318183);
        HashMap term318727 = new HashMap();
        term318722 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term318723 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term318724 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term318725 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term318726 = newInstance(Class.forName("java.lang.Object"));
        Object term318728 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term318729 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term318730 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term318731 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term318722, term318722.getClass(), "size", 0);
        setIntField(term318722, term318722.getClass(), "hash1", 0);
        setIntField(term318722, term318722.getClass(), "hash2", 0);
        setIntField(term318722, term318722.getClass(), "hash3", 0);
        setField(term318722, term318722.getClass(), "key1", null);
        setField(term318722, term318722.getClass(), "key2", null);
        setField(term318722, term318722.getClass(), "key3", null);
        setField(term318722, term318722.getClass(), "value1", null);
        setField(term318722, term318722.getClass(), "value2", null);
        setField(term318722, term318722.getClass(), "value3", null);
        setFloatField(term318723, term318723.getClass(), "loadFactor", 0.75F);
        setIntField(term318723, term318723.getClass(), "size", 3);
        setField(term318725, term318725.getClass(), "next", null);
        setField(term318725, term318725.getClass(), "key", term318726);
        setField(term318725, term318725.getClass(), "value", term318727);
        setElement(term318724, 6, term318725);
        setField(term318728, term318728.getClass(), "next", null);
        setIntField(term318729, term318729.getClass(), "size", 3);
        setIntField(term318729, term318729.getClass(), "hash1", 1388410528);
        setIntField(term318729, term318729.getClass(), "hash2", 1076887680);
        setIntField(term318729, term318729.getClass(), "hash3", 94470144);
        setField(term318729, term318729.getClass(), "key1", null);
        setField(term318729, term318729.getClass(), "key2", null);
        setField(term318729, term318729.getClass(), "key3", null);
        setField(term318729, term318729.getClass(), "value1", null);
        setField(term318729, term318729.getClass(), "value2", null);
        setField(term318729, term318729.getClass(), "value3", null);
        setField(term318729, term318729.getClass(), "delegateMap", null);
        setField(term318728, term318728.getClass(), "key", term318729);
        setField(term318728, term318728.getClass(), "value", null);
        setElement(term318724, 8, term318728);
        setField(term318730, term318730.getClass(), "next", null);
        setIntField(term318731, term318731.getClass(), "size", 3);
        setIntField(term318731, term318731.getClass(), "hash1", 268571649);
        setIntField(term318731, term318731.getClass(), "hash2", -1055389696);
        setIntField(term318731, term318731.getClass(), "hash3", 16);
        setField(term318731, term318731.getClass(), "key1", null);
        setField(term318731, term318731.getClass(), "key2", null);
        setField(term318731, term318731.getClass(), "key3", null);
        setField(term318731, term318731.getClass(), "value1", null);
        setField(term318731, term318731.getClass(), "value2", null);
        setField(term318731, term318731.getClass(), "value3", null);
        setField(term318731, term318731.getClass(), "delegateMap", null);
        setField(term318730, term318730.getClass(), "key", term318731);
        setField(term318730, term318730.getClass(), "value", term318729);
        setElement(term318724, 15, term318730);
        setField(term318723, term318723.getClass(), "data", term318724);
        setIntField(term318723, term318723.getClass(), "threshold", 12);
        setIntField(term318723, term318723.getClass(), "modCount", 3);
        setField(term318723, term318723.getClass(), "entrySet", null);
        setField(term318723, term318723.getClass(), "keySet", null);
        setField(term318723, term318723.getClass(), "values", null);
        setField(term318723, term318723.getClass(), "keySet", null);
        setField(term318723, term318723.getClass(), "values", null);
        setField(term318722, term318722.getClass(), "delegateMap", term318723);
        term318732 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term318732, term318732.getClass(), "size", 3);
        setIntField(term318732, term318732.getClass(), "hash1", 1388410528);
        setIntField(term318732, term318732.getClass(), "hash2", 1076887680);
        setIntField(term318732, term318732.getClass(), "hash3", 94470144);
        setField(term318732, term318732.getClass(), "key1", null);
        setField(term318732, term318732.getClass(), "key2", null);
        setField(term318732, term318732.getClass(), "key3", null);
        setField(term318732, term318732.getClass(), "value1", null);
        setField(term318732, term318732.getClass(), "value2", null);
        setField(term318732, term318732.getClass(), "value3", null);
        setField(term318732, term318732.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term318229;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term317657, args);
        assertTrue(recursiveEquals(term317657, term318722));
        assertTrue(recursiveEquals(term318229, term318732));
        assertTrue(recursiveEquals(retValue, null));
    }

};


