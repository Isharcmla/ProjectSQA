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
import java.lang.IndexOutOfBoundsException;
import static org.jfree.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Integer;

public class KeyedObjects2D_removeColumn_188587111037 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term208;
     Object term221;

    public KeyedObjects2D_removeColumn_188587111037() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term209 = new ArrayList();
        ArrayList term213 = new ArrayList();
        ArrayList term217 = new ArrayList();
        term208 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        setField(term208, term208.getClass(), "rowKeys", term209);
        setField(term208, term208.getClass(), "columnKeys", term213);
        setField(term208, term208.getClass(), "rows", term217);
        term221 = new Integer(-616727354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.KeyedObjects2D");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term221;
        try {
            callMethod(klass, "removeColumn", argTypes, term208, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


