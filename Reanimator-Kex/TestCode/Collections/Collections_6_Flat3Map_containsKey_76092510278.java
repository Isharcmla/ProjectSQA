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

public class Flat3Map_containsKey_76092510278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45382;
     Object term46120;
     Object term46121;

    public Flat3Map_containsKey_76092510278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45382 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term45382, term45382.getClass(), "delegateMap", null);
        setIntField(term45382, term45382.getClass(), "size", 0);
        setIntField(term45382, term45382.getClass(), "hash1", 0);
        setField(term45382, term45382.getClass(), "key1", term45382);
        term46120 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term46120, term46120.getClass(), "size", 0);
        setIntField(term46120, term46120.getClass(), "hash1", 0);
        setIntField(term46120, term46120.getClass(), "hash2", 0);
        setIntField(term46120, term46120.getClass(), "hash3", 0);
        setField(term46120, term46120.getClass(), "key1", term46120);
        setField(term46120, term46120.getClass(), "key2", null);
        setField(term46120, term46120.getClass(), "key3", null);
        setField(term46120, term46120.getClass(), "value1", null);
        setField(term46120, term46120.getClass(), "value2", null);
        setField(term46120, term46120.getClass(), "value3", null);
        setField(term46120, term46120.getClass(), "delegateMap", null);
        term46121 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term46121, term46121.getClass(), "size", 0);
        setIntField(term46121, term46121.getClass(), "hash1", 0);
        setIntField(term46121, term46121.getClass(), "hash2", 0);
        setIntField(term46121, term46121.getClass(), "hash3", 0);
        setField(term46121, term46121.getClass(), "key1", term46121);
        setField(term46121, term46121.getClass(), "key2", null);
        setField(term46121, term46121.getClass(), "key3", null);
        setField(term46121, term46121.getClass(), "value1", null);
        setField(term46121, term46121.getClass(), "value2", null);
        setField(term46121, term46121.getClass(), "value3", null);
        setField(term46121, term46121.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term45382;
        callMethod(klass, "containsKey", argTypes, term45382, args);
        assertTrue(recursiveEquals(term45382, term46120));
        assertTrue(recursiveEquals(term45382, term46121));
    }

};


