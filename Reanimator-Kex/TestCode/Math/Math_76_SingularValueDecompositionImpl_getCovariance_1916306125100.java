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

public class SingularValueDecompositionImpl_getCovariance_1916306125100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43533;

    public SingularValueDecompositionImpl_getCovariance_1916306125100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43533 = newInstance(Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        double[] term42422 = (double[]) newDoubleArray(129);
        Object term43641 = newInstance(Class.forName("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setDoubleElement(term42422, 0, 3.4683962378273423E18);
        setDoubleElement(term42422, 1, 5.8029485932748472E18);
        setDoubleElement(term42422, 2, 7.2074664299546542E18);
        setDoubleElement(term42422, 3, 4.6125909164973097E18);
        setDoubleElement(term42422, 4, 3.4956800669673073E18);
        setDoubleElement(term42422, 5, -2.29606065426137088E18);
        setField(term43533, term43533.getClass(), "singularValues", term42422);
        setField(term43533, term43533.getClass(), "cachedVt", term43641);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = 4.019950919712664E-77;
        try {
            callMethod(klass, "getCovariance", argTypes, term43533, args);
            assertTrue(false);
        }
        catch (MatrixIndexException e) {
        }

    }

};


