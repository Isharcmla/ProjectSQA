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
import java.lang.NullPointerException;
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SingularValueDecompositionImpl_getCovariance_191630612564 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24639;

    public SingularValueDecompositionImpl_getCovariance_191630612564() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24639 = newInstance(Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        double[] term24441 = (double[]) newDoubleArray(4);
        setDoubleElement(term24441, 0, 4.6117631216802857E18);
        setDoubleElement(term24441, 1, 7.6965813944322E13);
        setDoubleElement(term24441, 2, 3.9582418599936E13);
        setDoubleElement(term24441, 3, -9.2188618401576387E18);
        setField(term24639, term24639.getClass(), "singularValues", term24441);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = -2.263100023081299E-308;
        try {
            callMethod(klass, "getCovariance", argTypes, term24639, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


