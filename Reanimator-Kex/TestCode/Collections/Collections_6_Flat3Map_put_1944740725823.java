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

public class Flat3Map_put_1944740725823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term211158;
     Object term215876;
     Object term215877;

    public Flat3Map_put_1944740725823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term211158 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term211188 = newInstance(Class.forName("java.util.jar.JarVerifier$3"));
        setField(term211158, term211158.getClass(), "delegateMap", null);
        setIntField(term211158, term211158.getClass(), "size", 3);
        setIntField(term211158, term211158.getClass(), "hash3", 0);
        setField(term211158, term211158.getClass(), "value3", term211188);
        term215876 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term215876, term215876.getClass(), "size", 652129701);
        setIntField(term215876, term215876.getClass(), "hash1", 0);
        setIntField(term215876, term215876.getClass(), "hash2", 16);
        setIntField(term215876, term215876.getClass(), "hash3", 0);
        setField(term215876, term215876.getClass(), "key1", null);
        setField(term215876, term215876.getClass(), "key2", null);
        setField(term215876, term215876.getClass(), "key3", null);
        setField(term215876, term215876.getClass(), "value1", null);
        setField(term215876, term215876.getClass(), "value2", null);
        setField(term215876, term215876.getClass(), "value3", null);
        setField(term215876, term215876.getClass(), "delegateMap", false);
        term215877 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term215877, term215877.getClass(), "size", 652129701);
        setIntField(term215877, term215877.getClass(), "hash1", 0);
        setIntField(term215877, term215877.getClass(), "hash2", 16);
        setIntField(term215877, term215877.getClass(), "hash3", 0);
        setField(term215877, term215877.getClass(), "key1", null);
        setField(term215877, term215877.getClass(), "key2", null);
        setField(term215877, term215877.getClass(), "key3", null);
        setField(term215877, term215877.getClass(), "value1", null);
        setField(term215877, term215877.getClass(), "value2", null);
        setField(term215877, term215877.getClass(), "value3", null);
        setField(term215877, term215877.getClass(), "delegateMap", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term211158;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term211158, args);
        assertTrue(recursiveEquals(term211158, term215876));
        assertTrue(recursiveEquals(term211158, term215877));
        assertTrue(recursiveEquals(retValue, null));
    }

};


