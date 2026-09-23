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

public class Flat3Map_put_1944740725509 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96087;
     Object term96551;
     Object term96553;

    public Flat3Map_put_1944740725509() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96087 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term96142 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term96087, term96087.getClass(), "delegateMap", null);
        setIntField(term96087, term96087.getClass(), "size", 2);
        setIntField(term96087, term96087.getClass(), "hash2", -1);
        setField(term96087, term96087.getClass(), "value2", null);
        setIntField(term96087, term96087.getClass(), "hash1", 0);
        setIntField(term96142, term96142.getClass(), "size", 0);
        setField(term96087, term96087.getClass(), "value1", term96142);
        term96551 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term96552 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term96551, term96551.getClass(), "size", 3);
        setIntField(term96551, term96551.getClass(), "hash1", 0);
        setIntField(term96551, term96551.getClass(), "hash2", -1);
        setIntField(term96551, term96551.getClass(), "hash3", -1);
        setField(term96551, term96551.getClass(), "key1", null);
        setField(term96551, term96551.getClass(), "key2", null);
        setField(term96551, term96551.getClass(), "key3", term96551);
        setFloatField(term96552, term96552.getClass(), "loadFactor", 0.0F);
        setIntField(term96552, term96552.getClass(), "size", 0);
        setField(term96552, term96552.getClass(), "data", null);
        setIntField(term96552, term96552.getClass(), "threshold", 0);
        setIntField(term96552, term96552.getClass(), "modCount", 0);
        setField(term96552, term96552.getClass(), "entrySet", null);
        setField(term96552, term96552.getClass(), "keySet", null);
        setField(term96552, term96552.getClass(), "values", null);
        setField(term96552, term96552.getClass(), "keySet", null);
        setField(term96552, term96552.getClass(), "values", null);
        setField(term96551, term96551.getClass(), "value1", term96552);
        setField(term96551, term96551.getClass(), "value2", null);
        setField(term96551, term96551.getClass(), "value3", null);
        setField(term96551, term96551.getClass(), "delegateMap", null);
        term96553 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term96554 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term96553, term96553.getClass(), "size", 3);
        setIntField(term96553, term96553.getClass(), "hash1", 0);
        setIntField(term96553, term96553.getClass(), "hash2", -1);
        setIntField(term96553, term96553.getClass(), "hash3", -1);
        setField(term96553, term96553.getClass(), "key1", null);
        setField(term96553, term96553.getClass(), "key2", null);
        setField(term96553, term96553.getClass(), "key3", term96553);
        setFloatField(term96554, term96554.getClass(), "loadFactor", 0.0F);
        setIntField(term96554, term96554.getClass(), "size", 0);
        setField(term96554, term96554.getClass(), "data", null);
        setIntField(term96554, term96554.getClass(), "threshold", 0);
        setIntField(term96554, term96554.getClass(), "modCount", 0);
        setField(term96554, term96554.getClass(), "entrySet", null);
        setField(term96554, term96554.getClass(), "keySet", null);
        setField(term96554, term96554.getClass(), "values", null);
        setField(term96554, term96554.getClass(), "keySet", null);
        setField(term96554, term96554.getClass(), "values", null);
        setField(term96553, term96553.getClass(), "value1", term96554);
        setField(term96553, term96553.getClass(), "value2", null);
        setField(term96553, term96553.getClass(), "value3", null);
        setField(term96553, term96553.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term96087;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term96087, args);
        assertTrue(recursiveEquals(term96087, term96551));
        assertTrue(recursiveEquals(term96087, term96553));
        assertTrue(recursiveEquals(retValue, null));
    }

};


