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
import java.lang.NullPointerException;
import static org.apache.commons.collections.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Flat3Map_put_1944740725130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21654;
     Object term21892;

    public Flat3Map_put_1944740725130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21654 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term21764 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term21654, term21654.getClass(), "delegateMap", term21764);
        term21892 = newInstance(Class.forName("java.util.concurrent.ExecutorCompletionService$QueueingFuture"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term21892;
        args[1] = null;
        try {
            callMethod(klass, "put", argTypes, term21654, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
