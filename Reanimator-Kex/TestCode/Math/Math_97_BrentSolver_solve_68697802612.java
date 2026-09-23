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
import java.lang.NullPointerException;
import static org.apache.commons.math.analysis.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BrentSolver_solve_68697802612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2435;

    public BrentSolver_solve_68697802612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2435 = newInstance(Class.forName("org.apache.commons.math.analysis.BrentSolver"));
        Object term2535 = newInstance(Class.forName("org.apache.commons.math.ode.events.EventState$1"));
        setBooleanField(term2435, term2435.getClass(), "resultComputed", false);
        setField(term2435, term2435.getClass(), "f", term2535);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.BrentSolver");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = -4.65757825616952E231;
        args[1] = -3.454681793883365E-77;
        try {
            callMethod(klass, "solve", argTypes, term2435, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


