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

public class Flat3Map_put_1944740725810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205125;
     Object term205217;
     Object term214535;

    public Flat3Map_put_1944740725810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term205125 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term205125, term205125.getClass(), "delegateMap", null);
        setIntField(term205125, term205125.getClass(), "size", 3);
        setIntField(term205125, term205125.getClass(), "hash3", 0);
        setField(term205125, term205125.getClass(), "key3", null);
        setIntField(term205125, term205125.getClass(), "hash2", 0);
        setField(term205125, term205125.getClass(), "key2", null);
        setIntField(term205125, term205125.getClass(), "hash1", 0);
        setField(term205125, term205125.getClass(), "key1", term205125);
        term205217 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term205327 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term205217, term205217.getClass(), "delegateMap", null);
        setIntField(term205217, term205217.getClass(), "size", 3);
        setIntField(term205217, term205217.getClass(), "hash3", 0);
        setField(term205217, term205217.getClass(), "value3", null);
        setIntField(term205217, term205217.getClass(), "hash2", 0);
        setIntField(term205327, term205327.getClass(), "size", 0);
        setField(term205217, term205217.getClass(), "value2", term205327);
        setIntField(term205217, term205217.getClass(), "hash1", 0);
        setField(term205217, term205217.getClass(), "value1", null);
        term214535 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term214535, term214535.getClass(), "size", 3);
        setIntField(term214535, term214535.getClass(), "hash1", 0);
        setIntField(term214535, term214535.getClass(), "hash2", 0);
        setIntField(term214535, term214535.getClass(), "hash3", 0);
        setField(term214535, term214535.getClass(), "key1", null);
        setField(term214535, term214535.getClass(), "key2", null);
        setField(term214535, term214535.getClass(), "key3", null);
        setField(term214535, term214535.getClass(), "value1", null);
        setField(term214535, term214535.getClass(), "value2", null);
        setField(term214535, term214535.getClass(), "value3", null);
        setField(term214535, term214535.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term205217;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term205125, args);
        assertTrue(recursiveEquals(term205217, term214535));
        assertTrue(recursiveEquals(retValue, null));
    }

};


