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

public class Flat3Map_size_91486821268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15082;
     Object term15189;

    public Flat3Map_size_91486821268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15082 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term15082, term15082.getClass(), "delegateMap", null);
        term15189 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term15189, term15189.getClass(), "size", 0);
        setIntField(term15189, term15189.getClass(), "hash1", 0);
        setIntField(term15189, term15189.getClass(), "hash2", 0);
        setIntField(term15189, term15189.getClass(), "hash3", 0);
        setField(term15189, term15189.getClass(), "key1", null);
        setField(term15189, term15189.getClass(), "key2", null);
        setField(term15189, term15189.getClass(), "key3", null);
        setField(term15189, term15189.getClass(), "value1", null);
        setField(term15189, term15189.getClass(), "value2", null);
        setField(term15189, term15189.getClass(), "value3", null);
        setField(term15189, term15189.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "size", argTypes, term15082, args);
        assertTrue(recursiveEquals(term15082, term15189));
        assertTrue(recursiveEquals(retValue, 0));
    }

};
