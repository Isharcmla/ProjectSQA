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
import java.lang.Object;
import java.util.HashMap;

public class Flat3Map_put_1944740725698 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167627;
     Object term167861;

    public Flat3Map_put_1944740725698() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term167769 = new HashMap();
        term167627 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term167721 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        setField(term167627, term167627.getClass(), "delegateMap", null);
        setIntField(term167627, term167627.getClass(), "size", 3);
        setIntField(term167627, term167627.getClass(), "hash3", -1610505984);
        setField(term167627, term167627.getClass(), "key3", term167721);
        setField(term167627, term167627.getClass(), "key2", null);
        setField(term167627, term167627.getClass(), "value2", term167769);
        setIntField(term167627, term167627.getClass(), "hash2", 1342177804);
        setIntField(term167627, term167627.getClass(), "hash1", 163904);
        setField(term167627, term167627.getClass(), "key1", null);
        setField(term167627, term167627.getClass(), "value3", null);
        setField(term167627, term167627.getClass(), "value1", null);
        term167861 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term167953 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term167861, term167861.getClass(), "delegateMap", null);
        setIntField(term167861, term167861.getClass(), "size", 3);
        setIntField(term167861, term167861.getClass(), "hash3", 2065860608);
        setField(term167861, term167861.getClass(), "value3", null);
        setIntField(term167861, term167861.getClass(), "hash2", 811123200);
        setField(term167861, term167861.getClass(), "value2", null);
        setIntField(term167861, term167861.getClass(), "hash1", 338200576);
        setField(term167861, term167861.getClass(), "value1", null);
        setField(term167861, term167861.getClass(), "key3", null);
        setField(term167953, term167953.getClass(), "delegateMap", null);
        setIntField(term167953, term167953.getClass(), "size", 0);
        setField(term167861, term167861.getClass(), "key2", term167953);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term167861;
        args[1] = null;
        callMethod(klass, "put", argTypes, term167627, args);
    }

};


