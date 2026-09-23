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

public class Flat3Map_put_1944740725465 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85125;
     Object term85439;
     Object term85545;
     Object term85549;

    public Flat3Map_put_1944740725465() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85125 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term85217 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term85255 = newInstance(Class.forName("java.lang.Object"));
        Object term85347 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term85125, term85125.getClass(), "delegateMap", null);
        setIntField(term85125, term85125.getClass(), "size", 3);
        setIntField(term85125, term85125.getClass(), "hash3", 0);
        setField(term85217, term85217.getClass(), "delegateMap", null);
        setIntField(term85217, term85217.getClass(), "size", -4);
        setField(term85125, term85125.getClass(), "key3", term85217);
        setIntField(term85125, term85125.getClass(), "hash2", 0);
        setField(term85125, term85125.getClass(), "key2", term85255);
        setIntField(term85125, term85125.getClass(), "hash1", 0);
        setField(term85347, term85347.getClass(), "delegateMap", null);
        setIntField(term85347, term85347.getClass(), "size", 3);
        setField(term85125, term85125.getClass(), "key1", term85347);
        term85439 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term85439, term85439.getClass(), "delegateMap", null);
        setIntField(term85439, term85439.getClass(), "size", 3);
        setIntField(term85439, term85439.getClass(), "hash3", 0);
        setField(term85439, term85439.getClass(), "value3", null);
        setIntField(term85439, term85439.getClass(), "hash2", 0);
        setField(term85439, term85439.getClass(), "value2", null);
        setIntField(term85439, term85439.getClass(), "hash1", 0);
        setField(term85439, term85439.getClass(), "value1", null);
        term85545 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term85546 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term85547 = newInstance(Class.forName("java.lang.Object"));
        Object term85548 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term85545, term85545.getClass(), "size", 3);
        setIntField(term85545, term85545.getClass(), "hash1", 0);
        setIntField(term85545, term85545.getClass(), "hash2", 0);
        setIntField(term85545, term85545.getClass(), "hash3", 0);
        setIntField(term85546, term85546.getClass(), "size", 3);
        setIntField(term85546, term85546.getClass(), "hash1", 0);
        setIntField(term85546, term85546.getClass(), "hash2", 0);
        setIntField(term85546, term85546.getClass(), "hash3", 0);
        setField(term85546, term85546.getClass(), "key1", null);
        setField(term85546, term85546.getClass(), "key2", null);
        setField(term85546, term85546.getClass(), "key3", null);
        setField(term85546, term85546.getClass(), "value1", null);
        setField(term85546, term85546.getClass(), "value2", null);
        setField(term85546, term85546.getClass(), "value3", null);
        setField(term85546, term85546.getClass(), "delegateMap", null);
        setField(term85545, term85545.getClass(), "key1", term85546);
        setField(term85545, term85545.getClass(), "key2", term85547);
        setIntField(term85548, term85548.getClass(), "size", -4);
        setIntField(term85548, term85548.getClass(), "hash1", 0);
        setIntField(term85548, term85548.getClass(), "hash2", 0);
        setIntField(term85548, term85548.getClass(), "hash3", 0);
        setField(term85548, term85548.getClass(), "key1", null);
        setField(term85548, term85548.getClass(), "key2", null);
        setField(term85548, term85548.getClass(), "key3", null);
        setField(term85548, term85548.getClass(), "value1", null);
        setField(term85548, term85548.getClass(), "value2", null);
        setField(term85548, term85548.getClass(), "value3", null);
        setField(term85548, term85548.getClass(), "delegateMap", null);
        setField(term85545, term85545.getClass(), "key3", term85548);
        setField(term85545, term85545.getClass(), "value1", null);
        setField(term85545, term85545.getClass(), "value2", null);
        setField(term85545, term85545.getClass(), "value3", null);
        setField(term85545, term85545.getClass(), "delegateMap", null);
        term85549 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term85549, term85549.getClass(), "size", 3);
        setIntField(term85549, term85549.getClass(), "hash1", 0);
        setIntField(term85549, term85549.getClass(), "hash2", 0);
        setIntField(term85549, term85549.getClass(), "hash3", 0);
        setField(term85549, term85549.getClass(), "key1", null);
        setField(term85549, term85549.getClass(), "key2", null);
        setField(term85549, term85549.getClass(), "key3", null);
        setField(term85549, term85549.getClass(), "value1", null);
        setField(term85549, term85549.getClass(), "value2", null);
        setField(term85549, term85549.getClass(), "value3", null);
        setField(term85549, term85549.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term85439;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term85125, args);
        assertTrue(recursiveEquals(term85125, term85545));
        assertTrue(recursiveEquals(term85439, term85549));
        assertTrue(recursiveEquals(retValue, null));
    }

};


