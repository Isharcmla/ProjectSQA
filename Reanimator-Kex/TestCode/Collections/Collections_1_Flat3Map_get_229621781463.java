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

public class Flat3Map_get_229621781463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86521;
     Object term86719;
     Object term86722;

    public Flat3Map_get_229621781463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86521 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term86567 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term86623 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        setField(term86521, term86521.getClass(), "delegateMap", null);
        setIntField(term86521, term86521.getClass(), "size", 2);
        setIntField(term86521, term86521.getClass(), "hash2", 0);
        setField(term86521, term86521.getClass(), "value2", null);
        setIntField(term86521, term86521.getClass(), "hash1", 0);
        setField(term86521, term86521.getClass(), "value1", null);
        setField(term86521, term86521.getClass(), "key2", null);
        setField(term86567, term86567.getClass(), "delegateMap", term86623);
        setField(term86521, term86521.getClass(), "key1", term86567);
        term86719 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term86720 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term86721 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        setIntField(term86719, term86719.getClass(), "size", 2);
        setIntField(term86719, term86719.getClass(), "hash1", 0);
        setIntField(term86719, term86719.getClass(), "hash2", 0);
        setIntField(term86719, term86719.getClass(), "hash3", 0);
        setIntField(term86720, term86720.getClass(), "size", 0);
        setIntField(term86720, term86720.getClass(), "hash1", 0);
        setIntField(term86720, term86720.getClass(), "hash2", 0);
        setIntField(term86720, term86720.getClass(), "hash3", 0);
        setField(term86720, term86720.getClass(), "key1", null);
        setField(term86720, term86720.getClass(), "key2", null);
        setField(term86720, term86720.getClass(), "key3", null);
        setField(term86720, term86720.getClass(), "value1", null);
        setField(term86720, term86720.getClass(), "value2", null);
        setField(term86720, term86720.getClass(), "value3", null);
        setFloatField(term86721, term86721.getClass(), "loadFactor", 0.0F);
        setIntField(term86721, term86721.getClass(), "size", 0);
        setField(term86721, term86721.getClass(), "data", null);
        setIntField(term86721, term86721.getClass(), "threshold", 0);
        setIntField(term86721, term86721.getClass(), "modCount", 0);
        setField(term86721, term86721.getClass(), "entrySet", null);
        setField(term86721, term86721.getClass(), "keySet", null);
        setField(term86721, term86721.getClass(), "values", null);
        setField(term86721, term86721.getClass(), "keySet", null);
        setField(term86721, term86721.getClass(), "values", null);
        setField(term86720, term86720.getClass(), "delegateMap", term86721);
        setField(term86719, term86719.getClass(), "key1", term86720);
        setField(term86719, term86719.getClass(), "key2", null);
        setField(term86719, term86719.getClass(), "key3", null);
        setField(term86719, term86719.getClass(), "value1", null);
        setField(term86719, term86719.getClass(), "value2", null);
        setField(term86719, term86719.getClass(), "value3", null);
        setField(term86719, term86719.getClass(), "delegateMap", null);
        term86722 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term86723 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term86724 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        setIntField(term86722, term86722.getClass(), "size", 2);
        setIntField(term86722, term86722.getClass(), "hash1", 0);
        setIntField(term86722, term86722.getClass(), "hash2", 0);
        setIntField(term86722, term86722.getClass(), "hash3", 0);
        setIntField(term86723, term86723.getClass(), "size", 0);
        setIntField(term86723, term86723.getClass(), "hash1", 0);
        setIntField(term86723, term86723.getClass(), "hash2", 0);
        setIntField(term86723, term86723.getClass(), "hash3", 0);
        setField(term86723, term86723.getClass(), "key1", null);
        setField(term86723, term86723.getClass(), "key2", null);
        setField(term86723, term86723.getClass(), "key3", null);
        setField(term86723, term86723.getClass(), "value1", null);
        setField(term86723, term86723.getClass(), "value2", null);
        setField(term86723, term86723.getClass(), "value3", null);
        setFloatField(term86724, term86724.getClass(), "loadFactor", 0.0F);
        setIntField(term86724, term86724.getClass(), "size", 0);
        setField(term86724, term86724.getClass(), "data", null);
        setIntField(term86724, term86724.getClass(), "threshold", 0);
        setIntField(term86724, term86724.getClass(), "modCount", 0);
        setField(term86724, term86724.getClass(), "entrySet", null);
        setField(term86724, term86724.getClass(), "keySet", null);
        setField(term86724, term86724.getClass(), "values", null);
        setField(term86724, term86724.getClass(), "keySet", null);
        setField(term86724, term86724.getClass(), "values", null);
        setField(term86723, term86723.getClass(), "delegateMap", term86724);
        setField(term86722, term86722.getClass(), "key1", term86723);
        setField(term86722, term86722.getClass(), "key2", null);
        setField(term86722, term86722.getClass(), "key3", null);
        setField(term86722, term86722.getClass(), "value1", null);
        setField(term86722, term86722.getClass(), "value2", null);
        setField(term86722, term86722.getClass(), "value3", null);
        setField(term86722, term86722.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term86521;
        Object retValue = callMethod(klass, "get", argTypes, term86521, args);
        assertTrue(recursiveEquals(term86521, term86719));
        assertTrue(recursiveEquals(term86521, term86722));
        assertTrue(recursiveEquals(retValue, null));
    }

};
