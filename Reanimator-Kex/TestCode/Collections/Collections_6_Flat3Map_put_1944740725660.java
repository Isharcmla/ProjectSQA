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

public class Flat3Map_put_1944740725660 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148415;
     Object term148507;
     Object term149672;
     Object term149675;

    public Flat3Map_put_1944740725660() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148415 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term148415, term148415.getClass(), "delegateMap", null);
        setIntField(term148415, term148415.getClass(), "size", 2);
        setIntField(term148415, term148415.getClass(), "hash2", 0);
        setField(term148415, term148415.getClass(), "key2", null);
        setIntField(term148415, term148415.getClass(), "hash1", 0);
        setField(term148415, term148415.getClass(), "key1", term148415);
        term148507 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term148617 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term148507, term148507.getClass(), "delegateMap", null);
        setIntField(term148507, term148507.getClass(), "size", 2);
        setIntField(term148507, term148507.getClass(), "hash2", 0);
        setField(term148507, term148507.getClass(), "value2", null);
        setIntField(term148507, term148507.getClass(), "hash1", 0);
        setField(term148507, term148507.getClass(), "value1", null);
        setIntField(term148617, term148617.getClass(), "size", 0);
        setField(term148507, term148507.getClass(), "key2", term148617);
        term149672 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term149673 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term149674 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term149672, term149672.getClass(), "size", 3);
        setIntField(term149672, term149672.getClass(), "hash1", 0);
        setIntField(term149672, term149672.getClass(), "hash2", 0);
        setIntField(term149672, term149672.getClass(), "hash3", 0);
        setField(term149672, term149672.getClass(), "key1", term149672);
        setField(term149672, term149672.getClass(), "key2", null);
        setIntField(term149673, term149673.getClass(), "size", 2);
        setIntField(term149673, term149673.getClass(), "hash1", 0);
        setIntField(term149673, term149673.getClass(), "hash2", 0);
        setIntField(term149673, term149673.getClass(), "hash3", 0);
        setField(term149673, term149673.getClass(), "key1", null);
        setFloatField(term149674, term149674.getClass(), "loadFactor", 0.0F);
        setIntField(term149674, term149674.getClass(), "size", 0);
        setField(term149674, term149674.getClass(), "data", null);
        setIntField(term149674, term149674.getClass(), "threshold", 0);
        setIntField(term149674, term149674.getClass(), "modCount", 0);
        setField(term149674, term149674.getClass(), "entrySet", null);
        setField(term149674, term149674.getClass(), "keySet", null);
        setField(term149674, term149674.getClass(), "values", null);
        setField(term149674, term149674.getClass(), "keySet", null);
        setField(term149674, term149674.getClass(), "values", null);
        setField(term149673, term149673.getClass(), "key2", term149674);
        setField(term149673, term149673.getClass(), "key3", null);
        setField(term149673, term149673.getClass(), "value1", null);
        setField(term149673, term149673.getClass(), "value2", null);
        setField(term149673, term149673.getClass(), "value3", null);
        setField(term149673, term149673.getClass(), "delegateMap", null);
        setField(term149672, term149672.getClass(), "key3", term149673);
        setField(term149672, term149672.getClass(), "value1", null);
        setField(term149672, term149672.getClass(), "value2", null);
        setField(term149672, term149672.getClass(), "value3", null);
        setField(term149672, term149672.getClass(), "delegateMap", null);
        term149675 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term149676 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term149675, term149675.getClass(), "size", 2);
        setIntField(term149675, term149675.getClass(), "hash1", 0);
        setIntField(term149675, term149675.getClass(), "hash2", 0);
        setIntField(term149675, term149675.getClass(), "hash3", 0);
        setField(term149675, term149675.getClass(), "key1", null);
        setFloatField(term149676, term149676.getClass(), "loadFactor", 0.0F);
        setIntField(term149676, term149676.getClass(), "size", 0);
        setField(term149676, term149676.getClass(), "data", null);
        setIntField(term149676, term149676.getClass(), "threshold", 0);
        setIntField(term149676, term149676.getClass(), "modCount", 0);
        setField(term149676, term149676.getClass(), "entrySet", null);
        setField(term149676, term149676.getClass(), "keySet", null);
        setField(term149676, term149676.getClass(), "values", null);
        setField(term149676, term149676.getClass(), "keySet", null);
        setField(term149676, term149676.getClass(), "values", null);
        setField(term149675, term149675.getClass(), "key2", term149676);
        setField(term149675, term149675.getClass(), "key3", null);
        setField(term149675, term149675.getClass(), "value1", null);
        setField(term149675, term149675.getClass(), "value2", null);
        setField(term149675, term149675.getClass(), "value3", null);
        setField(term149675, term149675.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term148507;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term148415, args);
        assertTrue(recursiveEquals(term148415, term149672));
        assertTrue(recursiveEquals(term148507, term149675));
        assertTrue(recursiveEquals(retValue, null));
    }

};


