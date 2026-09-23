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
     Object term179;
     Object term195;

    public Flat3Map_remove_84069027934() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term179 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term184 = newInstance(Class.forName("java.lang.Object"));
        Object term185 = newInstance(Class.forName("java.lang.Object"));
        Object term186 = newInstance(Class.forName("java.lang.Object"));
        Object term187 = newInstance(Class.forName("java.lang.Object"));
        Object term188 = newInstance(Class.forName("java.lang.Object"));
        Object term189 = newInstance(Class.forName("java.lang.Object"));
        Object term190 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term179, term179.getClass(), "size", 1901317214);
        setIntField(term179, term179.getClass(), "hash1", 1166710220);
        setIntField(term179, term179.getClass(), "hash2", -1070592289);
        setIntField(term179, term179.getClass(), "hash3", -1464172784);
        setField(term179, term179.getClass(), "key1", term184);
        setField(term179, term179.getClass(), "key2", term185);
        setField(term179, term179.getClass(), "key3", term186);
        setField(term179, term179.getClass(), "value1", term187);
        setField(term179, term179.getClass(), "value2", term188);
        setField(term179, term179.getClass(), "value3", term189);
        setFloatField(term190, term190.getClass(), "loadFactor", 0.0F);
        setIntField(term190, term190.getClass(), "size", 0);
        setField(term190, term190.getClass(), "data", null);
        setIntField(term190, term190.getClass(), "threshold", 0);
        setIntField(term190, term190.getClass(), "modCount", 0);
        setField(term190, term190.getClass(), "entrySet", null);
        setField(term190, term190.getClass(), "keySet", null);
        setField(term190, term190.getClass(), "values", null);
        setField(term190, term190.getClass(), "keySet", null);
        setField(term190, term190.getClass(), "values", null);
        setField(term179, term179.getClass(), "delegateMap", term190);
        term195 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term195;
        try {
            callMethod(klass, "remove", argTypes, term179, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


