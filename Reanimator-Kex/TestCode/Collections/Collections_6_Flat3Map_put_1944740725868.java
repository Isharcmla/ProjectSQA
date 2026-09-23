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

public class Flat3Map_put_1944740725868 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term226742;
     Object term226926;

    public Flat3Map_put_1944740725868() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term226742 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term226972 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term226742, term226742.getClass(), "delegateMap", null);
        setIntField(term226742, term226742.getClass(), "size", 3);
        setIntField(term226742, term226742.getClass(), "hash3", 0);
        setField(term226972, term226972.getClass(), "delegateMap", null);
        setIntField(term226972, term226972.getClass(), "size", 0);
        setField(term226972, term226972.getClass(), "key3", term226972);
        setField(term226972, term226972.getClass(), "key2", null);
        setField(term226972, term226972.getClass(), "value2", null);
        setIntField(term226972, term226972.getClass(), "hash3", 0);
        setField(term226742, term226742.getClass(), "key3", term226972);
        term226926 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term226926, term226926.getClass(), "delegateMap", null);
        setIntField(term226926, term226926.getClass(), "size", 3);
        setIntField(term226926, term226926.getClass(), "hash3", 0);
        setField(term226926, term226926.getClass(), "value3", null);
        setIntField(term226926, term226926.getClass(), "hash2", 0);
        setField(term226926, term226926.getClass(), "value2", null);
        setIntField(term226926, term226926.getClass(), "hash1", 0);
        setField(term226926, term226926.getClass(), "value1", null);
        setField(term226926, term226926.getClass(), "key3", null);
        setField(term226926, term226926.getClass(), "key2", term226972);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term226926;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term226742, args);
        assertTrue(recursiveEquals(term226926, 2));
        assertTrue(recursiveEquals(retValue, null));
    }

};


