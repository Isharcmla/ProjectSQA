package org.apache.commons.math3.optim.nonlinear.scalar.gradient;

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
import static org.apache.commons.math3.optim.nonlinear.scalar.gradient.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Double;

public class NonLinearConjugateGradientOptimizer_findUpperBound_8765723214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4551;
     Object term4605;
     Object term4607;

    public NonLinearConjugateGradientOptimizer_findUpperBound_8765723214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18320 = Class.forName((String) "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer$Formula");
        Field term18319 = ((Class) term18320).getDeclaredField((String) "POLAK_RIBIERE");
        ((Field) term18319).setAccessible(true);
        Object enum31 = ((Field) term18319).get((Object) null);
        Class<? extends Object> term18866 = Class.forName((String) "org.apache.commons.math3.optim.nonlinear.scalar.GoalType");
        Field term18865 = ((Class) term18866).getDeclaredField((String) "MAXIMIZE");
        ((Field) term18865).setAccessible(true);
        Object enum32 = ((Field) term18865).get((Object) null);
        term4551 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        double[] term4582 = (double[]) newDoubleArray(5);
        double[] term4588 = (double[]) newDoubleArray(5);
        double[] term4594 = (double[]) newDoubleArray(2);
        Object term4597 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term4600 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor$1"));
        Object term4601 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term4604 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor$1"));
        setField(term4551, term4551.getClass(), "updateFormula", enum31);
        setField(term4551, term4551.getClass(), "preconditioner", null);
        setField(term4551, term4551.getClass(), "solver", null);
        setDoubleField(term4551, term4551.getClass(), "initialStep", 0.5279279537140873);
        setField(term4551, term4551.getClass(), "gradient", null);
        setField(term4551, term4551.getClass(), "function", null);
        setField(term4551, term4551.getClass(), "goal", enum32);
        setDoubleElement(term4582, 0, 0.3202192021706908);
        setDoubleElement(term4582, 1, 0.22651340641904605);
        setDoubleElement(term4582, 2, 0.8878841294187743);
        setDoubleElement(term4582, 3, 0.6588948704887806);
        setDoubleElement(term4582, 4, 0.6397214730945112);
        setField(term4551, term4551.getClass(), "start", term4582);
        setDoubleElement(term4588, 0, 0.25937345430928016);
        setDoubleElement(term4588, 1, 0.5873228247510078);
        setDoubleElement(term4588, 2, 0.8823181080774973);
        setDoubleElement(term4588, 3, 0.2192450926212024);
        setDoubleElement(term4588, 4, 0.7591353014991907);
        setField(term4551, term4551.getClass(), "lowerBound", term4588);
        setDoubleElement(term4594, 0, 0.791695029600875);
        setDoubleElement(term4594, 1, 0.6862221294683138);
        setField(term4551, term4551.getClass(), "upperBound", term4594);
        setIntField(term4597, term4597.getClass(), "maximalCount", 1134449235);
        setIntField(term4597, term4597.getClass(), "count", -883034806);
        setField(term4597, term4597.getClass(), "maxCountCallback", term4600);
        setField(term4551, term4551.getClass(), "evaluations", term4597);
        setIntField(term4601, term4601.getClass(), "maximalCount", 1585847225);
        setIntField(term4601, term4601.getClass(), "count", 597278769);
        setField(term4601, term4601.getClass(), "maxCountCallback", term4604);
        setField(term4551, term4551.getClass(), "iterations", term4601);
        setField(term4551, term4551.getClass(), "checker", null);
        term4605 = new Double(0.15917839663695388);
        term4607 = new Double(0.9374115574082594);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.math3.analysis.UnivariateFunction");
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term4605;
        args[2] = term4607;
        try {
            callMethod(klass, "findUpperBound", argTypes, term4551, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


