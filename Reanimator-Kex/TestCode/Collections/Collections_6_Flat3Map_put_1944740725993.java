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

public class Flat3Map_put_1944740725993 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term279316;
     Object term279740;

    public Flat3Map_put_1944740725993() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term279316 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term279408 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term279518 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term279648 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        setField(term279316, term279316.getClass(), "delegateMap", null);
        setIntField(term279316, term279316.getClass(), "size", 3);
        setIntField(term279316, term279316.getClass(), "hash3", -2018665016);
        setField(term279408, term279408.getClass(), "delegateMap", null);
        setIntField(term279408, term279408.getClass(), "size", 3);
        setIntField(term279518, term279518.getClass(), "size", 0);
        setField(term279408, term279408.getClass(), "key3", term279518);
        setField(term279408, term279408.getClass(), "key2", null);
        setField(term279408, term279408.getClass(), "value2", null);
        setIntField(term279408, term279408.getClass(), "hash3", 29687876);
        setIntField(term279408, term279408.getClass(), "hash2", -307993600);
        setIntField(term279408, term279408.getClass(), "hash1", -1871118336);
        setField(term279408, term279408.getClass(), "key1", null);
        setField(term279408, term279408.getClass(), "value3", null);
        setField(term279408, term279408.getClass(), "value1", null);
        setField(term279316, term279316.getClass(), "key3", term279408);
        setIntField(term279316, term279316.getClass(), "hash2", -2018665016);
        setField(term279316, term279316.getClass(), "key2", term279648);
        setIntField(term279316, term279316.getClass(), "hash1", 2018665015);
        setField(term279316, term279316.getClass(), "value3", null);
        setField(term279316, term279316.getClass(), "value2", null);
        setField(term279316, term279316.getClass(), "key1", null);
        setField(term279316, term279316.getClass(), "value1", null);
        term279740 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term279832 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term279740, term279740.getClass(), "delegateMap", null);
        setIntField(term279740, term279740.getClass(), "size", 3);
        setIntField(term279740, term279740.getClass(), "hash3", 1261375035);
        setField(term279740, term279740.getClass(), "value3", null);
        setIntField(term279740, term279740.getClass(), "hash2", -938933915);
        setField(term279740, term279740.getClass(), "value2", null);
        setIntField(term279740, term279740.getClass(), "hash1", 1953861160);
        setField(term279740, term279740.getClass(), "value1", null);
        setField(term279740, term279740.getClass(), "key3", null);
        setField(term279832, term279832.getClass(), "delegateMap", null);
        setIntField(term279832, term279832.getClass(), "size", 2);
        setIntField(term279832, term279832.getClass(), "hash2", 1065234);
        setField(term279832, term279832.getClass(), "value2", null);
        setIntField(term279832, term279832.getClass(), "hash1", 525508);
        setField(term279832, term279832.getClass(), "value1", null);
        setField(term279740, term279740.getClass(), "key2", term279832);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term279740;
        args[1] = null;
        callMethod(klass, "put", argTypes, term279316, args);
    }

};


