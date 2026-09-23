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

public class Flat3Map_hashCode_2019358094152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25661;
     Object term26202;

    public Flat3Map_hashCode_2019358094152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25661 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term25753 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term25661, term25661.getClass(), "delegateMap", null);
        setIntField(term25661, term25661.getClass(), "size", 2);
        setIntField(term25661, term25661.getClass(), "hash2", 0);
        setField(term25661, term25661.getClass(), "value2", term25753);
        term26202 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term26203 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term26202, term26202.getClass(), "size", 2);
        setIntField(term26202, term26202.getClass(), "hash1", 0);
        setIntField(term26202, term26202.getClass(), "hash2", 0);
        setIntField(term26202, term26202.getClass(), "hash3", 0);
        setField(term26202, term26202.getClass(), "key1", null);
        setField(term26202, term26202.getClass(), "key2", null);
        setField(term26202, term26202.getClass(), "key3", null);
        setField(term26202, term26202.getClass(), "value1", null);
        setIntField(term26203, term26203.getClass(), "size", 0);
        setIntField(term26203, term26203.getClass(), "hash1", 0);
        setIntField(term26203, term26203.getClass(), "hash2", 0);
        setIntField(term26203, term26203.getClass(), "hash3", 0);
        setField(term26203, term26203.getClass(), "key1", null);
        setField(term26203, term26203.getClass(), "key2", null);
        setField(term26203, term26203.getClass(), "key3", null);
        setField(term26203, term26203.getClass(), "value1", null);
        setField(term26203, term26203.getClass(), "value2", null);
        setField(term26203, term26203.getClass(), "value3", null);
        setField(term26203, term26203.getClass(), "delegateMap", null);
        setField(term26202, term26202.getClass(), "value2", term26203);
        setField(term26202, term26202.getClass(), "value3", null);
        setField(term26202, term26202.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term25661, args);
        assertTrue(recursiveEquals(term25661, term26202));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


