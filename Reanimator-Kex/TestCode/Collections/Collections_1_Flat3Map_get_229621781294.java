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

public class Flat3Map_get_229621781294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52234;
     Object term52326;
     Object term52820;
     Object term52821;

    public Flat3Map_get_229621781294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52234 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term52234, term52234.getClass(), "delegateMap", null);
        setIntField(term52234, term52234.getClass(), "size", 3);
        setIntField(term52234, term52234.getClass(), "hash3", 0);
        setField(term52234, term52234.getClass(), "key3", null);
        setIntField(term52234, term52234.getClass(), "hash2", -1);
        term52326 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term52326, term52326.getClass(), "delegateMap", null);
        setIntField(term52326, term52326.getClass(), "size", 3);
        setIntField(term52326, term52326.getClass(), "hash3", 0);
        setField(term52326, term52326.getClass(), "value3", null);
        setIntField(term52326, term52326.getClass(), "hash2", 0);
        setField(term52326, term52326.getClass(), "value2", null);
        setIntField(term52326, term52326.getClass(), "hash1", 0);
        setField(term52326, term52326.getClass(), "value1", null);
        term52820 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term52820, term52820.getClass(), "size", 3);
        setIntField(term52820, term52820.getClass(), "hash1", 0);
        setIntField(term52820, term52820.getClass(), "hash2", -1);
        setIntField(term52820, term52820.getClass(), "hash3", 0);
        setField(term52820, term52820.getClass(), "key1", null);
        setField(term52820, term52820.getClass(), "key2", null);
        setField(term52820, term52820.getClass(), "key3", null);
        setField(term52820, term52820.getClass(), "value1", null);
        setField(term52820, term52820.getClass(), "value2", null);
        setField(term52820, term52820.getClass(), "value3", null);
        setField(term52820, term52820.getClass(), "delegateMap", null);
        term52821 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term52821, term52821.getClass(), "size", 3);
        setIntField(term52821, term52821.getClass(), "hash1", 0);
        setIntField(term52821, term52821.getClass(), "hash2", 0);
        setIntField(term52821, term52821.getClass(), "hash3", 0);
        setField(term52821, term52821.getClass(), "key1", null);
        setField(term52821, term52821.getClass(), "key2", null);
        setField(term52821, term52821.getClass(), "key3", null);
        setField(term52821, term52821.getClass(), "value1", null);
        setField(term52821, term52821.getClass(), "value2", null);
        setField(term52821, term52821.getClass(), "value3", null);
        setField(term52821, term52821.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term52326;
        Object retValue = callMethod(klass, "get", argTypes, term52234, args);
        assertTrue(recursiveEquals(term52234, term52820));
        assertTrue(recursiveEquals(term52326, term52821));
        assertTrue(recursiveEquals(retValue, null));
    }

};
