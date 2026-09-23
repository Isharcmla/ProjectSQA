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

public class Flat3Map_containsValue_2053071372272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44248;
     Object term44450;
     Object term44865;
     Object term44867;

    public Flat3Map_containsValue_2053071372272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44248 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term44358 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term44248, term44248.getClass(), "delegateMap", null);
        setIntField(term44248, term44248.getClass(), "size", 2);
        setField(term44248, term44248.getClass(), "value2", term44358);
        term44450 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term44560 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term44450, term44450.getClass(), "delegateMap", term44560);
        term44865 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term44866 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term44865, term44865.getClass(), "size", 2);
        setIntField(term44865, term44865.getClass(), "hash1", 0);
        setIntField(term44865, term44865.getClass(), "hash2", 0);
        setIntField(term44865, term44865.getClass(), "hash3", 0);
        setField(term44865, term44865.getClass(), "key1", null);
        setField(term44865, term44865.getClass(), "key2", null);
        setField(term44865, term44865.getClass(), "key3", null);
        setField(term44865, term44865.getClass(), "value1", null);
        setFloatField(term44866, term44866.getClass(), "loadFactor", 0.0F);
        setIntField(term44866, term44866.getClass(), "size", 0);
        setField(term44866, term44866.getClass(), "data", null);
        setIntField(term44866, term44866.getClass(), "threshold", 0);
        setIntField(term44866, term44866.getClass(), "modCount", 0);
        setField(term44866, term44866.getClass(), "entrySet", null);
        setField(term44866, term44866.getClass(), "keySet", null);
        setField(term44866, term44866.getClass(), "values", null);
        setField(term44866, term44866.getClass(), "keySet", null);
        setField(term44866, term44866.getClass(), "values", null);
        setField(term44865, term44865.getClass(), "value2", term44866);
        setField(term44865, term44865.getClass(), "value3", null);
        setField(term44865, term44865.getClass(), "delegateMap", null);
        term44867 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term44868 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term44867, term44867.getClass(), "size", 0);
        setIntField(term44867, term44867.getClass(), "hash1", 0);
        setIntField(term44867, term44867.getClass(), "hash2", 0);
        setIntField(term44867, term44867.getClass(), "hash3", 0);
        setField(term44867, term44867.getClass(), "key1", null);
        setField(term44867, term44867.getClass(), "key2", null);
        setField(term44867, term44867.getClass(), "key3", null);
        setField(term44867, term44867.getClass(), "value1", null);
        setField(term44867, term44867.getClass(), "value2", null);
        setField(term44867, term44867.getClass(), "value3", null);
        setFloatField(term44868, term44868.getClass(), "loadFactor", 0.0F);
        setIntField(term44868, term44868.getClass(), "size", 0);
        setField(term44868, term44868.getClass(), "data", null);
        setIntField(term44868, term44868.getClass(), "threshold", 0);
        setIntField(term44868, term44868.getClass(), "modCount", 0);
        setField(term44868, term44868.getClass(), "entrySet", null);
        setField(term44868, term44868.getClass(), "keySet", null);
        setField(term44868, term44868.getClass(), "values", null);
        setField(term44868, term44868.getClass(), "keySet", null);
        setField(term44868, term44868.getClass(), "values", null);
        setField(term44867, term44867.getClass(), "delegateMap", term44868);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term44450;
        callMethod(klass, "containsValue", argTypes, term44248, args);
        assertTrue(recursiveEquals(term44248, term44865));
        assertTrue(recursiveEquals(term44450, term44867));
    }

};


