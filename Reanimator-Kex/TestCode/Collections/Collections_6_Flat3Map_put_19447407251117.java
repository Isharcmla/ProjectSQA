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

public class Flat3Map_put_19447407251117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term333527;
     Object term333809;
     Object term334576;
     Object term334585;

    public Flat3Map_put_19447407251117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term333527 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term333619 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term333717 = newInstance(Class.forName("org.apache.commons.collections.map.IdentityMap"));
        setField(term333527, term333527.getClass(), "delegateMap", null);
        setIntField(term333527, term333527.getClass(), "size", 3);
        setIntField(term333527, term333527.getClass(), "hash3", -978471168);
        setField(term333527, term333527.getClass(), "key3", null);
        setIntField(term333527, term333527.getClass(), "hash2", -978471168);
        setField(term333527, term333527.getClass(), "key2", null);
        setIntField(term333527, term333527.getClass(), "hash1", -978471168);
        setIntField(term333717, term333717.getClass(), "size", 0);
        setField(term333619, term333619.getClass(), "delegateMap", term333717);
        setField(term333527, term333527.getClass(), "key1", term333619);
        setField(term333527, term333527.getClass(), "value3", null);
        setField(term333527, term333527.getClass(), "value2", null);
        setField(term333527, term333527.getClass(), "value1", null);
        term333809 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term333903 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        setField(term333809, term333809.getClass(), "delegateMap", null);
        setIntField(term333809, term333809.getClass(), "size", 3);
        setIntField(term333809, term333809.getClass(), "hash3", 1091044369);
        setField(term333809, term333809.getClass(), "value3", null);
        setIntField(term333809, term333809.getClass(), "hash2", 470388783);
        setField(term333809, term333809.getClass(), "value2", null);
        setIntField(term333809, term333809.getClass(), "hash1", 1755062976);
        setIntField(term333903, term333903.getClass(), "size", 0);
        setField(term333809, term333809.getClass(), "value1", term333903);
        term334576 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term334577 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term334578 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term334579 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term334580 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term334581 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term334582 = newInstance(Class.forName("java.lang.Object"));
        Object term334583 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term334584 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term334576, term334576.getClass(), "size", 0);
        setIntField(term334576, term334576.getClass(), "hash1", 0);
        setIntField(term334576, term334576.getClass(), "hash2", 0);
        setIntField(term334576, term334576.getClass(), "hash3", 0);
        setField(term334576, term334576.getClass(), "key1", null);
        setField(term334576, term334576.getClass(), "key2", null);
        setField(term334576, term334576.getClass(), "key3", null);
        setField(term334576, term334576.getClass(), "value1", null);
        setField(term334576, term334576.getClass(), "value2", null);
        setField(term334576, term334576.getClass(), "value3", null);
        setFloatField(term334577, term334577.getClass(), "loadFactor", 0.75F);
        setIntField(term334577, term334577.getClass(), "size", 3);
        setField(term334579, term334579.getClass(), "next", null);
        setIntField(term334580, term334580.getClass(), "size", 0);
        setIntField(term334580, term334580.getClass(), "hash1", 0);
        setIntField(term334580, term334580.getClass(), "hash2", 0);
        setIntField(term334580, term334580.getClass(), "hash3", 0);
        setField(term334580, term334580.getClass(), "key1", null);
        setField(term334580, term334580.getClass(), "key2", null);
        setField(term334580, term334580.getClass(), "key3", null);
        setField(term334580, term334580.getClass(), "value1", null);
        setField(term334580, term334580.getClass(), "value2", null);
        setField(term334580, term334580.getClass(), "value3", null);
        setField(term334580, term334580.getClass(), "delegateMap", null);
        setField(term334579, term334579.getClass(), "key", term334580);
        setField(term334579, term334579.getClass(), "value", null);
        setElement(term334578, 0, term334579);
        setField(term334581, term334581.getClass(), "next", null);
        setField(term334581, term334581.getClass(), "key", term334582);
        setField(term334581, term334581.getClass(), "value", null);
        setElement(term334578, 6, term334581);
        setField(term334583, term334583.getClass(), "next", null);
        setIntField(term334584, term334584.getClass(), "size", 3);
        setIntField(term334584, term334584.getClass(), "hash1", 1755062976);
        setIntField(term334584, term334584.getClass(), "hash2", 470388783);
        setIntField(term334584, term334584.getClass(), "hash3", 1091044369);
        setField(term334584, term334584.getClass(), "key1", null);
        setField(term334584, term334584.getClass(), "key2", null);
        setField(term334584, term334584.getClass(), "key3", null);
        setField(term334584, term334584.getClass(), "value1", null);
        setField(term334584, term334584.getClass(), "value2", null);
        setField(term334584, term334584.getClass(), "value3", null);
        setField(term334584, term334584.getClass(), "delegateMap", null);
        setField(term334583, term334583.getClass(), "key", term334584);
        setField(term334583, term334583.getClass(), "value", null);
        setElement(term334578, 14, term334583);
        setField(term334577, term334577.getClass(), "data", term334578);
        setIntField(term334577, term334577.getClass(), "threshold", 12);
        setIntField(term334577, term334577.getClass(), "modCount", 3);
        setField(term334577, term334577.getClass(), "entrySet", null);
        setField(term334577, term334577.getClass(), "keySet", null);
        setField(term334577, term334577.getClass(), "values", null);
        setField(term334577, term334577.getClass(), "keySet", null);
        setField(term334577, term334577.getClass(), "values", null);
        setField(term334576, term334576.getClass(), "delegateMap", term334577);
        term334585 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term334585, term334585.getClass(), "size", 3);
        setIntField(term334585, term334585.getClass(), "hash1", 1755062976);
        setIntField(term334585, term334585.getClass(), "hash2", 470388783);
        setIntField(term334585, term334585.getClass(), "hash3", 1091044369);
        setField(term334585, term334585.getClass(), "key1", null);
        setField(term334585, term334585.getClass(), "key2", null);
        setField(term334585, term334585.getClass(), "key3", null);
        setField(term334585, term334585.getClass(), "value1", null);
        setField(term334585, term334585.getClass(), "value2", null);
        setField(term334585, term334585.getClass(), "value3", null);
        setField(term334585, term334585.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term333809;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term333527, args);
        assertTrue(recursiveEquals(term333527, term334576));
        assertTrue(recursiveEquals(term333809, term334585));
        assertTrue(recursiveEquals(retValue, null));
    }

};


