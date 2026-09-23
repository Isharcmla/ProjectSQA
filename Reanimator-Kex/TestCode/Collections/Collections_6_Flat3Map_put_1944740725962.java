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

public class Flat3Map_put_1944740725962 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term265739;
     Object term127753;

    public Flat3Map_put_1944740725962() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term265739 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term265794 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term265739, term265739.getClass(), "delegateMap", null);
        setIntField(term265739, term265739.getClass(), "size", 3);
        setIntField(term265739, term265739.getClass(), "hash3", 0);
        setField(term265739, term265739.getClass(), "value3", null);
        setIntField(term265739, term265739.getClass(), "hash2", 0);
        setIntField(term265794, term265794.getClass(), "size", 0);
        setField(term265739, term265739.getClass(), "value2", term265794);
        setIntField(term265739, term265739.getClass(), "hash1", 0);
        setField(term265739, term265739.getClass(), "value1", null);
        setField(term265739, term265739.getClass(), "key3", null);
        setField(term265739, term265739.getClass(), "key2", term265739);
        term127753 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term127754 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term127755 = newInstance(Class.forName("java.lang.Object"));
        Object term127756 = newInstance(Class.forName("java.util.stream.MatchOps$4MatchSink"));
        setField(term127754, term127754.getClass(), "next", null);
        setField(term127754, term127754.getClass(), "key", term127755);
        setField(term127756, term127756.getClass(), "val$matchKind", null);
        setField(term127756, term127756.getClass(), "val$predicate", null);
        setBooleanField(term127756, term127756.getClass(), "stop", false);
        setBooleanField(term127756, term127756.getClass(), "value", false);
        setField(term127754, term127754.getClass(), "value", term127756);
        setElement(term127753, 5, term127754);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term265739;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term265739, args);
        assertTrue(recursiveEquals(term265739, false));
        assertTrue(recursiveEquals(retValue, term127753));
    }

};


