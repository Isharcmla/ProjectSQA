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
import static org.apache.commons.math.optimization.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.optimization.EqualityUtils.*;

public class MultiStartUnivariateRealOptimizer_getOptimaValues_51756386837 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term403;
     Object term3661;
     Object term3640;

    public MultiStartUnivariateRealOptimizer_getOptimaValues_51756386837() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term403 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        double[] term409 = (double[]) newDoubleArray(2);
        double[] term412 = (double[]) newDoubleArray(5);
        setField(term403, term403.getClass(), "optimizer", null);
        setIntField(term403, term403.getClass(), "maxIterations", 1240914516);
        setIntField(term403, term403.getClass(), "maxEvaluations", -1465035361);
        setIntField(term403, term403.getClass(), "totalIterations", 1090617576);
        setIntField(term403, term403.getClass(), "totalEvaluations", -1547384488);
        setIntField(term403, term403.getClass(), "starts", 1442160736);
        setField(term403, term403.getClass(), "generator", null);
        setDoubleElement(term409, 0, 0.7818620200430967);
        setDoubleElement(term409, 1, 0.04640022995603543);
        setField(term403, term403.getClass(), "optima", term409);
        setDoubleElement(term412, 0, 0.9123572866833729);
        setDoubleElement(term412, 1, 0.40635376375558196);
        setDoubleElement(term412, 2, 0.4772043271031934);
        setDoubleElement(term412, 3, 0.2446504549754045);
        setDoubleElement(term412, 4, 0.6142723998707854);
        setField(term403, term403.getClass(), "optimaValues", term412);
        term3661 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        double[] term3662 = (double[]) newDoubleArray(2);
        double[] term3663 = (double[]) newDoubleArray(5);
        setField(term3661, term3661.getClass(), "optimizer", null);
        setIntField(term3661, term3661.getClass(), "maxIterations", 1240914516);
        setIntField(term3661, term3661.getClass(), "maxEvaluations", -1465035361);
        setIntField(term3661, term3661.getClass(), "totalIterations", 1090617576);
        setIntField(term3661, term3661.getClass(), "totalEvaluations", -1547384488);
        setIntField(term3661, term3661.getClass(), "starts", 1442160736);
        setField(term3661, term3661.getClass(), "generator", null);
        setDoubleElement(term3662, 0, 0.7818620200430967);
        setDoubleElement(term3662, 1, 0.04640022995603543);
        setField(term3661, term3661.getClass(), "optima", term3662);
        setDoubleElement(term3663, 0, 0.9123572866833729);
        setDoubleElement(term3663, 1, 0.40635376375558196);
        setDoubleElement(term3663, 2, 0.4772043271031934);
        setDoubleElement(term3663, 3, 0.2446504549754045);
        setDoubleElement(term3663, 4, 0.6142723998707854);
        setField(term3661, term3661.getClass(), "optimaValues", term3663);
        term3640 = (double[]) newDoubleArray(5);
        setDoubleElement(term3640, 0, 0.9123572866833729);
        setDoubleElement(term3640, 1, 0.40635376375558196);
        setDoubleElement(term3640, 2, 0.4772043271031934);
        setDoubleElement(term3640, 3, 0.2446504549754045);
        setDoubleElement(term3640, 4, 0.6142723998707854);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getOptimaValues", argTypes, term403, args);
        assertTrue(recursiveEquals(term403, term3661));
        assertTrue(recursiveEquals(retValue, term3640));
    }

};


