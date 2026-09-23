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

public class SingularValueDecompositionImpl_getCovariance_191630612565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25718;

    public SingularValueDecompositionImpl_getCovariance_191630612565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25718 = newInstance(Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        double[] term25300 = (double[]) newDoubleArray(59);
        Object term25820 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setDoubleElement(term25300, 0, 1.73403546313623347E18);
        setDoubleElement(term25300, 1, 4.7603050992721019E18);
        setDoubleElement(term25300, 2, -7.9893854412583649E18);
        setField(term25718, term25718.getClass(), "singularValues", term25300);
        setField(term25718, term25718.getClass(), "cachedVt", null);
        setField(term25718, term25718.getClass(), "cachedV", term25820);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = 8.574994686510494E-227;
        callMethod(klass, "getCovariance", argTypes, term25718, args);
    }

};


