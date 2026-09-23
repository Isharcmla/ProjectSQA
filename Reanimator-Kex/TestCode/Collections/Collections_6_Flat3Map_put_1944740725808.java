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

public class Flat3Map_put_1944740725808 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term204929;
     Object term204883;

    public Flat3Map_put_1944740725808() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term204929 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term204948 = newInstance(Class.forName("java.lang.Object"));
        setField(term204929, term204929.getClass(), "delegateMap", null);
        setIntField(term204929, term204929.getClass(), "size", 2);
        setIntField(term204929, term204929.getClass(), "hash3", -1);
        setField(term204929, term204929.getClass(), "key3", term204948);
        setField(term204929, term204929.getClass(), "key2", term204948);
        setField(term204929, term204929.getClass(), "value2", null);
        setIntField(term204929, term204929.getClass(), "hash2", 0);
        setIntField(term204929, term204929.getClass(), "hash1", -1);
        setField(term204929, term204929.getClass(), "value1", null);
        term204883 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term204883, term204883.getClass(), "delegateMap", null);
        setIntField(term204883, term204883.getClass(), "size", 3);
        setIntField(term204883, term204883.getClass(), "hash3", 0);
        setField(term204883, term204883.getClass(), "value3", null);
        setIntField(term204883, term204883.getClass(), "hash2", 0);
        setField(term204883, term204883.getClass(), "value2", null);
        setIntField(term204883, term204883.getClass(), "hash1", 0);
        setField(term204883, term204883.getClass(), "value1", null);
        setField(term204883, term204883.getClass(), "key3", null);
        setField(term204883, term204883.getClass(), "key2", term204929);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term204883;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term204929, args);
        assertTrue(recursiveEquals(term204883, 130298592065232L));
        assertTrue(recursiveEquals(retValue, null));
    }

};


