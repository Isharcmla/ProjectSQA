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
import java.util.HashMap;
import java.lang.Object;

public class Flat3Map_equals_1826922527723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144401;
     Object term144633;
     Object term144945;
     Object term144949;

    public Flat3Map_equals_1826922527723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term144657 = new HashMap();
        term144401 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term144541 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term144401, term144401.getClass(), "delegateMap", null);
        setIntField(term144401, term144401.getClass(), "size", 2);
        setField(term144401, term144401.getClass(), "key2", term144657);
        setField(term144401, term144401.getClass(), "value2", null);
        setField(term144401, term144401.getClass(), "key1", null);
        setField(term144401, term144401.getClass(), "value1", term144541);
        term144633 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term144695 = newInstance(Class.forName("java.lang.Object"));
        setField(term144633, term144633.getClass(), "delegateMap", null);
        setIntField(term144633, term144633.getClass(), "size", 2);
        setIntField(term144633, term144633.getClass(), "hash2", 0);
        setField(term144633, term144633.getClass(), "key2", term144657);
        setField(term144633, term144633.getClass(), "value2", null);
        setField(term144633, term144633.getClass(), "key1", null);
        setField(term144633, term144633.getClass(), "value1", term144695);
        HashMap term144946 = new HashMap();
        term144945 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term144948 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term144945, term144945.getClass(), "size", 2);
        setIntField(term144945, term144945.getClass(), "hash1", 0);
        setIntField(term144945, term144945.getClass(), "hash2", 0);
        setIntField(term144945, term144945.getClass(), "hash3", 0);
        setField(term144945, term144945.getClass(), "key1", null);
        setField(term144945, term144945.getClass(), "key2", term144946);
        setField(term144945, term144945.getClass(), "key3", null);
        setIntField(term144948, term144948.getClass(), "size", 0);
        setIntField(term144948, term144948.getClass(), "hash1", 0);
        setIntField(term144948, term144948.getClass(), "hash2", 0);
        setIntField(term144948, term144948.getClass(), "hash3", 0);
        setField(term144948, term144948.getClass(), "key1", null);
        setField(term144948, term144948.getClass(), "key2", null);
        setField(term144948, term144948.getClass(), "key3", null);
        setField(term144948, term144948.getClass(), "value1", null);
        setField(term144948, term144948.getClass(), "value2", null);
        setField(term144948, term144948.getClass(), "value3", null);
        setField(term144948, term144948.getClass(), "delegateMap", null);
        setField(term144945, term144945.getClass(), "value1", term144948);
        setField(term144945, term144945.getClass(), "value2", null);
        setField(term144945, term144945.getClass(), "value3", null);
        setField(term144945, term144945.getClass(), "delegateMap", null);
        HashMap term144950 = new HashMap();
        term144949 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term144952 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term144949, term144949.getClass(), "size", 2);
        setIntField(term144949, term144949.getClass(), "hash1", 0);
        setIntField(term144949, term144949.getClass(), "hash2", 0);
        setIntField(term144949, term144949.getClass(), "hash3", 0);
        setField(term144949, term144949.getClass(), "key1", null);
        setField(term144949, term144949.getClass(), "key2", term144950);
        setField(term144949, term144949.getClass(), "key3", null);
        setField(term144949, term144949.getClass(), "value1", term144952);
        setField(term144949, term144949.getClass(), "value2", null);
        setField(term144949, term144949.getClass(), "value3", null);
        setField(term144949, term144949.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term144633;
        Object retValue = callMethod(klass, "equals", argTypes, term144401, args);
        assertTrue(recursiveEquals(term144401, term144945));
        assertTrue(recursiveEquals(term144633, term144949));
        assertTrue(recursiveEquals(retValue, false));
    }

};
