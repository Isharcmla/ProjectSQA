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

public class Flat3Map_get_229621781282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50078;
     Object term50254;
     Object term50662;
     Object term50665;

    public Flat3Map_get_229621781282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50078 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term50116 = newInstance(Class.forName("java.lang.Object"));
        term50254 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term50078, term50078.getClass(), "delegateMap", null);
        setIntField(term50078, term50078.getClass(), "size", 3);
        setIntField(term50078, term50078.getClass(), "hash3", 0);
        setField(term50078, term50078.getClass(), "key3", term50116);
        setIntField(term50078, term50078.getClass(), "hash2", 0);
        setField(term50254, term50254.getClass(), "delegateMap", null);
        setIntField(term50254, term50254.getClass(), "size", 3);
        setIntField(term50254, term50254.getClass(), "hash3", 0);
        setField(term50254, term50254.getClass(), "value3", null);
        setIntField(term50254, term50254.getClass(), "hash2", 0);
        setField(term50254, term50254.getClass(), "value2", null);
        setIntField(term50254, term50254.getClass(), "hash1", 0);
        setField(term50254, term50254.getClass(), "value1", null);
        setField(term50078, term50078.getClass(), "key2", term50254);
        term50662 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term50663 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term50664 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term50662, term50662.getClass(), "size", 3);
        setIntField(term50662, term50662.getClass(), "hash1", 0);
        setIntField(term50662, term50662.getClass(), "hash2", 0);
        setIntField(term50662, term50662.getClass(), "hash3", 0);
        setField(term50662, term50662.getClass(), "key1", null);
        setIntField(term50663, term50663.getClass(), "size", 3);
        setIntField(term50663, term50663.getClass(), "hash1", 0);
        setIntField(term50663, term50663.getClass(), "hash2", 0);
        setIntField(term50663, term50663.getClass(), "hash3", 0);
        setField(term50663, term50663.getClass(), "key1", null);
        setField(term50663, term50663.getClass(), "key2", null);
        setField(term50663, term50663.getClass(), "key3", null);
        setField(term50663, term50663.getClass(), "value1", null);
        setField(term50663, term50663.getClass(), "value2", null);
        setField(term50663, term50663.getClass(), "value3", null);
        setField(term50663, term50663.getClass(), "delegateMap", null);
        setField(term50662, term50662.getClass(), "key2", term50663);
        setField(term50662, term50662.getClass(), "key3", term50664);
        setField(term50662, term50662.getClass(), "value1", null);
        setField(term50662, term50662.getClass(), "value2", null);
        setField(term50662, term50662.getClass(), "value3", null);
        setField(term50662, term50662.getClass(), "delegateMap", null);
        term50665 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term50665, term50665.getClass(), "size", 3);
        setIntField(term50665, term50665.getClass(), "hash1", 0);
        setIntField(term50665, term50665.getClass(), "hash2", 0);
        setIntField(term50665, term50665.getClass(), "hash3", 0);
        setField(term50665, term50665.getClass(), "key1", null);
        setField(term50665, term50665.getClass(), "key2", null);
        setField(term50665, term50665.getClass(), "key3", null);
        setField(term50665, term50665.getClass(), "value1", null);
        setField(term50665, term50665.getClass(), "value2", null);
        setField(term50665, term50665.getClass(), "value3", null);
        setField(term50665, term50665.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term50254;
        Object retValue = callMethod(klass, "get", argTypes, term50078, args);
        assertTrue(recursiveEquals(term50078, term50662));
        assertTrue(recursiveEquals(term50254, term50665));
        assertTrue(recursiveEquals(retValue, null));
    }

};
