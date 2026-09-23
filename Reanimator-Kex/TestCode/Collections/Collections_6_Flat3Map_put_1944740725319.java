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

public class Flat3Map_put_1944740725319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53224;
     Object term53500;
     Object term53757;
     Object term53760;

    public Flat3Map_put_1944740725319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53224 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term53316 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term53408 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term53224, term53224.getClass(), "delegateMap", null);
        setIntField(term53224, term53224.getClass(), "size", 3);
        setIntField(term53224, term53224.getClass(), "hash3", 0);
        setField(term53316, term53316.getClass(), "delegateMap", null);
        setIntField(term53316, term53316.getClass(), "size", 3);
        setField(term53316, term53316.getClass(), "key3", term53408);
        setField(term53316, term53316.getClass(), "key2", null);
        setField(term53316, term53316.getClass(), "value2", null);
        setField(term53224, term53224.getClass(), "key3", term53316);
        term53500 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term53592 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term53500, term53500.getClass(), "delegateMap", null);
        setIntField(term53500, term53500.getClass(), "size", 3);
        setIntField(term53500, term53500.getClass(), "hash3", 0);
        setField(term53500, term53500.getClass(), "value3", null);
        setIntField(term53500, term53500.getClass(), "hash2", 0);
        setField(term53500, term53500.getClass(), "value2", null);
        setIntField(term53500, term53500.getClass(), "hash1", 0);
        setField(term53500, term53500.getClass(), "value1", null);
        setField(term53500, term53500.getClass(), "key3", null);
        setField(term53500, term53500.getClass(), "key2", term53592);
        term53757 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term53758 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term53759 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term53757, term53757.getClass(), "size", 3);
        setIntField(term53757, term53757.getClass(), "hash1", 0);
        setIntField(term53757, term53757.getClass(), "hash2", 0);
        setIntField(term53757, term53757.getClass(), "hash3", 0);
        setField(term53757, term53757.getClass(), "key1", null);
        setField(term53757, term53757.getClass(), "key2", null);
        setIntField(term53758, term53758.getClass(), "size", 3);
        setIntField(term53758, term53758.getClass(), "hash1", 0);
        setIntField(term53758, term53758.getClass(), "hash2", 0);
        setIntField(term53758, term53758.getClass(), "hash3", 0);
        setField(term53758, term53758.getClass(), "key1", null);
        setField(term53758, term53758.getClass(), "key2", null);
        setIntField(term53759, term53759.getClass(), "size", 0);
        setIntField(term53759, term53759.getClass(), "hash1", 0);
        setIntField(term53759, term53759.getClass(), "hash2", 0);
        setIntField(term53759, term53759.getClass(), "hash3", 0);
        setField(term53759, term53759.getClass(), "key1", null);
        setField(term53759, term53759.getClass(), "key2", null);
        setField(term53759, term53759.getClass(), "key3", null);
        setField(term53759, term53759.getClass(), "value1", null);
        setField(term53759, term53759.getClass(), "value2", null);
        setField(term53759, term53759.getClass(), "value3", null);
        setField(term53759, term53759.getClass(), "delegateMap", null);
        setField(term53758, term53758.getClass(), "key3", term53759);
        setField(term53758, term53758.getClass(), "value1", null);
        setField(term53758, term53758.getClass(), "value2", null);
        setField(term53758, term53758.getClass(), "value3", null);
        setField(term53758, term53758.getClass(), "delegateMap", null);
        setField(term53757, term53757.getClass(), "key3", term53758);
        setField(term53757, term53757.getClass(), "value1", null);
        setField(term53757, term53757.getClass(), "value2", null);
        setField(term53757, term53757.getClass(), "value3", null);
        setField(term53757, term53757.getClass(), "delegateMap", null);
        term53760 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term53761 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term53760, term53760.getClass(), "size", 3);
        setIntField(term53760, term53760.getClass(), "hash1", 0);
        setIntField(term53760, term53760.getClass(), "hash2", 0);
        setIntField(term53760, term53760.getClass(), "hash3", 0);
        setField(term53760, term53760.getClass(), "key1", null);
        setIntField(term53761, term53761.getClass(), "size", 0);
        setIntField(term53761, term53761.getClass(), "hash1", 0);
        setIntField(term53761, term53761.getClass(), "hash2", 0);
        setIntField(term53761, term53761.getClass(), "hash3", 0);
        setField(term53761, term53761.getClass(), "key1", null);
        setField(term53761, term53761.getClass(), "key2", null);
        setField(term53761, term53761.getClass(), "key3", null);
        setField(term53761, term53761.getClass(), "value1", null);
        setField(term53761, term53761.getClass(), "value2", null);
        setField(term53761, term53761.getClass(), "value3", null);
        setField(term53761, term53761.getClass(), "delegateMap", null);
        setField(term53760, term53760.getClass(), "key2", term53761);
        setField(term53760, term53760.getClass(), "key3", null);
        setField(term53760, term53760.getClass(), "value1", null);
        setField(term53760, term53760.getClass(), "value2", null);
        setField(term53760, term53760.getClass(), "value3", null);
        setField(term53760, term53760.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term53500;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term53224, args);
        assertTrue(recursiveEquals(term53224, term53757));
        assertTrue(recursiveEquals(term53500, term53760));
        assertTrue(recursiveEquals(retValue, null));
    }

};


