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

public class Flat3Map_containsKey_76092510484 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91075;
     Object term91213;
     Object term91736;
     Object term91738;

    public Flat3Map_containsKey_76092510484() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91075 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        term91213 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term91075, term91075.getClass(), "delegateMap", null);
        setIntField(term91075, term91075.getClass(), "size", -3);
        setIntField(term91075, term91075.getClass(), "hash2", 0);
        setField(term91075, term91075.getClass(), "key2", term91075);
        setIntField(term91075, term91075.getClass(), "hash1", 0);
        setField(term91213, term91213.getClass(), "delegateMap", null);
        setIntField(term91213, term91213.getClass(), "size", 2);
        setIntField(term91213, term91213.getClass(), "hash2", 0);
        setField(term91213, term91213.getClass(), "value2", null);
        setIntField(term91213, term91213.getClass(), "hash1", 0);
        setField(term91213, term91213.getClass(), "value1", null);
        setField(term91075, term91075.getClass(), "key1", term91213);
        term91736 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term91737 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term91736, term91736.getClass(), "size", -3);
        setIntField(term91736, term91736.getClass(), "hash1", 0);
        setIntField(term91736, term91736.getClass(), "hash2", 0);
        setIntField(term91736, term91736.getClass(), "hash3", 0);
        setIntField(term91737, term91737.getClass(), "size", 2);
        setIntField(term91737, term91737.getClass(), "hash1", 0);
        setIntField(term91737, term91737.getClass(), "hash2", 0);
        setIntField(term91737, term91737.getClass(), "hash3", 0);
        setField(term91737, term91737.getClass(), "key1", null);
        setField(term91737, term91737.getClass(), "key2", null);
        setField(term91737, term91737.getClass(), "key3", null);
        setField(term91737, term91737.getClass(), "value1", null);
        setField(term91737, term91737.getClass(), "value2", null);
        setField(term91737, term91737.getClass(), "value3", null);
        setField(term91737, term91737.getClass(), "delegateMap", null);
        setField(term91736, term91736.getClass(), "key1", term91737);
        setField(term91736, term91736.getClass(), "key2", term91736);
        setField(term91736, term91736.getClass(), "key3", null);
        setField(term91736, term91736.getClass(), "value1", null);
        setField(term91736, term91736.getClass(), "value2", null);
        setField(term91736, term91736.getClass(), "value3", null);
        setField(term91736, term91736.getClass(), "delegateMap", null);
        term91738 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term91738, term91738.getClass(), "size", 2);
        setIntField(term91738, term91738.getClass(), "hash1", 0);
        setIntField(term91738, term91738.getClass(), "hash2", 0);
        setIntField(term91738, term91738.getClass(), "hash3", 0);
        setField(term91738, term91738.getClass(), "key1", null);
        setField(term91738, term91738.getClass(), "key2", null);
        setField(term91738, term91738.getClass(), "key3", null);
        setField(term91738, term91738.getClass(), "value1", null);
        setField(term91738, term91738.getClass(), "value2", null);
        setField(term91738, term91738.getClass(), "value3", null);
        setField(term91738, term91738.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term91213;
        callMethod(klass, "containsKey", argTypes, term91075, args);
        assertTrue(recursiveEquals(term91075, term91736));
        assertTrue(recursiveEquals(term91213, term91738));
    }

};
