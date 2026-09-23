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
import static org.apache.commons.math.analysis.solvers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.analysis.solvers.EqualityUtils.*;

public class UnivariateRealSolverUtils_setup_3913928517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5819;
     Object term7350;

    public UnivariateRealSolverUtils_setup_3913928517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5819 = newInstance(Class.forName("org.apache.commons.math.ode.events.EventState$1"));
        term7350 = newInstance(Class.forName("org.apache.commons.math.ode.events.EventState$1"));
        setField(term7350, term7350.getClass(), "val$interpolator", null);
        setField(term7350, term7350.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        Object[] args = new Object[1];
        args[0] = term5819;
        callMethod(klass, "setup", argTypes, null, args);
        assertTrue(recursiveEquals(term5819, term7350));
    }

};


