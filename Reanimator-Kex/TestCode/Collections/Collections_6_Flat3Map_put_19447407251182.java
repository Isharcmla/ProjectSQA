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

public class Flat3Map_put_19447407251182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term368070;
     Object term368348;

    public Flat3Map_put_19447407251182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term368070 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term368162 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term368256 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        setField(term368070, term368070.getClass(), "delegateMap", null);
        setIntField(term368070, term368070.getClass(), "size", 3);
        setIntField(term368070, term368070.getClass(), "hash3", 0);
        setIntField(term368256, term368256.getClass(), "size", -4);
        setField(term368162, term368162.getClass(), "delegateMap", term368256);
        setField(term368070, term368070.getClass(), "key3", term368162);
        setIntField(term368070, term368070.getClass(), "hash2", 0);
        setField(term368070, term368070.getClass(), "key2", null);
        setIntField(term368070, term368070.getClass(), "hash1", -1);
        term368348 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term368458 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term368348, term368348.getClass(), "delegateMap", null);
        setIntField(term368348, term368348.getClass(), "size", 3);
        setIntField(term368348, term368348.getClass(), "hash3", 0);
        setField(term368348, term368348.getClass(), "value3", null);
        setIntField(term368348, term368348.getClass(), "hash2", 0);
        setIntField(term368458, term368458.getClass(), "size", 0);
        setField(term368348, term368348.getClass(), "value2", term368458);
        setIntField(term368348, term368348.getClass(), "hash1", 0);
        setField(term368348, term368348.getClass(), "value1", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term368348;
        args[1] = null;
        callMethod(klass, "put", argTypes, term368070, args);
    }

};


