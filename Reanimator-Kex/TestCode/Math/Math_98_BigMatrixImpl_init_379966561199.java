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
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BigMatrixImpl_init_379966561199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89696;

    public BigMatrixImpl_init_379966561199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term89829 = newInstance(Class.forName("org.apache.commons.math.linear.BigMatrixImpl"));
        int[] term89702 = (int[]) newIntArray(0);
        setField(term89829, term89829.getClass(), "data", null);
        setField(term89829, term89829.getClass(), "lu", null);
        setField(term89829, term89829.getClass(), "permutation", term89702);
        setIntField(term89829, term89829.getClass(), "parity", 0);
        setIntField(term89829, term89829.getClass(), "roundingMode", 0);
        setIntField(term89829, term89829.getClass(), "scale", 0);
        term89696 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.String"), 0).getClass(), 4);
        Object[] term89697 = (Object[]) newArray("java.lang.String", 1);
        Object[] term89699 = (Object[]) newArray("java.lang.String", 1);
        Object[] term89701 = (Object[]) newArray("java.lang.String", 0);
        setElement(term89697, 0, "");
        setElement(term89696, 0, term89697);
        setElement(term89699, 0, "");
        setElement(term89696, 1, term89699);
        setElement(term89696, 2, term89701);
        setElement(term89696, 3, term89697);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(Class.forName("java.lang.String"), 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term89696;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


