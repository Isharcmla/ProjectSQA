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

public class Flat3Map_put_1944740725806 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term203686;
     Object term203962;

    public Flat3Map_put_1944740725806() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term203686 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term203778 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term203870 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term203686, term203686.getClass(), "delegateMap", null);
        setIntField(term203686, term203686.getClass(), "size", 3);
        setIntField(term203686, term203686.getClass(), "hash3", 0);
        setField(term203778, term203778.getClass(), "delegateMap", null);
        setIntField(term203778, term203778.getClass(), "size", 3);
        setField(term203778, term203778.getClass(), "key3", term203870);
        setField(term203778, term203778.getClass(), "key2", null);
        setField(term203778, term203778.getClass(), "value2", null);
        setField(term203686, term203686.getClass(), "key3", term203778);
        term203962 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term204096 = newInstance(Class.forName("org.apache.commons.collections.iterators.UnmodifiableMapIterator"));
        setField(term203962, term203962.getClass(), "delegateMap", null);
        setIntField(term203962, term203962.getClass(), "size", 3);
        setIntField(term203962, term203962.getClass(), "hash3", 0);
        setField(term203962, term203962.getClass(), "value3", null);
        setIntField(term203962, term203962.getClass(), "hash2", 0);
        setField(term203962, term203962.getClass(), "value2", null);
        setIntField(term203962, term203962.getClass(), "hash1", 0);
        setField(term203962, term203962.getClass(), "value1", null);
        setField(term203962, term203962.getClass(), "key3", null);
        setField(term203962, term203962.getClass(), "key2", null);
        setField(term203962, term203962.getClass(), "key1", term204096);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term203962;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term203686, args);
        assertTrue(recursiveEquals(term203962, 0));
        assertTrue(recursiveEquals(retValue, null));
    }

};


