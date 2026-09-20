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

public class Flat3Map_put_1944740725568 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108792;
     Object term109307;

    public Flat3Map_put_1944740725568() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108792 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term108884 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term108792, term108792.getClass(), "delegateMap", null);
        setIntField(term108792, term108792.getClass(), "size", 3);
        setField(term108792, term108792.getClass(), "key3", term108884);
        term109307 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term109308 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term109307, term109307.getClass(), "size", 3);
        setIntField(term109307, term109307.getClass(), "hash1", 0);
        setIntField(term109307, term109307.getClass(), "hash2", 0);
        setIntField(term109307, term109307.getClass(), "hash3", 0);
        setField(term109307, term109307.getClass(), "key1", null);
        setField(term109307, term109307.getClass(), "key2", null);
        setIntField(term109308, term109308.getClass(), "size", 0);
        setIntField(term109308, term109308.getClass(), "hash1", 0);
        setIntField(term109308, term109308.getClass(), "hash2", 0);
        setIntField(term109308, term109308.getClass(), "hash3", 0);
        setField(term109308, term109308.getClass(), "key1", null);
        setField(term109308, term109308.getClass(), "key2", null);
        setField(term109308, term109308.getClass(), "key3", null);
        setField(term109308, term109308.getClass(), "value1", null);
        setField(term109308, term109308.getClass(), "value2", null);
        setField(term109308, term109308.getClass(), "value3", null);
        setField(term109308, term109308.getClass(), "delegateMap", null);
        setField(term109307, term109307.getClass(), "key3", term109308);
        setField(term109307, term109307.getClass(), "value1", null);
        setField(term109307, term109307.getClass(), "value2", null);
        setField(term109307, term109307.getClass(), "value3", null);
        setField(term109307, term109307.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term108792, args);
        assertTrue(recursiveEquals(term108792, term109307));
        assertTrue(recursiveEquals(retValue, null));
    }

};
