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
import java.util.HashMap;

public class Flat3Map_equals_1826922527770 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155990;
     Object term156130;
     Object term156613;
     Object term156616;

    public Flat3Map_equals_1826922527770() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term156154 = new HashMap();
        term155990 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term155990, term155990.getClass(), "delegateMap", null);
        setIntField(term155990, term155990.getClass(), "size", 3);
        setField(term155990, term155990.getClass(), "key3", null);
        setField(term155990, term155990.getClass(), "value3", null);
        setField(term155990, term155990.getClass(), "key2", null);
        setField(term155990, term155990.getClass(), "value2", null);
        setField(term155990, term155990.getClass(), "key1", term156154);
        term156130 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term156130, term156130.getClass(), "delegateMap", null);
        setIntField(term156130, term156130.getClass(), "size", 3);
        setField(term156130, term156130.getClass(), "key3", null);
        setField(term156130, term156130.getClass(), "value3", null);
        setIntField(term156130, term156130.getClass(), "hash3", 0);
        setIntField(term156130, term156130.getClass(), "hash2", 0);
        setField(term156130, term156130.getClass(), "key2", term156154);
        HashMap term156614 = new HashMap();
        term156613 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term156613, term156613.getClass(), "size", 3);
        setIntField(term156613, term156613.getClass(), "hash1", 0);
        setIntField(term156613, term156613.getClass(), "hash2", 0);
        setIntField(term156613, term156613.getClass(), "hash3", 0);
        setField(term156613, term156613.getClass(), "key1", term156614);
        setField(term156613, term156613.getClass(), "key2", null);
        setField(term156613, term156613.getClass(), "key3", null);
        setField(term156613, term156613.getClass(), "value1", null);
        setField(term156613, term156613.getClass(), "value2", null);
        setField(term156613, term156613.getClass(), "value3", null);
        setField(term156613, term156613.getClass(), "delegateMap", null);
        HashMap term156617 = new HashMap();
        term156616 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term156616, term156616.getClass(), "size", 3);
        setIntField(term156616, term156616.getClass(), "hash1", 0);
        setIntField(term156616, term156616.getClass(), "hash2", 0);
        setIntField(term156616, term156616.getClass(), "hash3", 0);
        setField(term156616, term156616.getClass(), "key1", null);
        setField(term156616, term156616.getClass(), "key2", term156617);
        setField(term156616, term156616.getClass(), "key3", null);
        setField(term156616, term156616.getClass(), "value1", null);
        setField(term156616, term156616.getClass(), "value2", null);
        setField(term156616, term156616.getClass(), "value3", null);
        setField(term156616, term156616.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term156130;
        Object retValue = callMethod(klass, "equals", argTypes, term155990, args);
        assertTrue(recursiveEquals(term155990, term156613));
        assertTrue(recursiveEquals(term156130, term156616));
        assertTrue(recursiveEquals(retValue, true));
    }

};
