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

public class Flat3Map_put_1944740725375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64654;
     Object term64676;
     Object term64677;

    public Flat3Map_put_1944740725375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64654 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term64654, term64654.getClass(), "delegateMap", null);
        setIntField(term64654, term64654.getClass(), "size", 1);
        setIntField(term64654, term64654.getClass(), "hash1", 0);
        setField(term64654, term64654.getClass(), "value1", null);
        term64676 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term64676, term64676.getClass(), "size", 2);
        setIntField(term64676, term64676.getClass(), "hash1", 0);
        setIntField(term64676, term64676.getClass(), "hash2", 0);
        setIntField(term64676, term64676.getClass(), "hash3", 0);
        setField(term64676, term64676.getClass(), "key1", null);
        setField(term64676, term64676.getClass(), "key2", term64676);
        setField(term64676, term64676.getClass(), "key3", null);
        setField(term64676, term64676.getClass(), "value1", null);
        setField(term64676, term64676.getClass(), "value2", null);
        setField(term64676, term64676.getClass(), "value3", null);
        setField(term64676, term64676.getClass(), "delegateMap", null);
        term64677 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term64677, term64677.getClass(), "size", 2);
        setIntField(term64677, term64677.getClass(), "hash1", 0);
        setIntField(term64677, term64677.getClass(), "hash2", 0);
        setIntField(term64677, term64677.getClass(), "hash3", 0);
        setField(term64677, term64677.getClass(), "key1", null);
        setField(term64677, term64677.getClass(), "key2", term64677);
        setField(term64677, term64677.getClass(), "key3", null);
        setField(term64677, term64677.getClass(), "value1", null);
        setField(term64677, term64677.getClass(), "value2", null);
        setField(term64677, term64677.getClass(), "value3", null);
        setField(term64677, term64677.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term64654;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term64654, args);
        assertTrue(recursiveEquals(term64654, term64676));
        assertTrue(recursiveEquals(term64654, term64677));
        assertTrue(recursiveEquals(retValue, null));
    }

};


