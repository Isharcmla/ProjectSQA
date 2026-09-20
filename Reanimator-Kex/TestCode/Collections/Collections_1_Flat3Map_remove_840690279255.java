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

public class Flat3Map_remove_840690279255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44783;
     Object term44839;

    public Flat3Map_remove_840690279255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44783 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term44783, term44783.getClass(), "delegateMap", null);
        setIntField(term44783, term44783.getClass(), "size", 3);
        term44839 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term44839, term44839.getClass(), "size", 2);
        setIntField(term44839, term44839.getClass(), "hash1", 0);
        setIntField(term44839, term44839.getClass(), "hash2", 0);
        setIntField(term44839, term44839.getClass(), "hash3", 0);
        setField(term44839, term44839.getClass(), "key1", null);
        setField(term44839, term44839.getClass(), "key2", null);
        setField(term44839, term44839.getClass(), "key3", null);
        setField(term44839, term44839.getClass(), "value1", null);
        setField(term44839, term44839.getClass(), "value2", null);
        setField(term44839, term44839.getClass(), "value3", null);
        setField(term44839, term44839.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "remove", argTypes, term44783, args);
        assertTrue(recursiveEquals(term44783, term44839));
        assertTrue(recursiveEquals(retValue, null));
    }

};
