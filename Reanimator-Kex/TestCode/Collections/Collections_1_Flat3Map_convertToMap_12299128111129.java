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

public class Flat3Map_convertToMap_12299128111129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term230911;
     Object term231850;

    public Flat3Map_convertToMap_12299128111129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term231051 = new HashMap();
        term230911 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term231003 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term231091 = newInstance(Class.forName("java.lang.Class$2"));
        setField(term230911, term230911.getClass(), "delegateMap", null);
        setIntField(term230911, term230911.getClass(), "size", 3);
        setField(term231003, term231003.getClass(), "delegateMap", null);
        setIntField(term231003, term231003.getClass(), "size", 0);
        setField(term230911, term230911.getClass(), "key3", term231003);
        setField(term230911, term230911.getClass(), "value3", term231051);
        setField(term230911, term230911.getClass(), "key2", null);
        setField(term230911, term230911.getClass(), "value2", null);
        setField(term230911, term230911.getClass(), "key1", null);
        setField(term230911, term230911.getClass(), "value1", term231091);
        term231850 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term231851 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term231852 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term231853 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term231854 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term231855 = newInstance(Class.forName("java.lang.Object"));
        Object term231856 = newInstance(Class.forName("java.lang.Class$2"));
        setIntField(term231850, term231850.getClass(), "size", 0);
        setIntField(term231850, term231850.getClass(), "hash1", 0);
        setIntField(term231850, term231850.getClass(), "hash2", 0);
        setIntField(term231850, term231850.getClass(), "hash3", 0);
        setField(term231850, term231850.getClass(), "key1", null);
        setField(term231850, term231850.getClass(), "key2", null);
        setField(term231850, term231850.getClass(), "key3", null);
        setField(term231850, term231850.getClass(), "value1", null);
        setField(term231850, term231850.getClass(), "value2", null);
        setField(term231850, term231850.getClass(), "value3", null);
        setFloatField(term231851, term231851.getClass(), "loadFactor", 0.75F);
        setIntField(term231851, term231851.getClass(), "size", 2);
        setField(term231854, term231854.getClass(), "next", null);
        setField(term231854, term231854.getClass(), "key", null);
        setField(term231854, term231854.getClass(), "value", null);
        setField(term231853, term231853.getClass(), "next", term231854);
        setField(term231853, term231853.getClass(), "key", term231855);
        setField(term231856, term231856.getClass(), "this$0", null);
        setField(term231853, term231853.getClass(), "value", term231856);
        setElement(term231852, 0, term231853);
        setField(term231851, term231851.getClass(), "data", term231852);
        setIntField(term231851, term231851.getClass(), "threshold", 12);
        setIntField(term231851, term231851.getClass(), "modCount", 2);
        setField(term231851, term231851.getClass(), "entrySet", null);
        setField(term231851, term231851.getClass(), "keySet", null);
        setField(term231851, term231851.getClass(), "values", null);
        setField(term231851, term231851.getClass(), "keySet", null);
        setField(term231851, term231851.getClass(), "values", null);
        setField(term231850, term231850.getClass(), "delegateMap", term231851);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "convertToMap", argTypes, term230911, args);
        assertTrue(recursiveEquals(term230911, term231850));
    }

};
