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

public class SingularValueDecompositionImpl_getCovariance_1916306125116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52315;

    public SingularValueDecompositionImpl_getCovariance_1916306125116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52315 = newInstance(Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        double[] term51588 = (double[]) newDoubleArray(64);
        setDoubleElement(term51588, 0, 6.75539944140192E15);
        setDoubleElement(term51588, 1, 4.71484329905357E15);
        setDoubleElement(term51588, 2, -9.2188661694846546E18);
        setDoubleElement(term51588, 3, 7.2695310783448576E16);
        setDoubleElement(term51588, 4, -9.2185517778762793E18);
        setDoubleElement(term51588, 5, -4.5931064709407652E18);
        setField(term52315, term52315.getClass(), "singularValues", term51588);
        setField(term52315, term52315.getClass(), "cachedVt", null);
        setField(term52315, term52315.getClass(), "cachedV", null);
        setIntField(term52315, term52315.getClass(), "m", -2147483648);
        setIntField(term52315, term52315.getClass(), "n", -2147483647);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = -2.094726562706015;
        try {
            callMethod(klass, "getCovariance", argTypes, term52315, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


