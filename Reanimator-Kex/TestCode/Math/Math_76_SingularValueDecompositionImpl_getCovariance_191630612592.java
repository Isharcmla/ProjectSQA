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

public class SingularValueDecompositionImpl_getCovariance_191630612592 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40531;

    public SingularValueDecompositionImpl_getCovariance_191630612592() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40531 = newInstance(Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        double[] term40264 = (double[]) newDoubleArray(21);
        Object term40627 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        setDoubleElement(term40264, 0, -9.2188684372274053E18);
        setDoubleElement(term40264, 1, 9.00719925475738E15);
        setDoubleElement(term40264, 2, -4.6071824188000174E18);
        setField(term40531, term40531.getClass(), "singularValues", term40264);
        setField(term40531, term40531.getClass(), "cachedVt", null);
        setField(term40531, term40531.getClass(), "cachedV", term40627);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = -2.0000000000000573;
        callMethod(klass, "getCovariance", argTypes, term40531, args);
    }

};


