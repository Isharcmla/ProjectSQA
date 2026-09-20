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

public class Flat3Map_get_229621781228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39683;
     Object term39905;
     Object term40125;
     Object term40128;

    public Flat3Map_get_229621781228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39683 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term39721 = newInstance(Class.forName("java.lang.Object"));
        Object term39813 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term39683, term39683.getClass(), "delegateMap", null);
        setIntField(term39683, term39683.getClass(), "size", 2);
        setIntField(term39683, term39683.getClass(), "hash2", 0);
        setField(term39683, term39683.getClass(), "key2", term39721);
        setIntField(term39683, term39683.getClass(), "hash1", 0);
        setField(term39683, term39683.getClass(), "key1", term39813);
        term39905 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term39905, term39905.getClass(), "delegateMap", null);
        setIntField(term39905, term39905.getClass(), "size", 2);
        setIntField(term39905, term39905.getClass(), "hash2", 0);
        setField(term39905, term39905.getClass(), "value2", null);
        setIntField(term39905, term39905.getClass(), "hash1", 0);
        setField(term39905, term39905.getClass(), "value1", null);
        term40125 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term40126 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term40127 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term40125, term40125.getClass(), "size", 2);
        setIntField(term40125, term40125.getClass(), "hash1", 0);
        setIntField(term40125, term40125.getClass(), "hash2", 0);
        setIntField(term40125, term40125.getClass(), "hash3", 0);
        setIntField(term40126, term40126.getClass(), "size", 0);
        setIntField(term40126, term40126.getClass(), "hash1", 0);
        setIntField(term40126, term40126.getClass(), "hash2", 0);
        setIntField(term40126, term40126.getClass(), "hash3", 0);
        setField(term40126, term40126.getClass(), "key1", null);
        setField(term40126, term40126.getClass(), "key2", null);
        setField(term40126, term40126.getClass(), "key3", null);
        setField(term40126, term40126.getClass(), "value1", null);
        setField(term40126, term40126.getClass(), "value2", null);
        setField(term40126, term40126.getClass(), "value3", null);
        setField(term40126, term40126.getClass(), "delegateMap", null);
        setField(term40125, term40125.getClass(), "key1", term40126);
        setField(term40125, term40125.getClass(), "key2", term40127);
        setField(term40125, term40125.getClass(), "key3", null);
        setField(term40125, term40125.getClass(), "value1", null);
        setField(term40125, term40125.getClass(), "value2", null);
        setField(term40125, term40125.getClass(), "value3", null);
        setField(term40125, term40125.getClass(), "delegateMap", null);
        term40128 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term40128, term40128.getClass(), "size", 2);
        setIntField(term40128, term40128.getClass(), "hash1", 0);
        setIntField(term40128, term40128.getClass(), "hash2", 0);
        setIntField(term40128, term40128.getClass(), "hash3", 0);
        setField(term40128, term40128.getClass(), "key1", null);
        setField(term40128, term40128.getClass(), "key2", null);
        setField(term40128, term40128.getClass(), "key3", null);
        setField(term40128, term40128.getClass(), "value1", null);
        setField(term40128, term40128.getClass(), "value2", null);
        setField(term40128, term40128.getClass(), "value3", null);
        setField(term40128, term40128.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term39905;
        Object retValue = callMethod(klass, "get", argTypes, term39683, args);
        assertTrue(recursiveEquals(term39683, term40125));
        assertTrue(recursiveEquals(term39905, term40128));
        assertTrue(recursiveEquals(retValue, null));
    }

};
