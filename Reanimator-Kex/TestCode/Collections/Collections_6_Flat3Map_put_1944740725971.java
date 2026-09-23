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

public class Flat3Map_put_1944740725971 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term270289;
     Object term270665;

    public Flat3Map_put_1944740725971() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term270289 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term270381 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term270473 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term270573 = newInstance(Class.forName("org.apache.commons.collections.map.ReferenceMap"));
        setField(term270289, term270289.getClass(), "delegateMap", null);
        setIntField(term270289, term270289.getClass(), "size", 3);
        setIntField(term270289, term270289.getClass(), "hash3", -453737726);
        setField(term270381, term270381.getClass(), "delegateMap", null);
        setIntField(term270381, term270381.getClass(), "size", 3);
        setField(term270473, term270473.getClass(), "delegateMap", null);
        setIntField(term270473, term270473.getClass(), "size", 0);
        setField(term270381, term270381.getClass(), "key3", term270473);
        setField(term270381, term270381.getClass(), "key2", null);
        setField(term270381, term270381.getClass(), "value2", null);
        setIntField(term270381, term270381.getClass(), "hash3", 44957696);
        setIntField(term270573, term270573.getClass(), "size", 0);
        setField(term270381, term270381.getClass(), "value3", term270573);
        setIntField(term270381, term270381.getClass(), "hash2", -1940586496);
        setIntField(term270381, term270381.getClass(), "hash1", 1507500032);
        setField(term270381, term270381.getClass(), "value1", null);
        setField(term270289, term270289.getClass(), "key3", term270381);
        setIntField(term270289, term270289.getClass(), "hash2", -453737726);
        setField(term270289, term270289.getClass(), "key2", null);
        setIntField(term270289, term270289.getClass(), "hash1", -453737726);
        setField(term270289, term270289.getClass(), "key1", null);
        setField(term270289, term270289.getClass(), "value3", term270573);
        setField(term270289, term270289.getClass(), "value2", null);
        setField(term270289, term270289.getClass(), "value1", null);
        term270665 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term270757 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term270665, term270665.getClass(), "delegateMap", null);
        setIntField(term270665, term270665.getClass(), "size", 3);
        setIntField(term270665, term270665.getClass(), "hash3", -387776512);
        setField(term270665, term270665.getClass(), "value3", null);
        setIntField(term270665, term270665.getClass(), "hash2", -1089437694);
        setField(term270665, term270665.getClass(), "value2", null);
        setIntField(term270665, term270665.getClass(), "hash1", 1023476480);
        setField(term270665, term270665.getClass(), "value1", null);
        setField(term270665, term270665.getClass(), "key3", null);
        setField(term270757, term270757.getClass(), "delegateMap", null);
        setIntField(term270757, term270757.getClass(), "size", 0);
        setField(term270665, term270665.getClass(), "key2", term270757);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term270665;
        args[1] = null;
        callMethod(klass, "put", argTypes, term270289, args);
    }

};


