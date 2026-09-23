package org.apache.commons.math.analysis;

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
import static org.apache.commons.math.analysis.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.analysis.EqualityUtils.*;
import java.lang.Object;
import java.lang.Double;

public class BrentSolver_solve_74974203881 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30231;
     Object term31138;

    public BrentSolver_solve_74974203881() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30231 = newInstance(Class.forName("org.apache.commons.math.analysis.BrentSolver"));
        Object term30339 = newInstance(Class.forName("org.apache.commons.math.analysis.PolynomialFunction"));
        double[] term26591 = (double[]) newDoubleArray(385);
        setIntField(term30231, term30231.getClass(), "maximalIterationCount", 1);
        setDoubleField(term30231, term30231.getClass(), "functionValueAccuracy", 2.20959240435601568E17);
        setDoubleField(term30231, term30231.getClass(), "relativeAccuracy", 4.70186399727407E18);
        setDoubleField(term30231, term30231.getClass(), "absoluteAccuracy", 3.7154696925806592E16);
        setField(term30339, term30339.getClass(), "coefficients", term26591);
        setField(term30231, term30231.getClass(), "f", term30339);
        term31138 = newInstance(Class.forName("org.apache.commons.math.analysis.BrentSolver"));
        Object term31139 = newInstance(Class.forName("org.apache.commons.math.analysis.PolynomialFunction"));
        double[] term31140 = (double[]) newDoubleArray(385);
        setDoubleField(term31138, term31138.getClass(), "absoluteAccuracy", 3.7154696925806592E16);
        setDoubleField(term31138, term31138.getClass(), "relativeAccuracy", 4.70186399727407E18);
        setDoubleField(term31138, term31138.getClass(), "functionValueAccuracy", 2.20959240435601568E17);
        setIntField(term31138, term31138.getClass(), "maximalIterationCount", 1);
        setDoubleField(term31138, term31138.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term31138, term31138.getClass(), "defaultRelativeAccuracy", 0.0);
        setDoubleField(term31138, term31138.getClass(), "defaultFunctionValueAccuracy", 0.0);
        setIntField(term31138, term31138.getClass(), "defaultMaximalIterationCount", 0);
        setBooleanField(term31138, term31138.getClass(), "resultComputed", true);
        setDoubleField(term31138, term31138.getClass(), "result", -2.522757013E-315);
        setIntField(term31138, term31138.getClass(), "iterationCount", 0);
        setField(term31139, term31139.getClass(), "coefficients", term31140);
        setField(term31138, term31138.getClass(), "f", term31139);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.BrentSolver");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        argTypes[3] = double.class;
        argTypes[4] = double.class;
        argTypes[5] = double.class;
        Object[] args = new Object[6];
        args[0] = -2.225074110718022E-308;
        args[1] = 0.0;
        args[2] = -2.522757013E-315;
        args[3] = -3.356704251980698E7;
        args[4] = Double.NaN;
        args[5] = 3.178012639629941E157;
        Object retValue = callMethod(klass, "solve", argTypes, term30231, args);
        assertTrue(recursiveEquals(term30231, term31138));
        assertTrue(recursiveEquals(retValue, -2.522757013E-315));
    }

};


