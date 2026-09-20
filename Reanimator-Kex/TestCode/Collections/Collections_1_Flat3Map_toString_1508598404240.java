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

public class Flat3Map_toString_1508598404240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41881;
     Object term42770;

    public Flat3Map_toString_1508598404240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41881 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term41881, term41881.getClass(), "delegateMap", null);
        setIntField(term41881, term41881.getClass(), "size", 3);
        setField(term41881, term41881.getClass(), "key3", "");
        setField(term41881, term41881.getClass(), "value3", "");
        setField(term41881, term41881.getClass(), "key2", "");
        setField(term41881, term41881.getClass(), "value2", "");
        setField(term41881, term41881.getClass(), "key1", "");
        setField(term41881, term41881.getClass(), "value1", term41881);
        term42770 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term42770, term42770.getClass(), "size", 3);
        setIntField(term42770, term42770.getClass(), "hash1", 0);
        setIntField(term42770, term42770.getClass(), "hash2", 0);
        setIntField(term42770, term42770.getClass(), "hash3", 0);
        setField(term42770, term42770.getClass(), "key1", "");
        setField(term42770, term42770.getClass(), "key2", "");
        setField(term42770, term42770.getClass(), "key3", "");
        setField(term42770, term42770.getClass(), "value1", term42770);
        setField(term42770, term42770.getClass(), "value2", "");
        setField(term42770, term42770.getClass(), "value3", "");
        setField(term42770, term42770.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term41881, args);
        assertTrue(recursiveEquals(term41881, term42770));
        assertTrue(recursiveEquals(retValue, "{=,=,=(this Map)}"));
    }

};
