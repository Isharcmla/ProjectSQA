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

public class Flat3Map_put_1944740725487 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90981;
     Object term91112;
     Object term91113;

    public Flat3Map_put_1944740725487() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90981 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term90981, term90981.getClass(), "delegateMap", null);
        setIntField(term90981, term90981.getClass(), "size", 2);
        setIntField(term90981, term90981.getClass(), "hash2", 0);
        setField(term90981, term90981.getClass(), "value2", null);
        setIntField(term90981, term90981.getClass(), "hash1", 0);
        setField(term90981, term90981.getClass(), "value1", null);
        term91112 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term91112, term91112.getClass(), "size", 3);
        setIntField(term91112, term91112.getClass(), "hash1", 0);
        setIntField(term91112, term91112.getClass(), "hash2", 0);
        setIntField(term91112, term91112.getClass(), "hash3", 0);
        setField(term91112, term91112.getClass(), "key1", null);
        setField(term91112, term91112.getClass(), "key2", null);
        setField(term91112, term91112.getClass(), "key3", term91112);
        setField(term91112, term91112.getClass(), "value1", null);
        setField(term91112, term91112.getClass(), "value2", null);
        setField(term91112, term91112.getClass(), "value3", null);
        setField(term91112, term91112.getClass(), "delegateMap", null);
        term91113 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term91113, term91113.getClass(), "size", 3);
        setIntField(term91113, term91113.getClass(), "hash1", 0);
        setIntField(term91113, term91113.getClass(), "hash2", 0);
        setIntField(term91113, term91113.getClass(), "hash3", 0);
        setField(term91113, term91113.getClass(), "key1", null);
        setField(term91113, term91113.getClass(), "key2", null);
        setField(term91113, term91113.getClass(), "key3", term91113);
        setField(term91113, term91113.getClass(), "value1", null);
        setField(term91113, term91113.getClass(), "value2", null);
        setField(term91113, term91113.getClass(), "value3", null);
        setField(term91113, term91113.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term90981;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term90981, args);
        assertTrue(recursiveEquals(term90981, term91112));
        assertTrue(recursiveEquals(term90981, term91113));
        assertTrue(recursiveEquals(retValue, null));
    }

};


