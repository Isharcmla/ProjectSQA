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

public class Flat3Map_get_229621781742 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149515;
     Object term149607;
     Object term149864;
     Object term149865;

    public Flat3Map_get_229621781742() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149515 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term149515, term149515.getClass(), "delegateMap", null);
        setIntField(term149515, term149515.getClass(), "size", 3);
        setIntField(term149515, term149515.getClass(), "hash3", 0);
        setField(term149515, term149515.getClass(), "key3", null);
        term149607 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term149607, term149607.getClass(), "delegateMap", null);
        setIntField(term149607, term149607.getClass(), "size", 3);
        setIntField(term149607, term149607.getClass(), "hash3", 0);
        setField(term149607, term149607.getClass(), "value3", null);
        setIntField(term149607, term149607.getClass(), "hash2", 0);
        setField(term149607, term149607.getClass(), "value2", null);
        setIntField(term149607, term149607.getClass(), "hash1", 0);
        setField(term149607, term149607.getClass(), "value1", null);
        setField(term149607, term149607.getClass(), "key3", null);
        term149864 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term149864, term149864.getClass(), "size", 3);
        setIntField(term149864, term149864.getClass(), "hash1", 0);
        setIntField(term149864, term149864.getClass(), "hash2", 0);
        setIntField(term149864, term149864.getClass(), "hash3", 0);
        setField(term149864, term149864.getClass(), "key1", null);
        setField(term149864, term149864.getClass(), "key2", null);
        setField(term149864, term149864.getClass(), "key3", null);
        setField(term149864, term149864.getClass(), "value1", null);
        setField(term149864, term149864.getClass(), "value2", null);
        setField(term149864, term149864.getClass(), "value3", null);
        setField(term149864, term149864.getClass(), "delegateMap", null);
        term149865 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term149865, term149865.getClass(), "size", 3);
        setIntField(term149865, term149865.getClass(), "hash1", 0);
        setIntField(term149865, term149865.getClass(), "hash2", 0);
        setIntField(term149865, term149865.getClass(), "hash3", 0);
        setField(term149865, term149865.getClass(), "key1", null);
        setField(term149865, term149865.getClass(), "key2", null);
        setField(term149865, term149865.getClass(), "key3", null);
        setField(term149865, term149865.getClass(), "value1", null);
        setField(term149865, term149865.getClass(), "value2", null);
        setField(term149865, term149865.getClass(), "value3", null);
        setField(term149865, term149865.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term149607;
        Object retValue = callMethod(klass, "get", argTypes, term149515, args);
        assertTrue(recursiveEquals(term149515, term149864));
        assertTrue(recursiveEquals(term149607, term149865));
        assertTrue(recursiveEquals(retValue, null));
    }

};
