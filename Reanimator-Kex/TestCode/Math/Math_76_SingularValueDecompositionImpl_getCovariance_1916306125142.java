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
import java.lang.Object;

public class SingularValueDecompositionImpl_getCovariance_1916306125142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72719;

    public SingularValueDecompositionImpl_getCovariance_1916306125142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72719 = newInstance(Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        double[] term72504 = (double[]) newDoubleArray(5);
        Object term72831 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setDoubleElement(term72504, 0, 2.3103667332906076E18);
        setDoubleElement(term72504, 1, 4.508410394640393E15);
        setDoubleElement(term72504, 2, -6.9085172605642015E18);
        setField(term72719, term72719.getClass(), "singularValues", term72504);
        setField(term72719, term72719.getClass(), "cachedVt", null);
        setField(term72719, term72719.getClass(), "cachedV", null);
        setIntField(term72719, term72719.getClass(), "m", -2147483648);
        setIntField(term72719, term72719.getClass(), "n", -2147483647);
        setField(term72719, term72719.getClass(), "eigenDecomposition", term72831);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = -2.053919397762171E-289;
        try {
            callMethod(klass, "getCovariance", argTypes, term72719, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


