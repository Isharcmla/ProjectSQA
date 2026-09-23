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

public class Flat3Map_put_19447407251040 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term296643;
     Object term297033;
     Object term298550;
     Object term298560;

    public Flat3Map_put_19447407251040() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term296643 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term296735 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term296773 = newInstance(Class.forName("java.lang.Object"));
        Object term296903 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term296941 = newInstance(Class.forName("java.lang.Object"));
        setField(term296643, term296643.getClass(), "delegateMap", null);
        setIntField(term296643, term296643.getClass(), "size", 3);
        setIntField(term296643, term296643.getClass(), "hash3", 1583477184);
        setField(term296735, term296735.getClass(), "delegateMap", null);
        setIntField(term296735, term296735.getClass(), "size", 3);
        setField(term296735, term296735.getClass(), "key3", term296773);
        setField(term296735, term296735.getClass(), "key2", null);
        setField(term296735, term296735.getClass(), "value2", null);
        setIntField(term296735, term296735.getClass(), "hash3", 479215616);
        setIntField(term296735, term296735.getClass(), "hash2", -2147196928);
        setIntField(term296735, term296735.getClass(), "hash1", 537604096);
        setField(term296735, term296735.getClass(), "key1", term296903);
        setField(term296735, term296735.getClass(), "value3", null);
        setField(term296735, term296735.getClass(), "value1", null);
        setField(term296643, term296643.getClass(), "key3", term296735);
        setIntField(term296643, term296643.getClass(), "hash2", -1583477185);
        setIntField(term296643, term296643.getClass(), "hash1", 1583477184);
        setField(term296643, term296643.getClass(), "key1", null);
        setField(term296643, term296643.getClass(), "value3", term296941);
        setField(term296643, term296643.getClass(), "key2", null);
        setField(term296643, term296643.getClass(), "value2", term296773);
        setField(term296643, term296643.getClass(), "value1", term296941);
        term297033 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term297125 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term297033, term297033.getClass(), "delegateMap", null);
        setIntField(term297033, term297033.getClass(), "size", 3);
        setIntField(term297033, term297033.getClass(), "hash3", 802696256);
        setField(term297033, term297033.getClass(), "value3", null);
        setIntField(term297033, term297033.getClass(), "hash2", 17270784);
        setField(term297033, term297033.getClass(), "value2", null);
        setIntField(term297033, term297033.getClass(), "hash1", 763510144);
        setField(term297033, term297033.getClass(), "value1", null);
        setField(term297033, term297033.getClass(), "key3", null);
        setField(term297125, term297125.getClass(), "delegateMap", null);
        setIntField(term297125, term297125.getClass(), "size", 2);
        setIntField(term297125, term297125.getClass(), "hash2", 2048);
        setField(term297125, term297125.getClass(), "value2", null);
        setIntField(term297125, term297125.getClass(), "hash1", -2147196928);
        setField(term297125, term297125.getClass(), "value1", null);
        setField(term297033, term297033.getClass(), "key2", term297125);
        term298550 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term298551 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term298552 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term298553 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term298554 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term298555 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term298556 = newInstance(Class.forName("java.lang.Object"));
        Object term298557 = newInstance(Class.forName("java.lang.Object"));
        Object term298558 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term298559 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term298550, term298550.getClass(), "size", 0);
        setIntField(term298550, term298550.getClass(), "hash1", 0);
        setIntField(term298550, term298550.getClass(), "hash2", 0);
        setIntField(term298550, term298550.getClass(), "hash3", 0);
        setField(term298550, term298550.getClass(), "key1", null);
        setField(term298550, term298550.getClass(), "key2", null);
        setField(term298550, term298550.getClass(), "key3", null);
        setField(term298550, term298550.getClass(), "value1", null);
        setField(term298550, term298550.getClass(), "value2", null);
        setField(term298550, term298550.getClass(), "value3", null);
        setFloatField(term298551, term298551.getClass(), "loadFactor", 0.75F);
        setIntField(term298551, term298551.getClass(), "size", 3);
        setField(term298553, term298553.getClass(), "next", null);
        setIntField(term298554, term298554.getClass(), "size", 3);
        setIntField(term298554, term298554.getClass(), "hash1", 763510144);
        setIntField(term298554, term298554.getClass(), "hash2", 17270784);
        setIntField(term298554, term298554.getClass(), "hash3", 802696256);
        setField(term298554, term298554.getClass(), "key1", null);
        setField(term298554, term298554.getClass(), "key2", null);
        setField(term298554, term298554.getClass(), "key3", null);
        setField(term298554, term298554.getClass(), "value1", null);
        setField(term298554, term298554.getClass(), "value2", null);
        setField(term298554, term298554.getClass(), "value3", null);
        setField(term298554, term298554.getClass(), "delegateMap", null);
        setField(term298553, term298553.getClass(), "key", term298554);
        setField(term298553, term298553.getClass(), "value", null);
        setElement(term298552, 1, term298553);
        setField(term298555, term298555.getClass(), "next", null);
        setField(term298555, term298555.getClass(), "key", term298556);
        setField(term298555, term298555.getClass(), "value", term298557);
        setElement(term298552, 6, term298555);
        setField(term298558, term298558.getClass(), "next", null);
        setIntField(term298559, term298559.getClass(), "size", 3);
        setIntField(term298559, term298559.getClass(), "hash1", 537604096);
        setIntField(term298559, term298559.getClass(), "hash2", -2147196928);
        setIntField(term298559, term298559.getClass(), "hash3", 479215616);
        setField(term298559, term298559.getClass(), "key1", null);
        setField(term298559, term298559.getClass(), "key2", null);
        setField(term298559, term298559.getClass(), "key3", null);
        setField(term298559, term298559.getClass(), "value1", null);
        setField(term298559, term298559.getClass(), "value2", null);
        setField(term298559, term298559.getClass(), "value3", null);
        setField(term298559, term298559.getClass(), "delegateMap", null);
        setField(term298558, term298558.getClass(), "key", term298559);
        setField(term298558, term298558.getClass(), "value", term298557);
        setElement(term298552, 15, term298558);
        setField(term298551, term298551.getClass(), "data", term298552);
        setIntField(term298551, term298551.getClass(), "threshold", 12);
        setIntField(term298551, term298551.getClass(), "modCount", 3);
        setField(term298551, term298551.getClass(), "entrySet", null);
        setField(term298551, term298551.getClass(), "keySet", null);
        setField(term298551, term298551.getClass(), "values", null);
        setField(term298551, term298551.getClass(), "keySet", null);
        setField(term298551, term298551.getClass(), "values", null);
        setField(term298550, term298550.getClass(), "delegateMap", term298551);
        term298560 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term298560, term298560.getClass(), "size", 3);
        setIntField(term298560, term298560.getClass(), "hash1", 763510144);
        setIntField(term298560, term298560.getClass(), "hash2", 17270784);
        setIntField(term298560, term298560.getClass(), "hash3", 802696256);
        setField(term298560, term298560.getClass(), "key1", null);
        setField(term298560, term298560.getClass(), "key2", null);
        setField(term298560, term298560.getClass(), "key3", null);
        setField(term298560, term298560.getClass(), "value1", null);
        setField(term298560, term298560.getClass(), "value2", null);
        setField(term298560, term298560.getClass(), "value3", null);
        setField(term298560, term298560.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term297033;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term296643, args);
        assertTrue(recursiveEquals(term296643, term298550));
        assertTrue(recursiveEquals(term297033, term298560));
        assertTrue(recursiveEquals(retValue, null));
    }

};


