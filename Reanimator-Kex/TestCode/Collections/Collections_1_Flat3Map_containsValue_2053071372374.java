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

public class Flat3Map_containsValue_2053071372374 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67842;
     Object term68332;
     Object term68335;

    public Flat3Map_containsValue_2053071372374() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67842 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term67888 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term67934 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term67842, term67842.getClass(), "delegateMap", null);
        setIntField(term67842, term67842.getClass(), "size", -1);
        setField(term67888, term67888.getClass(), "delegateMap", null);
        setIntField(term67888, term67888.getClass(), "size", 0);
        setField(term67842, term67842.getClass(), "value3", term67888);
        setField(term67842, term67842.getClass(), "value2", term67934);
        term68332 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term68333 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term68334 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term68332, term68332.getClass(), "size", -1);
        setIntField(term68332, term68332.getClass(), "hash1", 0);
        setIntField(term68332, term68332.getClass(), "hash2", 0);
        setIntField(term68332, term68332.getClass(), "hash3", 0);
        setField(term68332, term68332.getClass(), "key1", null);
        setField(term68332, term68332.getClass(), "key2", null);
        setField(term68332, term68332.getClass(), "key3", null);
        setField(term68332, term68332.getClass(), "value1", null);
        setIntField(term68333, term68333.getClass(), "size", 0);
        setIntField(term68333, term68333.getClass(), "hash1", 0);
        setIntField(term68333, term68333.getClass(), "hash2", 0);
        setIntField(term68333, term68333.getClass(), "hash3", 0);
        setField(term68333, term68333.getClass(), "key1", null);
        setField(term68333, term68333.getClass(), "key2", null);
        setField(term68333, term68333.getClass(), "key3", null);
        setField(term68333, term68333.getClass(), "value1", null);
        setField(term68333, term68333.getClass(), "value2", null);
        setField(term68333, term68333.getClass(), "value3", null);
        setField(term68333, term68333.getClass(), "delegateMap", null);
        setField(term68332, term68332.getClass(), "value2", term68333);
        setIntField(term68334, term68334.getClass(), "size", 0);
        setIntField(term68334, term68334.getClass(), "hash1", 0);
        setIntField(term68334, term68334.getClass(), "hash2", 0);
        setIntField(term68334, term68334.getClass(), "hash3", 0);
        setField(term68334, term68334.getClass(), "key1", null);
        setField(term68334, term68334.getClass(), "key2", null);
        setField(term68334, term68334.getClass(), "key3", null);
        setField(term68334, term68334.getClass(), "value1", null);
        setField(term68334, term68334.getClass(), "value2", null);
        setField(term68334, term68334.getClass(), "value3", null);
        setField(term68334, term68334.getClass(), "delegateMap", null);
        setField(term68332, term68332.getClass(), "value3", term68334);
        setField(term68332, term68332.getClass(), "delegateMap", null);
        term68335 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term68336 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term68337 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term68335, term68335.getClass(), "size", -1);
        setIntField(term68335, term68335.getClass(), "hash1", 0);
        setIntField(term68335, term68335.getClass(), "hash2", 0);
        setIntField(term68335, term68335.getClass(), "hash3", 0);
        setField(term68335, term68335.getClass(), "key1", null);
        setField(term68335, term68335.getClass(), "key2", null);
        setField(term68335, term68335.getClass(), "key3", null);
        setField(term68335, term68335.getClass(), "value1", null);
        setIntField(term68336, term68336.getClass(), "size", 0);
        setIntField(term68336, term68336.getClass(), "hash1", 0);
        setIntField(term68336, term68336.getClass(), "hash2", 0);
        setIntField(term68336, term68336.getClass(), "hash3", 0);
        setField(term68336, term68336.getClass(), "key1", null);
        setField(term68336, term68336.getClass(), "key2", null);
        setField(term68336, term68336.getClass(), "key3", null);
        setField(term68336, term68336.getClass(), "value1", null);
        setField(term68336, term68336.getClass(), "value2", null);
        setField(term68336, term68336.getClass(), "value3", null);
        setField(term68336, term68336.getClass(), "delegateMap", null);
        setField(term68335, term68335.getClass(), "value2", term68336);
        setIntField(term68337, term68337.getClass(), "size", 0);
        setIntField(term68337, term68337.getClass(), "hash1", 0);
        setIntField(term68337, term68337.getClass(), "hash2", 0);
        setIntField(term68337, term68337.getClass(), "hash3", 0);
        setField(term68337, term68337.getClass(), "key1", null);
        setField(term68337, term68337.getClass(), "key2", null);
        setField(term68337, term68337.getClass(), "key3", null);
        setField(term68337, term68337.getClass(), "value1", null);
        setField(term68337, term68337.getClass(), "value2", null);
        setField(term68337, term68337.getClass(), "value3", null);
        setField(term68337, term68337.getClass(), "delegateMap", null);
        setField(term68335, term68335.getClass(), "value3", term68337);
        setField(term68335, term68335.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term67842;
        callMethod(klass, "containsValue", argTypes, term67842, args);
        assertTrue(recursiveEquals(term67842, term68332));
        assertTrue(recursiveEquals(term67842, term68335));
    }

};
