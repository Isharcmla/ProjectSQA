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

public class Flat3Map_get_229621781757 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term153540;
     Object term153826;
     Object term153992;
     Object term153995;

    public Flat3Map_get_229621781757() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term153540 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term153642 = newInstance(Class.forName("java.util.stream.ReduceOps$CountingSink$OfDouble"));
        Object term153734 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term153540, term153540.getClass(), "delegateMap", null);
        setIntField(term153540, term153540.getClass(), "size", 2);
        setIntField(term153540, term153540.getClass(), "hash2", 0);
        setField(term153540, term153540.getClass(), "key2", term153642);
        setIntField(term153540, term153540.getClass(), "hash1", 0);
        setField(term153734, term153734.getClass(), "delegateMap", null);
        setIntField(term153734, term153734.getClass(), "size", 2);
        setField(term153540, term153540.getClass(), "key1", term153734);
        term153826 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term153928 = newInstance(Class.forName("java.util.stream.ReduceOps$CountingSink$OfDouble"));
        setField(term153826, term153826.getClass(), "delegateMap", null);
        setIntField(term153826, term153826.getClass(), "size", 2);
        setIntField(term153826, term153826.getClass(), "hash2", 0);
        setField(term153826, term153826.getClass(), "value2", null);
        setIntField(term153826, term153826.getClass(), "hash1", 0);
        setField(term153826, term153826.getClass(), "value1", null);
        setField(term153826, term153826.getClass(), "key2", term153928);
        term153992 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term153993 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term153994 = newInstance(Class.forName("java.util.stream.ReduceOps$CountingSink$OfDouble"));
        setIntField(term153992, term153992.getClass(), "size", 2);
        setIntField(term153992, term153992.getClass(), "hash1", 0);
        setIntField(term153992, term153992.getClass(), "hash2", 0);
        setIntField(term153992, term153992.getClass(), "hash3", 0);
        setIntField(term153993, term153993.getClass(), "size", 2);
        setIntField(term153993, term153993.getClass(), "hash1", 0);
        setIntField(term153993, term153993.getClass(), "hash2", 0);
        setIntField(term153993, term153993.getClass(), "hash3", 0);
        setField(term153993, term153993.getClass(), "key1", null);
        setField(term153993, term153993.getClass(), "key2", null);
        setField(term153993, term153993.getClass(), "key3", null);
        setField(term153993, term153993.getClass(), "value1", null);
        setField(term153993, term153993.getClass(), "value2", null);
        setField(term153993, term153993.getClass(), "value3", null);
        setField(term153993, term153993.getClass(), "delegateMap", null);
        setField(term153992, term153992.getClass(), "key1", term153993);
        setLongField(term153994, term153994.getClass(), "count", 0L);
        setField(term153994, term153994.getClass(), "state", null);
        setField(term153992, term153992.getClass(), "key2", term153994);
        setField(term153992, term153992.getClass(), "key3", null);
        setField(term153992, term153992.getClass(), "value1", null);
        setField(term153992, term153992.getClass(), "value2", null);
        setField(term153992, term153992.getClass(), "value3", null);
        setField(term153992, term153992.getClass(), "delegateMap", null);
        term153995 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term153996 = newInstance(Class.forName("java.util.stream.ReduceOps$CountingSink$OfDouble"));
        setIntField(term153995, term153995.getClass(), "size", 2);
        setIntField(term153995, term153995.getClass(), "hash1", 0);
        setIntField(term153995, term153995.getClass(), "hash2", 0);
        setIntField(term153995, term153995.getClass(), "hash3", 0);
        setField(term153995, term153995.getClass(), "key1", null);
        setLongField(term153996, term153996.getClass(), "count", 0L);
        setField(term153996, term153996.getClass(), "state", null);
        setField(term153995, term153995.getClass(), "key2", term153996);
        setField(term153995, term153995.getClass(), "key3", null);
        setField(term153995, term153995.getClass(), "value1", null);
        setField(term153995, term153995.getClass(), "value2", null);
        setField(term153995, term153995.getClass(), "value3", null);
        setField(term153995, term153995.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term153826;
        Object retValue = callMethod(klass, "get", argTypes, term153540, args);
        assertTrue(recursiveEquals(term153540, term153992));
        assertTrue(recursiveEquals(term153826, term153995));
        assertTrue(recursiveEquals(retValue, null));
    }

};
