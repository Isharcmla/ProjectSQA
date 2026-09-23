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

public class Flat3Map_put_1944740725295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48953;
     Object term49158;

    public Flat3Map_put_1944740725295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48953 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term49045 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term49137 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term48953, term48953.getClass(), "delegateMap", null);
        setIntField(term48953, term48953.getClass(), "size", 3);
        setField(term48953, term48953.getClass(), "key3", term49045);
        setField(term48953, term48953.getClass(), "key2", term49137);
        term49158 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term49159 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term49160 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term49158, term49158.getClass(), "size", 3);
        setIntField(term49158, term49158.getClass(), "hash1", 0);
        setIntField(term49158, term49158.getClass(), "hash2", 0);
        setIntField(term49158, term49158.getClass(), "hash3", 0);
        setField(term49158, term49158.getClass(), "key1", null);
        setIntField(term49159, term49159.getClass(), "size", 0);
        setIntField(term49159, term49159.getClass(), "hash1", 0);
        setIntField(term49159, term49159.getClass(), "hash2", 0);
        setIntField(term49159, term49159.getClass(), "hash3", 0);
        setField(term49159, term49159.getClass(), "key1", null);
        setField(term49159, term49159.getClass(), "key2", null);
        setField(term49159, term49159.getClass(), "key3", null);
        setField(term49159, term49159.getClass(), "value1", null);
        setField(term49159, term49159.getClass(), "value2", null);
        setField(term49159, term49159.getClass(), "value3", null);
        setField(term49159, term49159.getClass(), "delegateMap", null);
        setField(term49158, term49158.getClass(), "key2", term49159);
        setIntField(term49160, term49160.getClass(), "size", 0);
        setIntField(term49160, term49160.getClass(), "hash1", 0);
        setIntField(term49160, term49160.getClass(), "hash2", 0);
        setIntField(term49160, term49160.getClass(), "hash3", 0);
        setField(term49160, term49160.getClass(), "key1", null);
        setField(term49160, term49160.getClass(), "key2", null);
        setField(term49160, term49160.getClass(), "key3", null);
        setField(term49160, term49160.getClass(), "value1", null);
        setField(term49160, term49160.getClass(), "value2", null);
        setField(term49160, term49160.getClass(), "value3", null);
        setField(term49160, term49160.getClass(), "delegateMap", null);
        setField(term49158, term49158.getClass(), "key3", term49160);
        setField(term49158, term49158.getClass(), "value1", null);
        setField(term49158, term49158.getClass(), "value2", null);
        setField(term49158, term49158.getClass(), "value3", null);
        setField(term49158, term49158.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term48953, args);
        assertTrue(recursiveEquals(term48953, term49158));
        assertTrue(recursiveEquals(retValue, null));
    }

};


