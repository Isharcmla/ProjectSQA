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

public class Flat3Map_get_229621781411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75945;
     Object term76114;
     Object term76117;

    public Flat3Map_get_229621781411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75945 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term75991 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term76040 = newInstance(Class.forName("org.apache.commons.collections.map.IdentityMap"));
        setField(term75945, term75945.getClass(), "delegateMap", null);
        setIntField(term75945, term75945.getClass(), "size", 2);
        setIntField(term75945, term75945.getClass(), "hash2", 0);
        setField(term75945, term75945.getClass(), "value2", null);
        setIntField(term75945, term75945.getClass(), "hash1", 0);
        setField(term75945, term75945.getClass(), "value1", null);
        setField(term75945, term75945.getClass(), "key2", null);
        setField(term75991, term75991.getClass(), "delegateMap", term76040);
        setField(term75945, term75945.getClass(), "key1", term75991);
        term76114 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term76115 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term76116 = newInstance(Class.forName("org.apache.commons.collections.map.IdentityMap"));
        setIntField(term76114, term76114.getClass(), "size", 2);
        setIntField(term76114, term76114.getClass(), "hash1", 0);
        setIntField(term76114, term76114.getClass(), "hash2", 0);
        setIntField(term76114, term76114.getClass(), "hash3", 0);
        setIntField(term76115, term76115.getClass(), "size", 0);
        setIntField(term76115, term76115.getClass(), "hash1", 0);
        setIntField(term76115, term76115.getClass(), "hash2", 0);
        setIntField(term76115, term76115.getClass(), "hash3", 0);
        setField(term76115, term76115.getClass(), "key1", null);
        setField(term76115, term76115.getClass(), "key2", null);
        setField(term76115, term76115.getClass(), "key3", null);
        setField(term76115, term76115.getClass(), "value1", null);
        setField(term76115, term76115.getClass(), "value2", null);
        setField(term76115, term76115.getClass(), "value3", null);
        setFloatField(term76116, term76116.getClass(), "loadFactor", 0.0F);
        setIntField(term76116, term76116.getClass(), "size", 0);
        setField(term76116, term76116.getClass(), "data", null);
        setIntField(term76116, term76116.getClass(), "threshold", 0);
        setIntField(term76116, term76116.getClass(), "modCount", 0);
        setField(term76116, term76116.getClass(), "entrySet", null);
        setField(term76116, term76116.getClass(), "keySet", null);
        setField(term76116, term76116.getClass(), "values", null);
        setField(term76116, term76116.getClass(), "keySet", null);
        setField(term76116, term76116.getClass(), "values", null);
        setField(term76115, term76115.getClass(), "delegateMap", term76116);
        setField(term76114, term76114.getClass(), "key1", term76115);
        setField(term76114, term76114.getClass(), "key2", null);
        setField(term76114, term76114.getClass(), "key3", null);
        setField(term76114, term76114.getClass(), "value1", null);
        setField(term76114, term76114.getClass(), "value2", null);
        setField(term76114, term76114.getClass(), "value3", null);
        setField(term76114, term76114.getClass(), "delegateMap", null);
        term76117 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term76118 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term76119 = newInstance(Class.forName("org.apache.commons.collections.map.IdentityMap"));
        setIntField(term76117, term76117.getClass(), "size", 2);
        setIntField(term76117, term76117.getClass(), "hash1", 0);
        setIntField(term76117, term76117.getClass(), "hash2", 0);
        setIntField(term76117, term76117.getClass(), "hash3", 0);
        setIntField(term76118, term76118.getClass(), "size", 0);
        setIntField(term76118, term76118.getClass(), "hash1", 0);
        setIntField(term76118, term76118.getClass(), "hash2", 0);
        setIntField(term76118, term76118.getClass(), "hash3", 0);
        setField(term76118, term76118.getClass(), "key1", null);
        setField(term76118, term76118.getClass(), "key2", null);
        setField(term76118, term76118.getClass(), "key3", null);
        setField(term76118, term76118.getClass(), "value1", null);
        setField(term76118, term76118.getClass(), "value2", null);
        setField(term76118, term76118.getClass(), "value3", null);
        setFloatField(term76119, term76119.getClass(), "loadFactor", 0.0F);
        setIntField(term76119, term76119.getClass(), "size", 0);
        setField(term76119, term76119.getClass(), "data", null);
        setIntField(term76119, term76119.getClass(), "threshold", 0);
        setIntField(term76119, term76119.getClass(), "modCount", 0);
        setField(term76119, term76119.getClass(), "entrySet", null);
        setField(term76119, term76119.getClass(), "keySet", null);
        setField(term76119, term76119.getClass(), "values", null);
        setField(term76119, term76119.getClass(), "keySet", null);
        setField(term76119, term76119.getClass(), "values", null);
        setField(term76118, term76118.getClass(), "delegateMap", term76119);
        setField(term76117, term76117.getClass(), "key1", term76118);
        setField(term76117, term76117.getClass(), "key2", null);
        setField(term76117, term76117.getClass(), "key3", null);
        setField(term76117, term76117.getClass(), "value1", null);
        setField(term76117, term76117.getClass(), "value2", null);
        setField(term76117, term76117.getClass(), "value3", null);
        setField(term76117, term76117.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term75945;
        Object retValue = callMethod(klass, "get", argTypes, term75945, args);
        assertTrue(recursiveEquals(term75945, term76114));
        assertTrue(recursiveEquals(term75945, term76117));
        assertTrue(recursiveEquals(retValue, null));
    }

};
