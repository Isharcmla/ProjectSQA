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

public class Flat3Map_put_1944740725701 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term169026;
     Object term169506;

    public Flat3Map_put_1944740725701() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term169026 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term169118 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term169216 = newInstance(Class.forName("org.apache.commons.collections.map.IdentityMap"));
        Object[] term168642 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term169304 = newInstance(Class.forName("org.apache.commons.collections.map.LRUMap"));
        Object term169414 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term169026, term169026.getClass(), "delegateMap", null);
        setIntField(term169026, term169026.getClass(), "size", 3);
        setIntField(term169026, term169026.getClass(), "hash3", 545276483);
        setField(term169026, term169026.getClass(), "key3", null);
        setIntField(term169026, term169026.getClass(), "hash2", 545276483);
        setField(term169026, term169026.getClass(), "key2", null);
        setIntField(term169026, term169026.getClass(), "hash1", 545276483);
        setIntField(term169216, term169216.getClass(), "size", 0);
        setField(term169118, term169118.getClass(), "delegateMap", term169216);
        setField(term169026, term169026.getClass(), "key1", term169118);
        setField(term169026, term169026.getClass(), "value3", term168642);
        setField(term169026, term169026.getClass(), "value2", term169304);
        setField(term169026, term169026.getClass(), "value1", term169414);
        term169506 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term169618 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        setField(term169506, term169506.getClass(), "delegateMap", null);
        setIntField(term169506, term169506.getClass(), "size", 3);
        setIntField(term169506, term169506.getClass(), "hash3", 111337509);
        setField(term169506, term169506.getClass(), "value3", null);
        setIntField(term169506, term169506.getClass(), "hash2", -641658872);
        setField(term169506, term169506.getClass(), "value2", null);
        setIntField(term169506, term169506.getClass(), "hash1", 1075597846);
        setIntField(term169618, term169618.getClass(), "size", 0);
        setField(term169506, term169506.getClass(), "value1", term169618);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term169506;
        args[1] = null;
        callMethod(klass, "put", argTypes, term169026, args);
    }

};


