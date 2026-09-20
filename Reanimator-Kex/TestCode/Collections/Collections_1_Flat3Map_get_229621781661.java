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

public class Flat3Map_get_229621781661 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129075;
     Object term129351;
     Object term129669;
     Object term129672;

    public Flat3Map_get_229621781661() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term129075 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term129167 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term129259 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term129075, term129075.getClass(), "delegateMap", null);
        setIntField(term129075, term129075.getClass(), "size", 3);
        setIntField(term129075, term129075.getClass(), "hash3", 0);
        setField(term129167, term129167.getClass(), "delegateMap", null);
        setIntField(term129167, term129167.getClass(), "size", 3);
        setField(term129167, term129167.getClass(), "key3", term129259);
        setField(term129167, term129167.getClass(), "key2", null);
        setField(term129167, term129167.getClass(), "value2", null);
        setField(term129075, term129075.getClass(), "key3", term129167);
        term129351 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term129443 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term129351, term129351.getClass(), "delegateMap", null);
        setIntField(term129351, term129351.getClass(), "size", 3);
        setIntField(term129351, term129351.getClass(), "hash3", 0);
        setField(term129351, term129351.getClass(), "value3", null);
        setIntField(term129351, term129351.getClass(), "hash2", 0);
        setField(term129351, term129351.getClass(), "value2", null);
        setIntField(term129351, term129351.getClass(), "hash1", 0);
        setField(term129351, term129351.getClass(), "value1", null);
        setField(term129351, term129351.getClass(), "key3", null);
        setField(term129351, term129351.getClass(), "key2", term129443);
        term129669 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term129670 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term129671 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term129669, term129669.getClass(), "size", 3);
        setIntField(term129669, term129669.getClass(), "hash1", 0);
        setIntField(term129669, term129669.getClass(), "hash2", 0);
        setIntField(term129669, term129669.getClass(), "hash3", 0);
        setField(term129669, term129669.getClass(), "key1", null);
        setField(term129669, term129669.getClass(), "key2", null);
        setIntField(term129670, term129670.getClass(), "size", 3);
        setIntField(term129670, term129670.getClass(), "hash1", 0);
        setIntField(term129670, term129670.getClass(), "hash2", 0);
        setIntField(term129670, term129670.getClass(), "hash3", 0);
        setField(term129670, term129670.getClass(), "key1", null);
        setField(term129670, term129670.getClass(), "key2", null);
        setIntField(term129671, term129671.getClass(), "size", 0);
        setIntField(term129671, term129671.getClass(), "hash1", 0);
        setIntField(term129671, term129671.getClass(), "hash2", 0);
        setIntField(term129671, term129671.getClass(), "hash3", 0);
        setField(term129671, term129671.getClass(), "key1", null);
        setField(term129671, term129671.getClass(), "key2", null);
        setField(term129671, term129671.getClass(), "key3", null);
        setField(term129671, term129671.getClass(), "value1", null);
        setField(term129671, term129671.getClass(), "value2", null);
        setField(term129671, term129671.getClass(), "value3", null);
        setField(term129671, term129671.getClass(), "delegateMap", null);
        setField(term129670, term129670.getClass(), "key3", term129671);
        setField(term129670, term129670.getClass(), "value1", null);
        setField(term129670, term129670.getClass(), "value2", null);
        setField(term129670, term129670.getClass(), "value3", null);
        setField(term129670, term129670.getClass(), "delegateMap", null);
        setField(term129669, term129669.getClass(), "key3", term129670);
        setField(term129669, term129669.getClass(), "value1", null);
        setField(term129669, term129669.getClass(), "value2", null);
        setField(term129669, term129669.getClass(), "value3", null);
        setField(term129669, term129669.getClass(), "delegateMap", null);
        term129672 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term129673 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term129672, term129672.getClass(), "size", 3);
        setIntField(term129672, term129672.getClass(), "hash1", 0);
        setIntField(term129672, term129672.getClass(), "hash2", 0);
        setIntField(term129672, term129672.getClass(), "hash3", 0);
        setField(term129672, term129672.getClass(), "key1", null);
        setIntField(term129673, term129673.getClass(), "size", 0);
        setIntField(term129673, term129673.getClass(), "hash1", 0);
        setIntField(term129673, term129673.getClass(), "hash2", 0);
        setIntField(term129673, term129673.getClass(), "hash3", 0);
        setField(term129673, term129673.getClass(), "key1", null);
        setField(term129673, term129673.getClass(), "key2", null);
        setField(term129673, term129673.getClass(), "key3", null);
        setField(term129673, term129673.getClass(), "value1", null);
        setField(term129673, term129673.getClass(), "value2", null);
        setField(term129673, term129673.getClass(), "value3", null);
        setField(term129673, term129673.getClass(), "delegateMap", null);
        setField(term129672, term129672.getClass(), "key2", term129673);
        setField(term129672, term129672.getClass(), "key3", null);
        setField(term129672, term129672.getClass(), "value1", null);
        setField(term129672, term129672.getClass(), "value2", null);
        setField(term129672, term129672.getClass(), "value3", null);
        setField(term129672, term129672.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term129351;
        Object retValue = callMethod(klass, "get", argTypes, term129075, args);
        assertTrue(recursiveEquals(term129075, term129669));
        assertTrue(recursiveEquals(term129351, term129672));
        assertTrue(recursiveEquals(retValue, null));
    }

};
