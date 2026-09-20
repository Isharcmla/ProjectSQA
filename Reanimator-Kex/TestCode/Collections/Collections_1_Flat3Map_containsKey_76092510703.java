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

public class Flat3Map_containsKey_76092510703 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139260;
     Object term139352;
     Object term139642;
     Object term139643;

    public Flat3Map_containsKey_76092510703() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term139260 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term139260, term139260.getClass(), "delegateMap", null);
        setIntField(term139260, term139260.getClass(), "size", 2);
        setIntField(term139260, term139260.getClass(), "hash2", 0);
        setField(term139260, term139260.getClass(), "key2", term139260);
        term139352 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term139462 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term139352, term139352.getClass(), "delegateMap", null);
        setIntField(term139352, term139352.getClass(), "size", 2);
        setIntField(term139352, term139352.getClass(), "hash2", 0);
        setIntField(term139462, term139462.getClass(), "size", 0);
        setField(term139352, term139352.getClass(), "value2", term139462);
        setIntField(term139352, term139352.getClass(), "hash1", 0);
        setField(term139352, term139352.getClass(), "value1", null);
        term139642 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term139642, term139642.getClass(), "size", 2);
        setIntField(term139642, term139642.getClass(), "hash1", 0);
        setIntField(term139642, term139642.getClass(), "hash2", 0);
        setIntField(term139642, term139642.getClass(), "hash3", 0);
        setField(term139642, term139642.getClass(), "key1", null);
        setField(term139642, term139642.getClass(), "key2", term139642);
        setField(term139642, term139642.getClass(), "key3", null);
        setField(term139642, term139642.getClass(), "value1", null);
        setField(term139642, term139642.getClass(), "value2", null);
        setField(term139642, term139642.getClass(), "value3", null);
        setField(term139642, term139642.getClass(), "delegateMap", null);
        term139643 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term139644 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term139643, term139643.getClass(), "size", 2);
        setIntField(term139643, term139643.getClass(), "hash1", 0);
        setIntField(term139643, term139643.getClass(), "hash2", 0);
        setIntField(term139643, term139643.getClass(), "hash3", 0);
        setField(term139643, term139643.getClass(), "key1", null);
        setField(term139643, term139643.getClass(), "key2", null);
        setField(term139643, term139643.getClass(), "key3", null);
        setField(term139643, term139643.getClass(), "value1", null);
        setFloatField(term139644, term139644.getClass(), "loadFactor", 0.0F);
        setIntField(term139644, term139644.getClass(), "size", 0);
        setField(term139644, term139644.getClass(), "data", null);
        setIntField(term139644, term139644.getClass(), "threshold", 0);
        setIntField(term139644, term139644.getClass(), "modCount", 0);
        setField(term139644, term139644.getClass(), "entrySet", null);
        setField(term139644, term139644.getClass(), "keySet", null);
        setField(term139644, term139644.getClass(), "values", null);
        setField(term139644, term139644.getClass(), "keySet", null);
        setField(term139644, term139644.getClass(), "values", null);
        setField(term139643, term139643.getClass(), "value2", term139644);
        setField(term139643, term139643.getClass(), "value3", null);
        setField(term139643, term139643.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term139352;
        callMethod(klass, "containsKey", argTypes, term139260, args);
        assertTrue(recursiveEquals(term139260, term139642));
        assertTrue(recursiveEquals(term139352, term139643));
    }

};
