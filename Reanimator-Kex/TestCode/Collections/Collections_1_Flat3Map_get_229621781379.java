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

public class Flat3Map_get_229621781379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68981;
     Object term69257;
     Object term69412;
     Object term69415;

    public Flat3Map_get_229621781379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68981 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term69073 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term69165 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term68981, term68981.getClass(), "delegateMap", null);
        setIntField(term68981, term68981.getClass(), "size", 2);
        setIntField(term68981, term68981.getClass(), "hash2", 0);
        setField(term69073, term69073.getClass(), "delegateMap", null);
        setIntField(term69073, term69073.getClass(), "size", -3);
        setField(term68981, term68981.getClass(), "key2", term69073);
        setIntField(term68981, term68981.getClass(), "hash1", 0);
        setField(term68981, term68981.getClass(), "key1", term69165);
        term69257 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term69257, term69257.getClass(), "delegateMap", null);
        setIntField(term69257, term69257.getClass(), "size", 2);
        setIntField(term69257, term69257.getClass(), "hash2", 0);
        setField(term69257, term69257.getClass(), "value2", null);
        setIntField(term69257, term69257.getClass(), "hash1", 0);
        setField(term69257, term69257.getClass(), "value1", null);
        term69412 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term69413 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term69414 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term69412, term69412.getClass(), "size", 2);
        setIntField(term69412, term69412.getClass(), "hash1", 0);
        setIntField(term69412, term69412.getClass(), "hash2", 0);
        setIntField(term69412, term69412.getClass(), "hash3", 0);
        setIntField(term69413, term69413.getClass(), "size", 0);
        setIntField(term69413, term69413.getClass(), "hash1", 0);
        setIntField(term69413, term69413.getClass(), "hash2", 0);
        setIntField(term69413, term69413.getClass(), "hash3", 0);
        setField(term69413, term69413.getClass(), "key1", null);
        setField(term69413, term69413.getClass(), "key2", null);
        setField(term69413, term69413.getClass(), "key3", null);
        setField(term69413, term69413.getClass(), "value1", null);
        setField(term69413, term69413.getClass(), "value2", null);
        setField(term69413, term69413.getClass(), "value3", null);
        setField(term69413, term69413.getClass(), "delegateMap", null);
        setField(term69412, term69412.getClass(), "key1", term69413);
        setIntField(term69414, term69414.getClass(), "size", -3);
        setIntField(term69414, term69414.getClass(), "hash1", 0);
        setIntField(term69414, term69414.getClass(), "hash2", 0);
        setIntField(term69414, term69414.getClass(), "hash3", 0);
        setField(term69414, term69414.getClass(), "key1", null);
        setField(term69414, term69414.getClass(), "key2", null);
        setField(term69414, term69414.getClass(), "key3", null);
        setField(term69414, term69414.getClass(), "value1", null);
        setField(term69414, term69414.getClass(), "value2", null);
        setField(term69414, term69414.getClass(), "value3", null);
        setField(term69414, term69414.getClass(), "delegateMap", null);
        setField(term69412, term69412.getClass(), "key2", term69414);
        setField(term69412, term69412.getClass(), "key3", null);
        setField(term69412, term69412.getClass(), "value1", null);
        setField(term69412, term69412.getClass(), "value2", null);
        setField(term69412, term69412.getClass(), "value3", null);
        setField(term69412, term69412.getClass(), "delegateMap", null);
        term69415 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term69415, term69415.getClass(), "size", 2);
        setIntField(term69415, term69415.getClass(), "hash1", 0);
        setIntField(term69415, term69415.getClass(), "hash2", 0);
        setIntField(term69415, term69415.getClass(), "hash3", 0);
        setField(term69415, term69415.getClass(), "key1", null);
        setField(term69415, term69415.getClass(), "key2", null);
        setField(term69415, term69415.getClass(), "key3", null);
        setField(term69415, term69415.getClass(), "value1", null);
        setField(term69415, term69415.getClass(), "value2", null);
        setField(term69415, term69415.getClass(), "value3", null);
        setField(term69415, term69415.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term69257;
        Object retValue = callMethod(klass, "get", argTypes, term68981, args);
        assertTrue(recursiveEquals(term68981, term69412));
        assertTrue(recursiveEquals(term69257, term69415));
        assertTrue(recursiveEquals(retValue, null));
    }

};
