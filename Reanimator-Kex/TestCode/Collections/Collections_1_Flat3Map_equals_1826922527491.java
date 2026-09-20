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

public class Flat3Map_equals_1826922527491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92555;
     Object term92779;
     Object term92828;
     Object term92830;

    public Flat3Map_equals_1826922527491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92555 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term92687 = newInstance(Class.forName("java.util.zip.Deflater$DeflaterZStreamRef$FinalizableZStreamRef"));
        setField(term92555, term92555.getClass(), "delegateMap", null);
        setIntField(term92555, term92555.getClass(), "size", 2);
        setField(term92555, term92555.getClass(), "key2", term92687);
        term92779 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term92779, term92779.getClass(), "delegateMap", null);
        setIntField(term92779, term92779.getClass(), "size", 2);
        term92828 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term92829 = newInstance(Class.forName("java.util.zip.Deflater$DeflaterZStreamRef$FinalizableZStreamRef"));
        setIntField(term92828, term92828.getClass(), "size", 2);
        setIntField(term92828, term92828.getClass(), "hash1", 0);
        setIntField(term92828, term92828.getClass(), "hash2", 0);
        setIntField(term92828, term92828.getClass(), "hash3", 0);
        setField(term92828, term92828.getClass(), "key1", null);
        setField(term92829, term92829.getClass(), "owner", null);
        setLongField(term92829, term92829.getClass(), "address", 0L);
        setField(term92829, term92829.getClass(), "cleanable", null);
        setField(term92828, term92828.getClass(), "key2", term92829);
        setField(term92828, term92828.getClass(), "key3", null);
        setField(term92828, term92828.getClass(), "value1", null);
        setField(term92828, term92828.getClass(), "value2", null);
        setField(term92828, term92828.getClass(), "value3", null);
        setField(term92828, term92828.getClass(), "delegateMap", null);
        term92830 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term92830, term92830.getClass(), "size", 2);
        setIntField(term92830, term92830.getClass(), "hash1", 0);
        setIntField(term92830, term92830.getClass(), "hash2", 0);
        setIntField(term92830, term92830.getClass(), "hash3", 0);
        setField(term92830, term92830.getClass(), "key1", null);
        setField(term92830, term92830.getClass(), "key2", null);
        setField(term92830, term92830.getClass(), "key3", null);
        setField(term92830, term92830.getClass(), "value1", null);
        setField(term92830, term92830.getClass(), "value2", null);
        setField(term92830, term92830.getClass(), "value3", null);
        setField(term92830, term92830.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term92779;
        Object retValue = callMethod(klass, "equals", argTypes, term92555, args);
        assertTrue(recursiveEquals(term92555, term92828));
        assertTrue(recursiveEquals(term92779, term92830));
        assertTrue(recursiveEquals(retValue, false));
    }

};
