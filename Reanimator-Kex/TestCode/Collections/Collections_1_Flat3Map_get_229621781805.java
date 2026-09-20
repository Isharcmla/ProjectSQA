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

public class Flat3Map_get_229621781805 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163752;
     Object term164028;
     Object term164631;
     Object term164634;

    public Flat3Map_get_229621781805() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term163752 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term164074 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term164120 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term163752, term163752.getClass(), "delegateMap", null);
        setIntField(term163752, term163752.getClass(), "size", 3);
        setIntField(term163752, term163752.getClass(), "hash3", 0);
        setField(term164074, term164074.getClass(), "delegateMap", null);
        setIntField(term164074, term164074.getClass(), "size", 0);
        setField(term164120, term164120.getClass(), "delegateMap", null);
        setIntField(term164120, term164120.getClass(), "size", 3);
        setField(term164074, term164074.getClass(), "key3", term164120);
        setField(term164074, term164074.getClass(), "key2", null);
        setField(term164074, term164074.getClass(), "value2", null);
        setIntField(term164074, term164074.getClass(), "hash3", 0);
        setField(term163752, term163752.getClass(), "key3", term164074);
        term164028 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term164028, term164028.getClass(), "delegateMap", null);
        setIntField(term164028, term164028.getClass(), "size", 3);
        setIntField(term164028, term164028.getClass(), "hash3", 0);
        setField(term164028, term164028.getClass(), "value3", null);
        setIntField(term164028, term164028.getClass(), "hash2", 0);
        setField(term164028, term164028.getClass(), "value2", null);
        setIntField(term164028, term164028.getClass(), "hash1", 0);
        setField(term164028, term164028.getClass(), "value1", null);
        setField(term164028, term164028.getClass(), "key3", null);
        setField(term164028, term164028.getClass(), "key2", term164074);
        term164631 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term164632 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term164633 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term164631, term164631.getClass(), "size", 3);
        setIntField(term164631, term164631.getClass(), "hash1", 0);
        setIntField(term164631, term164631.getClass(), "hash2", 0);
        setIntField(term164631, term164631.getClass(), "hash3", 0);
        setField(term164631, term164631.getClass(), "key1", null);
        setField(term164631, term164631.getClass(), "key2", null);
        setIntField(term164632, term164632.getClass(), "size", 0);
        setIntField(term164632, term164632.getClass(), "hash1", 0);
        setIntField(term164632, term164632.getClass(), "hash2", 0);
        setIntField(term164632, term164632.getClass(), "hash3", 0);
        setField(term164632, term164632.getClass(), "key1", null);
        setField(term164632, term164632.getClass(), "key2", null);
        setIntField(term164633, term164633.getClass(), "size", 3);
        setIntField(term164633, term164633.getClass(), "hash1", 0);
        setIntField(term164633, term164633.getClass(), "hash2", 0);
        setIntField(term164633, term164633.getClass(), "hash3", 0);
        setField(term164633, term164633.getClass(), "key1", null);
        setField(term164633, term164633.getClass(), "key2", null);
        setField(term164633, term164633.getClass(), "key3", null);
        setField(term164633, term164633.getClass(), "value1", null);
        setField(term164633, term164633.getClass(), "value2", null);
        setField(term164633, term164633.getClass(), "value3", null);
        setField(term164633, term164633.getClass(), "delegateMap", null);
        setField(term164632, term164632.getClass(), "key3", term164633);
        setField(term164632, term164632.getClass(), "value1", null);
        setField(term164632, term164632.getClass(), "value2", null);
        setField(term164632, term164632.getClass(), "value3", null);
        setField(term164632, term164632.getClass(), "delegateMap", null);
        setField(term164631, term164631.getClass(), "key3", term164632);
        setField(term164631, term164631.getClass(), "value1", null);
        setField(term164631, term164631.getClass(), "value2", null);
        setField(term164631, term164631.getClass(), "value3", null);
        setField(term164631, term164631.getClass(), "delegateMap", null);
        term164634 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term164635 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term164636 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term164634, term164634.getClass(), "size", 3);
        setIntField(term164634, term164634.getClass(), "hash1", 0);
        setIntField(term164634, term164634.getClass(), "hash2", 0);
        setIntField(term164634, term164634.getClass(), "hash3", 0);
        setField(term164634, term164634.getClass(), "key1", null);
        setIntField(term164635, term164635.getClass(), "size", 0);
        setIntField(term164635, term164635.getClass(), "hash1", 0);
        setIntField(term164635, term164635.getClass(), "hash2", 0);
        setIntField(term164635, term164635.getClass(), "hash3", 0);
        setField(term164635, term164635.getClass(), "key1", null);
        setField(term164635, term164635.getClass(), "key2", null);
        setIntField(term164636, term164636.getClass(), "size", 3);
        setIntField(term164636, term164636.getClass(), "hash1", 0);
        setIntField(term164636, term164636.getClass(), "hash2", 0);
        setIntField(term164636, term164636.getClass(), "hash3", 0);
        setField(term164636, term164636.getClass(), "key1", null);
        setField(term164636, term164636.getClass(), "key2", null);
        setField(term164636, term164636.getClass(), "key3", null);
        setField(term164636, term164636.getClass(), "value1", null);
        setField(term164636, term164636.getClass(), "value2", null);
        setField(term164636, term164636.getClass(), "value3", null);
        setField(term164636, term164636.getClass(), "delegateMap", null);
        setField(term164635, term164635.getClass(), "key3", term164636);
        setField(term164635, term164635.getClass(), "value1", null);
        setField(term164635, term164635.getClass(), "value2", null);
        setField(term164635, term164635.getClass(), "value3", null);
        setField(term164635, term164635.getClass(), "delegateMap", null);
        setField(term164634, term164634.getClass(), "key2", term164635);
        setField(term164634, term164634.getClass(), "key3", null);
        setField(term164634, term164634.getClass(), "value1", null);
        setField(term164634, term164634.getClass(), "value2", null);
        setField(term164634, term164634.getClass(), "value3", null);
        setField(term164634, term164634.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term164028;
        Object retValue = callMethod(klass, "get", argTypes, term163752, args);
        assertTrue(recursiveEquals(term163752, term164631));
        assertTrue(recursiveEquals(term164028, term164634));
        assertTrue(recursiveEquals(retValue, null));
    }

};
