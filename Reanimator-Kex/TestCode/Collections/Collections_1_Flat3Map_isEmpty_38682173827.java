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

public class Flat3Map_isEmpty_38682173827 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59;
     Object term6426;

    public Flat3Map_isEmpty_38682173827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term64 = newInstance(Class.forName("java.lang.Object"));
        Object term65 = newInstance(Class.forName("java.lang.Object"));
        Object term66 = newInstance(Class.forName("java.lang.Object"));
        Object term67 = newInstance(Class.forName("java.lang.Object"));
        Object term68 = newInstance(Class.forName("java.lang.Object"));
        Object term69 = newInstance(Class.forName("java.lang.Object"));
        Object term70 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term59, term59.getClass(), "size", -268815336);
        setIntField(term59, term59.getClass(), "hash1", -1210583429);
        setIntField(term59, term59.getClass(), "hash2", -663691365);
        setIntField(term59, term59.getClass(), "hash3", 339854490);
        setField(term59, term59.getClass(), "key1", term64);
        setField(term59, term59.getClass(), "key2", term65);
        setField(term59, term59.getClass(), "key3", term66);
        setField(term59, term59.getClass(), "value1", term67);
        setField(term59, term59.getClass(), "value2", term68);
        setField(term59, term59.getClass(), "value3", term69);
        setFloatField(term70, term70.getClass(), "loadFactor", 0.0F);
        setIntField(term70, term70.getClass(), "size", 0);
        setField(term70, term70.getClass(), "data", null);
        setIntField(term70, term70.getClass(), "threshold", 0);
        setIntField(term70, term70.getClass(), "modCount", 0);
        setField(term70, term70.getClass(), "entrySet", null);
        setField(term70, term70.getClass(), "keySet", null);
        setField(term70, term70.getClass(), "values", null);
        setField(term70, term70.getClass(), "keySet", null);
        setField(term70, term70.getClass(), "values", null);
        setField(term59, term59.getClass(), "delegateMap", term70);
        term6426 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term6427 = newInstance(Class.forName("java.lang.Object"));
        Object term6428 = newInstance(Class.forName("java.lang.Object"));
        Object term6429 = newInstance(Class.forName("java.lang.Object"));
        Object term6430 = newInstance(Class.forName("java.lang.Object"));
        Object term6431 = newInstance(Class.forName("java.lang.Object"));
        Object term6432 = newInstance(Class.forName("java.lang.Object"));
        Object term6433 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term6426, term6426.getClass(), "size", -268815336);
        setIntField(term6426, term6426.getClass(), "hash1", -1210583429);
        setIntField(term6426, term6426.getClass(), "hash2", -663691365);
        setIntField(term6426, term6426.getClass(), "hash3", 339854490);
        setField(term6426, term6426.getClass(), "key1", term6427);
        setField(term6426, term6426.getClass(), "key2", term6428);
        setField(term6426, term6426.getClass(), "key3", term6429);
        setField(term6426, term6426.getClass(), "value1", term6430);
        setField(term6426, term6426.getClass(), "value2", term6431);
        setField(term6426, term6426.getClass(), "value3", term6432);
        setFloatField(term6433, term6433.getClass(), "loadFactor", 0.0F);
        setIntField(term6433, term6433.getClass(), "size", 0);
        setField(term6433, term6433.getClass(), "data", null);
        setIntField(term6433, term6433.getClass(), "threshold", 0);
        setIntField(term6433, term6433.getClass(), "modCount", 0);
        setField(term6433, term6433.getClass(), "entrySet", null);
        setField(term6433, term6433.getClass(), "keySet", null);
        setField(term6433, term6433.getClass(), "values", null);
        setField(term6433, term6433.getClass(), "keySet", null);
        setField(term6433, term6433.getClass(), "values", null);
        setField(term6426, term6426.getClass(), "delegateMap", term6433);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isEmpty", argTypes, term59, args);
        assertTrue(recursiveEquals(term59, term6426));
        assertTrue(recursiveEquals(retValue, true));
    }

};
