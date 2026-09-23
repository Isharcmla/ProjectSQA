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

public class RealMatrixImpl_operate_827117190148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1059210;
     Object term1059047;

    public RealMatrixImpl_operate_827117190148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1059210 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        Object[] term1059050 = (Object[]) newArray("[D", 8);
        double[] term1059051 = (double[]) newDoubleArray(2);
        setElement(term1059050, 0, term1059051);
        setField(term1059210, term1059210.getClass(), "data", term1059050);
        term1059047 = (double[]) newDoubleArray(2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1059047;
        callMethod(klass, "operate", argTypes, term1059210, args);
    }

};


