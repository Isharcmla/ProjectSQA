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

public class Flat3Map_put_1944740725365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62200;
     Object term62292;
     Object term62368;
     Object term62373;

    public Flat3Map_put_1944740725365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62200 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term62200, term62200.getClass(), "delegateMap", null);
        setIntField(term62200, term62200.getClass(), "size", -3);
        setIntField(term62200, term62200.getClass(), "hash2", 0);
        setField(term62200, term62200.getClass(), "key2", term62200);
        setIntField(term62200, term62200.getClass(), "hash1", -1);
        term62292 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term62292, term62292.getClass(), "delegateMap", null);
        setIntField(term62292, term62292.getClass(), "size", 2);
        setIntField(term62292, term62292.getClass(), "hash2", 0);
        setField(term62292, term62292.getClass(), "value2", null);
        setIntField(term62292, term62292.getClass(), "hash1", 0);
        setField(term62292, term62292.getClass(), "value1", null);
        term62368 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term62369 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term62370 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term62371 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term62372 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term62368, term62368.getClass(), "size", 0);
        setIntField(term62368, term62368.getClass(), "hash1", 0);
        setIntField(term62368, term62368.getClass(), "hash2", 0);
        setIntField(term62368, term62368.getClass(), "hash3", 0);
        setField(term62368, term62368.getClass(), "key1", null);
        setField(term62368, term62368.getClass(), "key2", null);
        setField(term62368, term62368.getClass(), "key3", null);
        setField(term62368, term62368.getClass(), "value1", null);
        setField(term62368, term62368.getClass(), "value2", null);
        setField(term62368, term62368.getClass(), "value3", null);
        setFloatField(term62369, term62369.getClass(), "loadFactor", 0.75F);
        setIntField(term62369, term62369.getClass(), "size", 1);
        setField(term62371, term62371.getClass(), "next", null);
        setIntField(term62372, term62372.getClass(), "size", 2);
        setIntField(term62372, term62372.getClass(), "hash1", 0);
        setIntField(term62372, term62372.getClass(), "hash2", 0);
        setIntField(term62372, term62372.getClass(), "hash3", 0);
        setField(term62372, term62372.getClass(), "key1", null);
        setField(term62372, term62372.getClass(), "key2", null);
        setField(term62372, term62372.getClass(), "key3", null);
        setField(term62372, term62372.getClass(), "value1", null);
        setField(term62372, term62372.getClass(), "value2", null);
        setField(term62372, term62372.getClass(), "value3", null);
        setField(term62372, term62372.getClass(), "delegateMap", null);
        setField(term62371, term62371.getClass(), "key", term62372);
        setField(term62371, term62371.getClass(), "value", null);
        setElement(term62370, 0, term62371);
        setField(term62369, term62369.getClass(), "data", term62370);
        setIntField(term62369, term62369.getClass(), "threshold", 12);
        setIntField(term62369, term62369.getClass(), "modCount", 1);
        setField(term62369, term62369.getClass(), "entrySet", null);
        setField(term62369, term62369.getClass(), "keySet", null);
        setField(term62369, term62369.getClass(), "values", null);
        setField(term62369, term62369.getClass(), "keySet", null);
        setField(term62369, term62369.getClass(), "values", null);
        setField(term62368, term62368.getClass(), "delegateMap", term62369);
        term62373 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term62373, term62373.getClass(), "size", 2);
        setIntField(term62373, term62373.getClass(), "hash1", 0);
        setIntField(term62373, term62373.getClass(), "hash2", 0);
        setIntField(term62373, term62373.getClass(), "hash3", 0);
        setField(term62373, term62373.getClass(), "key1", null);
        setField(term62373, term62373.getClass(), "key2", null);
        setField(term62373, term62373.getClass(), "key3", null);
        setField(term62373, term62373.getClass(), "value1", null);
        setField(term62373, term62373.getClass(), "value2", null);
        setField(term62373, term62373.getClass(), "value3", null);
        setField(term62373, term62373.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term62292;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term62200, args);
        assertTrue(recursiveEquals(term62200, term62368));
        assertTrue(recursiveEquals(term62292, term62373));
        assertTrue(recursiveEquals(retValue, null));
    }

};


