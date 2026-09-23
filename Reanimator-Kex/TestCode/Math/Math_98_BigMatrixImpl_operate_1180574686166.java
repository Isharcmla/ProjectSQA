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

public class BigMatrixImpl_operate_1180574686166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84436;
     Object term84217;

    public BigMatrixImpl_operate_1180574686166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84436 = newInstance(Class.forName("org.apache.commons.math.linear.BigMatrixImpl"));
        term84217 = (double[]) newDoubleArray(105);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term84217;
        callMethod(klass, "operate", argTypes, term84436, args);
    }

};


