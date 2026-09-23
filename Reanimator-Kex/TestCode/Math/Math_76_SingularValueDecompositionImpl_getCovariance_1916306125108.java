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

public class SingularValueDecompositionImpl_getCovariance_1916306125108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48878;

    public SingularValueDecompositionImpl_getCovariance_1916306125108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48878 = newInstance(Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        double[] term48620 = (double[]) newDoubleArray(6);
        Object term48980 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setDoubleElement(term48620, 0, 4.591577804707332E15);
        setDoubleElement(term48620, 1, 4.82027629038874E15);
        setDoubleElement(term48620, 2, 9.024791440786452E15);
        setDoubleElement(term48620, 3, 4.609153817576448E15);
        setDoubleElement(term48620, 4, 1.1294459392697864E16);
        setDoubleElement(term48620, 5, 4.609169926651904E15);
        setField(term48878, term48878.getClass(), "singularValues", term48620);
        setField(term48878, term48878.getClass(), "cachedVt", term48980);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = 4.34590053995727E-310;
        try {
            callMethod(klass, "getCovariance", argTypes, term48878, args);
            assertTrue(false);
        }
        catch (MatrixIndexException e) {
        }

    }

};


