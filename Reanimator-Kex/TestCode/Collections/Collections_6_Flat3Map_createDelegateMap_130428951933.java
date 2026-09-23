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

public class Flat3Map_createDelegateMap_130428951933 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163;
     Object term7287;
     Object term7262;

    public Flat3Map_createDelegateMap_130428951933() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term163 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term168 = newInstance(Class.forName("java.lang.Object"));
        Object term169 = newInstance(Class.forName("java.lang.Object"));
        Object term170 = newInstance(Class.forName("java.lang.Object"));
        Object term171 = newInstance(Class.forName("java.lang.Object"));
        Object term172 = newInstance(Class.forName("java.lang.Object"));
        Object term173 = newInstance(Class.forName("java.lang.Object"));
        Object term174 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term163, term163.getClass(), "size", -376422566);
        setIntField(term163, term163.getClass(), "hash1", 306847454);
        setIntField(term163, term163.getClass(), "hash2", 1745276158);
        setIntField(term163, term163.getClass(), "hash3", 2009020256);
        setField(term163, term163.getClass(), "key1", term168);
        setField(term163, term163.getClass(), "key2", term169);
        setField(term163, term163.getClass(), "key3", term170);
        setField(term163, term163.getClass(), "value1", term171);
        setField(term163, term163.getClass(), "value2", term172);
        setField(term163, term163.getClass(), "value3", term173);
        setFloatField(term174, term174.getClass(), "loadFactor", 0.0F);
        setIntField(term174, term174.getClass(), "size", 0);
        setField(term174, term174.getClass(), "data", null);
        setIntField(term174, term174.getClass(), "threshold", 0);
        setIntField(term174, term174.getClass(), "modCount", 0);
        setField(term174, term174.getClass(), "entrySet", null);
        setField(term174, term174.getClass(), "keySet", null);
        setField(term174, term174.getClass(), "values", null);
        setField(term174, term174.getClass(), "keySet", null);
        setField(term174, term174.getClass(), "values", null);
        setField(term163, term163.getClass(), "delegateMap", term174);
        term7287 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term7288 = newInstance(Class.forName("java.lang.Object"));
        Object term7289 = newInstance(Class.forName("java.lang.Object"));
        Object term7290 = newInstance(Class.forName("java.lang.Object"));
        Object term7291 = newInstance(Class.forName("java.lang.Object"));
        Object term7292 = newInstance(Class.forName("java.lang.Object"));
        Object term7293 = newInstance(Class.forName("java.lang.Object"));
        Object term7294 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term7287, term7287.getClass(), "size", -376422566);
        setIntField(term7287, term7287.getClass(), "hash1", 306847454);
        setIntField(term7287, term7287.getClass(), "hash2", 1745276158);
        setIntField(term7287, term7287.getClass(), "hash3", 2009020256);
        setField(term7287, term7287.getClass(), "key1", term7288);
        setField(term7287, term7287.getClass(), "key2", term7289);
        setField(term7287, term7287.getClass(), "key3", term7290);
        setField(term7287, term7287.getClass(), "value1", term7291);
        setField(term7287, term7287.getClass(), "value2", term7292);
        setField(term7287, term7287.getClass(), "value3", term7293);
        setFloatField(term7294, term7294.getClass(), "loadFactor", 0.0F);
        setIntField(term7294, term7294.getClass(), "size", 0);
        setField(term7294, term7294.getClass(), "data", null);
        setIntField(term7294, term7294.getClass(), "threshold", 0);
        setIntField(term7294, term7294.getClass(), "modCount", 0);
        setField(term7294, term7294.getClass(), "entrySet", null);
        setField(term7294, term7294.getClass(), "keySet", null);
        setField(term7294, term7294.getClass(), "values", null);
        setField(term7294, term7294.getClass(), "keySet", null);
        setField(term7294, term7294.getClass(), "values", null);
        setField(term7287, term7287.getClass(), "delegateMap", term7294);
        term7262 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term7265 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        setFloatField(term7262, term7262.getClass(), "loadFactor", 0.75F);
        setIntField(term7262, term7262.getClass(), "size", 0);
        setField(term7262, term7262.getClass(), "data", term7265);
        setIntField(term7262, term7262.getClass(), "threshold", 12);
        setIntField(term7262, term7262.getClass(), "modCount", 0);
        setField(term7262, term7262.getClass(), "entrySet", null);
        setField(term7262, term7262.getClass(), "keySet", null);
        setField(term7262, term7262.getClass(), "values", null);
        setField(term7262, term7262.getClass(), "keySet", null);
        setField(term7262, term7262.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "createDelegateMap", argTypes, term163, args);
        assertTrue(recursiveEquals(term163, term7287));
        assertTrue(recursiveEquals(retValue, term7262));
    }

};


