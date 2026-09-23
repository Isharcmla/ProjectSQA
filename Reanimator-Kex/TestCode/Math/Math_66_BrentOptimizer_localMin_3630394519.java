package org.apache.commons.math.optimization.univariate;

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
import static org.apache.commons.math.optimization.univariate.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Double;

public class BrentOptimizer_localMin_3630394519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1155;
     Object term1183;
     Object enum11;
     Object term1185;
     Object term1187;
     Object term1189;
     Object term1191;
     Object term1193;

    public BrentOptimizer_localMin_3630394519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4483 = Class.forName((String) "org.apache.commons.math.optimization.GoalType");
        Field term4482 = ((Class) term4483).getDeclaredField((String) "MINIMIZE");
        ((Field) term4482).setAccessible(true);
        enum11 = ((Field) term4482).get((Object) null);
        term1155 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setBooleanField(term1155, term1155.getClass(), "resultComputed", false);
        setDoubleField(term1155, term1155.getClass(), "result", 0.5840714198152577);
        setDoubleField(term1155, term1155.getClass(), "functionValue", 0.7559240768573477);
        setIntField(term1155, term1155.getClass(), "maxEvaluations", 2147483647);
        setIntField(term1155, term1155.getClass(), "evaluations", -1339778481);
        setField(term1155, term1155.getClass(), "goal", enum11);
        setDoubleField(term1155, term1155.getClass(), "min", 0.10667076642995188);
        setDoubleField(term1155, term1155.getClass(), "max", 0.11493000848982304);
        setDoubleField(term1155, term1155.getClass(), "startValue", 0.37161417339133307);
        setField(term1155, term1155.getClass(), "function", null);
        setDoubleField(term1155, term1155.getClass(), "absoluteAccuracy", 1.0E-10);
        setDoubleField(term1155, term1155.getClass(), "relativeAccuracy", 1.0E-14);
        setIntField(term1155, term1155.getClass(), "maximalIterationCount", 100);
        setDoubleField(term1155, term1155.getClass(), "defaultAbsoluteAccuracy", 0.6805867182029153);
        setDoubleField(term1155, term1155.getClass(), "defaultRelativeAccuracy", 0.2852810965221698);
        setIntField(term1155, term1155.getClass(), "defaultMaximalIterationCount", 1725571209);
        setIntField(term1155, term1155.getClass(), "iterationCount", -522618178);
        term1183 = new Boolean(true);
        term1185 = new Double(0.6300849762307866);
        term1187 = new Double(0.9737083944266686);
        term1189 = new Double(0.0668892744806211);
        term1191 = new Double(0.3587267442738795);
        term1193 = new Double(0.07802449704920456);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = boolean.class;
        argTypes[1] = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        argTypes[2] = Class.forName("org.apache.commons.math.optimization.GoalType");
        argTypes[3] = double.class;
        argTypes[4] = double.class;
        argTypes[5] = double.class;
        argTypes[6] = double.class;
        argTypes[7] = double.class;
        Object[] args = new Object[8];
        args[0] = term1183;
        args[1] = null;
        args[2] = enum11;
        args[3] = term1185;
        args[4] = term1187;
        args[5] = term1189;
        args[6] = term1191;
        args[7] = term1193;
        try {
            callMethod(klass, "localMin", argTypes, term1155, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


