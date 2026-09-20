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

public class Flat3Map_put_1944740725793 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term161712;
     Object term161742;
     Object term161743;

    public Flat3Map_put_1944740725793() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term161712 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term161712, term161712.getClass(), "delegateMap", null);
        setIntField(term161712, term161712.getClass(), "size", 2);
        term161742 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term161742, term161742.getClass(), "size", 3);
        setIntField(term161742, term161742.getClass(), "hash1", 0);
        setIntField(term161742, term161742.getClass(), "hash2", 0);
        setIntField(term161742, term161742.getClass(), "hash3", 0);
        setField(term161742, term161742.getClass(), "key1", null);
        setField(term161742, term161742.getClass(), "key2", null);
        setField(term161742, term161742.getClass(), "key3", term161742);
        setField(term161742, term161742.getClass(), "value1", null);
        setField(term161742, term161742.getClass(), "value2", null);
        setField(term161742, term161742.getClass(), "value3", null);
        setField(term161742, term161742.getClass(), "delegateMap", null);
        term161743 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term161743, term161743.getClass(), "size", 3);
        setIntField(term161743, term161743.getClass(), "hash1", 0);
        setIntField(term161743, term161743.getClass(), "hash2", 0);
        setIntField(term161743, term161743.getClass(), "hash3", 0);
        setField(term161743, term161743.getClass(), "key1", null);
        setField(term161743, term161743.getClass(), "key2", null);
        setField(term161743, term161743.getClass(), "key3", term161743);
        setField(term161743, term161743.getClass(), "value1", null);
        setField(term161743, term161743.getClass(), "value2", null);
        setField(term161743, term161743.getClass(), "value3", null);
        setField(term161743, term161743.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term161712;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term161712, args);
        assertTrue(recursiveEquals(term161712, term161742));
        assertTrue(recursiveEquals(term161712, term161743));
        assertTrue(recursiveEquals(retValue, null));
    }

};
