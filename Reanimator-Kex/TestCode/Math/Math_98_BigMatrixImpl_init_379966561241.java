package org.apache.commons.math.linear;

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
import java.lang.OutOfMemoryError;
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BigMatrixImpl_init_379966561241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91780;

    public BigMatrixImpl_init_379966561241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term91903 = newInstance(Class.forName("org.apache.commons.math.linear.BigMatrixImpl"));
        setField(term91903, term91903.getClass(), "data", null);
        setField(term91903, term91903.getClass(), "lu", null);
        setField(term91903, term91903.getClass(), "permutation", null);
        setIntField(term91903, term91903.getClass(), "parity", 0);
        setIntField(term91903, term91903.getClass(), "roundingMode", 0);
        setIntField(term91903, term91903.getClass(), "scale", 0);
        term91780 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.String"), 0).getClass(), 1);
        Object[] term91781 = (Object[]) newArray("java.lang.String", 1);
        setElement(term91781, 0, "");
        setElement(term91780, 0, term91781);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(Class.forName("java.lang.String"), 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term91780;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (OutOfMemoryError e) {
        }

    }

};


