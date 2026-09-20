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

public class Flat3Map_remove_840690279992 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198084;
     Object term198539;
     Object term198541;

    public Flat3Map_remove_840690279992() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term198084 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term198144 = newInstance(Class.forName("org.apache.commons.collections.MultiHashMap$ValueIterator"));
        setField(term198084, term198084.getClass(), "delegateMap", null);
        setIntField(term198084, term198084.getClass(), "size", 1);
        setIntField(term198084, term198084.getClass(), "hash1", 0);
        setField(term198084, term198084.getClass(), "value1", term198144);
        term198539 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term198540 = newInstance(Class.forName("org.apache.commons.collections.MultiHashMap$ValueIterator"));
        setIntField(term198539, term198539.getClass(), "size", 1);
        setIntField(term198539, term198539.getClass(), "hash1", 0);
        setIntField(term198539, term198539.getClass(), "hash2", 0);
        setIntField(term198539, term198539.getClass(), "hash3", 0);
        setField(term198539, term198539.getClass(), "key1", null);
        setField(term198539, term198539.getClass(), "key2", null);
        setField(term198539, term198539.getClass(), "key3", null);
        setField(term198540, term198540.getClass(), "backedIterator", null);
        setField(term198540, term198540.getClass(), "tempIterator", null);
        setField(term198540, term198540.getClass(), "this$0", null);
        setField(term198539, term198539.getClass(), "value1", term198540);
        setField(term198539, term198539.getClass(), "value2", null);
        setField(term198539, term198539.getClass(), "value3", null);
        setField(term198539, term198539.getClass(), "delegateMap", null);
        term198541 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term198542 = newInstance(Class.forName("org.apache.commons.collections.MultiHashMap$ValueIterator"));
        setIntField(term198541, term198541.getClass(), "size", 1);
        setIntField(term198541, term198541.getClass(), "hash1", 0);
        setIntField(term198541, term198541.getClass(), "hash2", 0);
        setIntField(term198541, term198541.getClass(), "hash3", 0);
        setField(term198541, term198541.getClass(), "key1", null);
        setField(term198541, term198541.getClass(), "key2", null);
        setField(term198541, term198541.getClass(), "key3", null);
        setField(term198542, term198542.getClass(), "backedIterator", null);
        setField(term198542, term198542.getClass(), "tempIterator", null);
        setField(term198542, term198542.getClass(), "this$0", null);
        setField(term198541, term198541.getClass(), "value1", term198542);
        setField(term198541, term198541.getClass(), "value2", null);
        setField(term198541, term198541.getClass(), "value3", null);
        setField(term198541, term198541.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term198084;
        Object retValue = callMethod(klass, "remove", argTypes, term198084, args);
        assertTrue(recursiveEquals(term198084, term198539));
        assertTrue(recursiveEquals(term198084, term198541));
        assertTrue(recursiveEquals(retValue, null));
    }

};
