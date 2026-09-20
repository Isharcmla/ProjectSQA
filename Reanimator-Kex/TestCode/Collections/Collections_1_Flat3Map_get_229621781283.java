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

public class Flat3Map_get_229621781283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50412;
     Object term50626;
     Object term50709;
     Object term50713;

    public Flat3Map_get_229621781283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50412 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term50450 = newInstance(Class.forName("java.lang.Object"));
        Object term50488 = newInstance(Class.forName("java.lang.Object"));
        term50626 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term50412, term50412.getClass(), "delegateMap", null);
        setIntField(term50412, term50412.getClass(), "size", 3);
        setIntField(term50412, term50412.getClass(), "hash3", 0);
        setField(term50412, term50412.getClass(), "key3", term50450);
        setIntField(term50412, term50412.getClass(), "hash2", 0);
        setField(term50412, term50412.getClass(), "key2", term50488);
        setIntField(term50412, term50412.getClass(), "hash1", 0);
        setField(term50626, term50626.getClass(), "delegateMap", null);
        setIntField(term50626, term50626.getClass(), "size", 3);
        setIntField(term50626, term50626.getClass(), "hash3", 0);
        setField(term50626, term50626.getClass(), "value3", null);
        setIntField(term50626, term50626.getClass(), "hash2", 0);
        setField(term50626, term50626.getClass(), "value2", null);
        setIntField(term50626, term50626.getClass(), "hash1", 0);
        setField(term50626, term50626.getClass(), "value1", null);
        setField(term50412, term50412.getClass(), "key1", term50626);
        term50709 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term50710 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term50711 = newInstance(Class.forName("java.lang.Object"));
        Object term50712 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term50709, term50709.getClass(), "size", 3);
        setIntField(term50709, term50709.getClass(), "hash1", 0);
        setIntField(term50709, term50709.getClass(), "hash2", 0);
        setIntField(term50709, term50709.getClass(), "hash3", 0);
        setIntField(term50710, term50710.getClass(), "size", 3);
        setIntField(term50710, term50710.getClass(), "hash1", 0);
        setIntField(term50710, term50710.getClass(), "hash2", 0);
        setIntField(term50710, term50710.getClass(), "hash3", 0);
        setField(term50710, term50710.getClass(), "key1", null);
        setField(term50710, term50710.getClass(), "key2", null);
        setField(term50710, term50710.getClass(), "key3", null);
        setField(term50710, term50710.getClass(), "value1", null);
        setField(term50710, term50710.getClass(), "value2", null);
        setField(term50710, term50710.getClass(), "value3", null);
        setField(term50710, term50710.getClass(), "delegateMap", null);
        setField(term50709, term50709.getClass(), "key1", term50710);
        setField(term50709, term50709.getClass(), "key2", term50711);
        setField(term50709, term50709.getClass(), "key3", term50712);
        setField(term50709, term50709.getClass(), "value1", null);
        setField(term50709, term50709.getClass(), "value2", null);
        setField(term50709, term50709.getClass(), "value3", null);
        setField(term50709, term50709.getClass(), "delegateMap", null);
        term50713 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term50713, term50713.getClass(), "size", 3);
        setIntField(term50713, term50713.getClass(), "hash1", 0);
        setIntField(term50713, term50713.getClass(), "hash2", 0);
        setIntField(term50713, term50713.getClass(), "hash3", 0);
        setField(term50713, term50713.getClass(), "key1", null);
        setField(term50713, term50713.getClass(), "key2", null);
        setField(term50713, term50713.getClass(), "key3", null);
        setField(term50713, term50713.getClass(), "value1", null);
        setField(term50713, term50713.getClass(), "value2", null);
        setField(term50713, term50713.getClass(), "value3", null);
        setField(term50713, term50713.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term50626;
        Object retValue = callMethod(klass, "get", argTypes, term50412, args);
        assertTrue(recursiveEquals(term50412, term50709));
        assertTrue(recursiveEquals(term50626, term50713));
        assertTrue(recursiveEquals(retValue, null));
    }

};
