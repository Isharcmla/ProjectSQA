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

public class Flat3Map_put_1944740725438 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78918;
     Object term79010;
     Object term79451;
     Object term79452;

    public Flat3Map_put_1944740725438() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78918 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term78918, term78918.getClass(), "delegateMap", null);
        setIntField(term78918, term78918.getClass(), "size", 2);
        setIntField(term78918, term78918.getClass(), "hash2", 0);
        setField(term78918, term78918.getClass(), "key2", term78918);
        term79010 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term79010, term79010.getClass(), "delegateMap", null);
        setIntField(term79010, term79010.getClass(), "size", 2);
        setIntField(term79010, term79010.getClass(), "hash2", 0);
        setField(term79010, term79010.getClass(), "value2", null);
        setIntField(term79010, term79010.getClass(), "hash1", 0);
        setField(term79010, term79010.getClass(), "value1", null);
        term79451 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term79451, term79451.getClass(), "size", 2);
        setIntField(term79451, term79451.getClass(), "hash1", 0);
        setIntField(term79451, term79451.getClass(), "hash2", 0);
        setIntField(term79451, term79451.getClass(), "hash3", 0);
        setField(term79451, term79451.getClass(), "key1", null);
        setField(term79451, term79451.getClass(), "key2", term79451);
        setField(term79451, term79451.getClass(), "key3", null);
        setField(term79451, term79451.getClass(), "value1", null);
        setField(term79451, term79451.getClass(), "value2", null);
        setField(term79451, term79451.getClass(), "value3", null);
        setField(term79451, term79451.getClass(), "delegateMap", null);
        term79452 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term79452, term79452.getClass(), "size", 2);
        setIntField(term79452, term79452.getClass(), "hash1", 0);
        setIntField(term79452, term79452.getClass(), "hash2", 0);
        setIntField(term79452, term79452.getClass(), "hash3", 0);
        setField(term79452, term79452.getClass(), "key1", null);
        setField(term79452, term79452.getClass(), "key2", null);
        setField(term79452, term79452.getClass(), "key3", null);
        setField(term79452, term79452.getClass(), "value1", null);
        setField(term79452, term79452.getClass(), "value2", null);
        setField(term79452, term79452.getClass(), "value3", null);
        setField(term79452, term79452.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term79010;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term78918, args);
        assertTrue(recursiveEquals(term78918, term79451));
        assertTrue(recursiveEquals(term79010, term79452));
        assertTrue(recursiveEquals(retValue, null));
    }

};


