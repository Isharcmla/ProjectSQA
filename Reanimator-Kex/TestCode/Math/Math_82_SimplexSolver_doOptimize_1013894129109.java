package org.apache.commons.math.optimization.linear;

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
import static org.apache.commons.math.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class SimplexSolver_doOptimize_1013894129109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53509;

    public SimplexSolver_doOptimize_1013894129109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term53887 = Class.forName((String) "org.apache.commons.math.optimization.GoalType");
        Field term53886 = ((Class) term53887).getDeclaredField((String) "MAXIMIZE");
        ((Field) term53886).setAccessible(true);
        Object enum56 = ((Field) term53886).get((Object) null);
        term53509 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        Object term53649 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        Object term53751 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(term53649, term53649.getClass(), "coefficients", term53751);
        setField(term53509, term53509.getClass(), "f", term53649);
        setField(term53509, term53509.getClass(), "constraints", null);
        setField(term53509, term53509.getClass(), "goalType", enum56);
        setBooleanField(term53509, term53509.getClass(), "restrictToNonNegative", false);
        setDoubleField(term53509, term53509.getClass(), "epsilon", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "doOptimize", argTypes, term53509, args);
    }

};


