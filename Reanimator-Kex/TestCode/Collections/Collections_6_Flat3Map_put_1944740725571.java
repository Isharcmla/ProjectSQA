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

public class Flat3Map_put_1944740725571 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115365;
     Object term115613;
     Object term115731;
     Object term115734;

    public Flat3Map_put_1944740725571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term115365 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        term115613 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term115668 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term115365, term115365.getClass(), "delegateMap", null);
        setIntField(term115365, term115365.getClass(), "size", 3);
        setIntField(term115365, term115365.getClass(), "hash3", 0);
        setField(term115365, term115365.getClass(), "key3", null);
        setIntField(term115365, term115365.getClass(), "hash2", 0);
        setField(term115365, term115365.getClass(), "key2", null);
        setIntField(term115365, term115365.getClass(), "hash1", 0);
        setField(term115613, term115613.getClass(), "delegateMap", null);
        setIntField(term115613, term115613.getClass(), "size", 3);
        setIntField(term115613, term115613.getClass(), "hash3", 0);
        setField(term115613, term115613.getClass(), "value3", null);
        setIntField(term115613, term115613.getClass(), "hash2", 0);
        setField(term115613, term115613.getClass(), "value2", null);
        setIntField(term115613, term115613.getClass(), "hash1", 0);
        setIntField(term115668, term115668.getClass(), "size", 0);
        setField(term115613, term115613.getClass(), "value1", term115668);
        setField(term115365, term115365.getClass(), "key1", term115613);
        term115731 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term115732 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term115733 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term115731, term115731.getClass(), "size", 3);
        setIntField(term115731, term115731.getClass(), "hash1", 0);
        setIntField(term115731, term115731.getClass(), "hash2", 0);
        setIntField(term115731, term115731.getClass(), "hash3", 0);
        setIntField(term115732, term115732.getClass(), "size", 3);
        setIntField(term115732, term115732.getClass(), "hash1", 0);
        setIntField(term115732, term115732.getClass(), "hash2", 0);
        setIntField(term115732, term115732.getClass(), "hash3", 0);
        setField(term115732, term115732.getClass(), "key1", null);
        setField(term115732, term115732.getClass(), "key2", null);
        setField(term115732, term115732.getClass(), "key3", null);
        setFloatField(term115733, term115733.getClass(), "loadFactor", 0.0F);
        setIntField(term115733, term115733.getClass(), "size", 0);
        setField(term115733, term115733.getClass(), "data", null);
        setIntField(term115733, term115733.getClass(), "threshold", 0);
        setIntField(term115733, term115733.getClass(), "modCount", 0);
        setField(term115733, term115733.getClass(), "entrySet", null);
        setField(term115733, term115733.getClass(), "keySet", null);
        setField(term115733, term115733.getClass(), "values", null);
        setField(term115733, term115733.getClass(), "keySet", null);
        setField(term115733, term115733.getClass(), "values", null);
        setField(term115732, term115732.getClass(), "value1", term115733);
        setField(term115732, term115732.getClass(), "value2", null);
        setField(term115732, term115732.getClass(), "value3", null);
        setField(term115732, term115732.getClass(), "delegateMap", null);
        setField(term115731, term115731.getClass(), "key1", term115732);
        setField(term115731, term115731.getClass(), "key2", null);
        setField(term115731, term115731.getClass(), "key3", null);
        setField(term115731, term115731.getClass(), "value1", null);
        setField(term115731, term115731.getClass(), "value2", null);
        setField(term115731, term115731.getClass(), "value3", null);
        setField(term115731, term115731.getClass(), "delegateMap", null);
        term115734 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term115735 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term115734, term115734.getClass(), "size", 3);
        setIntField(term115734, term115734.getClass(), "hash1", 0);
        setIntField(term115734, term115734.getClass(), "hash2", 0);
        setIntField(term115734, term115734.getClass(), "hash3", 0);
        setField(term115734, term115734.getClass(), "key1", null);
        setField(term115734, term115734.getClass(), "key2", null);
        setField(term115734, term115734.getClass(), "key3", null);
        setFloatField(term115735, term115735.getClass(), "loadFactor", 0.0F);
        setIntField(term115735, term115735.getClass(), "size", 0);
        setField(term115735, term115735.getClass(), "data", null);
        setIntField(term115735, term115735.getClass(), "threshold", 0);
        setIntField(term115735, term115735.getClass(), "modCount", 0);
        setField(term115735, term115735.getClass(), "entrySet", null);
        setField(term115735, term115735.getClass(), "keySet", null);
        setField(term115735, term115735.getClass(), "values", null);
        setField(term115735, term115735.getClass(), "keySet", null);
        setField(term115735, term115735.getClass(), "values", null);
        setField(term115734, term115734.getClass(), "value1", term115735);
        setField(term115734, term115734.getClass(), "value2", null);
        setField(term115734, term115734.getClass(), "value3", null);
        setField(term115734, term115734.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term115613;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term115365, args);
        assertTrue(recursiveEquals(term115365, term115731));
        assertTrue(recursiveEquals(term115613, term115734));
        assertTrue(recursiveEquals(retValue, null));
    }

};


