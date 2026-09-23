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

public class Flat3Map_put_1944740725609 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128225;
     Object term128447;
     Object term128930;
     Object term128938;

    public Flat3Map_put_1944740725609() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term128225 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term128317 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term128355 = newInstance(Class.forName("java.lang.Object"));
        setField(term128225, term128225.getClass(), "delegateMap", null);
        setIntField(term128225, term128225.getClass(), "size", 3);
        setIntField(term128225, term128225.getClass(), "hash3", 0);
        setField(term128317, term128317.getClass(), "delegateMap", null);
        setIntField(term128317, term128317.getClass(), "size", 3);
        setField(term128317, term128317.getClass(), "key3", term128355);
        setField(term128317, term128317.getClass(), "key2", null);
        setField(term128317, term128317.getClass(), "value2", null);
        setIntField(term128317, term128317.getClass(), "hash3", 0);
        setField(term128225, term128225.getClass(), "key3", term128317);
        term128447 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term128539 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term128447, term128447.getClass(), "delegateMap", null);
        setIntField(term128447, term128447.getClass(), "size", 3);
        setIntField(term128447, term128447.getClass(), "hash3", 0);
        setField(term128447, term128447.getClass(), "value3", null);
        setIntField(term128447, term128447.getClass(), "hash2", 0);
        setField(term128447, term128447.getClass(), "value2", null);
        setIntField(term128447, term128447.getClass(), "hash1", 0);
        setField(term128447, term128447.getClass(), "value1", null);
        setField(term128447, term128447.getClass(), "key3", null);
        setField(term128539, term128539.getClass(), "delegateMap", null);
        setIntField(term128539, term128539.getClass(), "size", 2);
        setIntField(term128539, term128539.getClass(), "hash2", 0);
        setField(term128539, term128539.getClass(), "value2", null);
        setIntField(term128539, term128539.getClass(), "hash1", 0);
        setField(term128539, term128539.getClass(), "value1", null);
        setField(term128447, term128447.getClass(), "key2", term128539);
        term128930 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term128931 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term128932 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term128933 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term128934 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term128935 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term128936 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term128937 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term128930, term128930.getClass(), "size", 0);
        setIntField(term128930, term128930.getClass(), "hash1", 0);
        setIntField(term128930, term128930.getClass(), "hash2", 0);
        setIntField(term128930, term128930.getClass(), "hash3", 0);
        setField(term128930, term128930.getClass(), "key1", null);
        setField(term128930, term128930.getClass(), "key2", null);
        setField(term128930, term128930.getClass(), "key3", null);
        setField(term128930, term128930.getClass(), "value1", null);
        setField(term128930, term128930.getClass(), "value2", null);
        setField(term128930, term128930.getClass(), "value3", null);
        setFloatField(term128931, term128931.getClass(), "loadFactor", 0.75F);
        setIntField(term128931, term128931.getClass(), "size", 3);
        setField(term128934, term128934.getClass(), "next", null);
        setField(term128934, term128934.getClass(), "key", null);
        setField(term128934, term128934.getClass(), "value", null);
        setField(term128933, term128933.getClass(), "next", term128934);
        setIntField(term128935, term128935.getClass(), "size", 3);
        setIntField(term128935, term128935.getClass(), "hash1", 0);
        setIntField(term128935, term128935.getClass(), "hash2", 0);
        setIntField(term128935, term128935.getClass(), "hash3", 0);
        setField(term128935, term128935.getClass(), "key1", null);
        setField(term128935, term128935.getClass(), "key2", null);
        setField(term128935, term128935.getClass(), "key3", null);
        setField(term128935, term128935.getClass(), "value1", null);
        setField(term128935, term128935.getClass(), "value2", null);
        setField(term128935, term128935.getClass(), "value3", null);
        setField(term128935, term128935.getClass(), "delegateMap", null);
        setField(term128933, term128933.getClass(), "key", term128935);
        setField(term128933, term128933.getClass(), "value", null);
        setElement(term128932, 0, term128933);
        setField(term128936, term128936.getClass(), "next", null);
        setField(term128936, term128936.getClass(), "key", term128937);
        setField(term128936, term128936.getClass(), "value", null);
        setElement(term128932, 5, term128936);
        setField(term128931, term128931.getClass(), "data", term128932);
        setIntField(term128931, term128931.getClass(), "threshold", 12);
        setIntField(term128931, term128931.getClass(), "modCount", 3);
        setField(term128931, term128931.getClass(), "entrySet", null);
        setField(term128931, term128931.getClass(), "keySet", null);
        setField(term128931, term128931.getClass(), "values", null);
        setField(term128931, term128931.getClass(), "keySet", null);
        setField(term128931, term128931.getClass(), "values", null);
        setField(term128930, term128930.getClass(), "delegateMap", term128931);
        term128938 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term128938, term128938.getClass(), "size", 3);
        setIntField(term128938, term128938.getClass(), "hash1", 0);
        setIntField(term128938, term128938.getClass(), "hash2", 0);
        setIntField(term128938, term128938.getClass(), "hash3", 0);
        setField(term128938, term128938.getClass(), "key1", null);
        setField(term128938, term128938.getClass(), "key2", null);
        setField(term128938, term128938.getClass(), "key3", null);
        setField(term128938, term128938.getClass(), "value1", null);
        setField(term128938, term128938.getClass(), "value2", null);
        setField(term128938, term128938.getClass(), "value3", null);
        setField(term128938, term128938.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term128447;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term128225, args);
        assertTrue(recursiveEquals(term128225, term128930));
        assertTrue(recursiveEquals(term128447, term128938));
        assertTrue(recursiveEquals(retValue, null));
    }

};


