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

public class Flat3Map_put_1944740725805 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term203341;
     Object term203295;

    public Flat3Map_put_1944740725805() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term203341 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term203387 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term203433 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term203452 = newInstance(Class.forName("java.lang.Object"));
        Object term203498 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term203341, term203341.getClass(), "delegateMap", null);
        setIntField(term203341, term203341.getClass(), "size", 0);
        setIntField(term203341, term203341.getClass(), "hash3", 0);
        setField(term203387, term203387.getClass(), "delegateMap", null);
        setIntField(term203387, term203387.getClass(), "size", 3);
        setField(term203387, term203387.getClass(), "key3", term203433);
        setField(term203387, term203387.getClass(), "key2", null);
        setField(term203387, term203387.getClass(), "value2", null);
        setIntField(term203387, term203387.getClass(), "hash3", -1);
        setIntField(term203387, term203387.getClass(), "hash2", 0);
        setIntField(term203387, term203387.getClass(), "hash1", 0);
        setField(term203387, term203387.getClass(), "key1", term203452);
        setField(term203341, term203341.getClass(), "key3", term203387);
        setIntField(term203341, term203341.getClass(), "hash2", 0);
        setField(term203341, term203341.getClass(), "key2", term203498);
        term203295 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term203295, term203295.getClass(), "delegateMap", null);
        setIntField(term203295, term203295.getClass(), "size", 3);
        setIntField(term203295, term203295.getClass(), "hash3", 0);
        setField(term203295, term203295.getClass(), "value3", null);
        setIntField(term203295, term203295.getClass(), "hash2", 0);
        setField(term203295, term203295.getClass(), "value2", null);
        setIntField(term203295, term203295.getClass(), "hash1", 0);
        setField(term203295, term203295.getClass(), "value1", null);
        setField(term203295, term203295.getClass(), "key3", null);
        setField(term203295, term203295.getClass(), "key2", term203341);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term203295;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term203341, args);
        assertTrue(recursiveEquals(term203295, (short) 0));
        assertTrue(recursiveEquals(retValue, null));
    }

};


