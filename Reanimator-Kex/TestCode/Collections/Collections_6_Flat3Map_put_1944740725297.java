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

public class Flat3Map_put_1944740725297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49334;
     Object term49356;
     Object term49357;

    public Flat3Map_put_1944740725297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49334 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term49334, term49334.getClass(), "delegateMap", null);
        setIntField(term49334, term49334.getClass(), "size", 2);
        setIntField(term49334, term49334.getClass(), "hash2", 0);
        setField(term49334, term49334.getClass(), "value2", null);
        setIntField(term49334, term49334.getClass(), "hash1", 0);
        setField(term49334, term49334.getClass(), "value1", null);
        setField(term49334, term49334.getClass(), "key2", term49334);
        term49356 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term49356, term49356.getClass(), "size", 2);
        setIntField(term49356, term49356.getClass(), "hash1", 0);
        setIntField(term49356, term49356.getClass(), "hash2", 0);
        setIntField(term49356, term49356.getClass(), "hash3", 0);
        setField(term49356, term49356.getClass(), "key1", null);
        setField(term49356, term49356.getClass(), "key2", term49356);
        setField(term49356, term49356.getClass(), "key3", null);
        setField(term49356, term49356.getClass(), "value1", null);
        setField(term49356, term49356.getClass(), "value2", null);
        setField(term49356, term49356.getClass(), "value3", null);
        setField(term49356, term49356.getClass(), "delegateMap", null);
        term49357 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term49357, term49357.getClass(), "size", 2);
        setIntField(term49357, term49357.getClass(), "hash1", 0);
        setIntField(term49357, term49357.getClass(), "hash2", 0);
        setIntField(term49357, term49357.getClass(), "hash3", 0);
        setField(term49357, term49357.getClass(), "key1", null);
        setField(term49357, term49357.getClass(), "key2", term49357);
        setField(term49357, term49357.getClass(), "key3", null);
        setField(term49357, term49357.getClass(), "value1", null);
        setField(term49357, term49357.getClass(), "value2", null);
        setField(term49357, term49357.getClass(), "value3", null);
        setField(term49357, term49357.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term49334;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term49334, args);
        assertTrue(recursiveEquals(term49334, term49356));
        assertTrue(recursiveEquals(term49334, term49357));
        assertTrue(recursiveEquals(retValue, null));
    }

};


