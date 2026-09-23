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

public class BigMatrixImpl_init_1394893403312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105740;

    public BigMatrixImpl_init_1394893403312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term105918 = newInstance(Class.forName("org.apache.commons.math.linear.BigMatrixImpl"));
        Object[] term105755 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 0);
        setField(term105918, term105918.getClass(), "data", term105755);
        setField(term105918, term105918.getClass(), "lu", null);
        setField(term105918, term105918.getClass(), "permutation", null);
        setIntField(term105918, term105918.getClass(), "parity", 0);
        setIntField(term105918, term105918.getClass(), "roundingMode", 0);
        setIntField(term105918, term105918.getClass(), "scale", 0);
        term105740 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 7);
        Object[] term105741 = (Object[]) newArray("java.math.BigDecimal", 1);
        Object term105964 = newInstance(Class.forName("java.math.BigDecimal"));
        Object[] term105743 = (Object[]) newArray("java.math.BigDecimal", 1);
        Object term106010 = newInstance(Class.forName("java.math.BigDecimal"));
        Object[] term105745 = (Object[]) newArray("java.math.BigDecimal", 1);
        Object term106056 = newInstance(Class.forName("java.math.BigDecimal"));
        Object[] term105747 = (Object[]) newArray("java.math.BigDecimal", 1);
        Object term106102 = newInstance(Class.forName("java.math.BigDecimal"));
        Object[] term105749 = (Object[]) newArray("java.math.BigDecimal", 1);
        Object term106148 = newInstance(Class.forName("java.math.BigDecimal"));
        Object[] term105751 = (Object[]) newArray("java.math.BigDecimal", 1);
        Object term106194 = newInstance(Class.forName("java.math.BigDecimal"));
        Object[] term105753 = (Object[]) newArray("java.math.BigDecimal", 1);
        Object term106240 = newInstance(Class.forName("java.math.BigDecimal"));
        setElement(term105741, 0, term105964);
        setElement(term105740, 0, term105741);
        setElement(term105743, 0, term106010);
        setElement(term105740, 1, term105743);
        setElement(term105745, 0, term106056);
        setElement(term105740, 2, term105745);
        setElement(term105747, 0, term106102);
        setElement(term105740, 3, term105747);
        setElement(term105749, 0, term106148);
        setElement(term105740, 4, term105749);
        setElement(term105751, 0, term106194);
        setElement(term105740, 5, term105751);
        setElement(term105753, 0, term106240);
        setElement(term105740, 6, term105753);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term105740;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


