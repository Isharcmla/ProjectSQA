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

public class Flat3Map_put_1944740725283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46768;
     Object term46844;
     Object term46845;

    public Flat3Map_put_1944740725283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46768 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term46768, term46768.getClass(), "delegateMap", null);
        setIntField(term46768, term46768.getClass(), "size", 0);
        setIntField(term46768, term46768.getClass(), "hash1", 0);
        setField(term46768, term46768.getClass(), "key1", term46768);
        term46844 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term46844, term46844.getClass(), "size", 1);
        setIntField(term46844, term46844.getClass(), "hash1", 0);
        setIntField(term46844, term46844.getClass(), "hash2", 0);
        setIntField(term46844, term46844.getClass(), "hash3", 0);
        setField(term46844, term46844.getClass(), "key1", term46844);
        setField(term46844, term46844.getClass(), "key2", null);
        setField(term46844, term46844.getClass(), "key3", null);
        setField(term46844, term46844.getClass(), "value1", null);
        setField(term46844, term46844.getClass(), "value2", null);
        setField(term46844, term46844.getClass(), "value3", null);
        setField(term46844, term46844.getClass(), "delegateMap", null);
        term46845 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term46845, term46845.getClass(), "size", 1);
        setIntField(term46845, term46845.getClass(), "hash1", 0);
        setIntField(term46845, term46845.getClass(), "hash2", 0);
        setIntField(term46845, term46845.getClass(), "hash3", 0);
        setField(term46845, term46845.getClass(), "key1", term46845);
        setField(term46845, term46845.getClass(), "key2", null);
        setField(term46845, term46845.getClass(), "key3", null);
        setField(term46845, term46845.getClass(), "value1", null);
        setField(term46845, term46845.getClass(), "value2", null);
        setField(term46845, term46845.getClass(), "value3", null);
        setField(term46845, term46845.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term46768;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term46768, args);
        assertTrue(recursiveEquals(term46768, term46844));
        assertTrue(recursiveEquals(term46768, term46845));
        assertTrue(recursiveEquals(retValue, null));
    }

};


