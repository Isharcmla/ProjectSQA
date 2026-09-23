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

public class Flat3Map_put_1944740725543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106987;
     Object term107209;
     Object term107280;
     Object term107283;

    public Flat3Map_put_1944740725543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term106987 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term107025 = newInstance(Class.forName("java.lang.Object"));
        Object term107117 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term106987, term106987.getClass(), "delegateMap", null);
        setIntField(term106987, term106987.getClass(), "size", 2);
        setIntField(term106987, term106987.getClass(), "hash2", 0);
        setField(term106987, term106987.getClass(), "key2", term107025);
        setIntField(term106987, term106987.getClass(), "hash1", 0);
        setField(term107117, term107117.getClass(), "delegateMap", null);
        setIntField(term107117, term107117.getClass(), "size", 2);
        setField(term106987, term106987.getClass(), "key1", term107117);
        term107209 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term107209, term107209.getClass(), "delegateMap", null);
        setIntField(term107209, term107209.getClass(), "size", 2);
        setIntField(term107209, term107209.getClass(), "hash2", 0);
        setField(term107209, term107209.getClass(), "value2", null);
        setIntField(term107209, term107209.getClass(), "hash1", 0);
        setField(term107209, term107209.getClass(), "value1", null);
        term107280 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term107281 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term107282 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term107280, term107280.getClass(), "size", 2);
        setIntField(term107280, term107280.getClass(), "hash1", 0);
        setIntField(term107280, term107280.getClass(), "hash2", 0);
        setIntField(term107280, term107280.getClass(), "hash3", 0);
        setIntField(term107281, term107281.getClass(), "size", 2);
        setIntField(term107281, term107281.getClass(), "hash1", 0);
        setIntField(term107281, term107281.getClass(), "hash2", 0);
        setIntField(term107281, term107281.getClass(), "hash3", 0);
        setField(term107281, term107281.getClass(), "key1", null);
        setField(term107281, term107281.getClass(), "key2", null);
        setField(term107281, term107281.getClass(), "key3", null);
        setField(term107281, term107281.getClass(), "value1", null);
        setField(term107281, term107281.getClass(), "value2", null);
        setField(term107281, term107281.getClass(), "value3", null);
        setField(term107281, term107281.getClass(), "delegateMap", null);
        setField(term107280, term107280.getClass(), "key1", term107281);
        setField(term107280, term107280.getClass(), "key2", term107282);
        setField(term107280, term107280.getClass(), "key3", null);
        setField(term107280, term107280.getClass(), "value1", null);
        setField(term107280, term107280.getClass(), "value2", null);
        setField(term107280, term107280.getClass(), "value3", null);
        setField(term107280, term107280.getClass(), "delegateMap", null);
        term107283 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term107283, term107283.getClass(), "size", 2);
        setIntField(term107283, term107283.getClass(), "hash1", 0);
        setIntField(term107283, term107283.getClass(), "hash2", 0);
        setIntField(term107283, term107283.getClass(), "hash3", 0);
        setField(term107283, term107283.getClass(), "key1", null);
        setField(term107283, term107283.getClass(), "key2", null);
        setField(term107283, term107283.getClass(), "key3", null);
        setField(term107283, term107283.getClass(), "value1", null);
        setField(term107283, term107283.getClass(), "value2", null);
        setField(term107283, term107283.getClass(), "value3", null);
        setField(term107283, term107283.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term107209;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term106987, args);
        assertTrue(recursiveEquals(term106987, term107280));
        assertTrue(recursiveEquals(term107209, term107283));
        assertTrue(recursiveEquals(retValue, null));
    }

};


