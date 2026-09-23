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

public class Flat3Map_put_1944740725759 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term187358;
     Object term187434;

    public Flat3Map_put_1944740725759() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term187358 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term187358, term187358.getClass(), "delegateMap", null);
        setIntField(term187358, term187358.getClass(), "size", 2);
        term187434 = newInstance(Class.forName("java.util.stream.SliceOps$SliceTask"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term187434;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term187358, args);
        assertTrue(recursiveEquals(term187434, 0));
        assertTrue(recursiveEquals(retValue, null));
    }

};


