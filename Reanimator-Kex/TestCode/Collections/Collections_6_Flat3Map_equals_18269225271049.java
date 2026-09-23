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

public class Flat3Map_equals_18269225271049 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term301472;
     Object term301618;
     Object term302049;
     Object term302051;

    public Flat3Map_equals_18269225271049() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term301472 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term301526 = newInstance(Class.forName("java.util.Base64$Decoder"));
        setField(term301472, term301472.getClass(), "delegateMap", null);
        setIntField(term301472, term301472.getClass(), "size", 3);
        setField(term301472, term301472.getClass(), "key3", null);
        setField(term301472, term301472.getClass(), "value3", null);
        setField(term301472, term301472.getClass(), "key2", null);
        setField(term301472, term301472.getClass(), "value2", null);
        setField(term301472, term301472.getClass(), "key1", term301526);
        term301618 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term301618, term301618.getClass(), "delegateMap", null);
        setIntField(term301618, term301618.getClass(), "size", 3);
        setField(term301618, term301618.getClass(), "key3", null);
        setField(term301618, term301618.getClass(), "value3", null);
        term302049 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term302050 = newInstance(Class.forName("java.util.Base64$Decoder"));
        setIntField(term302049, term302049.getClass(), "size", 3);
        setIntField(term302049, term302049.getClass(), "hash1", 0);
        setIntField(term302049, term302049.getClass(), "hash2", 0);
        setIntField(term302049, term302049.getClass(), "hash3", 0);
        setBooleanField(term302050, term302050.getClass(), "isURL", false);
        setBooleanField(term302050, term302050.getClass(), "isMIME", false);
        setField(term302049, term302049.getClass(), "key1", term302050);
        setField(term302049, term302049.getClass(), "key2", null);
        setField(term302049, term302049.getClass(), "key3", null);
        setField(term302049, term302049.getClass(), "value1", null);
        setField(term302049, term302049.getClass(), "value2", null);
        setField(term302049, term302049.getClass(), "value3", null);
        setField(term302049, term302049.getClass(), "delegateMap", null);
        term302051 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term302051, term302051.getClass(), "size", 3);
        setIntField(term302051, term302051.getClass(), "hash1", 0);
        setIntField(term302051, term302051.getClass(), "hash2", 0);
        setIntField(term302051, term302051.getClass(), "hash3", 0);
        setField(term302051, term302051.getClass(), "key1", null);
        setField(term302051, term302051.getClass(), "key2", null);
        setField(term302051, term302051.getClass(), "key3", null);
        setField(term302051, term302051.getClass(), "value1", null);
        setField(term302051, term302051.getClass(), "value2", null);
        setField(term302051, term302051.getClass(), "value3", null);
        setField(term302051, term302051.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term301618;
        Object retValue = callMethod(klass, "equals", argTypes, term301472, args);
        assertTrue(recursiveEquals(term301472, term302049));
        assertTrue(recursiveEquals(term301618, term302051));
        assertTrue(recursiveEquals(retValue, false));
    }

};


