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

public class Flat3Map_put_19447407251083 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term316504;
     Object term316956;
     Object term317115;
     Object term317121;

    public Flat3Map_put_19447407251083() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term316504 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term316596 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term316688 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term316726 = newInstance(Class.forName("java.lang.Object"));
        term316956 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term317002 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term316504, term316504.getClass(), "delegateMap", null);
        setIntField(term316504, term316504.getClass(), "size", 3);
        setIntField(term316504, term316504.getClass(), "hash3", 0);
        setField(term316596, term316596.getClass(), "delegateMap", null);
        setIntField(term316596, term316596.getClass(), "size", 3);
        setField(term316596, term316596.getClass(), "key3", term316688);
        setField(term316596, term316596.getClass(), "key2", null);
        setField(term316596, term316596.getClass(), "value2", null);
        setIntField(term316596, term316596.getClass(), "hash3", -1);
        setIntField(term316596, term316596.getClass(), "hash2", -1);
        setIntField(term316596, term316596.getClass(), "hash1", -1);
        setField(term316504, term316504.getClass(), "key3", term316596);
        setIntField(term316504, term316504.getClass(), "hash2", 0);
        setField(term316504, term316504.getClass(), "key2", term316726);
        setIntField(term316504, term316504.getClass(), "hash1", 0);
        setField(term316956, term316956.getClass(), "delegateMap", null);
        setIntField(term316956, term316956.getClass(), "size", 3);
        setIntField(term316956, term316956.getClass(), "hash3", 0);
        setField(term316956, term316956.getClass(), "value3", null);
        setIntField(term316956, term316956.getClass(), "hash2", 0);
        setField(term316956, term316956.getClass(), "value2", null);
        setIntField(term316956, term316956.getClass(), "hash1", 0);
        setField(term316956, term316956.getClass(), "value1", null);
        setField(term316956, term316956.getClass(), "key3", null);
        setField(term317002, term317002.getClass(), "delegateMap", null);
        setIntField(term317002, term317002.getClass(), "size", 0);
        setField(term316956, term316956.getClass(), "key2", term317002);
        setField(term316504, term316504.getClass(), "key1", term316956);
        term317115 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term317116 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term317117 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term317118 = newInstance(Class.forName("java.lang.Object"));
        Object term317119 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term317120 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term317115, term317115.getClass(), "size", 3);
        setIntField(term317115, term317115.getClass(), "hash1", 0);
        setIntField(term317115, term317115.getClass(), "hash2", 0);
        setIntField(term317115, term317115.getClass(), "hash3", 0);
        setIntField(term317116, term317116.getClass(), "size", 3);
        setIntField(term317116, term317116.getClass(), "hash1", 0);
        setIntField(term317116, term317116.getClass(), "hash2", 0);
        setIntField(term317116, term317116.getClass(), "hash3", 0);
        setField(term317116, term317116.getClass(), "key1", null);
        setIntField(term317117, term317117.getClass(), "size", 0);
        setIntField(term317117, term317117.getClass(), "hash1", 0);
        setIntField(term317117, term317117.getClass(), "hash2", 0);
        setIntField(term317117, term317117.getClass(), "hash3", 0);
        setField(term317117, term317117.getClass(), "key1", null);
        setField(term317117, term317117.getClass(), "key2", null);
        setField(term317117, term317117.getClass(), "key3", null);
        setField(term317117, term317117.getClass(), "value1", null);
        setField(term317117, term317117.getClass(), "value2", null);
        setField(term317117, term317117.getClass(), "value3", null);
        setField(term317117, term317117.getClass(), "delegateMap", null);
        setField(term317116, term317116.getClass(), "key2", term317117);
        setField(term317116, term317116.getClass(), "key3", null);
        setField(term317116, term317116.getClass(), "value1", null);
        setField(term317116, term317116.getClass(), "value2", null);
        setField(term317116, term317116.getClass(), "value3", null);
        setField(term317116, term317116.getClass(), "delegateMap", null);
        setField(term317115, term317115.getClass(), "key1", term317116);
        setField(term317115, term317115.getClass(), "key2", term317118);
        setIntField(term317119, term317119.getClass(), "size", 3);
        setIntField(term317119, term317119.getClass(), "hash1", -1);
        setIntField(term317119, term317119.getClass(), "hash2", -1);
        setIntField(term317119, term317119.getClass(), "hash3", -1);
        setField(term317119, term317119.getClass(), "key1", null);
        setField(term317119, term317119.getClass(), "key2", null);
        setIntField(term317120, term317120.getClass(), "size", 0);
        setIntField(term317120, term317120.getClass(), "hash1", 0);
        setIntField(term317120, term317120.getClass(), "hash2", 0);
        setIntField(term317120, term317120.getClass(), "hash3", 0);
        setField(term317120, term317120.getClass(), "key1", null);
        setField(term317120, term317120.getClass(), "key2", null);
        setField(term317120, term317120.getClass(), "key3", null);
        setField(term317120, term317120.getClass(), "value1", null);
        setField(term317120, term317120.getClass(), "value2", null);
        setField(term317120, term317120.getClass(), "value3", null);
        setField(term317120, term317120.getClass(), "delegateMap", null);
        setField(term317119, term317119.getClass(), "key3", term317120);
        setField(term317119, term317119.getClass(), "value1", null);
        setField(term317119, term317119.getClass(), "value2", null);
        setField(term317119, term317119.getClass(), "value3", null);
        setField(term317119, term317119.getClass(), "delegateMap", null);
        setField(term317115, term317115.getClass(), "key3", term317119);
        setField(term317115, term317115.getClass(), "value1", null);
        setField(term317115, term317115.getClass(), "value2", null);
        setField(term317115, term317115.getClass(), "value3", null);
        setField(term317115, term317115.getClass(), "delegateMap", null);
        term317121 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term317122 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term317121, term317121.getClass(), "size", 3);
        setIntField(term317121, term317121.getClass(), "hash1", 0);
        setIntField(term317121, term317121.getClass(), "hash2", 0);
        setIntField(term317121, term317121.getClass(), "hash3", 0);
        setField(term317121, term317121.getClass(), "key1", null);
        setIntField(term317122, term317122.getClass(), "size", 0);
        setIntField(term317122, term317122.getClass(), "hash1", 0);
        setIntField(term317122, term317122.getClass(), "hash2", 0);
        setIntField(term317122, term317122.getClass(), "hash3", 0);
        setField(term317122, term317122.getClass(), "key1", null);
        setField(term317122, term317122.getClass(), "key2", null);
        setField(term317122, term317122.getClass(), "key3", null);
        setField(term317122, term317122.getClass(), "value1", null);
        setField(term317122, term317122.getClass(), "value2", null);
        setField(term317122, term317122.getClass(), "value3", null);
        setField(term317122, term317122.getClass(), "delegateMap", null);
        setField(term317121, term317121.getClass(), "key2", term317122);
        setField(term317121, term317121.getClass(), "key3", null);
        setField(term317121, term317121.getClass(), "value1", null);
        setField(term317121, term317121.getClass(), "value2", null);
        setField(term317121, term317121.getClass(), "value3", null);
        setField(term317121, term317121.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term316956;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term316504, args);
        assertTrue(recursiveEquals(term316504, term317115));
        assertTrue(recursiveEquals(term316956, term317121));
        assertTrue(recursiveEquals(retValue, null));
    }

};


