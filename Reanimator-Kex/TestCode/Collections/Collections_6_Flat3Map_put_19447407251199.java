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
import java.lang.Object;

public class Flat3Map_put_19447407251199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term379812;

    public Flat3Map_put_19447407251199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term379812 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term379868 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        setField(term379812, term379812.getClass(), "delegateMap", null);
        setIntField(term379812, term379812.getClass(), "size", 3);
        setIntField(term379812, term379812.getClass(), "hash3", 0);
        setField(term379812, term379812.getClass(), "value3", null);
        setIntField(term379812, term379812.getClass(), "hash2", 0);
        setIntField(term379868, term379868.getClass(), "size", 0);
        setField(term379812, term379812.getClass(), "value2", term379868);
        setIntField(term379812, term379812.getClass(), "hash1", 0);
        setField(term379812, term379812.getClass(), "value1", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term379812;
        args[1] = null;
        callMethod(klass, "put", argTypes, term379812, args);
    }

};


