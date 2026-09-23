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

public class Flat3Map_put_19447407251043 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term298740;
     Object term298832;
     Object term299781;
     Object term299788;

    public Flat3Map_put_19447407251043() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term298740 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term298740, term298740.getClass(), "delegateMap", null);
        setIntField(term298740, term298740.getClass(), "size", 3);
        setIntField(term298740, term298740.getClass(), "hash3", -1);
        setIntField(term298740, term298740.getClass(), "hash2", -1);
        setIntField(term298740, term298740.getClass(), "hash1", 0);
        term298832 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term298942 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term299034 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term299164 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        setField(term298832, term298832.getClass(), "delegateMap", null);
        setIntField(term298832, term298832.getClass(), "size", 3);
        setIntField(term298832, term298832.getClass(), "hash3", 0);
        setIntField(term298942, term298942.getClass(), "size", 0);
        setField(term298832, term298832.getClass(), "value3", term298942);
        setIntField(term298832, term298832.getClass(), "hash2", 0);
        setField(term299034, term299034.getClass(), "delegateMap", null);
        setIntField(term299034, term299034.getClass(), "size", 0);
        setField(term298832, term298832.getClass(), "value2", term299034);
        setIntField(term298832, term298832.getClass(), "hash1", 0);
        setField(term299164, term299164.getClass(), "key", null);
        setField(term299164, term299164.getClass(), "value", null);
        setField(term298832, term298832.getClass(), "value1", term299164);
        term299781 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term299782 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term299783 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term299784 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term299785 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term299786 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term299787 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term299781, term299781.getClass(), "size", 0);
        setIntField(term299781, term299781.getClass(), "hash1", 0);
        setIntField(term299781, term299781.getClass(), "hash2", 0);
        setIntField(term299781, term299781.getClass(), "hash3", 0);
        setField(term299781, term299781.getClass(), "key1", null);
        setField(term299781, term299781.getClass(), "key2", null);
        setField(term299781, term299781.getClass(), "key3", null);
        setField(term299781, term299781.getClass(), "value1", null);
        setField(term299781, term299781.getClass(), "value2", null);
        setField(term299781, term299781.getClass(), "value3", null);
        setFloatField(term299782, term299782.getClass(), "loadFactor", 0.75F);
        setIntField(term299782, term299782.getClass(), "size", 2);
        setField(term299784, term299784.getClass(), "next", null);
        setIntField(term299785, term299785.getClass(), "size", 3);
        setIntField(term299785, term299785.getClass(), "hash1", 0);
        setIntField(term299785, term299785.getClass(), "hash2", 0);
        setIntField(term299785, term299785.getClass(), "hash3", 0);
        setField(term299785, term299785.getClass(), "key1", null);
        setField(term299785, term299785.getClass(), "key2", null);
        setField(term299785, term299785.getClass(), "key3", null);
        setField(term299785, term299785.getClass(), "value1", null);
        setField(term299785, term299785.getClass(), "value2", null);
        setField(term299785, term299785.getClass(), "value3", null);
        setField(term299785, term299785.getClass(), "delegateMap", null);
        setField(term299784, term299784.getClass(), "key", term299785);
        setField(term299784, term299784.getClass(), "value", null);
        setElement(term299783, 0, term299784);
        setField(term299786, term299786.getClass(), "next", null);
        setField(term299786, term299786.getClass(), "key", term299787);
        setField(term299786, term299786.getClass(), "value", null);
        setElement(term299783, 6, term299786);
        setField(term299782, term299782.getClass(), "data", term299783);
        setIntField(term299782, term299782.getClass(), "threshold", 12);
        setIntField(term299782, term299782.getClass(), "modCount", 2);
        setField(term299782, term299782.getClass(), "entrySet", null);
        setField(term299782, term299782.getClass(), "keySet", null);
        setField(term299782, term299782.getClass(), "values", null);
        setField(term299782, term299782.getClass(), "keySet", null);
        setField(term299782, term299782.getClass(), "values", null);
        setField(term299781, term299781.getClass(), "delegateMap", term299782);
        term299788 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term299788, term299788.getClass(), "size", 3);
        setIntField(term299788, term299788.getClass(), "hash1", 0);
        setIntField(term299788, term299788.getClass(), "hash2", 0);
        setIntField(term299788, term299788.getClass(), "hash3", 0);
        setField(term299788, term299788.getClass(), "key1", null);
        setField(term299788, term299788.getClass(), "key2", null);
        setField(term299788, term299788.getClass(), "key3", null);
        setField(term299788, term299788.getClass(), "value1", null);
        setField(term299788, term299788.getClass(), "value2", null);
        setField(term299788, term299788.getClass(), "value3", null);
        setField(term299788, term299788.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term298832;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term298740, args);
        assertTrue(recursiveEquals(term298740, term299781));
        assertTrue(recursiveEquals(term298832, term299788));
        assertTrue(recursiveEquals(retValue, null));
    }

};


