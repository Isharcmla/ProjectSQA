package org.apache.commons.math.analysis.solvers;

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
import org.apache.commons.math.exception.NullArgumentException;
import static org.apache.commons.math.analysis.solvers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Double;

public class BracketingNthOrderBrentSolver_solve_185105626217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1789;
     Object term1813;
     Object term1815;
     Object term1817;
     Object term1819;
     Object enum17;

    public BracketingNthOrderBrentSolver_solve_185105626217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10614 = Class.forName((String) "org.apache.commons.math.analysis.solvers.AllowedSolution");
        Field term10613 = ((Class) term10614).getDeclaredField((String) "ANY_SIDE");
        ((Field) term10613).setAccessible(true);
        Object enum16 = ((Field) term10613).get((Object) null);
        term1789 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        Object term1806 = newInstance(Class.forName("org.apache.commons.math.util.Incrementor"));
        Object term1809 = newInstance(Class.forName("org.apache.commons.math.util.Incrementor$1"));
        setIntField(term1789, term1789.getClass(), "maximalOrder", 5);
        setField(term1789, term1789.getClass(), "allowed", enum16);
        setDoubleField(term1789, term1789.getClass(), "functionValueAccuracy", 1.0E-15);
        setDoubleField(term1789, term1789.getClass(), "absoluteAccuracy", 1.0E-6);
        setDoubleField(term1789, term1789.getClass(), "relativeAccuracy", 1.0E-14);
        setIntField(term1806, term1806.getClass(), "maximalCount", 0);
        setIntField(term1806, term1806.getClass(), "count", 0);
        setField(term1806, term1806.getClass(), "maxCountCallback", term1809);
        setField(term1789, term1789.getClass(), "evaluations", term1806);
        setDoubleField(term1789, term1789.getClass(), "searchMin", 0.37161417339133307);
        setDoubleField(term1789, term1789.getClass(), "searchMax", 0.6805867182029153);
        setDoubleField(term1789, term1789.getClass(), "searchStart", 0.2852810965221698);
        setField(term1789, term1789.getClass(), "function", null);
        term1813 = new Integer(-1955890973);
        term1815 = new Double(0.6300849762307866);
        term1817 = new Double(0.9737083944266686);
        term1819 = new Double(0.0668892744806211);
        Class<? extends Object> term10925 = Class.forName((String) "org.apache.commons.math.analysis.solvers.AllowedSolution");
        Field term10924 = ((Class) term10925).getDeclaredField((String) "BELOW_SIDE");
        ((Field) term10924).setAccessible(true);
        enum17 = ((Field) term10924).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("org.apache.commons.math.analysis.UnivariateFunction");
        argTypes[2] = double.class;
        argTypes[3] = double.class;
        argTypes[4] = double.class;
        argTypes[5] = Class.forName("org.apache.commons.math.analysis.solvers.AllowedSolution");
        Object[] args = new Object[6];
        args[0] = term1813;
        args[1] = null;
        args[2] = term1815;
        args[3] = term1817;
        args[4] = term1819;
        args[5] = enum17;
        try {
            callMethod(klass, "solve", argTypes, term1789, args);
            assertTrue(false);
        }
        catch (NullArgumentException e) {
        }

    }

};


