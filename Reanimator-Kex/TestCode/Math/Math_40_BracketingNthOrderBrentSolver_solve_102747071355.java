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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.math.analysis.solvers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;
import java.lang.String;

public class BracketingNthOrderBrentSolver_solve_102747071355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49192;
     Object term49380;
     Object enum23;

    public BracketingNthOrderBrentSolver_solve_102747071355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49192 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        Object term49278 = newInstance(Class.forName("org.apache.commons.math.util.Incrementor"));
        setField(term49192, term49192.getClass(), "allowed", null);
        setDoubleField(term49192, term49192.getClass(), "searchMin", 0.0);
        setDoubleField(term49192, term49192.getClass(), "searchMax", 0.0);
        setDoubleField(term49192, term49192.getClass(), "searchStart", 0.0);
        setField(term49192, term49192.getClass(), "function", null);
        setField(term49192, term49192.getClass(), "evaluations", term49278);
        term49380 = newInstance(Class.forName("org.apache.commons.math.analysis.FunctionUtils$2"));
        Class<? extends Object> term50188 = Class.forName((String) "org.apache.commons.math.analysis.solvers.AllowedSolution");
        Field term50187 = ((Class) term50188).getDeclaredField((String) "ABOVE_SIDE");
        ((Field) term50187).setAccessible(true);
        enum23 = ((Field) term50187).get((Object) null);
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
        args[0] = 0;
        args[1] = term49380;
        args[2] = Double.NaN;
        args[3] = Double.NaN;
        args[4] = enum23;
        try {
            callMethod(klass, "solve", argTypes, term49192, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


