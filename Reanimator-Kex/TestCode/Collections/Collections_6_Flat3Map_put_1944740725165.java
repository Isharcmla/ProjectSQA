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

public class Flat3Map_put_1944740725165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27764;
     Object term27839;

    public Flat3Map_put_1944740725165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27764 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term27764, term27764.getClass(), "delegateMap", null);
        setIntField(term27764, term27764.getClass(), "size", 3);
        term27839 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term27839, term27839.getClass(), "size", 3);
        setIntField(term27839, term27839.getClass(), "hash1", 0);
        setIntField(term27839, term27839.getClass(), "hash2", 0);
        setIntField(term27839, term27839.getClass(), "hash3", 0);
        setField(term27839, term27839.getClass(), "key1", null);
        setField(term27839, term27839.getClass(), "key2", null);
        setField(term27839, term27839.getClass(), "key3", null);
        setField(term27839, term27839.getClass(), "value1", null);
        setField(term27839, term27839.getClass(), "value2", null);
        setField(term27839, term27839.getClass(), "value3", null);
        setField(term27839, term27839.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term27764, args);
        assertTrue(recursiveEquals(term27764, term27839));
        assertTrue(recursiveEquals(retValue, null));
    }

};


