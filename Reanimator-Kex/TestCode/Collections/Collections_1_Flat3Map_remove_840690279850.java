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

public class Flat3Map_remove_840690279850 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term171001;
     Object term172112;

    public Flat3Map_remove_840690279850() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term171001 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term171093 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term171185 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term171001, term171001.getClass(), "delegateMap", null);
        setIntField(term171001, term171001.getClass(), "size", 3);
        setField(term171001, term171001.getClass(), "key3", term171093);
        setField(term171001, term171001.getClass(), "key2", term171185);
        term172112 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term172113 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term172114 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term172112, term172112.getClass(), "size", 2);
        setIntField(term172112, term172112.getClass(), "hash1", 0);
        setIntField(term172112, term172112.getClass(), "hash2", 0);
        setIntField(term172112, term172112.getClass(), "hash3", 0);
        setIntField(term172113, term172113.getClass(), "size", 0);
        setIntField(term172113, term172113.getClass(), "hash1", 0);
        setIntField(term172113, term172113.getClass(), "hash2", 0);
        setIntField(term172113, term172113.getClass(), "hash3", 0);
        setField(term172113, term172113.getClass(), "key1", null);
        setField(term172113, term172113.getClass(), "key2", null);
        setField(term172113, term172113.getClass(), "key3", null);
        setField(term172113, term172113.getClass(), "value1", null);
        setField(term172113, term172113.getClass(), "value2", null);
        setField(term172113, term172113.getClass(), "value3", null);
        setField(term172113, term172113.getClass(), "delegateMap", null);
        setField(term172112, term172112.getClass(), "key1", term172113);
        setIntField(term172114, term172114.getClass(), "size", 0);
        setIntField(term172114, term172114.getClass(), "hash1", 0);
        setIntField(term172114, term172114.getClass(), "hash2", 0);
        setIntField(term172114, term172114.getClass(), "hash3", 0);
        setField(term172114, term172114.getClass(), "key1", null);
        setField(term172114, term172114.getClass(), "key2", null);
        setField(term172114, term172114.getClass(), "key3", null);
        setField(term172114, term172114.getClass(), "value1", null);
        setField(term172114, term172114.getClass(), "value2", null);
        setField(term172114, term172114.getClass(), "value3", null);
        setField(term172114, term172114.getClass(), "delegateMap", null);
        setField(term172112, term172112.getClass(), "key2", term172114);
        setField(term172112, term172112.getClass(), "key3", null);
        setField(term172112, term172112.getClass(), "value1", null);
        setField(term172112, term172112.getClass(), "value2", null);
        setField(term172112, term172112.getClass(), "value3", null);
        setField(term172112, term172112.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "remove", argTypes, term171001, args);
        assertTrue(recursiveEquals(term171001, term172112));
        assertTrue(recursiveEquals(retValue, null));
    }

};
