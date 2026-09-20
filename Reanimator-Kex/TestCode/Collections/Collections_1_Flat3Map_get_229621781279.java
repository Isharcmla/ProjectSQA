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

public class Flat3Map_get_229621781279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49864;
     Object term49930;
     Object term49931;

    public Flat3Map_get_229621781279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49864 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term49864, term49864.getClass(), "delegateMap", null);
        setIntField(term49864, term49864.getClass(), "size", 3);
        setIntField(term49864, term49864.getClass(), "hash3", 0);
        setField(term49864, term49864.getClass(), "value3", null);
        setIntField(term49864, term49864.getClass(), "hash2", 0);
        setField(term49864, term49864.getClass(), "value2", null);
        setIntField(term49864, term49864.getClass(), "hash1", 0);
        setField(term49864, term49864.getClass(), "value1", null);
        setField(term49864, term49864.getClass(), "key3", term49864);
        term49930 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term49930, term49930.getClass(), "size", 3);
        setIntField(term49930, term49930.getClass(), "hash1", 0);
        setIntField(term49930, term49930.getClass(), "hash2", 0);
        setIntField(term49930, term49930.getClass(), "hash3", 0);
        setField(term49930, term49930.getClass(), "key1", null);
        setField(term49930, term49930.getClass(), "key2", null);
        setField(term49930, term49930.getClass(), "key3", term49930);
        setField(term49930, term49930.getClass(), "value1", null);
        setField(term49930, term49930.getClass(), "value2", null);
        setField(term49930, term49930.getClass(), "value3", null);
        setField(term49930, term49930.getClass(), "delegateMap", null);
        term49931 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term49931, term49931.getClass(), "size", 3);
        setIntField(term49931, term49931.getClass(), "hash1", 0);
        setIntField(term49931, term49931.getClass(), "hash2", 0);
        setIntField(term49931, term49931.getClass(), "hash3", 0);
        setField(term49931, term49931.getClass(), "key1", null);
        setField(term49931, term49931.getClass(), "key2", null);
        setField(term49931, term49931.getClass(), "key3", term49931);
        setField(term49931, term49931.getClass(), "value1", null);
        setField(term49931, term49931.getClass(), "value2", null);
        setField(term49931, term49931.getClass(), "value3", null);
        setField(term49931, term49931.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term49864;
        Object retValue = callMethod(klass, "get", argTypes, term49864, args);
        assertTrue(recursiveEquals(term49864, term49930));
        assertTrue(recursiveEquals(term49864, term49931));
        assertTrue(recursiveEquals(retValue, null));
    }

};
