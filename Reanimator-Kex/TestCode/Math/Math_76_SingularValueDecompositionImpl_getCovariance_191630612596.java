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
import java.lang.Double;

public class SingularValueDecompositionImpl_getCovariance_191630612596 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42322;

    public SingularValueDecompositionImpl_getCovariance_191630612596() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42322 = newInstance(Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        double[] term42157 = (double[]) newDoubleArray(1);
        Object term42418 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        setDoubleElement(term42157, 0, -4.46832506095753E15);
        setField(term42322, term42322.getClass(), "singularValues", term42157);
        setField(term42322, term42322.getClass(), "cachedVt", null);
        setField(term42322, term42322.getClass(), "cachedV", term42418);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = Double.NaN;
        callMethod(klass, "getCovariance", argTypes, term42322, args);
    }

};


