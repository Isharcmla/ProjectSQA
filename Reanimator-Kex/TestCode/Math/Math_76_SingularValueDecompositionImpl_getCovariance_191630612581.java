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

public class SingularValueDecompositionImpl_getCovariance_191630612581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37081;

    public SingularValueDecompositionImpl_getCovariance_191630612581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37081 = newInstance(Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        double[] term36820 = (double[]) newDoubleArray(6);
        Object term37193 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setDoubleElement(term36820, 0, 9.2211554214131794E18);
        setDoubleElement(term36820, 1, 9.2189047211111219E18);
        setDoubleElement(term36820, 2, 9.2211202370412216E18);
        setDoubleElement(term36820, 3, 9.2188684372274217E18);
        setDoubleElement(term36820, 4, -4.503599627370432E15);
        setDoubleElement(term36820, 5, 9.2211202370410906E18);
        setField(term37081, term37081.getClass(), "singularValues", term36820);
        setField(term37081, term37081.getClass(), "cachedVt", null);
        setField(term37081, term37081.getClass(), "cachedV", null);
        setIntField(term37081, term37081.getClass(), "m", -2147483648);
        setIntField(term37081, term37081.getClass(), "n", -2147483647);
        setField(term37081, term37081.getClass(), "eigenDecomposition", term37193);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = Double.NaN;
        callMethod(klass, "getCovariance", argTypes, term37081, args);
    }

};


