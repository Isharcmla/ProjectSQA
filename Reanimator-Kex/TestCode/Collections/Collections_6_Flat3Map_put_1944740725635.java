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

public class Flat3Map_put_1944740725635 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140119;
     Object term140195;
     Object term140197;

    public Flat3Map_put_1944740725635() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term140119 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term140174 = newInstance(Class.forName("java.nio.channels.spi.AbstractInterruptibleChannel$1"));
        setField(term140119, term140119.getClass(), "delegateMap", null);
        setIntField(term140119, term140119.getClass(), "size", 2);
        setIntField(term140119, term140119.getClass(), "hash2", 0);
        setField(term140119, term140119.getClass(), "value2", null);
        setIntField(term140119, term140119.getClass(), "hash1", 0);
        setField(term140119, term140119.getClass(), "value1", term140174);
        term140195 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term140196 = newInstance(Class.forName("java.nio.channels.spi.AbstractInterruptibleChannel$1"));
        setIntField(term140195, term140195.getClass(), "size", 3);
        setIntField(term140195, term140195.getClass(), "hash1", 0);
        setIntField(term140195, term140195.getClass(), "hash2", 0);
        setIntField(term140195, term140195.getClass(), "hash3", 1809409308);
        setField(term140195, term140195.getClass(), "key1", null);
        setField(term140195, term140195.getClass(), "key2", null);
        setField(term140195, term140195.getClass(), "key3", term140195);
        setField(term140196, term140196.getClass(), "this$0", null);
        setField(term140195, term140195.getClass(), "value1", term140196);
        setField(term140195, term140195.getClass(), "value2", null);
        setField(term140195, term140195.getClass(), "value3", null);
        setField(term140195, term140195.getClass(), "delegateMap", null);
        term140197 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term140198 = newInstance(Class.forName("java.nio.channels.spi.AbstractInterruptibleChannel$1"));
        setIntField(term140197, term140197.getClass(), "size", 3);
        setIntField(term140197, term140197.getClass(), "hash1", 0);
        setIntField(term140197, term140197.getClass(), "hash2", 0);
        setIntField(term140197, term140197.getClass(), "hash3", 1809409308);
        setField(term140197, term140197.getClass(), "key1", null);
        setField(term140197, term140197.getClass(), "key2", null);
        setField(term140197, term140197.getClass(), "key3", term140197);
        setField(term140198, term140198.getClass(), "this$0", null);
        setField(term140197, term140197.getClass(), "value1", term140198);
        setField(term140197, term140197.getClass(), "value2", null);
        setField(term140197, term140197.getClass(), "value3", null);
        setField(term140197, term140197.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term140119;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term140119, args);
        assertTrue(recursiveEquals(term140119, term140195));
        assertTrue(recursiveEquals(term140119, term140197));
        assertTrue(recursiveEquals(retValue, null));
    }

};


