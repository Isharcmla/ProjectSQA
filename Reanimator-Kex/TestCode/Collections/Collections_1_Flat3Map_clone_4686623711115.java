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

public class Flat3Map_clone_4686623711115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term222932;
     Object term223793;
     Object term223783;

    public Flat3Map_clone_4686623711115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term222932 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        term223793 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term223793, term223793.getClass(), "size", 0);
        setIntField(term223793, term223793.getClass(), "hash1", 0);
        setIntField(term223793, term223793.getClass(), "hash2", 0);
        setIntField(term223793, term223793.getClass(), "hash3", 0);
        setField(term223793, term223793.getClass(), "key1", null);
        setField(term223793, term223793.getClass(), "key2", null);
        setField(term223793, term223793.getClass(), "key3", null);
        setField(term223793, term223793.getClass(), "value1", null);
        setField(term223793, term223793.getClass(), "value2", null);
        setField(term223793, term223793.getClass(), "value3", null);
        setField(term223793, term223793.getClass(), "delegateMap", null);
        term223783 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term223783, term223783.getClass(), "size", 0);
        setIntField(term223783, term223783.getClass(), "hash1", 0);
        setIntField(term223783, term223783.getClass(), "hash2", 0);
        setIntField(term223783, term223783.getClass(), "hash3", 0);
        setField(term223783, term223783.getClass(), "key1", null);
        setField(term223783, term223783.getClass(), "key2", null);
        setField(term223783, term223783.getClass(), "key3", null);
        setField(term223783, term223783.getClass(), "value1", null);
        setField(term223783, term223783.getClass(), "value2", null);
        setField(term223783, term223783.getClass(), "value3", null);
        setField(term223783, term223783.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "clone", argTypes, term222932, args);
        assertTrue(recursiveEquals(term222932, term223793));
        assertTrue(recursiveEquals(retValue, term223783));
    }

};
