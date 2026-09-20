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

public class Flat3Map_put_1944740725842 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term169771;
     Object term170071;
     Object term170072;

    public Flat3Map_put_1944740725842() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term169771 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term169771, term169771.getClass(), "delegateMap", null);
        setIntField(term169771, term169771.getClass(), "size", 2);
        setIntField(term169771, term169771.getClass(), "hash2", 0);
        setField(term169771, term169771.getClass(), "value2", null);
        setIntField(term169771, term169771.getClass(), "hash1", 0);
        setField(term169771, term169771.getClass(), "value1", null);
        term170071 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term170071, term170071.getClass(), "size", 3);
        setIntField(term170071, term170071.getClass(), "hash1", 0);
        setIntField(term170071, term170071.getClass(), "hash2", 0);
        setIntField(term170071, term170071.getClass(), "hash3", 0);
        setField(term170071, term170071.getClass(), "key1", null);
        setField(term170071, term170071.getClass(), "key2", null);
        setField(term170071, term170071.getClass(), "key3", term170071);
        setField(term170071, term170071.getClass(), "value1", null);
        setField(term170071, term170071.getClass(), "value2", null);
        setField(term170071, term170071.getClass(), "value3", null);
        setField(term170071, term170071.getClass(), "delegateMap", null);
        term170072 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term170072, term170072.getClass(), "size", 3);
        setIntField(term170072, term170072.getClass(), "hash1", 0);
        setIntField(term170072, term170072.getClass(), "hash2", 0);
        setIntField(term170072, term170072.getClass(), "hash3", 0);
        setField(term170072, term170072.getClass(), "key1", null);
        setField(term170072, term170072.getClass(), "key2", null);
        setField(term170072, term170072.getClass(), "key3", term170072);
        setField(term170072, term170072.getClass(), "value1", null);
        setField(term170072, term170072.getClass(), "value2", null);
        setField(term170072, term170072.getClass(), "value3", null);
        setField(term170072, term170072.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term169771;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term169771, args);
        assertTrue(recursiveEquals(term169771, term170071));
        assertTrue(recursiveEquals(term169771, term170072));
        assertTrue(recursiveEquals(retValue, null));
    }

};
