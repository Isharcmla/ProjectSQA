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

public class Flat3Map_put_1944740725643 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125573;
     Object term125934;

    public Flat3Map_put_1944740725643() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term125573 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term125665 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term125757 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term125573, term125573.getClass(), "delegateMap", null);
        setIntField(term125573, term125573.getClass(), "size", 3);
        setField(term125573, term125573.getClass(), "key3", term125665);
        setField(term125573, term125573.getClass(), "key2", term125757);
        term125934 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term125935 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term125936 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term125934, term125934.getClass(), "size", 3);
        setIntField(term125934, term125934.getClass(), "hash1", 0);
        setIntField(term125934, term125934.getClass(), "hash2", 0);
        setIntField(term125934, term125934.getClass(), "hash3", 0);
        setField(term125934, term125934.getClass(), "key1", null);
        setIntField(term125935, term125935.getClass(), "size", 0);
        setIntField(term125935, term125935.getClass(), "hash1", 0);
        setIntField(term125935, term125935.getClass(), "hash2", 0);
        setIntField(term125935, term125935.getClass(), "hash3", 0);
        setField(term125935, term125935.getClass(), "key1", null);
        setField(term125935, term125935.getClass(), "key2", null);
        setField(term125935, term125935.getClass(), "key3", null);
        setField(term125935, term125935.getClass(), "value1", null);
        setField(term125935, term125935.getClass(), "value2", null);
        setField(term125935, term125935.getClass(), "value3", null);
        setField(term125935, term125935.getClass(), "delegateMap", null);
        setField(term125934, term125934.getClass(), "key2", term125935);
        setIntField(term125936, term125936.getClass(), "size", 0);
        setIntField(term125936, term125936.getClass(), "hash1", 0);
        setIntField(term125936, term125936.getClass(), "hash2", 0);
        setIntField(term125936, term125936.getClass(), "hash3", 0);
        setField(term125936, term125936.getClass(), "key1", null);
        setField(term125936, term125936.getClass(), "key2", null);
        setField(term125936, term125936.getClass(), "key3", null);
        setField(term125936, term125936.getClass(), "value1", null);
        setField(term125936, term125936.getClass(), "value2", null);
        setField(term125936, term125936.getClass(), "value3", null);
        setField(term125936, term125936.getClass(), "delegateMap", null);
        setField(term125934, term125934.getClass(), "key3", term125936);
        setField(term125934, term125934.getClass(), "value1", null);
        setField(term125934, term125934.getClass(), "value2", null);
        setField(term125934, term125934.getClass(), "value3", null);
        setField(term125934, term125934.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term125573, args);
        assertTrue(recursiveEquals(term125573, term125934));
        assertTrue(recursiveEquals(retValue, null));
    }

};
