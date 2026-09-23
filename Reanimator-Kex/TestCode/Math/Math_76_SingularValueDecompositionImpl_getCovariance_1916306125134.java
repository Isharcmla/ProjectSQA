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

public class SingularValueDecompositionImpl_getCovariance_1916306125134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63086;

    public SingularValueDecompositionImpl_getCovariance_1916306125134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63086 = newInstance(Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        double[] term62089 = (double[]) newDoubleArray(132);
        Object term63198 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        Object term63306 = newInstance(Class.forName("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setDoubleElement(term62089, 0, 2.3149219539960965E18);
        setDoubleElement(term62089, 1, 2.3239102444886441E18);
        setDoubleElement(term62089, 2, 3.1717316090984218E18);
        setDoubleElement(term62089, 3, -2.28774926860513946E18);
        setField(term63086, term63086.getClass(), "singularValues", term62089);
        setField(term63086, term63086.getClass(), "cachedVt", null);
        setField(term63086, term63086.getClass(), "cachedV", null);
        setIntField(term63086, term63086.getClass(), "m", -2147483648);
        setIntField(term63086, term63086.getClass(), "n", -2147483648);
        setField(term63198, term63198.getClass(), "cachedV", term63306);
        setField(term63086, term63086.getClass(), "eigenDecomposition", term63198);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = -1.1502646522788558E-115;
        try {
            callMethod(klass, "getCovariance", argTypes, term63086, args);
            assertTrue(false);
        }
        catch (MatrixIndexException e) {
        }

    }

};


