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

public class Flat3Map_get_229621781716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142294;
     Object term142588;
     Object term143369;
     Object term143372;

    public Flat3Map_get_229621781716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term142294 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term142386 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term142496 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term142294, term142294.getClass(), "delegateMap", null);
        setIntField(term142294, term142294.getClass(), "size", 3);
        setIntField(term142294, term142294.getClass(), "hash3", 0);
        setField(term142386, term142386.getClass(), "delegateMap", null);
        setIntField(term142386, term142386.getClass(), "size", 3);
        setField(term142386, term142386.getClass(), "key3", term142496);
        setField(term142386, term142386.getClass(), "key2", null);
        setField(term142386, term142386.getClass(), "value2", null);
        setIntField(term142386, term142386.getClass(), "hash3", -1);
        setField(term142294, term142294.getClass(), "key3", term142386);
        term142588 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term142680 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term142588, term142588.getClass(), "delegateMap", null);
        setIntField(term142588, term142588.getClass(), "size", 3);
        setIntField(term142588, term142588.getClass(), "hash3", 0);
        setField(term142588, term142588.getClass(), "value3", null);
        setIntField(term142588, term142588.getClass(), "hash2", 0);
        setField(term142588, term142588.getClass(), "value2", null);
        setIntField(term142588, term142588.getClass(), "hash1", 0);
        setField(term142588, term142588.getClass(), "value1", null);
        setField(term142588, term142588.getClass(), "key3", null);
        setField(term142588, term142588.getClass(), "key2", null);
        setField(term142680, term142680.getClass(), "delegateMap", null);
        setIntField(term142680, term142680.getClass(), "size", 0);
        setField(term142588, term142588.getClass(), "key1", term142680);
        term143369 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term143370 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term143371 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term143369, term143369.getClass(), "size", 3);
        setIntField(term143369, term143369.getClass(), "hash1", 0);
        setIntField(term143369, term143369.getClass(), "hash2", 0);
        setIntField(term143369, term143369.getClass(), "hash3", 0);
        setField(term143369, term143369.getClass(), "key1", null);
        setField(term143369, term143369.getClass(), "key2", null);
        setIntField(term143370, term143370.getClass(), "size", 3);
        setIntField(term143370, term143370.getClass(), "hash1", 0);
        setIntField(term143370, term143370.getClass(), "hash2", 0);
        setIntField(term143370, term143370.getClass(), "hash3", -1);
        setField(term143370, term143370.getClass(), "key1", null);
        setField(term143370, term143370.getClass(), "key2", null);
        setFloatField(term143371, term143371.getClass(), "loadFactor", 0.0F);
        setIntField(term143371, term143371.getClass(), "size", 0);
        setField(term143371, term143371.getClass(), "data", null);
        setIntField(term143371, term143371.getClass(), "threshold", 0);
        setIntField(term143371, term143371.getClass(), "modCount", 0);
        setField(term143371, term143371.getClass(), "entrySet", null);
        setField(term143371, term143371.getClass(), "keySet", null);
        setField(term143371, term143371.getClass(), "values", null);
        setField(term143371, term143371.getClass(), "keySet", null);
        setField(term143371, term143371.getClass(), "values", null);
        setField(term143370, term143370.getClass(), "key3", term143371);
        setField(term143370, term143370.getClass(), "value1", null);
        setField(term143370, term143370.getClass(), "value2", null);
        setField(term143370, term143370.getClass(), "value3", null);
        setField(term143370, term143370.getClass(), "delegateMap", null);
        setField(term143369, term143369.getClass(), "key3", term143370);
        setField(term143369, term143369.getClass(), "value1", null);
        setField(term143369, term143369.getClass(), "value2", null);
        setField(term143369, term143369.getClass(), "value3", null);
        setField(term143369, term143369.getClass(), "delegateMap", null);
        term143372 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term143373 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term143372, term143372.getClass(), "size", 3);
        setIntField(term143372, term143372.getClass(), "hash1", 0);
        setIntField(term143372, term143372.getClass(), "hash2", 0);
        setIntField(term143372, term143372.getClass(), "hash3", 0);
        setIntField(term143373, term143373.getClass(), "size", 0);
        setIntField(term143373, term143373.getClass(), "hash1", 0);
        setIntField(term143373, term143373.getClass(), "hash2", 0);
        setIntField(term143373, term143373.getClass(), "hash3", 0);
        setField(term143373, term143373.getClass(), "key1", null);
        setField(term143373, term143373.getClass(), "key2", null);
        setField(term143373, term143373.getClass(), "key3", null);
        setField(term143373, term143373.getClass(), "value1", null);
        setField(term143373, term143373.getClass(), "value2", null);
        setField(term143373, term143373.getClass(), "value3", null);
        setField(term143373, term143373.getClass(), "delegateMap", null);
        setField(term143372, term143372.getClass(), "key1", term143373);
        setField(term143372, term143372.getClass(), "key2", null);
        setField(term143372, term143372.getClass(), "key3", null);
        setField(term143372, term143372.getClass(), "value1", null);
        setField(term143372, term143372.getClass(), "value2", null);
        setField(term143372, term143372.getClass(), "value3", null);
        setField(term143372, term143372.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term142588;
        Object retValue = callMethod(klass, "get", argTypes, term142294, args);
        assertTrue(recursiveEquals(term142294, term143369));
        assertTrue(recursiveEquals(term142588, term143372));
        assertTrue(recursiveEquals(retValue, null));
    }

};
