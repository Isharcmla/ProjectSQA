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

public class Flat3Map_put_1944740725917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term243981;
     Object term244257;
     Object term244552;

    public Flat3Map_put_1944740725917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term243981 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term244073 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term244165 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term243981, term243981.getClass(), "delegateMap", null);
        setIntField(term243981, term243981.getClass(), "size", 3);
        setIntField(term243981, term243981.getClass(), "hash3", 0);
        setField(term244073, term244073.getClass(), "delegateMap", null);
        setIntField(term244073, term244073.getClass(), "size", 3);
        setField(term244073, term244073.getClass(), "key3", term244165);
        setField(term244073, term244073.getClass(), "key2", null);
        setField(term244073, term244073.getClass(), "value2", null);
        setIntField(term244073, term244073.getClass(), "hash3", -1);
        setIntField(term244073, term244073.getClass(), "hash2", 0);
        setField(term243981, term243981.getClass(), "key3", term244073);
        term244257 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term244391 = newInstance(Class.forName("org.apache.commons.collections.iterators.UnmodifiableMapIterator"));
        setField(term244257, term244257.getClass(), "delegateMap", null);
        setIntField(term244257, term244257.getClass(), "size", 3);
        setIntField(term244257, term244257.getClass(), "hash3", 0);
        setField(term244257, term244257.getClass(), "value3", null);
        setIntField(term244257, term244257.getClass(), "hash2", 0);
        setField(term244257, term244257.getClass(), "value2", null);
        setIntField(term244257, term244257.getClass(), "hash1", 0);
        setField(term244257, term244257.getClass(), "value1", null);
        setField(term244257, term244257.getClass(), "key3", null);
        setField(term244257, term244257.getClass(), "key2", null);
        setField(term244257, term244257.getClass(), "key1", term244391);
        term244552 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term244553 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object term244554 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term244555 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        setIntField(term244552, term244552.getClass(), "size", 12);
        setIntField(term244552, term244552.getClass(), "hash1", 0);
        setIntField(term244552, term244552.getClass(), "hash2", 0);
        setIntField(term244552, term244552.getClass(), "hash3", 0);
        setField(term244552, term244552.getClass(), "key1", null);
        setField(term244552, term244552.getClass(), "key2", null);
        setField(term244552, term244552.getClass(), "key3", null);
        setField(term244552, term244552.getClass(), "value1", null);
        setField(term244552, term244552.getClass(), "value2", null);
        setField(term244552, term244552.getClass(), "value3", null);
        setFloatField(term244553, term244553.getClass(), "loadFactor", 0.75F);
        setIntField(term244553, term244553.getClass(), "size", 3);
        setFloatField(term244554, term244554.getClass(), "loadFactor", 0.75F);
        setIntField(term244554, term244554.getClass(), "size", 0);
        setField(term244554, term244554.getClass(), "data", term244555);
        setIntField(term244554, term244554.getClass(), "threshold", 12);
        setIntField(term244554, term244554.getClass(), "modCount", 0);
        setField(term244554, term244554.getClass(), "entrySet", null);
        setField(term244554, term244554.getClass(), "keySet", null);
        setField(term244554, term244554.getClass(), "values", null);
        setField(term244554, term244554.getClass(), "keySet", null);
        setField(term244554, term244554.getClass(), "values", null);
        setField(term244553, term244553.getClass(), "data", term244554);
        setIntField(term244553, term244553.getClass(), "threshold", 12);
        setIntField(term244553, term244553.getClass(), "modCount", 3);
        setField(term244553, term244553.getClass(), "entrySet", null);
        setField(term244553, term244553.getClass(), "keySet", null);
        setField(term244553, term244553.getClass(), "values", null);
        setField(term244553, term244553.getClass(), "keySet", null);
        setField(term244553, term244553.getClass(), "values", null);
        setField(term244552, term244552.getClass(), "delegateMap", term244553);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term244257;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term243981, args);
        assertTrue(recursiveEquals(term243981, term244552));
        assertTrue(recursiveEquals(term244257, 0));
        assertTrue(recursiveEquals(retValue, null));
    }

};


