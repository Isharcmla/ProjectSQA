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

public class Flat3Map_get_229621781496 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93171;
     Object term93263;
     Object term93719;
     Object term93720;

    public Flat3Map_get_229621781496() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93171 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term93171, term93171.getClass(), "delegateMap", null);
        setIntField(term93171, term93171.getClass(), "size", 2);
        setIntField(term93171, term93171.getClass(), "hash2", 0);
        setField(term93171, term93171.getClass(), "key2", null);
        term93263 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term93373 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term93263, term93263.getClass(), "delegateMap", null);
        setIntField(term93263, term93263.getClass(), "size", 2);
        setIntField(term93263, term93263.getClass(), "hash2", 0);
        setIntField(term93373, term93373.getClass(), "size", 0);
        setField(term93263, term93263.getClass(), "value2", term93373);
        setIntField(term93263, term93263.getClass(), "hash1", 0);
        setField(term93263, term93263.getClass(), "value1", null);
        setField(term93263, term93263.getClass(), "key2", null);
        term93719 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term93719, term93719.getClass(), "size", 2);
        setIntField(term93719, term93719.getClass(), "hash1", 0);
        setIntField(term93719, term93719.getClass(), "hash2", 0);
        setIntField(term93719, term93719.getClass(), "hash3", 0);
        setField(term93719, term93719.getClass(), "key1", null);
        setField(term93719, term93719.getClass(), "key2", null);
        setField(term93719, term93719.getClass(), "key3", null);
        setField(term93719, term93719.getClass(), "value1", null);
        setField(term93719, term93719.getClass(), "value2", null);
        setField(term93719, term93719.getClass(), "value3", null);
        setField(term93719, term93719.getClass(), "delegateMap", null);
        term93720 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term93721 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term93720, term93720.getClass(), "size", 2);
        setIntField(term93720, term93720.getClass(), "hash1", 0);
        setIntField(term93720, term93720.getClass(), "hash2", 0);
        setIntField(term93720, term93720.getClass(), "hash3", 0);
        setField(term93720, term93720.getClass(), "key1", null);
        setField(term93720, term93720.getClass(), "key2", null);
        setField(term93720, term93720.getClass(), "key3", null);
        setField(term93720, term93720.getClass(), "value1", null);
        setFloatField(term93721, term93721.getClass(), "loadFactor", 0.0F);
        setIntField(term93721, term93721.getClass(), "size", 0);
        setField(term93721, term93721.getClass(), "data", null);
        setIntField(term93721, term93721.getClass(), "threshold", 0);
        setIntField(term93721, term93721.getClass(), "modCount", 0);
        setField(term93721, term93721.getClass(), "entrySet", null);
        setField(term93721, term93721.getClass(), "keySet", null);
        setField(term93721, term93721.getClass(), "values", null);
        setField(term93721, term93721.getClass(), "keySet", null);
        setField(term93721, term93721.getClass(), "values", null);
        setField(term93720, term93720.getClass(), "value2", term93721);
        setField(term93720, term93720.getClass(), "value3", null);
        setField(term93720, term93720.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term93263;
        Object retValue = callMethod(klass, "get", argTypes, term93171, args);
        assertTrue(recursiveEquals(term93171, term93719));
        assertTrue(recursiveEquals(term93263, term93720));
        assertTrue(recursiveEquals(retValue, null));
    }

};
