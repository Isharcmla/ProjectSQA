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

public class SimplexOptimizer_doOptimize_13520743179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term389;

    public SimplexOptimizer_doOptimize_13520743179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3908 = Class.forName((String) "org.apache.commons.math3.optim.nonlinear.scalar.GoalType");
        Field term3907 = ((Class) term3908).getDeclaredField((String) "MAXIMIZE");
        ((Field) term3907).setAccessible(true);
        Object enum6 = ((Field) term3907).get((Object) null);
        term389 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        double[] term402 = (double[]) newDoubleArray(1);
        double[] term404 = (double[]) newDoubleArray(6);
        double[] term411 = (double[]) newDoubleArray(2);
        Object term414 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term417 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor$1"));
        Object term418 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term421 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor$1"));
        setField(term389, term389.getClass(), "simplex", null);
        setField(term389, term389.getClass(), "function", null);
        setField(term389, term389.getClass(), "goal", enum6);
        setDoubleElement(term402, 0, 0.7031006357544823);
        setField(term389, term389.getClass(), "start", term402);
        setDoubleElement(term404, 0, 0.9527281779865117);
        setDoubleElement(term404, 1, 0.9828442029246764);
        setDoubleElement(term404, 2, 0.2779719046761513);
        setDoubleElement(term404, 3, 0.6436713023569729);
        setDoubleElement(term404, 4, 0.7332741045694002);
        setDoubleElement(term404, 5, 0.4569171842750229);
        setField(term389, term389.getClass(), "lowerBound", term404);
        setDoubleElement(term411, 0, 0.8598297828918529);
        setDoubleElement(term411, 1, 0.43692187681405226);
        setField(term389, term389.getClass(), "upperBound", term411);
        setIntField(term414, term414.getClass(), "maximalCount", -1922583790);
        setIntField(term414, term414.getClass(), "count", -616727354);
        setField(term414, term414.getClass(), "maxCountCallback", term417);
        setField(term389, term389.getClass(), "evaluations", term414);
        setIntField(term418, term418.getClass(), "maximalCount", -1955890973);
        setIntField(term418, term418.getClass(), "count", -2038273078);
        setField(term418, term418.getClass(), "maxCountCallback", term421);
        setField(term389, term389.getClass(), "iterations", term418);
        setField(term389, term389.getClass(), "checker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "doOptimize", argTypes, term389, args);
            assertTrue(false);
        }
        catch (NullArgumentException e) {
        }

    }

};


