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

public class Flat3Map_put_1944740725605 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126621;
     Object term126713;
     Object term127594;
     Object term127596;

    public Flat3Map_put_1944740725605() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term126621 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term126621, term126621.getClass(), "delegateMap", null);
        setIntField(term126621, term126621.getClass(), "size", 2);
        setIntField(term126621, term126621.getClass(), "hash2", 0);
        setField(term126621, term126621.getClass(), "key2", null);
        term126713 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term126713, term126713.getClass(), "delegateMap", null);
        setIntField(term126713, term126713.getClass(), "size", 2);
        setIntField(term126713, term126713.getClass(), "hash2", 0);
        setField(term126713, term126713.getClass(), "value2", null);
        setIntField(term126713, term126713.getClass(), "hash1", 0);
        setField(term126713, term126713.getClass(), "value1", null);
        setField(term126713, term126713.getClass(), "key2", null);
        term127594 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term127595 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term127594, term127594.getClass(), "size", 3);
        setIntField(term127594, term127594.getClass(), "hash1", 0);
        setIntField(term127594, term127594.getClass(), "hash2", 0);
        setIntField(term127594, term127594.getClass(), "hash3", 0);
        setField(term127594, term127594.getClass(), "key1", null);
        setField(term127594, term127594.getClass(), "key2", null);
        setIntField(term127595, term127595.getClass(), "size", 2);
        setIntField(term127595, term127595.getClass(), "hash1", 0);
        setIntField(term127595, term127595.getClass(), "hash2", 0);
        setIntField(term127595, term127595.getClass(), "hash3", 0);
        setField(term127595, term127595.getClass(), "key1", null);
        setField(term127595, term127595.getClass(), "key2", null);
        setField(term127595, term127595.getClass(), "key3", null);
        setField(term127595, term127595.getClass(), "value1", null);
        setField(term127595, term127595.getClass(), "value2", null);
        setField(term127595, term127595.getClass(), "value3", null);
        setField(term127595, term127595.getClass(), "delegateMap", null);
        setField(term127594, term127594.getClass(), "key3", term127595);
        setField(term127594, term127594.getClass(), "value1", null);
        setField(term127594, term127594.getClass(), "value2", null);
        setField(term127594, term127594.getClass(), "value3", null);
        setField(term127594, term127594.getClass(), "delegateMap", null);
        term127596 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term127596, term127596.getClass(), "size", 2);
        setIntField(term127596, term127596.getClass(), "hash1", 0);
        setIntField(term127596, term127596.getClass(), "hash2", 0);
        setIntField(term127596, term127596.getClass(), "hash3", 0);
        setField(term127596, term127596.getClass(), "key1", null);
        setField(term127596, term127596.getClass(), "key2", null);
        setField(term127596, term127596.getClass(), "key3", null);
        setField(term127596, term127596.getClass(), "value1", null);
        setField(term127596, term127596.getClass(), "value2", null);
        setField(term127596, term127596.getClass(), "value3", null);
        setField(term127596, term127596.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term126713;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term126621, args);
        assertTrue(recursiveEquals(term126621, term127594));
        assertTrue(recursiveEquals(term126713, term127596));
        assertTrue(recursiveEquals(retValue, null));
    }

};


