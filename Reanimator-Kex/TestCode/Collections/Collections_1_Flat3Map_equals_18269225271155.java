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

public class Flat3Map_equals_18269225271155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term250797;
     Object term250985;
     Object term251096;
     Object term251100;

    public Flat3Map_equals_18269225271155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term251009 = new HashMap();
        HashMap term250893 = new HashMap();
        term250797 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term250797, term250797.getClass(), "delegateMap", null);
        setIntField(term250797, term250797.getClass(), "size", 2);
        setField(term250797, term250797.getClass(), "key2", term251009);
        setField(term250797, term250797.getClass(), "value2", null);
        setField(term250797, term250797.getClass(), "key1", term251009);
        setField(term250797, term250797.getClass(), "value1", term250893);
        term250985 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term250985, term250985.getClass(), "delegateMap", null);
        setIntField(term250985, term250985.getClass(), "size", 2);
        setIntField(term250985, term250985.getClass(), "hash2", 0);
        setField(term250985, term250985.getClass(), "key2", term251009);
        setField(term250985, term250985.getClass(), "value2", null);
        HashMap term251097 = new HashMap();
        HashMap term251099 = new HashMap();
        term251096 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term251096, term251096.getClass(), "size", 2);
        setIntField(term251096, term251096.getClass(), "hash1", 0);
        setIntField(term251096, term251096.getClass(), "hash2", 0);
        setIntField(term251096, term251096.getClass(), "hash3", 0);
        setField(term251096, term251096.getClass(), "key1", term251097);
        setField(term251096, term251096.getClass(), "key2", term251097);
        setField(term251096, term251096.getClass(), "key3", null);
        setField(term251096, term251096.getClass(), "value1", term251099);
        setField(term251096, term251096.getClass(), "value2", null);
        setField(term251096, term251096.getClass(), "value3", null);
        setField(term251096, term251096.getClass(), "delegateMap", null);
        HashMap term251101 = new HashMap();
        term251100 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term251100, term251100.getClass(), "size", 2);
        setIntField(term251100, term251100.getClass(), "hash1", 0);
        setIntField(term251100, term251100.getClass(), "hash2", 0);
        setIntField(term251100, term251100.getClass(), "hash3", 0);
        setField(term251100, term251100.getClass(), "key1", null);
        setField(term251100, term251100.getClass(), "key2", term251101);
        setField(term251100, term251100.getClass(), "key3", null);
        setField(term251100, term251100.getClass(), "value1", null);
        setField(term251100, term251100.getClass(), "value2", null);
        setField(term251100, term251100.getClass(), "value3", null);
        setField(term251100, term251100.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term250985;
        Object retValue = callMethod(klass, "equals", argTypes, term250797, args);
        assertTrue(recursiveEquals(term250797, term251096));
        assertTrue(recursiveEquals(term250985, term251100));
        assertTrue(recursiveEquals(retValue, false));
    }

};
