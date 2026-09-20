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
import java.util.HashMap;

public class Flat3Map_equals_1826922527289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51526;
     Object term51618;
     Object term51730;
     Object term51731;

    public Flat3Map_equals_1826922527289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51526 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term51526, term51526.getClass(), "delegateMap", null);
        setIntField(term51526, term51526.getClass(), "size", 2);
        setField(term51526, term51526.getClass(), "key2", null);
        setField(term51526, term51526.getClass(), "value2", null);
        HashMap term51666 = new HashMap();
        term51618 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term51618, term51618.getClass(), "delegateMap", null);
        setIntField(term51618, term51618.getClass(), "size", 2);
        setField(term51618, term51618.getClass(), "key2", null);
        setField(term51618, term51618.getClass(), "value2", term51666);
        term51730 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term51730, term51730.getClass(), "size", 2);
        setIntField(term51730, term51730.getClass(), "hash1", 0);
        setIntField(term51730, term51730.getClass(), "hash2", 0);
        setIntField(term51730, term51730.getClass(), "hash3", 0);
        setField(term51730, term51730.getClass(), "key1", null);
        setField(term51730, term51730.getClass(), "key2", null);
        setField(term51730, term51730.getClass(), "key3", null);
        setField(term51730, term51730.getClass(), "value1", null);
        setField(term51730, term51730.getClass(), "value2", null);
        setField(term51730, term51730.getClass(), "value3", null);
        setField(term51730, term51730.getClass(), "delegateMap", null);
        HashMap term51732 = new HashMap();
        term51731 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term51731, term51731.getClass(), "size", 2);
        setIntField(term51731, term51731.getClass(), "hash1", 0);
        setIntField(term51731, term51731.getClass(), "hash2", 0);
        setIntField(term51731, term51731.getClass(), "hash3", 0);
        setField(term51731, term51731.getClass(), "key1", null);
        setField(term51731, term51731.getClass(), "key2", null);
        setField(term51731, term51731.getClass(), "key3", null);
        setField(term51731, term51731.getClass(), "value1", null);
        setField(term51731, term51731.getClass(), "value2", term51732);
        setField(term51731, term51731.getClass(), "value3", null);
        setField(term51731, term51731.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term51618;
        Object retValue = callMethod(klass, "equals", argTypes, term51526, args);
        assertTrue(recursiveEquals(term51526, term51730));
        assertTrue(recursiveEquals(term51618, term51731));
        assertTrue(recursiveEquals(retValue, false));
    }

};
