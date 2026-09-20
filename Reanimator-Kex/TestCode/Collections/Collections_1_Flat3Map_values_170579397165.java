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

public class Flat3Map_values_170579397165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14961;
     Object term14983;
     Object term14982;

    public Flat3Map_values_170579397165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14961 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term14961, term14961.getClass(), "delegateMap", null);
        term14983 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term14983, term14983.getClass(), "size", 0);
        setIntField(term14983, term14983.getClass(), "hash1", 0);
        setIntField(term14983, term14983.getClass(), "hash2", 0);
        setIntField(term14983, term14983.getClass(), "hash3", 0);
        setField(term14983, term14983.getClass(), "key1", null);
        setField(term14983, term14983.getClass(), "key2", null);
        setField(term14983, term14983.getClass(), "key3", null);
        setField(term14983, term14983.getClass(), "value1", null);
        setField(term14983, term14983.getClass(), "value2", null);
        setField(term14983, term14983.getClass(), "value3", null);
        setField(term14983, term14983.getClass(), "delegateMap", null);
        term14982 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map$Values"));
        Object term14977 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term14977, term14977.getClass(), "size", 0);
        setIntField(term14977, term14977.getClass(), "hash1", 0);
        setIntField(term14977, term14977.getClass(), "hash2", 0);
        setIntField(term14977, term14977.getClass(), "hash3", 0);
        setField(term14977, term14977.getClass(), "key1", null);
        setField(term14977, term14977.getClass(), "key2", null);
        setField(term14977, term14977.getClass(), "key3", null);
        setField(term14977, term14977.getClass(), "value1", null);
        setField(term14977, term14977.getClass(), "value2", null);
        setField(term14977, term14977.getClass(), "value3", null);
        setField(term14977, term14977.getClass(), "delegateMap", null);
        setField(term14982, term14982.getClass(), "parent", term14977);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "values", argTypes, term14961, args);
        assertTrue(recursiveEquals(term14961, term14983));
        assertTrue(recursiveEquals(retValue, term14982));
    }

};
