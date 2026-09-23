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

public class Flat3Map_put_1944740725672 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term152921;
     Object term153273;
     Object term154223;
     Object term154233;

    public Flat3Map_put_1944740725672() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term152921 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term153013 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term153105 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term153143 = newInstance(Class.forName("java.lang.Object"));
        Object term153181 = newInstance(Class.forName("java.lang.Object"));
        setField(term152921, term152921.getClass(), "delegateMap", null);
        setIntField(term152921, term152921.getClass(), "size", 3);
        setIntField(term152921, term152921.getClass(), "hash3", 0);
        setField(term153013, term153013.getClass(), "delegateMap", null);
        setIntField(term153013, term153013.getClass(), "size", 3);
        setField(term153105, term153105.getClass(), "delegateMap", null);
        setIntField(term153105, term153105.getClass(), "size", 0);
        setField(term153013, term153013.getClass(), "key3", term153105);
        setField(term153013, term153013.getClass(), "key2", null);
        setField(term153013, term153013.getClass(), "value2", null);
        setIntField(term153013, term153013.getClass(), "hash3", 0);
        setField(term153013, term153013.getClass(), "value3", term153143);
        setField(term152921, term152921.getClass(), "key3", term153013);
        setIntField(term152921, term152921.getClass(), "hash2", 0);
        setField(term152921, term152921.getClass(), "key2", term153181);
        setIntField(term152921, term152921.getClass(), "hash1", -1);
        term153273 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term153365 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term153273, term153273.getClass(), "delegateMap", null);
        setIntField(term153273, term153273.getClass(), "size", 3);
        setIntField(term153273, term153273.getClass(), "hash3", 0);
        setField(term153273, term153273.getClass(), "value3", null);
        setIntField(term153273, term153273.getClass(), "hash2", 0);
        setField(term153273, term153273.getClass(), "value2", null);
        setIntField(term153273, term153273.getClass(), "hash1", 0);
        setField(term153273, term153273.getClass(), "value1", null);
        setField(term153273, term153273.getClass(), "key3", null);
        setField(term153365, term153365.getClass(), "delegateMap", null);
        setIntField(term153365, term153365.getClass(), "size", 0);
        setField(term153273, term153273.getClass(), "key2", term153365);
        term154223 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term154224 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term154225 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term154226 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term154227 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term154228 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term154229 = newInstance(Class.forName("java.lang.Object"));
        Object term154230 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term154231 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term154232 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term154223, term154223.getClass(), "size", 0);
        setIntField(term154223, term154223.getClass(), "hash1", 0);
        setIntField(term154223, term154223.getClass(), "hash2", 0);
        setIntField(term154223, term154223.getClass(), "hash3", 0);
        setField(term154223, term154223.getClass(), "key1", null);
        setField(term154223, term154223.getClass(), "key2", null);
        setField(term154223, term154223.getClass(), "key3", null);
        setField(term154223, term154223.getClass(), "value1", null);
        setField(term154223, term154223.getClass(), "value2", null);
        setField(term154223, term154223.getClass(), "value3", null);
        setFloatField(term154224, term154224.getClass(), "loadFactor", 0.75F);
        setIntField(term154224, term154224.getClass(), "size", 4);
        setField(term154226, term154226.getClass(), "next", null);
        setIntField(term154227, term154227.getClass(), "size", 3);
        setIntField(term154227, term154227.getClass(), "hash1", 0);
        setIntField(term154227, term154227.getClass(), "hash2", 0);
        setIntField(term154227, term154227.getClass(), "hash3", 0);
        setField(term154227, term154227.getClass(), "key1", null);
        setField(term154227, term154227.getClass(), "key2", null);
        setField(term154227, term154227.getClass(), "key3", null);
        setField(term154227, term154227.getClass(), "value1", null);
        setField(term154227, term154227.getClass(), "value2", null);
        setField(term154227, term154227.getClass(), "value3", null);
        setField(term154227, term154227.getClass(), "delegateMap", null);
        setField(term154226, term154226.getClass(), "key", term154227);
        setField(term154226, term154226.getClass(), "value", null);
        setElement(term154225, 0, term154226);
        setField(term154228, term154228.getClass(), "next", null);
        setField(term154228, term154228.getClass(), "key", term154229);
        setField(term154228, term154228.getClass(), "value", null);
        setElement(term154225, 5, term154228);
        setField(term154231, term154231.getClass(), "next", null);
        setField(term154231, term154231.getClass(), "key", null);
        setField(term154231, term154231.getClass(), "value", null);
        setField(term154230, term154230.getClass(), "next", term154231);
        setField(term154230, term154230.getClass(), "key", term154232);
        setField(term154230, term154230.getClass(), "value", null);
        setElement(term154225, 10, term154230);
        setField(term154224, term154224.getClass(), "data", term154225);
        setIntField(term154224, term154224.getClass(), "threshold", 12);
        setIntField(term154224, term154224.getClass(), "modCount", 4);
        setField(term154224, term154224.getClass(), "entrySet", null);
        setField(term154224, term154224.getClass(), "keySet", null);
        setField(term154224, term154224.getClass(), "values", null);
        setField(term154224, term154224.getClass(), "keySet", null);
        setField(term154224, term154224.getClass(), "values", null);
        setField(term154223, term154223.getClass(), "delegateMap", term154224);
        term154233 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term154233, term154233.getClass(), "size", 3);
        setIntField(term154233, term154233.getClass(), "hash1", 0);
        setIntField(term154233, term154233.getClass(), "hash2", 0);
        setIntField(term154233, term154233.getClass(), "hash3", 0);
        setField(term154233, term154233.getClass(), "key1", null);
        setField(term154233, term154233.getClass(), "key2", null);
        setField(term154233, term154233.getClass(), "key3", null);
        setField(term154233, term154233.getClass(), "value1", null);
        setField(term154233, term154233.getClass(), "value2", null);
        setField(term154233, term154233.getClass(), "value3", null);
        setField(term154233, term154233.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term153273;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term152921, args);
        assertTrue(recursiveEquals(term152921, term154223));
        assertTrue(recursiveEquals(term153273, term154233));
        assertTrue(recursiveEquals(retValue, null));
    }

};


