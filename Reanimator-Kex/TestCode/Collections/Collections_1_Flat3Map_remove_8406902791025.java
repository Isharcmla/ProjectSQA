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

public class Flat3Map_remove_8406902791025 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term204882;
     Object term205012;
     Object term205780;
     Object term205782;

    public Flat3Map_remove_8406902791025() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term204882 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term204920 = newInstance(Class.forName("java.lang.Object"));
        setField(term204882, term204882.getClass(), "delegateMap", null);
        setIntField(term204882, term204882.getClass(), "size", 3);
        setIntField(term204882, term204882.getClass(), "hash3", 0);
        setField(term204882, term204882.getClass(), "key3", term204920);
        setIntField(term204882, term204882.getClass(), "hash2", 0);
        setField(term204882, term204882.getClass(), "key2", null);
        setIntField(term204882, term204882.getClass(), "hash1", 0);
        setField(term204882, term204882.getClass(), "key1", term204882);
        term205012 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term205122 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term205012, term205012.getClass(), "delegateMap", null);
        setIntField(term205012, term205012.getClass(), "size", 3);
        setIntField(term205012, term205012.getClass(), "hash3", 0);
        setIntField(term205122, term205122.getClass(), "size", 0);
        setField(term205012, term205012.getClass(), "value3", term205122);
        setIntField(term205012, term205012.getClass(), "hash2", 0);
        setField(term205012, term205012.getClass(), "value2", null);
        setIntField(term205012, term205012.getClass(), "hash1", 0);
        setField(term205012, term205012.getClass(), "value1", null);
        setField(term205012, term205012.getClass(), "key3", null);
        term205780 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term205781 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term205780, term205780.getClass(), "size", 3);
        setIntField(term205780, term205780.getClass(), "hash1", 0);
        setIntField(term205780, term205780.getClass(), "hash2", 0);
        setIntField(term205780, term205780.getClass(), "hash3", 0);
        setField(term205780, term205780.getClass(), "key1", term205780);
        setField(term205780, term205780.getClass(), "key2", null);
        setField(term205780, term205780.getClass(), "key3", term205781);
        setField(term205780, term205780.getClass(), "value1", null);
        setField(term205780, term205780.getClass(), "value2", null);
        setField(term205780, term205780.getClass(), "value3", null);
        setField(term205780, term205780.getClass(), "delegateMap", null);
        term205782 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term205783 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term205782, term205782.getClass(), "size", 3);
        setIntField(term205782, term205782.getClass(), "hash1", 0);
        setIntField(term205782, term205782.getClass(), "hash2", 0);
        setIntField(term205782, term205782.getClass(), "hash3", 0);
        setField(term205782, term205782.getClass(), "key1", null);
        setField(term205782, term205782.getClass(), "key2", null);
        setField(term205782, term205782.getClass(), "key3", null);
        setField(term205782, term205782.getClass(), "value1", null);
        setField(term205782, term205782.getClass(), "value2", null);
        setFloatField(term205783, term205783.getClass(), "loadFactor", 0.0F);
        setIntField(term205783, term205783.getClass(), "size", 0);
        setField(term205783, term205783.getClass(), "data", null);
        setIntField(term205783, term205783.getClass(), "threshold", 0);
        setIntField(term205783, term205783.getClass(), "modCount", 0);
        setField(term205783, term205783.getClass(), "entrySet", null);
        setField(term205783, term205783.getClass(), "keySet", null);
        setField(term205783, term205783.getClass(), "values", null);
        setField(term205783, term205783.getClass(), "keySet", null);
        setField(term205783, term205783.getClass(), "values", null);
        setField(term205782, term205782.getClass(), "value3", term205783);
        setField(term205782, term205782.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term205012;
        Object retValue = callMethod(klass, "remove", argTypes, term204882, args);
        assertTrue(recursiveEquals(term204882, term205780));
        assertTrue(recursiveEquals(term205012, term205782));
        assertTrue(recursiveEquals(retValue, null));
    }

};
