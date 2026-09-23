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

public class Flat3Map_put_1944740725612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129140;
     Object term129416;
     Object term130168;
     Object term130176;

    public Flat3Map_put_1944740725612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term129140 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term129462 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term129508 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term129140, term129140.getClass(), "delegateMap", null);
        setIntField(term129140, term129140.getClass(), "size", 3);
        setIntField(term129140, term129140.getClass(), "hash3", 0);
        setField(term129462, term129462.getClass(), "delegateMap", null);
        setIntField(term129462, term129462.getClass(), "size", 0);
        setField(term129508, term129508.getClass(), "delegateMap", null);
        setIntField(term129508, term129508.getClass(), "size", 3);
        setField(term129462, term129462.getClass(), "key3", term129508);
        setField(term129462, term129462.getClass(), "key2", null);
        setField(term129462, term129462.getClass(), "value2", null);
        setIntField(term129462, term129462.getClass(), "hash3", 0);
        setField(term129140, term129140.getClass(), "key3", term129462);
        term129416 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term129416, term129416.getClass(), "delegateMap", null);
        setIntField(term129416, term129416.getClass(), "size", 3);
        setIntField(term129416, term129416.getClass(), "hash3", 0);
        setField(term129416, term129416.getClass(), "value3", null);
        setIntField(term129416, term129416.getClass(), "hash2", 0);
        setField(term129416, term129416.getClass(), "value2", null);
        setIntField(term129416, term129416.getClass(), "hash1", 0);
        setField(term129416, term129416.getClass(), "value1", null);
        setField(term129416, term129416.getClass(), "key3", null);
        setField(term129416, term129416.getClass(), "key2", null);
        setField(term129416, term129416.getClass(), "key1", term129462);
        term130168 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term130169 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term130170 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term130171 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term130172 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term130173 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term130174 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term130175 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term130168, term130168.getClass(), "size", 0);
        setIntField(term130168, term130168.getClass(), "hash1", 0);
        setIntField(term130168, term130168.getClass(), "hash2", 0);
        setIntField(term130168, term130168.getClass(), "hash3", 0);
        setField(term130168, term130168.getClass(), "key1", null);
        setField(term130168, term130168.getClass(), "key2", null);
        setField(term130168, term130168.getClass(), "key3", null);
        setField(term130168, term130168.getClass(), "value1", null);
        setField(term130168, term130168.getClass(), "value2", null);
        setField(term130168, term130168.getClass(), "value3", null);
        setFloatField(term130169, term130169.getClass(), "loadFactor", 0.75F);
        setIntField(term130169, term130169.getClass(), "size", 3);
        setField(term130172, term130172.getClass(), "next", null);
        setField(term130172, term130172.getClass(), "key", null);
        setField(term130172, term130172.getClass(), "value", null);
        setField(term130171, term130171.getClass(), "next", term130172);
        setIntField(term130173, term130173.getClass(), "size", 3);
        setIntField(term130173, term130173.getClass(), "hash1", 0);
        setIntField(term130173, term130173.getClass(), "hash2", 0);
        setIntField(term130173, term130173.getClass(), "hash3", 0);
        setField(term130173, term130173.getClass(), "key1", null);
        setField(term130173, term130173.getClass(), "key2", null);
        setField(term130173, term130173.getClass(), "key3", null);
        setField(term130173, term130173.getClass(), "value1", null);
        setField(term130173, term130173.getClass(), "value2", null);
        setField(term130173, term130173.getClass(), "value3", null);
        setField(term130173, term130173.getClass(), "delegateMap", null);
        setField(term130171, term130171.getClass(), "key", term130173);
        setField(term130171, term130171.getClass(), "value", null);
        setElement(term130170, 0, term130171);
        setField(term130174, term130174.getClass(), "next", null);
        setField(term130174, term130174.getClass(), "key", term130175);
        setField(term130174, term130174.getClass(), "value", null);
        setElement(term130170, 5, term130174);
        setField(term130169, term130169.getClass(), "data", term130170);
        setIntField(term130169, term130169.getClass(), "threshold", 12);
        setIntField(term130169, term130169.getClass(), "modCount", 3);
        setField(term130169, term130169.getClass(), "entrySet", null);
        setField(term130169, term130169.getClass(), "keySet", null);
        setField(term130169, term130169.getClass(), "values", null);
        setField(term130169, term130169.getClass(), "keySet", null);
        setField(term130169, term130169.getClass(), "values", null);
        setField(term130168, term130168.getClass(), "delegateMap", term130169);
        term130176 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term130176, term130176.getClass(), "size", 3);
        setIntField(term130176, term130176.getClass(), "hash1", 0);
        setIntField(term130176, term130176.getClass(), "hash2", 0);
        setIntField(term130176, term130176.getClass(), "hash3", 0);
        setField(term130176, term130176.getClass(), "key1", null);
        setField(term130176, term130176.getClass(), "key2", null);
        setField(term130176, term130176.getClass(), "key3", null);
        setField(term130176, term130176.getClass(), "value1", null);
        setField(term130176, term130176.getClass(), "value2", null);
        setField(term130176, term130176.getClass(), "value3", null);
        setField(term130176, term130176.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term129416;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term129140, args);
        assertTrue(recursiveEquals(term129140, term130168));
        assertTrue(recursiveEquals(term129416, term130176));
        assertTrue(recursiveEquals(retValue, null));
    }

};


