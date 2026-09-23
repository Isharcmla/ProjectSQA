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
import java.lang.Object;

public class Flat3Map_containsKey_760925101012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term287030;

    public Flat3Map_containsKey_760925101012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term287030 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term287085 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term287030, term287030.getClass(), "delegateMap", null);
        setIntField(term287030, term287030.getClass(), "size", 2);
        setIntField(term287030, term287030.getClass(), "hash2", 0);
        setField(term287030, term287030.getClass(), "value2", term287085);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term287030;
        callMethod(klass, "containsKey", argTypes, term287030, args);
    }

};


