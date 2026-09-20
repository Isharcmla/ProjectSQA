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

public class Flat3Map_hashCode_2019358094145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25451;
     Object term25461;

    public Flat3Map_hashCode_2019358094145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25451 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term25451, term25451.getClass(), "delegateMap", null);
        setIntField(term25451, term25451.getClass(), "size", 2);
        term25461 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term25461, term25461.getClass(), "size", 2);
        setIntField(term25461, term25461.getClass(), "hash1", 0);
        setIntField(term25461, term25461.getClass(), "hash2", 0);
        setIntField(term25461, term25461.getClass(), "hash3", 0);
        setField(term25461, term25461.getClass(), "key1", null);
        setField(term25461, term25461.getClass(), "key2", null);
        setField(term25461, term25461.getClass(), "key3", null);
        setField(term25461, term25461.getClass(), "value1", null);
        setField(term25461, term25461.getClass(), "value2", null);
        setField(term25461, term25461.getClass(), "value3", null);
        setField(term25461, term25461.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term25451, args);
        assertTrue(recursiveEquals(term25451, term25461));
        assertTrue(recursiveEquals(retValue, 0));
    }

};
