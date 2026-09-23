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

public class Flat3Map_hashCode_2019358094200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33103;
     Object term33608;

    public Flat3Map_hashCode_2019358094200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33103 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term33195 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term33103, term33103.getClass(), "delegateMap", null);
        setIntField(term33103, term33103.getClass(), "size", 2);
        setIntField(term33103, term33103.getClass(), "hash2", 0);
        setField(term33195, term33195.getClass(), "delegateMap", null);
        setIntField(term33195, term33195.getClass(), "size", 1);
        setField(term33103, term33103.getClass(), "value2", term33195);
        term33608 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term33609 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term33608, term33608.getClass(), "size", 2);
        setIntField(term33608, term33608.getClass(), "hash1", 0);
        setIntField(term33608, term33608.getClass(), "hash2", 0);
        setIntField(term33608, term33608.getClass(), "hash3", 0);
        setField(term33608, term33608.getClass(), "key1", null);
        setField(term33608, term33608.getClass(), "key2", null);
        setField(term33608, term33608.getClass(), "key3", null);
        setField(term33608, term33608.getClass(), "value1", null);
        setIntField(term33609, term33609.getClass(), "size", 1);
        setIntField(term33609, term33609.getClass(), "hash1", 0);
        setIntField(term33609, term33609.getClass(), "hash2", 0);
        setIntField(term33609, term33609.getClass(), "hash3", 0);
        setField(term33609, term33609.getClass(), "key1", null);
        setField(term33609, term33609.getClass(), "key2", null);
        setField(term33609, term33609.getClass(), "key3", null);
        setField(term33609, term33609.getClass(), "value1", null);
        setField(term33609, term33609.getClass(), "value2", null);
        setField(term33609, term33609.getClass(), "value3", null);
        setField(term33609, term33609.getClass(), "delegateMap", null);
        setField(term33608, term33608.getClass(), "value2", term33609);
        setField(term33608, term33608.getClass(), "value3", null);
        setField(term33608, term33608.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term33103, args);
        assertTrue(recursiveEquals(term33103, term33608));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


