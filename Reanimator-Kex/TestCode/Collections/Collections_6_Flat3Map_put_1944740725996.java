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
import java.lang.Object;

public class Flat3Map_put_1944740725996 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term280429;
     Object term280705;

    public Flat3Map_put_1944740725996() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term280429 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term280521 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term280613 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term280429, term280429.getClass(), "delegateMap", null);
        setIntField(term280429, term280429.getClass(), "size", 3);
        setIntField(term280429, term280429.getClass(), "hash3", 0);
        setField(term280429, term280429.getClass(), "key3", null);
        setIntField(term280429, term280429.getClass(), "hash2", 0);
        setField(term280521, term280521.getClass(), "delegateMap", null);
        setIntField(term280521, term280521.getClass(), "size", 3);
        setField(term280521, term280521.getClass(), "key3", null);
        setField(term280521, term280521.getClass(), "value3", null);
        setField(term280429, term280429.getClass(), "key2", term280521);
        setIntField(term280429, term280429.getClass(), "hash1", 0);
        setField(term280613, term280613.getClass(), "delegateMap", null);
        setIntField(term280613, term280613.getClass(), "size", 0);
        setField(term280429, term280429.getClass(), "key1", term280613);
        term280705 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term280799 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        setField(term280705, term280705.getClass(), "delegateMap", null);
        setIntField(term280705, term280705.getClass(), "size", 3);
        setIntField(term280705, term280705.getClass(), "hash3", 0);
        setField(term280705, term280705.getClass(), "value3", null);
        setIntField(term280705, term280705.getClass(), "hash2", 0);
        setField(term280705, term280705.getClass(), "value2", null);
        setIntField(term280705, term280705.getClass(), "hash1", 0);
        setIntField(term280799, term280799.getClass(), "size", 0);
        setField(term280705, term280705.getClass(), "value1", term280799);
        setField(term280705, term280705.getClass(), "key3", null);
        setField(term280705, term280705.getClass(), "key2", null);
        setField(term280705, term280705.getClass(), "key1", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term280705;
        args[1] = null;
        callMethod(klass, "put", argTypes, term280429, args);
    }

};


