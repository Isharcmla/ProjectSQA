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

public class Flat3Map_put_1944740725486 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90531;
     Object term90811;
     Object term91077;
     Object term91082;

    public Flat3Map_put_1944740725486() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term90671 = new HashMap();
        HashMap term90719 = new HashMap();
        term90531 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term90623 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term90531, term90531.getClass(), "delegateMap", null);
        setIntField(term90531, term90531.getClass(), "size", 2);
        setIntField(term90531, term90531.getClass(), "hash2", 0);
        setField(term90623, term90623.getClass(), "delegateMap", null);
        setIntField(term90623, term90623.getClass(), "size", 2);
        setField(term90623, term90623.getClass(), "key2", term90671);
        setField(term90623, term90623.getClass(), "key1", null);
        setField(term90623, term90623.getClass(), "value1", term90719);
        setField(term90531, term90531.getClass(), "key2", term90623);
        term90811 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term90811, term90811.getClass(), "delegateMap", null);
        setIntField(term90811, term90811.getClass(), "size", 2);
        setIntField(term90811, term90811.getClass(), "hash2", 0);
        setField(term90811, term90811.getClass(), "value2", null);
        setIntField(term90811, term90811.getClass(), "hash1", 0);
        setField(term90811, term90811.getClass(), "value1", null);
        setField(term90811, term90811.getClass(), "key2", null);
        HashMap term91079 = new HashMap();
        HashMap term91080 = new HashMap();
        term91077 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term91078 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term91081 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term91077, term91077.getClass(), "size", 3);
        setIntField(term91077, term91077.getClass(), "hash1", 0);
        setIntField(term91077, term91077.getClass(), "hash2", 0);
        setIntField(term91077, term91077.getClass(), "hash3", 0);
        setField(term91077, term91077.getClass(), "key1", null);
        setIntField(term91078, term91078.getClass(), "size", 2);
        setIntField(term91078, term91078.getClass(), "hash1", 0);
        setIntField(term91078, term91078.getClass(), "hash2", 0);
        setIntField(term91078, term91078.getClass(), "hash3", 0);
        setField(term91078, term91078.getClass(), "key1", null);
        setField(term91078, term91078.getClass(), "key2", term91079);
        setField(term91078, term91078.getClass(), "key3", null);
        setField(term91078, term91078.getClass(), "value1", term91080);
        setField(term91078, term91078.getClass(), "value2", null);
        setField(term91078, term91078.getClass(), "value3", null);
        setField(term91078, term91078.getClass(), "delegateMap", null);
        setField(term91077, term91077.getClass(), "key2", term91078);
        setIntField(term91081, term91081.getClass(), "size", 2);
        setIntField(term91081, term91081.getClass(), "hash1", 0);
        setIntField(term91081, term91081.getClass(), "hash2", 0);
        setIntField(term91081, term91081.getClass(), "hash3", 0);
        setField(term91081, term91081.getClass(), "key1", null);
        setField(term91081, term91081.getClass(), "key2", null);
        setField(term91081, term91081.getClass(), "key3", null);
        setField(term91081, term91081.getClass(), "value1", null);
        setField(term91081, term91081.getClass(), "value2", null);
        setField(term91081, term91081.getClass(), "value3", null);
        setField(term91081, term91081.getClass(), "delegateMap", null);
        setField(term91077, term91077.getClass(), "key3", term91081);
        setField(term91077, term91077.getClass(), "value1", null);
        setField(term91077, term91077.getClass(), "value2", null);
        setField(term91077, term91077.getClass(), "value3", null);
        setField(term91077, term91077.getClass(), "delegateMap", null);
        term91082 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term91082, term91082.getClass(), "size", 2);
        setIntField(term91082, term91082.getClass(), "hash1", 0);
        setIntField(term91082, term91082.getClass(), "hash2", 0);
        setIntField(term91082, term91082.getClass(), "hash3", 0);
        setField(term91082, term91082.getClass(), "key1", null);
        setField(term91082, term91082.getClass(), "key2", null);
        setField(term91082, term91082.getClass(), "key3", null);
        setField(term91082, term91082.getClass(), "value1", null);
        setField(term91082, term91082.getClass(), "value2", null);
        setField(term91082, term91082.getClass(), "value3", null);
        setField(term91082, term91082.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term90811;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term90531, args);
        assertTrue(recursiveEquals(term90531, term91077));
        assertTrue(recursiveEquals(term90811, term91082));
        assertTrue(recursiveEquals(retValue, null));
    }

};


