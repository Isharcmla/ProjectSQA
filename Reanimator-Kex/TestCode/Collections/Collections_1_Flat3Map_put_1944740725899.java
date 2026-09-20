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

public class Flat3Map_put_1944740725899 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term181120;
     Object term181132;
     Object term181133;

    public Flat3Map_put_1944740725899() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term181120 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term181120, term181120.getClass(), "delegateMap", null);
        setIntField(term181120, term181120.getClass(), "size", 0);
        term181132 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term181132, term181132.getClass(), "size", 1);
        setIntField(term181132, term181132.getClass(), "hash1", 0);
        setIntField(term181132, term181132.getClass(), "hash2", 0);
        setIntField(term181132, term181132.getClass(), "hash3", 0);
        setField(term181132, term181132.getClass(), "key1", term181132);
        setField(term181132, term181132.getClass(), "key2", null);
        setField(term181132, term181132.getClass(), "key3", null);
        setField(term181132, term181132.getClass(), "value1", null);
        setField(term181132, term181132.getClass(), "value2", null);
        setField(term181132, term181132.getClass(), "value3", null);
        setField(term181132, term181132.getClass(), "delegateMap", null);
        term181133 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term181133, term181133.getClass(), "size", 1);
        setIntField(term181133, term181133.getClass(), "hash1", 0);
        setIntField(term181133, term181133.getClass(), "hash2", 0);
        setIntField(term181133, term181133.getClass(), "hash3", 0);
        setField(term181133, term181133.getClass(), "key1", term181133);
        setField(term181133, term181133.getClass(), "key2", null);
        setField(term181133, term181133.getClass(), "key3", null);
        setField(term181133, term181133.getClass(), "value1", null);
        setField(term181133, term181133.getClass(), "value2", null);
        setField(term181133, term181133.getClass(), "value3", null);
        setField(term181133, term181133.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term181120;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term181120, args);
        assertTrue(recursiveEquals(term181120, term181132));
        assertTrue(recursiveEquals(term181120, term181133));
        assertTrue(recursiveEquals(retValue, null));
    }

};
