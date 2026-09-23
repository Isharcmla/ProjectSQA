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

public class Flat3Map_put_1944740725883 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term232981;
     Object term233277;

    public Flat3Map_put_1944740725883() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term232981 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term233073 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term233185 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        setField(term232981, term232981.getClass(), "delegateMap", null);
        setIntField(term232981, term232981.getClass(), "size", 3);
        setIntField(term232981, term232981.getClass(), "hash3", 0);
        setField(term232981, term232981.getClass(), "key3", null);
        setIntField(term232981, term232981.getClass(), "hash2", 0);
        setField(term232981, term232981.getClass(), "key2", null);
        setIntField(term232981, term232981.getClass(), "hash1", 0);
        setField(term233073, term233073.getClass(), "delegateMap", term233185);
        setField(term232981, term232981.getClass(), "key1", term233073);
        term233277 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term233387 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term233277, term233277.getClass(), "delegateMap", null);
        setIntField(term233277, term233277.getClass(), "size", 3);
        setIntField(term233277, term233277.getClass(), "hash3", 0);
        setField(term233277, term233277.getClass(), "value3", null);
        setIntField(term233277, term233277.getClass(), "hash2", 0);
        setField(term233277, term233277.getClass(), "value2", null);
        setIntField(term233277, term233277.getClass(), "hash1", 0);
        setIntField(term233387, term233387.getClass(), "size", 0);
        setField(term233277, term233277.getClass(), "value1", term233387);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term233277;
        args[1] = null;
        callMethod(klass, "put", argTypes, term232981, args);
    }

};


