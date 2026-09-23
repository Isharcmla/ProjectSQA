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

public class Flat3Map_put_1944740725561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113124;
     Object term113538;
     Object term113632;
     Object term113637;

    public Flat3Map_put_1944740725561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113124 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term113216 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term113308 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term113400 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        term113538 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term113124, term113124.getClass(), "delegateMap", null);
        setIntField(term113124, term113124.getClass(), "size", 2);
        setIntField(term113124, term113124.getClass(), "hash2", 0);
        setField(term113216, term113216.getClass(), "delegateMap", null);
        setIntField(term113216, term113216.getClass(), "size", 2);
        setField(term113216, term113216.getClass(), "key2", term113308);
        setField(term113216, term113216.getClass(), "key1", null);
        setField(term113216, term113216.getClass(), "value1", term113400);
        setField(term113124, term113124.getClass(), "key2", term113216);
        setIntField(term113124, term113124.getClass(), "hash1", 0);
        setField(term113538, term113538.getClass(), "delegateMap", null);
        setIntField(term113538, term113538.getClass(), "size", 2);
        setIntField(term113538, term113538.getClass(), "hash2", 0);
        setField(term113538, term113538.getClass(), "value2", null);
        setIntField(term113538, term113538.getClass(), "hash1", 0);
        setField(term113538, term113538.getClass(), "value1", null);
        setField(term113538, term113538.getClass(), "key2", null);
        setField(term113124, term113124.getClass(), "key1", term113538);
        term113632 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term113633 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term113634 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term113635 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term113636 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term113632, term113632.getClass(), "size", 2);
        setIntField(term113632, term113632.getClass(), "hash1", 0);
        setIntField(term113632, term113632.getClass(), "hash2", 0);
        setIntField(term113632, term113632.getClass(), "hash3", 0);
        setIntField(term113633, term113633.getClass(), "size", 2);
        setIntField(term113633, term113633.getClass(), "hash1", 0);
        setIntField(term113633, term113633.getClass(), "hash2", 0);
        setIntField(term113633, term113633.getClass(), "hash3", 0);
        setField(term113633, term113633.getClass(), "key1", null);
        setField(term113633, term113633.getClass(), "key2", null);
        setField(term113633, term113633.getClass(), "key3", null);
        setField(term113633, term113633.getClass(), "value1", null);
        setField(term113633, term113633.getClass(), "value2", null);
        setField(term113633, term113633.getClass(), "value3", null);
        setField(term113633, term113633.getClass(), "delegateMap", null);
        setField(term113632, term113632.getClass(), "key1", term113633);
        setIntField(term113634, term113634.getClass(), "size", 2);
        setIntField(term113634, term113634.getClass(), "hash1", 0);
        setIntField(term113634, term113634.getClass(), "hash2", 0);
        setIntField(term113634, term113634.getClass(), "hash3", 0);
        setField(term113634, term113634.getClass(), "key1", null);
        setIntField(term113635, term113635.getClass(), "size", 0);
        setIntField(term113635, term113635.getClass(), "hash1", 0);
        setIntField(term113635, term113635.getClass(), "hash2", 0);
        setIntField(term113635, term113635.getClass(), "hash3", 0);
        setField(term113635, term113635.getClass(), "key1", null);
        setField(term113635, term113635.getClass(), "key2", null);
        setField(term113635, term113635.getClass(), "key3", null);
        setField(term113635, term113635.getClass(), "value1", null);
        setField(term113635, term113635.getClass(), "value2", null);
        setField(term113635, term113635.getClass(), "value3", null);
        setField(term113635, term113635.getClass(), "delegateMap", null);
        setField(term113634, term113634.getClass(), "key2", term113635);
        setField(term113634, term113634.getClass(), "key3", null);
        setIntField(term113636, term113636.getClass(), "size", 0);
        setIntField(term113636, term113636.getClass(), "hash1", 0);
        setIntField(term113636, term113636.getClass(), "hash2", 0);
        setIntField(term113636, term113636.getClass(), "hash3", 0);
        setField(term113636, term113636.getClass(), "key1", null);
        setField(term113636, term113636.getClass(), "key2", null);
        setField(term113636, term113636.getClass(), "key3", null);
        setField(term113636, term113636.getClass(), "value1", null);
        setField(term113636, term113636.getClass(), "value2", null);
        setField(term113636, term113636.getClass(), "value3", null);
        setField(term113636, term113636.getClass(), "delegateMap", null);
        setField(term113634, term113634.getClass(), "value1", term113636);
        setField(term113634, term113634.getClass(), "value2", null);
        setField(term113634, term113634.getClass(), "value3", null);
        setField(term113634, term113634.getClass(), "delegateMap", null);
        setField(term113632, term113632.getClass(), "key2", term113634);
        setField(term113632, term113632.getClass(), "key3", null);
        setField(term113632, term113632.getClass(), "value1", null);
        setField(term113632, term113632.getClass(), "value2", null);
        setField(term113632, term113632.getClass(), "value3", null);
        setField(term113632, term113632.getClass(), "delegateMap", null);
        term113637 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term113637, term113637.getClass(), "size", 2);
        setIntField(term113637, term113637.getClass(), "hash1", 0);
        setIntField(term113637, term113637.getClass(), "hash2", 0);
        setIntField(term113637, term113637.getClass(), "hash3", 0);
        setField(term113637, term113637.getClass(), "key1", null);
        setField(term113637, term113637.getClass(), "key2", null);
        setField(term113637, term113637.getClass(), "key3", null);
        setField(term113637, term113637.getClass(), "value1", null);
        setField(term113637, term113637.getClass(), "value2", null);
        setField(term113637, term113637.getClass(), "value3", null);
        setField(term113637, term113637.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term113538;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term113124, args);
        assertTrue(recursiveEquals(term113124, term113632));
        assertTrue(recursiveEquals(term113538, term113637));
        assertTrue(recursiveEquals(retValue, null));
    }

};


