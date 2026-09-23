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
import java.lang.NegativeArraySizeException;
import static org.apache.commons.math.optimization.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Double;

public class MultiStartUnivariateRealOptimizer_optimize_147643963039 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term745;
     Object enum3;
     Object term771;
     Object term773;
     Object term775;

    public MultiStartUnivariateRealOptimizer_optimize_147643963039() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term745 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        double[] term751 = (double[]) newDoubleArray(5);
        double[] term757 = (double[]) newDoubleArray(1);
        setField(term745, term745.getClass(), "optimizer", null);
        setIntField(term745, term745.getClass(), "maxIterations", -344842608);
        setIntField(term745, term745.getClass(), "maxEvaluations", 941650513);
        setIntField(term745, term745.getClass(), "totalIterations", 444029505);
        setIntField(term745, term745.getClass(), "totalEvaluations", -1034506028);
        setIntField(term745, term745.getClass(), "starts", -1263114719);
        setField(term745, term745.getClass(), "generator", null);
        setDoubleElement(term751, 0, 0.7636130748477434);
        setDoubleElement(term751, 1, 0.07901636960861558);
        setDoubleElement(term751, 2, 0.18717846301066243);
        setDoubleElement(term751, 3, 0.5335953039331021);
        setDoubleElement(term751, 4, 0.5725602309856443);
        setField(term745, term745.getClass(), "optima", term751);
        setDoubleElement(term757, 0, 0.5310967137636303);
        setField(term745, term745.getClass(), "optimaValues", term757);
        Class<? extends Object> term4475 = Class.forName((String) "org.apache.commons.math.optimization.GoalType");
        Field term4474 = ((Class) term4475).getDeclaredField((String) "MAXIMIZE");
        ((Field) term4474).setAccessible(true);
        enum3 = ((Field) term4474).get((Object) null);
        term771 = new Double(0.6054109236809134);
        term773 = new Double(0.9165240441138934);
        term775 = new Double(0.22227423914231126);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        argTypes[1] = Class.forName("org.apache.commons.math.optimization.GoalType");
        argTypes[2] = double.class;
        argTypes[3] = double.class;
        argTypes[4] = double.class;
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = enum3;
        args[2] = term771;
        args[3] = term773;
        args[4] = term775;
        try {
            callMethod(klass, "optimize", argTypes, term745, args);
            assertTrue(false);
        }
        catch (NegativeArraySizeException e) {
        }

    }

};


