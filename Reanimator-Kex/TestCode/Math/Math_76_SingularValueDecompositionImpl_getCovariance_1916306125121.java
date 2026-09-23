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

public class SingularValueDecompositionImpl_getCovariance_1916306125121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56629;

    public SingularValueDecompositionImpl_getCovariance_1916306125121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56629 = newInstance(Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        double[] term56419 = (double[]) newDoubleArray(3);
        Object term56741 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        Object term56843 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setDoubleElement(term56419, 0, 8.5748536905152676E18);
        setDoubleElement(term56419, 1, 5.5664491394317681E18);
        setDoubleElement(term56419, 2, 1572869.0);
        setField(term56629, term56629.getClass(), "singularValues", term56419);
        setField(term56629, term56629.getClass(), "cachedVt", null);
        setField(term56629, term56629.getClass(), "cachedV", null);
        setIntField(term56629, term56629.getClass(), "m", -2147483648);
        setIntField(term56629, term56629.getClass(), "n", -2147483648);
        setField(term56741, term56741.getClass(), "cachedV", term56843);
        setField(term56629, term56629.getClass(), "eigenDecomposition", term56741);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = -2.4049076057402946E111;
        try {
            callMethod(klass, "getCovariance", argTypes, term56629, args);
            assertTrue(false);
        }
        catch (MatrixIndexException e) {
        }

    }

};


