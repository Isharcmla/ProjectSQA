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

public class BrentSolver_solve_68697802655 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10751;

    public BrentSolver_solve_68697802655() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10751 = newInstance(Class.forName("org.apache.commons.math.analysis.BrentSolver"));
        Object term10859 = newInstance(Class.forName("org.apache.commons.math.analysis.PolynomialFunction"));
        setBooleanField(term10751, term10751.getClass(), "resultComputed", false);
        setField(term10751, term10751.getClass(), "f", term10859);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.BrentSolver");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = -2.673279823983086E77;
        args[1] = -2.4256068848381665E-308;
        try {
            callMethod(klass, "solve", argTypes, term10751, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


