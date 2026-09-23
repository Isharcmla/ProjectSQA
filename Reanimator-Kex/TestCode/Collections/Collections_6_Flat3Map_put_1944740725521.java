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
import java.lang.NullPointerException;
import static org.apache.commons.collections.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Flat3Map_put_1944740725521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99301;
     Object term99613;

    public Flat3Map_put_1944740725521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99301 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term99411 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term99521 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term99411, term99411.getClass(), "size", -4);
        setField(term99301, term99301.getClass(), "delegateMap", term99411);
        setIntField(term99301, term99301.getClass(), "size", 3);
        setIntField(term99301, term99301.getClass(), "hash3", 0);
        setField(term99301, term99301.getClass(), "key3", term99301);
        setIntField(term99301, term99301.getClass(), "hash2", 0);
        setField(term99301, term99301.getClass(), "key2", null);
        setIntField(term99301, term99301.getClass(), "hash1", 0);
        setField(term99301, term99301.getClass(), "key1", term99521);
        term99613 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term99613, term99613.getClass(), "delegateMap", null);
        setIntField(term99613, term99613.getClass(), "size", 3);
        setIntField(term99613, term99613.getClass(), "hash3", 0);
        setField(term99613, term99613.getClass(), "value3", null);
        setIntField(term99613, term99613.getClass(), "hash2", 0);
        setField(term99613, term99613.getClass(), "value2", null);
        setIntField(term99613, term99613.getClass(), "hash1", 0);
        setField(term99613, term99613.getClass(), "value1", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term99613;
        args[1] = null;
        try {
            callMethod(klass, "put", argTypes, term99301, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


