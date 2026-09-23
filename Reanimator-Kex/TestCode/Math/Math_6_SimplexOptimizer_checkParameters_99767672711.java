package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

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
import org.apache.commons.math3.exception.NullArgumentException;
import static org.apache.commons.math3.optim.nonlinear.scalar.noderiv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class SimplexOptimizer_checkParameters_99767672711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1106;

    public SimplexOptimizer_checkParameters_99767672711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6615 = Class.forName((String) "org.apache.commons.math3.optim.nonlinear.scalar.GoalType");
        Field term6614 = ((Class) term6615).getDeclaredField((String) "MAXIMIZE");
        ((Field) term6614).setAccessible(true);
        Object enum9 = ((Field) term6614).get((Object) null);
        term1106 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        double[] term1119 = (double[]) newDoubleArray(5);
        double[] term1125 = (double[]) newDoubleArray(5);
        double[] term1131 = (double[]) newDoubleArray(2);
        Object term1134 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term1137 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor$1"));
        Object term1138 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term1141 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor$1"));
        setField(term1106, term1106.getClass(), "simplex", null);
        setField(term1106, term1106.getClass(), "function", null);
        setField(term1106, term1106.getClass(), "goal", enum9);
        setDoubleElement(term1119, 0, 0.07802449704920456);
        setDoubleElement(term1119, 1, 0.5279279537140873);
        setDoubleElement(term1119, 2, 0.3202192021706908);
        setDoubleElement(term1119, 3, 0.22651340641904605);
        setDoubleElement(term1119, 4, 0.8878841294187743);
        setField(term1106, term1106.getClass(), "start", term1119);
        setDoubleElement(term1125, 0, 0.6588948704887806);
        setDoubleElement(term1125, 1, 0.6397214730945112);
        setDoubleElement(term1125, 2, 0.25937345430928016);
        setDoubleElement(term1125, 3, 0.5873228247510078);
        setDoubleElement(term1125, 4, 0.8823181080774973);
        setField(term1106, term1106.getClass(), "lowerBound", term1125);
        setDoubleElement(term1131, 0, 0.2192450926212024);
        setDoubleElement(term1131, 1, 0.7591353014991907);
        setField(term1106, term1106.getClass(), "upperBound", term1131);
        setIntField(term1134, term1134.getClass(), "maximalCount", 1134449235);
        setIntField(term1134, term1134.getClass(), "count", -883034806);
        setField(term1134, term1134.getClass(), "maxCountCallback", term1137);
        setField(term1106, term1106.getClass(), "evaluations", term1134);
        setIntField(term1138, term1138.getClass(), "maximalCount", 1585847225);
        setIntField(term1138, term1138.getClass(), "count", 597278769);
        setField(term1138, term1138.getClass(), "maxCountCallback", term1141);
        setField(term1106, term1106.getClass(), "iterations", term1138);
        setField(term1106, term1106.getClass(), "checker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "checkParameters", argTypes, term1106, args);
            assertTrue(false);
        }
        catch (NullArgumentException e) {
        }

    }

};


