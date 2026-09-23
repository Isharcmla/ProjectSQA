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
import java.util.HashMap;

public class Flat3Map_put_1944740725938 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term252893;
     Object term253255;
     Object term254641;
     Object term254642;

    public Flat3Map_put_1944740725938() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term253125 = new HashMap();
        term252893 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term252985 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term253077 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term253163 = newInstance(Class.forName("java.lang.Object"));
        setField(term252893, term252893.getClass(), "delegateMap", null);
        setIntField(term252893, term252893.getClass(), "size", 3);
        setIntField(term252893, term252893.getClass(), "hash3", -303180792);
        setField(term252985, term252985.getClass(), "delegateMap", null);
        setIntField(term252985, term252985.getClass(), "size", 3);
        setField(term253077, term253077.getClass(), "delegateMap", null);
        setIntField(term253077, term253077.getClass(), "size", 0);
        setField(term252985, term252985.getClass(), "key3", term253077);
        setField(term252985, term252985.getClass(), "key2", null);
        setField(term252985, term252985.getClass(), "value2", null);
        setIntField(term252985, term252985.getClass(), "hash3", 1076002833);
        setField(term252985, term252985.getClass(), "value3", null);
        setIntField(term252985, term252985.getClass(), "hash2", 67109121);
        setIntField(term252985, term252985.getClass(), "hash1", 8192);
        setField(term252985, term252985.getClass(), "value1", null);
        setField(term252893, term252893.getClass(), "key3", term252985);
        setIntField(term252893, term252893.getClass(), "hash2", -303180792);
        setField(term252893, term252893.getClass(), "key2", null);
        setIntField(term252893, term252893.getClass(), "hash1", -303180792);
        setField(term252893, term252893.getClass(), "key1", null);
        setField(term252893, term252893.getClass(), "value3", term253125);
        setField(term252893, term252893.getClass(), "value2", null);
        setField(term252893, term252893.getClass(), "value1", term253163);
        term253255 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term253347 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term253427 = newInstance(Class.forName("java.util.stream.ReduceOps$ReduceTask"));
        setField(term253255, term253255.getClass(), "delegateMap", null);
        setIntField(term253255, term253255.getClass(), "size", 3);
        setIntField(term253255, term253255.getClass(), "hash3", 1390937464);
        setField(term253255, term253255.getClass(), "value3", null);
        setIntField(term253255, term253255.getClass(), "hash2", 70517776);
        setField(term253255, term253255.getClass(), "value2", null);
        setIntField(term253255, term253255.getClass(), "hash1", -1764636032);
        setField(term253255, term253255.getClass(), "value1", null);
        setField(term253255, term253255.getClass(), "key3", null);
        setField(term253347, term253347.getClass(), "delegateMap", null);
        setIntField(term253347, term253347.getClass(), "size", 0);
        setField(term253255, term253255.getClass(), "key2", term253347);
        setField(term253255, term253255.getClass(), "key1", term253427);
        term254641 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term254641, term254641.getClass(), "size", 0);
        setIntField(term254641, term254641.getClass(), "hash1", 0);
        setIntField(term254641, term254641.getClass(), "hash2", 16);
        setIntField(term254641, term254641.getClass(), "hash3", 0);
        setField(term254641, term254641.getClass(), "key1", null);
        setField(term254641, term254641.getClass(), "key2", null);
        setField(term254641, term254641.getClass(), "key3", null);
        setField(term254641, term254641.getClass(), "value1", null);
        setField(term254641, term254641.getClass(), "value2", null);
        setField(term254641, term254641.getClass(), "value3", null);
        setField(term254641, term254641.getClass(), "delegateMap", true);
        term254642 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term254642, term254642.getClass(), "size", 3);
        setIntField(term254642, term254642.getClass(), "hash1", -1764636032);
        setIntField(term254642, term254642.getClass(), "hash2", 70517776);
        setIntField(term254642, term254642.getClass(), "hash3", 1390937464);
        setField(term254642, term254642.getClass(), "key1", null);
        setField(term254642, term254642.getClass(), "key2", null);
        setField(term254642, term254642.getClass(), "key3", null);
        setField(term254642, term254642.getClass(), "value1", null);
        setField(term254642, term254642.getClass(), "value2", null);
        setField(term254642, term254642.getClass(), "value3", null);
        setField(term254642, term254642.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term253255;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term252893, args);
        assertTrue(recursiveEquals(term252893, term254641));
        assertTrue(recursiveEquals(term253255, term254642));
        assertTrue(recursiveEquals(retValue, null));
    }

};


