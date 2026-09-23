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

public class Flat3Map_put_19447407251079 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term315081;
     Object term315513;
     Object term315670;
     Object term315675;

    public Flat3Map_put_19447407251079() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term315081 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term315173 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term315283 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        term315513 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term315559 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term315081, term315081.getClass(), "delegateMap", null);
        setIntField(term315081, term315081.getClass(), "size", 3);
        setIntField(term315081, term315081.getClass(), "hash3", 0);
        setField(term315173, term315173.getClass(), "delegateMap", null);
        setIntField(term315173, term315173.getClass(), "size", 3);
        setField(term315173, term315173.getClass(), "key3", term315283);
        setField(term315173, term315173.getClass(), "key2", null);
        setField(term315173, term315173.getClass(), "value2", null);
        setIntField(term315173, term315173.getClass(), "hash3", -1);
        setIntField(term315173, term315173.getClass(), "hash2", 0);
        setIntField(term315173, term315173.getClass(), "hash1", -1);
        setField(term315081, term315081.getClass(), "key3", term315173);
        setIntField(term315081, term315081.getClass(), "hash2", -1);
        setIntField(term315081, term315081.getClass(), "hash1", 0);
        setField(term315513, term315513.getClass(), "delegateMap", null);
        setIntField(term315513, term315513.getClass(), "size", 3);
        setIntField(term315513, term315513.getClass(), "hash3", 0);
        setField(term315513, term315513.getClass(), "value3", null);
        setIntField(term315513, term315513.getClass(), "hash2", 0);
        setField(term315513, term315513.getClass(), "value2", null);
        setIntField(term315513, term315513.getClass(), "hash1", 0);
        setField(term315513, term315513.getClass(), "value1", null);
        setField(term315513, term315513.getClass(), "key3", null);
        setField(term315559, term315559.getClass(), "delegateMap", null);
        setIntField(term315559, term315559.getClass(), "size", 0);
        setField(term315513, term315513.getClass(), "key2", term315559);
        setField(term315081, term315081.getClass(), "key1", term315513);
        term315670 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term315671 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term315672 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term315673 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term315674 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term315670, term315670.getClass(), "size", 3);
        setIntField(term315670, term315670.getClass(), "hash1", 0);
        setIntField(term315670, term315670.getClass(), "hash2", -1);
        setIntField(term315670, term315670.getClass(), "hash3", 0);
        setIntField(term315671, term315671.getClass(), "size", 3);
        setIntField(term315671, term315671.getClass(), "hash1", 0);
        setIntField(term315671, term315671.getClass(), "hash2", 0);
        setIntField(term315671, term315671.getClass(), "hash3", 0);
        setField(term315671, term315671.getClass(), "key1", null);
        setIntField(term315672, term315672.getClass(), "size", 0);
        setIntField(term315672, term315672.getClass(), "hash1", 0);
        setIntField(term315672, term315672.getClass(), "hash2", 0);
        setIntField(term315672, term315672.getClass(), "hash3", 0);
        setField(term315672, term315672.getClass(), "key1", null);
        setField(term315672, term315672.getClass(), "key2", null);
        setField(term315672, term315672.getClass(), "key3", null);
        setField(term315672, term315672.getClass(), "value1", null);
        setField(term315672, term315672.getClass(), "value2", null);
        setField(term315672, term315672.getClass(), "value3", null);
        setField(term315672, term315672.getClass(), "delegateMap", null);
        setField(term315671, term315671.getClass(), "key2", term315672);
        setField(term315671, term315671.getClass(), "key3", null);
        setField(term315671, term315671.getClass(), "value1", null);
        setField(term315671, term315671.getClass(), "value2", null);
        setField(term315671, term315671.getClass(), "value3", null);
        setField(term315671, term315671.getClass(), "delegateMap", null);
        setField(term315670, term315670.getClass(), "key1", term315671);
        setField(term315670, term315670.getClass(), "key2", null);
        setIntField(term315673, term315673.getClass(), "size", 3);
        setIntField(term315673, term315673.getClass(), "hash1", -1);
        setIntField(term315673, term315673.getClass(), "hash2", 0);
        setIntField(term315673, term315673.getClass(), "hash3", -1);
        setField(term315673, term315673.getClass(), "key1", null);
        setField(term315673, term315673.getClass(), "key2", null);
        setFloatField(term315674, term315674.getClass(), "loadFactor", 0.0F);
        setIntField(term315674, term315674.getClass(), "size", 0);
        setField(term315674, term315674.getClass(), "data", null);
        setIntField(term315674, term315674.getClass(), "threshold", 0);
        setIntField(term315674, term315674.getClass(), "modCount", 0);
        setField(term315674, term315674.getClass(), "entrySet", null);
        setField(term315674, term315674.getClass(), "keySet", null);
        setField(term315674, term315674.getClass(), "values", null);
        setField(term315674, term315674.getClass(), "keySet", null);
        setField(term315674, term315674.getClass(), "values", null);
        setField(term315673, term315673.getClass(), "key3", term315674);
        setField(term315673, term315673.getClass(), "value1", null);
        setField(term315673, term315673.getClass(), "value2", null);
        setField(term315673, term315673.getClass(), "value3", null);
        setField(term315673, term315673.getClass(), "delegateMap", null);
        setField(term315670, term315670.getClass(), "key3", term315673);
        setField(term315670, term315670.getClass(), "value1", null);
        setField(term315670, term315670.getClass(), "value2", null);
        setField(term315670, term315670.getClass(), "value3", null);
        setField(term315670, term315670.getClass(), "delegateMap", null);
        term315675 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term315676 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term315675, term315675.getClass(), "size", 3);
        setIntField(term315675, term315675.getClass(), "hash1", 0);
        setIntField(term315675, term315675.getClass(), "hash2", 0);
        setIntField(term315675, term315675.getClass(), "hash3", 0);
        setField(term315675, term315675.getClass(), "key1", null);
        setIntField(term315676, term315676.getClass(), "size", 0);
        setIntField(term315676, term315676.getClass(), "hash1", 0);
        setIntField(term315676, term315676.getClass(), "hash2", 0);
        setIntField(term315676, term315676.getClass(), "hash3", 0);
        setField(term315676, term315676.getClass(), "key1", null);
        setField(term315676, term315676.getClass(), "key2", null);
        setField(term315676, term315676.getClass(), "key3", null);
        setField(term315676, term315676.getClass(), "value1", null);
        setField(term315676, term315676.getClass(), "value2", null);
        setField(term315676, term315676.getClass(), "value3", null);
        setField(term315676, term315676.getClass(), "delegateMap", null);
        setField(term315675, term315675.getClass(), "key2", term315676);
        setField(term315675, term315675.getClass(), "key3", null);
        setField(term315675, term315675.getClass(), "value1", null);
        setField(term315675, term315675.getClass(), "value2", null);
        setField(term315675, term315675.getClass(), "value3", null);
        setField(term315675, term315675.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term315513;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term315081, args);
        assertTrue(recursiveEquals(term315081, term315670));
        assertTrue(recursiveEquals(term315513, term315675));
        assertTrue(recursiveEquals(retValue, null));
    }

};


