package org.jfree.data;

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
import org.jfree.data.UnknownKeyException;
import static org.jfree.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class KeyedObjects2D_getObject_8114537499 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18658;
     Object term18788;

    public KeyedObjects2D_getObject_8114537499() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term18710 = new ArrayList();
        term18658 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        setField(term18658, term18658.getClass(), "rowKeys", term18710);
        term18788 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.KeyedObjects2D");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Comparable");
        argTypes[1] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[2];
        args[0] = term18788;
        args[1] = term18788;
        try {
            callMethod(klass, "getObject", argTypes, term18658, args);
            assertTrue(false);
        }
        catch (UnknownKeyException e) {
        }

    }

};


