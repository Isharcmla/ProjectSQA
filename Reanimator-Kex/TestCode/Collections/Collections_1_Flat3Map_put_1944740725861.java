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

public class Flat3Map_put_1944740725861 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173695;
     Object term173852;
     Object term173854;

    public Flat3Map_put_1944740725861() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term173695 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term173741 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term173695, term173695.getClass(), "delegateMap", null);
        setIntField(term173695, term173695.getClass(), "size", 2);
        setIntField(term173695, term173695.getClass(), "hash2", 0);
        setField(term173695, term173695.getClass(), "value2", null);
        setIntField(term173695, term173695.getClass(), "hash1", 0);
        setField(term173695, term173695.getClass(), "value1", null);
        setField(term173695, term173695.getClass(), "key2", term173741);
        term173852 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term173853 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term173852, term173852.getClass(), "size", 3);
        setIntField(term173852, term173852.getClass(), "hash1", 0);
        setIntField(term173852, term173852.getClass(), "hash2", 0);
        setIntField(term173852, term173852.getClass(), "hash3", 0);
        setField(term173852, term173852.getClass(), "key1", null);
        setIntField(term173853, term173853.getClass(), "size", 0);
        setIntField(term173853, term173853.getClass(), "hash1", 0);
        setIntField(term173853, term173853.getClass(), "hash2", 0);
        setIntField(term173853, term173853.getClass(), "hash3", 0);
        setField(term173853, term173853.getClass(), "key1", null);
        setField(term173853, term173853.getClass(), "key2", null);
        setField(term173853, term173853.getClass(), "key3", null);
        setField(term173853, term173853.getClass(), "value1", null);
        setField(term173853, term173853.getClass(), "value2", null);
        setField(term173853, term173853.getClass(), "value3", null);
        setField(term173853, term173853.getClass(), "delegateMap", null);
        setField(term173852, term173852.getClass(), "key2", term173853);
        setField(term173852, term173852.getClass(), "key3", term173852);
        setField(term173852, term173852.getClass(), "value1", null);
        setField(term173852, term173852.getClass(), "value2", null);
        setField(term173852, term173852.getClass(), "value3", null);
        setField(term173852, term173852.getClass(), "delegateMap", null);
        term173854 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term173855 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term173854, term173854.getClass(), "size", 3);
        setIntField(term173854, term173854.getClass(), "hash1", 0);
        setIntField(term173854, term173854.getClass(), "hash2", 0);
        setIntField(term173854, term173854.getClass(), "hash3", 0);
        setField(term173854, term173854.getClass(), "key1", null);
        setIntField(term173855, term173855.getClass(), "size", 0);
        setIntField(term173855, term173855.getClass(), "hash1", 0);
        setIntField(term173855, term173855.getClass(), "hash2", 0);
        setIntField(term173855, term173855.getClass(), "hash3", 0);
        setField(term173855, term173855.getClass(), "key1", null);
        setField(term173855, term173855.getClass(), "key2", null);
        setField(term173855, term173855.getClass(), "key3", null);
        setField(term173855, term173855.getClass(), "value1", null);
        setField(term173855, term173855.getClass(), "value2", null);
        setField(term173855, term173855.getClass(), "value3", null);
        setField(term173855, term173855.getClass(), "delegateMap", null);
        setField(term173854, term173854.getClass(), "key2", term173855);
        setField(term173854, term173854.getClass(), "key3", term173854);
        setField(term173854, term173854.getClass(), "value1", null);
        setField(term173854, term173854.getClass(), "value2", null);
        setField(term173854, term173854.getClass(), "value3", null);
        setField(term173854, term173854.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term173695;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term173695, args);
        assertTrue(recursiveEquals(term173695, term173852));
        assertTrue(recursiveEquals(term173695, term173854));
        assertTrue(recursiveEquals(retValue, null));
    }

};
