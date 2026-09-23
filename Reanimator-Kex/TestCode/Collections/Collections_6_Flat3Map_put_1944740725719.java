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

public class Flat3Map_put_1944740725719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178719;
     Object term179123;

    public Flat3Map_put_1944740725719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term178719 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term178811 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term178921 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term179031 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term178719, term178719.getClass(), "delegateMap", null);
        setIntField(term178719, term178719.getClass(), "size", 3);
        setIntField(term178719, term178719.getClass(), "hash3", 0);
        setField(term178811, term178811.getClass(), "delegateMap", null);
        setIntField(term178811, term178811.getClass(), "size", 3);
        setField(term178811, term178811.getClass(), "key3", term178921);
        setField(term178811, term178811.getClass(), "key2", term179031);
        setField(term178719, term178719.getClass(), "key3", term178811);
        term179123 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term179123, term179123.getClass(), "delegateMap", null);
        setIntField(term179123, term179123.getClass(), "size", 3);
        setIntField(term179123, term179123.getClass(), "hash3", 0);
        setField(term179123, term179123.getClass(), "value3", null);
        setIntField(term179123, term179123.getClass(), "hash2", 0);
        setField(term179123, term179123.getClass(), "value2", null);
        setIntField(term179123, term179123.getClass(), "hash1", 0);
        setField(term179123, term179123.getClass(), "value1", null);
        setField(term179123, term179123.getClass(), "key3", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term179123;
        args[1] = null;
        callMethod(klass, "put", argTypes, term178719, args);
    }

};


