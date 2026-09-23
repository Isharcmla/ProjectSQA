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

public class Flat3Map_put_1944740725515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97791;
     Object term98067;
     Object term98299;
     Object term98304;

    public Flat3Map_put_1944740725515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97791 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term97883 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term97975 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term97791, term97791.getClass(), "delegateMap", null);
        setIntField(term97791, term97791.getClass(), "size", 2);
        setIntField(term97791, term97791.getClass(), "hash2", 0);
        setField(term97883, term97883.getClass(), "delegateMap", null);
        setIntField(term97883, term97883.getClass(), "size", -3);
        setField(term97791, term97791.getClass(), "key2", term97883);
        setIntField(term97791, term97791.getClass(), "hash1", 0);
        setField(term97975, term97975.getClass(), "delegateMap", null);
        setIntField(term97975, term97975.getClass(), "size", 2);
        setField(term97791, term97791.getClass(), "key1", term97975);
        term98067 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term98177 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term98067, term98067.getClass(), "delegateMap", null);
        setIntField(term98067, term98067.getClass(), "size", 2);
        setIntField(term98067, term98067.getClass(), "hash2", 0);
        setField(term98067, term98067.getClass(), "value2", null);
        setIntField(term98067, term98067.getClass(), "hash1", 0);
        setField(term98067, term98067.getClass(), "value1", null);
        setField(term98067, term98067.getClass(), "key2", term98177);
        term98299 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term98300 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term98301 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term98302 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term98303 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term98299, term98299.getClass(), "size", 3);
        setIntField(term98299, term98299.getClass(), "hash1", 0);
        setIntField(term98299, term98299.getClass(), "hash2", 0);
        setIntField(term98299, term98299.getClass(), "hash3", 0);
        setIntField(term98300, term98300.getClass(), "size", 2);
        setIntField(term98300, term98300.getClass(), "hash1", 0);
        setIntField(term98300, term98300.getClass(), "hash2", 0);
        setIntField(term98300, term98300.getClass(), "hash3", 0);
        setField(term98300, term98300.getClass(), "key1", null);
        setField(term98300, term98300.getClass(), "key2", null);
        setField(term98300, term98300.getClass(), "key3", null);
        setField(term98300, term98300.getClass(), "value1", null);
        setField(term98300, term98300.getClass(), "value2", null);
        setField(term98300, term98300.getClass(), "value3", null);
        setField(term98300, term98300.getClass(), "delegateMap", null);
        setField(term98299, term98299.getClass(), "key1", term98300);
        setIntField(term98301, term98301.getClass(), "size", -3);
        setIntField(term98301, term98301.getClass(), "hash1", 0);
        setIntField(term98301, term98301.getClass(), "hash2", 0);
        setIntField(term98301, term98301.getClass(), "hash3", 0);
        setField(term98301, term98301.getClass(), "key1", null);
        setField(term98301, term98301.getClass(), "key2", null);
        setField(term98301, term98301.getClass(), "key3", null);
        setField(term98301, term98301.getClass(), "value1", null);
        setField(term98301, term98301.getClass(), "value2", null);
        setField(term98301, term98301.getClass(), "value3", null);
        setField(term98301, term98301.getClass(), "delegateMap", null);
        setField(term98299, term98299.getClass(), "key2", term98301);
        setIntField(term98302, term98302.getClass(), "size", 2);
        setIntField(term98302, term98302.getClass(), "hash1", 0);
        setIntField(term98302, term98302.getClass(), "hash2", 0);
        setIntField(term98302, term98302.getClass(), "hash3", 0);
        setField(term98302, term98302.getClass(), "key1", null);
        setFloatField(term98303, term98303.getClass(), "loadFactor", 0.0F);
        setIntField(term98303, term98303.getClass(), "size", 0);
        setField(term98303, term98303.getClass(), "data", null);
        setIntField(term98303, term98303.getClass(), "threshold", 0);
        setIntField(term98303, term98303.getClass(), "modCount", 0);
        setField(term98303, term98303.getClass(), "entrySet", null);
        setField(term98303, term98303.getClass(), "keySet", null);
        setField(term98303, term98303.getClass(), "values", null);
        setField(term98303, term98303.getClass(), "keySet", null);
        setField(term98303, term98303.getClass(), "values", null);
        setField(term98302, term98302.getClass(), "key2", term98303);
        setField(term98302, term98302.getClass(), "key3", null);
        setField(term98302, term98302.getClass(), "value1", null);
        setField(term98302, term98302.getClass(), "value2", null);
        setField(term98302, term98302.getClass(), "value3", null);
        setField(term98302, term98302.getClass(), "delegateMap", null);
        setField(term98299, term98299.getClass(), "key3", term98302);
        setField(term98299, term98299.getClass(), "value1", null);
        setField(term98299, term98299.getClass(), "value2", null);
        setField(term98299, term98299.getClass(), "value3", null);
        setField(term98299, term98299.getClass(), "delegateMap", null);
        term98304 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term98305 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term98304, term98304.getClass(), "size", 2);
        setIntField(term98304, term98304.getClass(), "hash1", 0);
        setIntField(term98304, term98304.getClass(), "hash2", 0);
        setIntField(term98304, term98304.getClass(), "hash3", 0);
        setField(term98304, term98304.getClass(), "key1", null);
        setFloatField(term98305, term98305.getClass(), "loadFactor", 0.0F);
        setIntField(term98305, term98305.getClass(), "size", 0);
        setField(term98305, term98305.getClass(), "data", null);
        setIntField(term98305, term98305.getClass(), "threshold", 0);
        setIntField(term98305, term98305.getClass(), "modCount", 0);
        setField(term98305, term98305.getClass(), "entrySet", null);
        setField(term98305, term98305.getClass(), "keySet", null);
        setField(term98305, term98305.getClass(), "values", null);
        setField(term98305, term98305.getClass(), "keySet", null);
        setField(term98305, term98305.getClass(), "values", null);
        setField(term98304, term98304.getClass(), "key2", term98305);
        setField(term98304, term98304.getClass(), "key3", null);
        setField(term98304, term98304.getClass(), "value1", null);
        setField(term98304, term98304.getClass(), "value2", null);
        setField(term98304, term98304.getClass(), "value3", null);
        setField(term98304, term98304.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term98067;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term97791, args);
        assertTrue(recursiveEquals(term97791, term98299));
        assertTrue(recursiveEquals(term98067, term98304));
        assertTrue(recursiveEquals(retValue, null));
    }

};


