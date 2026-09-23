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

public class Flat3Map_put_1944740725286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46990;
     Object term47082;
     Object term47454;
     Object term47455;

    public Flat3Map_put_1944740725286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46990 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term46990, term46990.getClass(), "delegateMap", null);
        setIntField(term46990, term46990.getClass(), "size", 3);
        setIntField(term46990, term46990.getClass(), "hash3", 0);
        setField(term46990, term46990.getClass(), "key3", term46990);
        term47082 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term47082, term47082.getClass(), "delegateMap", null);
        setIntField(term47082, term47082.getClass(), "size", 3);
        setIntField(term47082, term47082.getClass(), "hash3", 0);
        setField(term47082, term47082.getClass(), "value3", null);
        setIntField(term47082, term47082.getClass(), "hash2", 0);
        setField(term47082, term47082.getClass(), "value2", null);
        setIntField(term47082, term47082.getClass(), "hash1", 0);
        setField(term47082, term47082.getClass(), "value1", null);
        term47454 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term47454, term47454.getClass(), "size", 3);
        setIntField(term47454, term47454.getClass(), "hash1", 0);
        setIntField(term47454, term47454.getClass(), "hash2", 0);
        setIntField(term47454, term47454.getClass(), "hash3", 0);
        setField(term47454, term47454.getClass(), "key1", null);
        setField(term47454, term47454.getClass(), "key2", null);
        setField(term47454, term47454.getClass(), "key3", term47454);
        setField(term47454, term47454.getClass(), "value1", null);
        setField(term47454, term47454.getClass(), "value2", null);
        setField(term47454, term47454.getClass(), "value3", null);
        setField(term47454, term47454.getClass(), "delegateMap", null);
        term47455 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term47455, term47455.getClass(), "size", 3);
        setIntField(term47455, term47455.getClass(), "hash1", 0);
        setIntField(term47455, term47455.getClass(), "hash2", 0);
        setIntField(term47455, term47455.getClass(), "hash3", 0);
        setField(term47455, term47455.getClass(), "key1", null);
        setField(term47455, term47455.getClass(), "key2", null);
        setField(term47455, term47455.getClass(), "key3", null);
        setField(term47455, term47455.getClass(), "value1", null);
        setField(term47455, term47455.getClass(), "value2", null);
        setField(term47455, term47455.getClass(), "value3", null);
        setField(term47455, term47455.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term47082;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term46990, args);
        assertTrue(recursiveEquals(term46990, term47454));
        assertTrue(recursiveEquals(term47082, term47455));
        assertTrue(recursiveEquals(retValue, null));
    }

};


