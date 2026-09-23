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

public class RealMatrixImpl_operate_827117190136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83312;
     Object term83163;

    public RealMatrixImpl_operate_827117190136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83312 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        Object[] term83165 = (Object[]) newArray("[D", 2);
        double[] term83166 = (double[]) newDoubleArray(1);
        double[] term83168 = (double[]) newDoubleArray(0);
        setElement(term83165, 0, term83166);
        setElement(term83165, 1, term83168);
        setField(term83312, term83312.getClass(), "data", term83165);
        term83163 = (double[]) newDoubleArray(1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term83163;
        callMethod(klass, "operate", argTypes, term83312, args);
    }

};


