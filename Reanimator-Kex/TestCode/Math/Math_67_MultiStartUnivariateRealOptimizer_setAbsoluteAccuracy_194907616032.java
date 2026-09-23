package org.apache.commons.math.optimization;

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
import static org.apache.commons.math.optimization.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Double;

public class MultiStartUnivariateRealOptimizer_setAbsoluteAccuracy_194907616032 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term251;
     Object term271;

    public MultiStartUnivariateRealOptimizer_setAbsoluteAccuracy_194907616032() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term251 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        double[] term257 = (double[]) newDoubleArray(9);
        double[] term267 = (double[]) newDoubleArray(3);
        setField(term251, term251.getClass(), "optimizer", null);
        setIntField(term251, term251.getClass(), "maxIterations", 458147407);
        setIntField(term251, term251.getClass(), "maxEvaluations", -184153539);
        setIntField(term251, term251.getClass(), "totalIterations", 493620644);
        setIntField(term251, term251.getClass(), "totalEvaluations", 1328271830);
        setIntField(term251, term251.getClass(), "starts", 1596070772);
        setField(term251, term251.getClass(), "generator", null);
        setDoubleElement(term257, 0, 0.29874017652881824);
        setDoubleElement(term257, 1, 0.32554480512985284);
        setDoubleElement(term257, 2, 0.8924855581421237);
        setDoubleElement(term257, 3, 0.32237559209193944);
        setDoubleElement(term257, 4, 0.53094494792755);
        setDoubleElement(term257, 5, 0.146431486357265);
        setDoubleElement(term257, 6, 0.24259014218848696);
        setDoubleElement(term257, 7, 0.1544348383112728);
        setDoubleElement(term257, 8, 0.5187846213101265);
        setField(term251, term251.getClass(), "optima", term257);
        setDoubleElement(term267, 0, 0.045893173090043815);
        setDoubleElement(term267, 1, 0.3626177854778667);
        setDoubleElement(term267, 2, 0.3163771663728089);
        setField(term251, term251.getClass(), "optimaValues", term267);
        term271 = new Double(0.8819646072665548);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term271;
        try {
            callMethod(klass, "setAbsoluteAccuracy", argTypes, term251, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


