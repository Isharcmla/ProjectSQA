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
import org.apache.commons.math.linear.MatrixIndexException;
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SingularValueDecompositionImpl_getCovariance_191630612553 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21971;

    public SingularValueDecompositionImpl_getCovariance_191630612553() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21971 = newInstance(Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        double[] term21721 = (double[]) newDoubleArray(6);
        Object term22069 = newInstance(Class.forName("org.apache.commons.math.linear.BlockRealMatrix"));
        setDoubleElement(term21721, 0, 4.574002731286533E15);
        setDoubleElement(term21721, 1, 4.820276156039173E15);
        setDoubleElement(term21721, 2, 4.820808731983936E15);
        setDoubleElement(term21721, 3, 9.007474132647936E15);
        setDoubleElement(term21721, 4, 1.0172681580183552E16);
        setDoubleElement(term21721, 5, 4.820276156563457E15);
        setField(term21971, term21971.getClass(), "singularValues", term21721);
        setField(term21971, term21971.getClass(), "cachedVt", term22069);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = 1.564589936594534E-309;
        try {
            callMethod(klass, "getCovariance", argTypes, term21971, args);
            assertTrue(false);
        }
        catch (MatrixIndexException e) {
        }

    }

};


