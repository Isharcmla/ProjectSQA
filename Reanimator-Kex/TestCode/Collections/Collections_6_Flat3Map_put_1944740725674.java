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

public class Flat3Map_put_1944740725674 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term153590;
     Object term153682;
     Object term155288;
     Object term155296;

    public Flat3Map_put_1944740725674() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term153590 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term153590, term153590.getClass(), "delegateMap", null);
        setIntField(term153590, term153590.getClass(), "size", 3);
        setIntField(term153590, term153590.getClass(), "hash3", -1);
        setField(term153590, term153590.getClass(), "key3", null);
        setIntField(term153590, term153590.getClass(), "hash2", 0);
        setField(term153590, term153590.getClass(), "key2", null);
        setIntField(term153590, term153590.getClass(), "hash1", 0);
        setField(term153590, term153590.getClass(), "key1", term153590);
        setField(term153590, term153590.getClass(), "value3", null);
        term153682 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term153792 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term153830 = newInstance(Class.forName("java.lang.Object"));
        setField(term153682, term153682.getClass(), "delegateMap", null);
        setIntField(term153682, term153682.getClass(), "size", 3);
        setIntField(term153682, term153682.getClass(), "hash3", 0);
        setField(term153682, term153682.getClass(), "value3", null);
        setIntField(term153682, term153682.getClass(), "hash2", 0);
        setField(term153682, term153682.getClass(), "value2", null);
        setIntField(term153682, term153682.getClass(), "hash1", 0);
        setIntField(term153792, term153792.getClass(), "size", 0);
        setField(term153682, term153682.getClass(), "value1", term153792);
        setField(term153682, term153682.getClass(), "key3", null);
        setField(term153682, term153682.getClass(), "key2", null);
        setField(term153682, term153682.getClass(), "key1", term153830);
        term155288 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term155289 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term155290 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term155291 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term155292 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term155293 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term155294 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term155295 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term155288, term155288.getClass(), "size", 0);
        setIntField(term155288, term155288.getClass(), "hash1", 0);
        setIntField(term155288, term155288.getClass(), "hash2", 0);
        setIntField(term155288, term155288.getClass(), "hash3", 0);
        setField(term155288, term155288.getClass(), "key1", null);
        setField(term155288, term155288.getClass(), "key2", null);
        setField(term155288, term155288.getClass(), "key3", null);
        setField(term155288, term155288.getClass(), "value1", null);
        setField(term155288, term155288.getClass(), "value2", null);
        setField(term155288, term155288.getClass(), "value3", null);
        setFloatField(term155289, term155289.getClass(), "loadFactor", 0.75F);
        setIntField(term155289, term155289.getClass(), "size", 3);
        setField(term155292, term155292.getClass(), "next", null);
        setField(term155292, term155292.getClass(), "key", term155288);
        setField(term155292, term155292.getClass(), "value", null);
        setField(term155291, term155291.getClass(), "next", term155292);
        setIntField(term155293, term155293.getClass(), "size", 3);
        setIntField(term155293, term155293.getClass(), "hash1", 0);
        setIntField(term155293, term155293.getClass(), "hash2", 0);
        setIntField(term155293, term155293.getClass(), "hash3", 0);
        setField(term155293, term155293.getClass(), "key1", null);
        setField(term155293, term155293.getClass(), "key2", null);
        setField(term155293, term155293.getClass(), "key3", null);
        setField(term155293, term155293.getClass(), "value1", null);
        setField(term155293, term155293.getClass(), "value2", null);
        setField(term155293, term155293.getClass(), "value3", null);
        setField(term155293, term155293.getClass(), "delegateMap", null);
        setField(term155291, term155291.getClass(), "key", term155293);
        setField(term155291, term155291.getClass(), "value", null);
        setElement(term155290, 0, term155291);
        setField(term155294, term155294.getClass(), "next", null);
        setField(term155294, term155294.getClass(), "key", term155295);
        setField(term155294, term155294.getClass(), "value", null);
        setElement(term155290, 5, term155294);
        setField(term155289, term155289.getClass(), "data", term155290);
        setIntField(term155289, term155289.getClass(), "threshold", 12);
        setIntField(term155289, term155289.getClass(), "modCount", 3);
        setField(term155289, term155289.getClass(), "entrySet", null);
        setField(term155289, term155289.getClass(), "keySet", null);
        setField(term155289, term155289.getClass(), "values", null);
        setField(term155289, term155289.getClass(), "keySet", null);
        setField(term155289, term155289.getClass(), "values", null);
        setField(term155288, term155288.getClass(), "delegateMap", term155289);
        term155296 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term155296, term155296.getClass(), "size", 3);
        setIntField(term155296, term155296.getClass(), "hash1", 0);
        setIntField(term155296, term155296.getClass(), "hash2", 0);
        setIntField(term155296, term155296.getClass(), "hash3", 0);
        setField(term155296, term155296.getClass(), "key1", null);
        setField(term155296, term155296.getClass(), "key2", null);
        setField(term155296, term155296.getClass(), "key3", null);
        setField(term155296, term155296.getClass(), "value1", null);
        setField(term155296, term155296.getClass(), "value2", null);
        setField(term155296, term155296.getClass(), "value3", null);
        setField(term155296, term155296.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term153682;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term153590, args);
        assertTrue(recursiveEquals(term153590, term155288));
        assertTrue(recursiveEquals(term153682, term155296));
        assertTrue(recursiveEquals(retValue, null));
    }

};


