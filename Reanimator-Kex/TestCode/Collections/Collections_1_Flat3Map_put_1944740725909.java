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

public class Flat3Map_put_1944740725909 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term182889;
     Object term183632;
     Object term183635;

    public Flat3Map_put_1944740725909() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term182889 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term182935 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term182990 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term182889, term182889.getClass(), "delegateMap", null);
        setIntField(term182889, term182889.getClass(), "size", 2);
        setIntField(term182889, term182889.getClass(), "hash2", 0);
        setField(term182889, term182889.getClass(), "value2", null);
        setIntField(term182889, term182889.getClass(), "hash1", 0);
        setField(term182889, term182889.getClass(), "value1", null);
        setField(term182935, term182935.getClass(), "delegateMap", term182990);
        setField(term182889, term182889.getClass(), "key2", term182935);
        term183632 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term183633 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term183634 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term183632, term183632.getClass(), "size", 3);
        setIntField(term183632, term183632.getClass(), "hash1", 0);
        setIntField(term183632, term183632.getClass(), "hash2", 0);
        setIntField(term183632, term183632.getClass(), "hash3", 0);
        setField(term183632, term183632.getClass(), "key1", null);
        setIntField(term183633, term183633.getClass(), "size", 0);
        setIntField(term183633, term183633.getClass(), "hash1", 0);
        setIntField(term183633, term183633.getClass(), "hash2", 0);
        setIntField(term183633, term183633.getClass(), "hash3", 0);
        setField(term183633, term183633.getClass(), "key1", null);
        setField(term183633, term183633.getClass(), "key2", null);
        setField(term183633, term183633.getClass(), "key3", null);
        setField(term183633, term183633.getClass(), "value1", null);
        setField(term183633, term183633.getClass(), "value2", null);
        setField(term183633, term183633.getClass(), "value3", null);
        setFloatField(term183634, term183634.getClass(), "loadFactor", 0.0F);
        setIntField(term183634, term183634.getClass(), "size", 0);
        setField(term183634, term183634.getClass(), "data", null);
        setIntField(term183634, term183634.getClass(), "threshold", 0);
        setIntField(term183634, term183634.getClass(), "modCount", 0);
        setField(term183634, term183634.getClass(), "entrySet", null);
        setField(term183634, term183634.getClass(), "keySet", null);
        setField(term183634, term183634.getClass(), "values", null);
        setField(term183634, term183634.getClass(), "keySet", null);
        setField(term183634, term183634.getClass(), "values", null);
        setField(term183633, term183633.getClass(), "delegateMap", term183634);
        setField(term183632, term183632.getClass(), "key2", term183633);
        setField(term183632, term183632.getClass(), "key3", term183632);
        setField(term183632, term183632.getClass(), "value1", null);
        setField(term183632, term183632.getClass(), "value2", null);
        setField(term183632, term183632.getClass(), "value3", null);
        setField(term183632, term183632.getClass(), "delegateMap", null);
        term183635 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term183636 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term183637 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term183635, term183635.getClass(), "size", 3);
        setIntField(term183635, term183635.getClass(), "hash1", 0);
        setIntField(term183635, term183635.getClass(), "hash2", 0);
        setIntField(term183635, term183635.getClass(), "hash3", 0);
        setField(term183635, term183635.getClass(), "key1", null);
        setIntField(term183636, term183636.getClass(), "size", 0);
        setIntField(term183636, term183636.getClass(), "hash1", 0);
        setIntField(term183636, term183636.getClass(), "hash2", 0);
        setIntField(term183636, term183636.getClass(), "hash3", 0);
        setField(term183636, term183636.getClass(), "key1", null);
        setField(term183636, term183636.getClass(), "key2", null);
        setField(term183636, term183636.getClass(), "key3", null);
        setField(term183636, term183636.getClass(), "value1", null);
        setField(term183636, term183636.getClass(), "value2", null);
        setField(term183636, term183636.getClass(), "value3", null);
        setFloatField(term183637, term183637.getClass(), "loadFactor", 0.0F);
        setIntField(term183637, term183637.getClass(), "size", 0);
        setField(term183637, term183637.getClass(), "data", null);
        setIntField(term183637, term183637.getClass(), "threshold", 0);
        setIntField(term183637, term183637.getClass(), "modCount", 0);
        setField(term183637, term183637.getClass(), "entrySet", null);
        setField(term183637, term183637.getClass(), "keySet", null);
        setField(term183637, term183637.getClass(), "values", null);
        setField(term183637, term183637.getClass(), "keySet", null);
        setField(term183637, term183637.getClass(), "values", null);
        setField(term183636, term183636.getClass(), "delegateMap", term183637);
        setField(term183635, term183635.getClass(), "key2", term183636);
        setField(term183635, term183635.getClass(), "key3", term183635);
        setField(term183635, term183635.getClass(), "value1", null);
        setField(term183635, term183635.getClass(), "value2", null);
        setField(term183635, term183635.getClass(), "value3", null);
        setField(term183635, term183635.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term182889;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term182889, args);
        assertTrue(recursiveEquals(term182889, term183632));
        assertTrue(recursiveEquals(term182889, term183635));
        assertTrue(recursiveEquals(retValue, null));
    }

};
