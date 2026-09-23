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

public class Flat3Map_put_1944740725414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72180;
     Object term72272;
     Object term73182;
     Object term73185;

    public Flat3Map_put_1944740725414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72180 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term72180, term72180.getClass(), "delegateMap", null);
        setIntField(term72180, term72180.getClass(), "size", 1);
        setIntField(term72180, term72180.getClass(), "hash1", 0);
        setField(term72180, term72180.getClass(), "key1", term72180);
        term72272 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term72382 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term72272, term72272.getClass(), "delegateMap", null);
        setIntField(term72272, term72272.getClass(), "size", 1);
        setIntField(term72272, term72272.getClass(), "hash1", 0);
        setIntField(term72382, term72382.getClass(), "size", 0);
        setField(term72272, term72272.getClass(), "value1", term72382);
        term73182 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term73183 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term73184 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term73182, term73182.getClass(), "size", 2);
        setIntField(term73182, term73182.getClass(), "hash1", 0);
        setIntField(term73182, term73182.getClass(), "hash2", 0);
        setIntField(term73182, term73182.getClass(), "hash3", 0);
        setField(term73182, term73182.getClass(), "key1", term73182);
        setIntField(term73183, term73183.getClass(), "size", 1);
        setIntField(term73183, term73183.getClass(), "hash1", 0);
        setIntField(term73183, term73183.getClass(), "hash2", 0);
        setIntField(term73183, term73183.getClass(), "hash3", 0);
        setField(term73183, term73183.getClass(), "key1", null);
        setField(term73183, term73183.getClass(), "key2", null);
        setField(term73183, term73183.getClass(), "key3", null);
        setFloatField(term73184, term73184.getClass(), "loadFactor", 0.0F);
        setIntField(term73184, term73184.getClass(), "size", 0);
        setField(term73184, term73184.getClass(), "data", null);
        setIntField(term73184, term73184.getClass(), "threshold", 0);
        setIntField(term73184, term73184.getClass(), "modCount", 0);
        setField(term73184, term73184.getClass(), "entrySet", null);
        setField(term73184, term73184.getClass(), "keySet", null);
        setField(term73184, term73184.getClass(), "values", null);
        setField(term73184, term73184.getClass(), "keySet", null);
        setField(term73184, term73184.getClass(), "values", null);
        setField(term73183, term73183.getClass(), "value1", term73184);
        setField(term73183, term73183.getClass(), "value2", null);
        setField(term73183, term73183.getClass(), "value3", null);
        setField(term73183, term73183.getClass(), "delegateMap", null);
        setField(term73182, term73182.getClass(), "key2", term73183);
        setField(term73182, term73182.getClass(), "key3", null);
        setField(term73182, term73182.getClass(), "value1", null);
        setField(term73182, term73182.getClass(), "value2", null);
        setField(term73182, term73182.getClass(), "value3", null);
        setField(term73182, term73182.getClass(), "delegateMap", null);
        term73185 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term73186 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term73185, term73185.getClass(), "size", 1);
        setIntField(term73185, term73185.getClass(), "hash1", 0);
        setIntField(term73185, term73185.getClass(), "hash2", 0);
        setIntField(term73185, term73185.getClass(), "hash3", 0);
        setField(term73185, term73185.getClass(), "key1", null);
        setField(term73185, term73185.getClass(), "key2", null);
        setField(term73185, term73185.getClass(), "key3", null);
        setFloatField(term73186, term73186.getClass(), "loadFactor", 0.0F);
        setIntField(term73186, term73186.getClass(), "size", 0);
        setField(term73186, term73186.getClass(), "data", null);
        setIntField(term73186, term73186.getClass(), "threshold", 0);
        setIntField(term73186, term73186.getClass(), "modCount", 0);
        setField(term73186, term73186.getClass(), "entrySet", null);
        setField(term73186, term73186.getClass(), "keySet", null);
        setField(term73186, term73186.getClass(), "values", null);
        setField(term73186, term73186.getClass(), "keySet", null);
        setField(term73186, term73186.getClass(), "values", null);
        setField(term73185, term73185.getClass(), "value1", term73186);
        setField(term73185, term73185.getClass(), "value2", null);
        setField(term73185, term73185.getClass(), "value3", null);
        setField(term73185, term73185.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term72272;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term72180, args);
        assertTrue(recursiveEquals(term72180, term73182));
        assertTrue(recursiveEquals(term72272, term73185));
        assertTrue(recursiveEquals(retValue, null));
    }

};


