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

public class Flat3Map_hashCode_2019358094234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38553;
     Object term38825;

    public Flat3Map_hashCode_2019358094234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38553 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term38657 = newInstance(Class.forName("org.apache.commons.collections.functors.IfClosure"));
        setField(term38553, term38553.getClass(), "delegateMap", null);
        setIntField(term38553, term38553.getClass(), "size", 3);
        setIntField(term38553, term38553.getClass(), "hash3", 0);
        setField(term38553, term38553.getClass(), "value3", null);
        setIntField(term38553, term38553.getClass(), "hash2", 0);
        setField(term38553, term38553.getClass(), "value2", term38657);
        term38825 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term38826 = newInstance(Class.forName("org.apache.commons.collections.functors.IfClosure"));
        setIntField(term38825, term38825.getClass(), "size", 3);
        setIntField(term38825, term38825.getClass(), "hash1", 0);
        setIntField(term38825, term38825.getClass(), "hash2", 0);
        setIntField(term38825, term38825.getClass(), "hash3", 0);
        setField(term38825, term38825.getClass(), "key1", null);
        setField(term38825, term38825.getClass(), "key2", null);
        setField(term38825, term38825.getClass(), "key3", null);
        setField(term38825, term38825.getClass(), "value1", null);
        setField(term38826, term38826.getClass(), "iPredicate", null);
        setField(term38826, term38826.getClass(), "iTrueClosure", null);
        setField(term38826, term38826.getClass(), "iFalseClosure", null);
        setField(term38825, term38825.getClass(), "value2", term38826);
        setField(term38825, term38825.getClass(), "value3", null);
        setField(term38825, term38825.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term38553, args);
        assertTrue(recursiveEquals(term38553, term38825));
        assertTrue(recursiveEquals(retValue, 1404616719));
    }

};


