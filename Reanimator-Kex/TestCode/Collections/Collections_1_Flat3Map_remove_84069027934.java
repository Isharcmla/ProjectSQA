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

public class Flat3Map_remove_84069027934 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term181;
     Object term197;

    public Flat3Map_remove_84069027934() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term181 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term186 = newInstance(Class.forName("java.lang.Object"));
        Object term187 = newInstance(Class.forName("java.lang.Object"));
        Object term188 = newInstance(Class.forName("java.lang.Object"));
        Object term189 = newInstance(Class.forName("java.lang.Object"));
        Object term190 = newInstance(Class.forName("java.lang.Object"));
        Object term191 = newInstance(Class.forName("java.lang.Object"));
        Object term192 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term181, term181.getClass(), "size", 1901317214);
        setIntField(term181, term181.getClass(), "hash1", 1166710220);
        setIntField(term181, term181.getClass(), "hash2", -1070592289);
        setIntField(term181, term181.getClass(), "hash3", -1464172784);
        setField(term181, term181.getClass(), "key1", term186);
        setField(term181, term181.getClass(), "key2", term187);
        setField(term181, term181.getClass(), "key3", term188);
        setField(term181, term181.getClass(), "value1", term189);
        setField(term181, term181.getClass(), "value2", term190);
        setField(term181, term181.getClass(), "value3", term191);
        setFloatField(term192, term192.getClass(), "loadFactor", 0.0F);
        setIntField(term192, term192.getClass(), "size", 0);
        setField(term192, term192.getClass(), "data", null);
        setIntField(term192, term192.getClass(), "threshold", 0);
        setIntField(term192, term192.getClass(), "modCount", 0);
        setField(term192, term192.getClass(), "entrySet", null);
        setField(term192, term192.getClass(), "keySet", null);
        setField(term192, term192.getClass(), "values", null);
        setField(term192, term192.getClass(), "keySet", null);
        setField(term192, term192.getClass(), "values", null);
        setField(term181, term181.getClass(), "delegateMap", term192);
        term197 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term197;
        try {
            callMethod(klass, "remove", argTypes, term181, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
