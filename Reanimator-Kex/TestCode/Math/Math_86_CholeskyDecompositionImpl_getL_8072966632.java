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

public class CholeskyDecompositionImpl_getL_8072966632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5;

    public CholeskyDecompositionImpl_getL_8072966632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5 = newInstance(Class.forName("org.apache.commons.math.linear.CholeskyDecompositionImpl"));
        Object[] term6 = (Object[]) newArray("[D", 5);
        double[] term7 = (double[]) newDoubleArray(4);
        double[] term12 = (double[]) newDoubleArray(3);
        double[] term16 = (double[]) newDoubleArray(4);
        double[] term21 = (double[]) newDoubleArray(1);
        double[] term23 = (double[]) newDoubleArray(6);
        setDoubleElement(term7, 0, 0.5523635872663106);
        setDoubleElement(term7, 1, 0.544608645520025);
        setDoubleElement(term7, 2, 0.28570734989730284);
        setDoubleElement(term7, 3, 0.40176586625454525);
        setElement(term6, 0, term7);
        setDoubleElement(term12, 0, 0.2641345529914265);
        setDoubleElement(term12, 1, 0.36923381893433327);
        setDoubleElement(term12, 2, 0.6076495596892013);
        setElement(term6, 1, term12);
        setDoubleElement(term16, 0, 0.37773193782763337);
        setDoubleElement(term16, 1, 0.8474802076607362);
        setDoubleElement(term16, 2, 0.5183269973490326);
        setDoubleElement(term16, 3, 0.7655020693602768);
        setElement(term6, 2, term16);
        setDoubleElement(term21, 0, 0.1374549299694151);
        setElement(term6, 3, term21);
        setDoubleElement(term23, 0, 0.7031006357544823);
        setDoubleElement(term23, 1, 0.9527281779865117);
        setDoubleElement(term23, 2, 0.9828442029246764);
        setDoubleElement(term23, 3, 0.2779719046761513);
        setDoubleElement(term23, 4, 0.6436713023569729);
        setDoubleElement(term23, 5, 0.7332741045694002);
        setElement(term6, 4, term23);
        setField(term5, term5.getClass(), "lTData", term6);
        setField(term5, term5.getClass(), "cachedL", null);
        setField(term5, term5.getClass(), "cachedLT", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.CholeskyDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getL", argTypes, term5, args);
    }

};


