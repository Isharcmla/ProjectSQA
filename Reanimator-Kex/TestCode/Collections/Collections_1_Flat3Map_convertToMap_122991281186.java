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

public class Flat3Map_convertToMap_122991281186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16727;
     Object term17293;

    public Flat3Map_convertToMap_122991281186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16727 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term16837 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term16727, term16727.getClass(), "delegateMap", term16837);
        setIntField(term16727, term16727.getClass(), "size", 2);
        term17293 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term17294 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term17295 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term17296 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term17297 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term17293, term17293.getClass(), "size", 0);
        setIntField(term17293, term17293.getClass(), "hash1", 0);
        setIntField(term17293, term17293.getClass(), "hash2", 0);
        setIntField(term17293, term17293.getClass(), "hash3", 0);
        setField(term17293, term17293.getClass(), "key1", null);
        setField(term17293, term17293.getClass(), "key2", null);
        setField(term17293, term17293.getClass(), "key3", null);
        setField(term17293, term17293.getClass(), "value1", null);
        setField(term17293, term17293.getClass(), "value2", null);
        setField(term17293, term17293.getClass(), "value3", null);
        setFloatField(term17294, term17294.getClass(), "loadFactor", 0.75F);
        setIntField(term17294, term17294.getClass(), "size", 1);
        setField(term17296, term17296.getClass(), "next", null);
        setField(term17296, term17296.getClass(), "key", term17297);
        setField(term17296, term17296.getClass(), "value", null);
        setElement(term17295, 0, term17296);
        setField(term17294, term17294.getClass(), "data", term17295);
        setIntField(term17294, term17294.getClass(), "threshold", 12);
        setIntField(term17294, term17294.getClass(), "modCount", 1);
        setField(term17294, term17294.getClass(), "entrySet", null);
        setField(term17294, term17294.getClass(), "keySet", null);
        setField(term17294, term17294.getClass(), "values", null);
        setField(term17294, term17294.getClass(), "keySet", null);
        setField(term17294, term17294.getClass(), "values", null);
        setField(term17293, term17293.getClass(), "delegateMap", term17294);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "convertToMap", argTypes, term16727, args);
        assertTrue(recursiveEquals(term16727, term17293));
    }

};
