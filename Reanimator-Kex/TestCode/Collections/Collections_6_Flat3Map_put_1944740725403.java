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

public class Flat3Map_put_1944740725403 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69882;
     Object term69926;
     Object term69927;

    public Flat3Map_put_1944740725403() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69882 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term69882, term69882.getClass(), "delegateMap", null);
        setIntField(term69882, term69882.getClass(), "size", 2);
        setIntField(term69882, term69882.getClass(), "hash2", -1);
        setField(term69882, term69882.getClass(), "value2", null);
        setIntField(term69882, term69882.getClass(), "hash1", 0);
        setField(term69882, term69882.getClass(), "value1", null);
        term69926 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term69926, term69926.getClass(), "size", 3);
        setIntField(term69926, term69926.getClass(), "hash1", 0);
        setIntField(term69926, term69926.getClass(), "hash2", -1);
        setIntField(term69926, term69926.getClass(), "hash3", -1);
        setField(term69926, term69926.getClass(), "key1", null);
        setField(term69926, term69926.getClass(), "key2", null);
        setField(term69926, term69926.getClass(), "key3", term69926);
        setField(term69926, term69926.getClass(), "value1", null);
        setField(term69926, term69926.getClass(), "value2", null);
        setField(term69926, term69926.getClass(), "value3", null);
        setField(term69926, term69926.getClass(), "delegateMap", null);
        term69927 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term69927, term69927.getClass(), "size", 3);
        setIntField(term69927, term69927.getClass(), "hash1", 0);
        setIntField(term69927, term69927.getClass(), "hash2", -1);
        setIntField(term69927, term69927.getClass(), "hash3", -1);
        setField(term69927, term69927.getClass(), "key1", null);
        setField(term69927, term69927.getClass(), "key2", null);
        setField(term69927, term69927.getClass(), "key3", term69927);
        setField(term69927, term69927.getClass(), "value1", null);
        setField(term69927, term69927.getClass(), "value2", null);
        setField(term69927, term69927.getClass(), "value3", null);
        setField(term69927, term69927.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term69882;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term69882, args);
        assertTrue(recursiveEquals(term69882, term69926));
        assertTrue(recursiveEquals(term69882, term69927));
        assertTrue(recursiveEquals(retValue, null));
    }

};


