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

public class Flat3Map_toString_1508598404241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42613;
     Object term42844;

    public Flat3Map_toString_1508598404241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42613 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term42613, term42613.getClass(), "delegateMap", null);
        setIntField(term42613, term42613.getClass(), "size", 3);
        setField(term42613, term42613.getClass(), "key3", "");
        setField(term42613, term42613.getClass(), "value3", "");
        setField(term42613, term42613.getClass(), "key2", "");
        setField(term42613, term42613.getClass(), "value2", term42613);
        term42844 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term42844, term42844.getClass(), "size", 3);
        setIntField(term42844, term42844.getClass(), "hash1", 0);
        setIntField(term42844, term42844.getClass(), "hash2", 0);
        setIntField(term42844, term42844.getClass(), "hash3", 0);
        setField(term42844, term42844.getClass(), "key1", null);
        setField(term42844, term42844.getClass(), "key2", "");
        setField(term42844, term42844.getClass(), "key3", "");
        setField(term42844, term42844.getClass(), "value1", null);
        setField(term42844, term42844.getClass(), "value2", term42844);
        setField(term42844, term42844.getClass(), "value3", "");
        setField(term42844, term42844.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term42613, args);
        assertTrue(recursiveEquals(term42613, term42844));
        assertTrue(recursiveEquals(retValue, "{=,=(this Map),null=null}"));
    }

};
