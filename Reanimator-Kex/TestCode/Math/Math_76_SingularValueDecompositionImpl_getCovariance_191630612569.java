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

public class SingularValueDecompositionImpl_getCovariance_191630612569 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30548;

    public SingularValueDecompositionImpl_getCovariance_191630612569() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30548 = newInstance(Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        double[] term29102 = (double[]) newDoubleArray(251);
        Object term30660 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setDoubleElement(term29102, 0, -9.2233668135010632E18);
        setDoubleElement(term29102, 1, 5.7649683123696435E17);
        setDoubleElement(term29102, 2, -9.1872703873755382E18);
        setField(term30548, term30548.getClass(), "singularValues", term29102);
        setField(term30548, term30548.getClass(), "cachedVt", null);
        setField(term30548, term30548.getClass(), "cachedV", null);
        setIntField(term30548, term30548.getClass(), "m", -2147483648);
        setIntField(term30548, term30548.getClass(), "n", -2147483648);
        setField(term30548, term30548.getClass(), "eigenDecomposition", term30660);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = -2.242866867961566E-308;
        callMethod(klass, "getCovariance", argTypes, term30548, args);
    }

};


