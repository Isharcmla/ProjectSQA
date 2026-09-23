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

public class Flat3Map_put_1944740725268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43767;
     Object term43897;
     Object term44099;
     Object term44102;

    public Flat3Map_put_1944740725268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43767 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term43805 = newInstance(Class.forName("java.lang.Object"));
        setField(term43767, term43767.getClass(), "delegateMap", null);
        setIntField(term43767, term43767.getClass(), "size", 2);
        setIntField(term43767, term43767.getClass(), "hash2", 0);
        setField(term43767, term43767.getClass(), "key2", term43805);
        setIntField(term43767, term43767.getClass(), "hash1", -1);
        term43897 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term43897, term43897.getClass(), "delegateMap", null);
        setIntField(term43897, term43897.getClass(), "size", 2);
        setIntField(term43897, term43897.getClass(), "hash2", 0);
        setField(term43897, term43897.getClass(), "value2", null);
        setIntField(term43897, term43897.getClass(), "hash1", 0);
        setField(term43897, term43897.getClass(), "value1", null);
        term44099 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term44100 = newInstance(Class.forName("java.lang.Object"));
        Object term44101 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term44099, term44099.getClass(), "size", 3);
        setIntField(term44099, term44099.getClass(), "hash1", -1);
        setIntField(term44099, term44099.getClass(), "hash2", 0);
        setIntField(term44099, term44099.getClass(), "hash3", 0);
        setField(term44099, term44099.getClass(), "key1", null);
        setField(term44099, term44099.getClass(), "key2", term44100);
        setIntField(term44101, term44101.getClass(), "size", 2);
        setIntField(term44101, term44101.getClass(), "hash1", 0);
        setIntField(term44101, term44101.getClass(), "hash2", 0);
        setIntField(term44101, term44101.getClass(), "hash3", 0);
        setField(term44101, term44101.getClass(), "key1", null);
        setField(term44101, term44101.getClass(), "key2", null);
        setField(term44101, term44101.getClass(), "key3", null);
        setField(term44101, term44101.getClass(), "value1", null);
        setField(term44101, term44101.getClass(), "value2", null);
        setField(term44101, term44101.getClass(), "value3", null);
        setField(term44101, term44101.getClass(), "delegateMap", null);
        setField(term44099, term44099.getClass(), "key3", term44101);
        setField(term44099, term44099.getClass(), "value1", null);
        setField(term44099, term44099.getClass(), "value2", null);
        setField(term44099, term44099.getClass(), "value3", null);
        setField(term44099, term44099.getClass(), "delegateMap", null);
        term44102 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term44102, term44102.getClass(), "size", 2);
        setIntField(term44102, term44102.getClass(), "hash1", 0);
        setIntField(term44102, term44102.getClass(), "hash2", 0);
        setIntField(term44102, term44102.getClass(), "hash3", 0);
        setField(term44102, term44102.getClass(), "key1", null);
        setField(term44102, term44102.getClass(), "key2", null);
        setField(term44102, term44102.getClass(), "key3", null);
        setField(term44102, term44102.getClass(), "value1", null);
        setField(term44102, term44102.getClass(), "value2", null);
        setField(term44102, term44102.getClass(), "value3", null);
        setField(term44102, term44102.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term43897;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term43767, args);
        assertTrue(recursiveEquals(term43767, term44099));
        assertTrue(recursiveEquals(term43897, term44102));
        assertTrue(recursiveEquals(retValue, null));
    }

};


