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

public class Flat3Map_put_1944740725880 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term231485;
     Object term231981;

    public Flat3Map_put_1944740725880() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term231485 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term231577 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term231669 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term231779 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term231889 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object[] term231020 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        setField(term231485, term231485.getClass(), "delegateMap", null);
        setIntField(term231485, term231485.getClass(), "size", 3);
        setIntField(term231485, term231485.getClass(), "hash3", 1194742658);
        setField(term231577, term231577.getClass(), "delegateMap", null);
        setIntField(term231577, term231577.getClass(), "size", 3);
        setField(term231669, term231669.getClass(), "delegateMap", null);
        setIntField(term231669, term231669.getClass(), "size", 0);
        setField(term231577, term231577.getClass(), "key3", term231669);
        setField(term231577, term231577.getClass(), "key2", null);
        setField(term231577, term231577.getClass(), "value2", null);
        setIntField(term231577, term231577.getClass(), "hash3", 847911472);
        setIntField(term231779, term231779.getClass(), "size", 0);
        setField(term231577, term231577.getClass(), "value3", term231779);
        setIntField(term231577, term231577.getClass(), "hash2", 134217920);
        setIntField(term231577, term231577.getClass(), "hash1", 352960768);
        setField(term231577, term231577.getClass(), "value1", null);
        setField(term231485, term231485.getClass(), "key3", term231577);
        setIntField(term231485, term231485.getClass(), "hash2", 1194742658);
        setField(term231485, term231485.getClass(), "key2", null);
        setIntField(term231485, term231485.getClass(), "hash1", 1194742658);
        setField(term231485, term231485.getClass(), "key1", null);
        setField(term231485, term231485.getClass(), "value3", null);
        setField(term231485, term231485.getClass(), "value2", term231889);
        setField(term231485, term231485.getClass(), "value1", term231020);
        term231981 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term232073 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term231981, term231981.getClass(), "delegateMap", null);
        setIntField(term231981, term231981.getClass(), "size", 3);
        setIntField(term231981, term231981.getClass(), "hash3", 740557058);
        setField(term231981, term231981.getClass(), "value3", null);
        setIntField(term231981, term231981.getClass(), "hash2", 1040318464);
        setField(term231981, term231981.getClass(), "value2", null);
        setIntField(term231981, term231981.getClass(), "hash1", -586132864);
        setField(term231981, term231981.getClass(), "value1", null);
        setField(term231981, term231981.getClass(), "key3", null);
        setField(term232073, term232073.getClass(), "delegateMap", null);
        setIntField(term232073, term232073.getClass(), "size", 0);
        setField(term231981, term231981.getClass(), "key2", term232073);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term231981;
        args[1] = null;
        callMethod(klass, "put", argTypes, term231485, args);
    }

};


