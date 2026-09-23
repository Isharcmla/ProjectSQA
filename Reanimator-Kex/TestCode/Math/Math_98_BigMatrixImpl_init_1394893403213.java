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

public class BigMatrixImpl_init_1394893403213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92506;

    public BigMatrixImpl_init_1394893403213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term92640 = newInstance(Class.forName("org.apache.commons.math.linear.BigMatrixImpl"));
        Object[] term92512 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 0);
        Object[] term92513 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 0);
        int[] term92514 = (int[]) newIntArray(0);
        setField(term92640, term92640.getClass(), "data", term92512);
        setField(term92640, term92640.getClass(), "lu", term92513);
        setField(term92640, term92640.getClass(), "permutation", term92514);
        setIntField(term92640, term92640.getClass(), "parity", 0);
        setIntField(term92640, term92640.getClass(), "roundingMode", 0);
        setIntField(term92640, term92640.getClass(), "scale", 0);
        term92506 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 10);
        Object[] term92507 = (Object[]) newArray("java.math.BigDecimal", 2);
        Object term92686 = newInstance(Class.forName("java.math.BigDecimal"));
        Object[] term92509 = (Object[]) newArray("java.math.BigDecimal", 2);
        Object term92732 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term92778 = newInstance(Class.forName("java.math.BigDecimal"));
        setElement(term92507, 0, term92686);
        setElement(term92507, 1, term92686);
        setElement(term92506, 0, term92507);
        setElement(term92509, 0, term92732);
        setElement(term92509, 1, term92778);
        setElement(term92506, 1, term92509);
        setElement(term92506, 2, term92509);
        setElement(term92506, 3, term92509);
        setElement(term92506, 4, term92509);
        setElement(term92506, 5, term92509);
        setElement(term92506, 6, term92509);
        setElement(term92506, 7, term92509);
        setElement(term92506, 8, term92509);
        setElement(term92506, 9, term92509);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term92506;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


