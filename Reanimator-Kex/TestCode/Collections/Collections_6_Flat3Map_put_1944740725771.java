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

public class Flat3Map_put_1944740725771 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term195842;
     Object term196166;

    public Flat3Map_put_1944740725771() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term195982 = new HashMap();
        term195842 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term195934 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term196074 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term195842, term195842.getClass(), "delegateMap", null);
        setIntField(term195842, term195842.getClass(), "size", 3);
        setIntField(term195842, term195842.getClass(), "hash3", 0);
        setField(term195934, term195934.getClass(), "delegateMap", null);
        setIntField(term195934, term195934.getClass(), "size", 3);
        setField(term195934, term195934.getClass(), "key3", term195982);
        setField(term195934, term195934.getClass(), "key2", null);
        setField(term195934, term195934.getClass(), "value2", null);
        setIntField(term195934, term195934.getClass(), "hash3", -1);
        setIntField(term195934, term195934.getClass(), "hash2", -1);
        setIntField(term195934, term195934.getClass(), "hash1", -1);
        setField(term195842, term195842.getClass(), "key3", term195934);
        setIntField(term195842, term195842.getClass(), "hash2", 0);
        setField(term195842, term195842.getClass(), "key2", term196074);
        term196166 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term196258 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term196166, term196166.getClass(), "delegateMap", null);
        setIntField(term196166, term196166.getClass(), "size", 3);
        setIntField(term196166, term196166.getClass(), "hash3", 0);
        setField(term196166, term196166.getClass(), "value3", null);
        setIntField(term196166, term196166.getClass(), "hash2", 0);
        setField(term196166, term196166.getClass(), "value2", null);
        setIntField(term196166, term196166.getClass(), "hash1", 0);
        setField(term196166, term196166.getClass(), "value1", null);
        setField(term196166, term196166.getClass(), "key3", null);
        setField(term196258, term196258.getClass(), "delegateMap", null);
        setIntField(term196258, term196258.getClass(), "size", 2);
        setIntField(term196258, term196258.getClass(), "hash2", 0);
        setField(term196258, term196258.getClass(), "value2", null);
        setIntField(term196258, term196258.getClass(), "hash1", 0);
        setField(term196258, term196258.getClass(), "value1", null);
        setField(term196166, term196166.getClass(), "key2", term196258);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term196166;
        args[1] = null;
        callMethod(klass, "put", argTypes, term195842, args);
    }

};


