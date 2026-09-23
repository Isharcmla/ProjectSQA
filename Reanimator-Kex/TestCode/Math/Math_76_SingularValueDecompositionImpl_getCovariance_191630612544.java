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

public class SingularValueDecompositionImpl_getCovariance_191630612544 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15368;

    public SingularValueDecompositionImpl_getCovariance_191630612544() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15368 = newInstance(Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        double[] term15117 = (double[]) newDoubleArray(6);
        Object term15464 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        setDoubleElement(term15117, 0, 4.398046511104E12);
        setDoubleElement(term15117, 1, 4.6116948145204429E18);
        setDoubleElement(term15117, 2, 5.075345673814016E15);
        setDoubleElement(term15117, 3, 4.509097185509376E15);
        setDoubleElement(term15117, 4, 4.789472650592264E15);
        setDoubleElement(term15117, 5, 4.503599627894784E15);
        setField(term15368, term15368.getClass(), "singularValues", term15117);
        setField(term15368, term15368.getClass(), "cachedVt", null);
        setField(term15368, term15368.getClass(), "cachedV", term15464);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = -1.40153578001675E-309;
        callMethod(klass, "getCovariance", argTypes, term15368, args);
    }

};


