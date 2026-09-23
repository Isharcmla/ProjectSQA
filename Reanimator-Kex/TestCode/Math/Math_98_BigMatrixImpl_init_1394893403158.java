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

public class BigMatrixImpl_init_1394893403158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83259;

    public BigMatrixImpl_init_1394893403158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term83382 = newInstance(Class.forName("org.apache.commons.math.linear.BigMatrixImpl"));
        Object[] term83261 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 0);
        int[] term83262 = (int[]) newIntArray(0);
        setField(term83382, term83382.getClass(), "data", term83261);
        setField(term83382, term83382.getClass(), "lu", null);
        setField(term83382, term83382.getClass(), "permutation", term83262);
        setIntField(term83382, term83382.getClass(), "parity", 0);
        setIntField(term83382, term83382.getClass(), "roundingMode", 0);
        setIntField(term83382, term83382.getClass(), "scale", 0);
        term83259 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 1);
        Object[] term83260 = (Object[]) newArray("java.math.BigDecimal", 1);
        setElement(term83259, 0, term83260);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term83259;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


