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

public class BracketingNthOrderBrentSolver_solve_102747071316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1117;
     Object term1141;
     Object term1143;
     Object term1145;
     Object enum15;

    public BracketingNthOrderBrentSolver_solve_102747071316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9177 = Class.forName((String) "org.apache.commons.math.analysis.solvers.AllowedSolution");
        Field term9176 = ((Class) term9177).getDeclaredField((String) "ANY_SIDE");
        ((Field) term9176).setAccessible(true);
        Object enum14 = ((Field) term9176).get((Object) null);
        term1117 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        Object term1134 = newInstance(Class.forName("org.apache.commons.math.util.Incrementor"));
        Object term1137 = newInstance(Class.forName("org.apache.commons.math.util.Incrementor$1"));
        setIntField(term1117, term1117.getClass(), "maximalOrder", 5);
        setField(term1117, term1117.getClass(), "allowed", enum14);
        setDoubleField(term1117, term1117.getClass(), "functionValueAccuracy", 1.0E-15);
        setDoubleField(term1117, term1117.getClass(), "absoluteAccuracy", 1.0E-6);
        setDoubleField(term1117, term1117.getClass(), "relativeAccuracy", 1.0E-14);
        setIntField(term1134, term1134.getClass(), "maximalCount", 0);
        setIntField(term1134, term1134.getClass(), "count", 0);
        setField(term1134, term1134.getClass(), "maxCountCallback", term1137);
        setField(term1117, term1117.getClass(), "evaluations", term1134);
        setDoubleField(term1117, term1117.getClass(), "searchMin", 0.3800088629986428);
        setDoubleField(term1117, term1117.getClass(), "searchMax", 0.5840714198152577);
        setDoubleField(term1117, term1117.getClass(), "searchStart", 0.7559240768573477);
        setField(term1117, term1117.getClass(), "function", null);
        term1141 = new Integer(-616727354);
        term1143 = new Double(0.10667076642995188);
        term1145 = new Double(0.11493000848982304);
        Class<? extends Object> term9488 = Class.forName((String) "org.apache.commons.math.analysis.solvers.AllowedSolution");
        Field term9487 = ((Class) term9488).getDeclaredField((String) "RIGHT_SIDE");
        ((Field) term9487).setAccessible(true);
        enum15 = ((Field) term9487).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("org.apache.commons.math.analysis.UnivariateFunction");
        argTypes[2] = double.class;
        argTypes[3] = double.class;
        argTypes[4] = Class.forName("org.apache.commons.math.analysis.solvers.AllowedSolution");
        Object[] args = new Object[5];
        args[0] = term1141;
        args[1] = null;
        args[2] = term1143;
        args[3] = term1145;
        args[4] = enum15;
        try {
            callMethod(klass, "solve", argTypes, term1117, args);
            assertTrue(false);
        }
        catch (NullArgumentException e) {
        }

    }

};


