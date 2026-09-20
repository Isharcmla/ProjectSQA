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

public class Flat3Map_put_1944740725247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43598;
     Object term43752;

    public Flat3Map_put_1944740725247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43598 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term43690 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term43598, term43598.getClass(), "delegateMap", null);
        setIntField(term43598, term43598.getClass(), "size", 1);
        setField(term43598, term43598.getClass(), "key1", term43690);
        term43752 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term43753 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term43752, term43752.getClass(), "size", 2);
        setIntField(term43752, term43752.getClass(), "hash1", 0);
        setIntField(term43752, term43752.getClass(), "hash2", 0);
        setIntField(term43752, term43752.getClass(), "hash3", 0);
        setIntField(term43753, term43753.getClass(), "size", 0);
        setIntField(term43753, term43753.getClass(), "hash1", 0);
        setIntField(term43753, term43753.getClass(), "hash2", 0);
        setIntField(term43753, term43753.getClass(), "hash3", 0);
        setField(term43753, term43753.getClass(), "key1", null);
        setField(term43753, term43753.getClass(), "key2", null);
        setField(term43753, term43753.getClass(), "key3", null);
        setField(term43753, term43753.getClass(), "value1", null);
        setField(term43753, term43753.getClass(), "value2", null);
        setField(term43753, term43753.getClass(), "value3", null);
        setField(term43753, term43753.getClass(), "delegateMap", null);
        setField(term43752, term43752.getClass(), "key1", term43753);
        setField(term43752, term43752.getClass(), "key2", null);
        setField(term43752, term43752.getClass(), "key3", null);
        setField(term43752, term43752.getClass(), "value1", null);
        setField(term43752, term43752.getClass(), "value2", null);
        setField(term43752, term43752.getClass(), "value3", null);
        setField(term43752, term43752.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term43598, args);
        assertTrue(recursiveEquals(term43598, term43752));
        assertTrue(recursiveEquals(retValue, null));
    }

};
