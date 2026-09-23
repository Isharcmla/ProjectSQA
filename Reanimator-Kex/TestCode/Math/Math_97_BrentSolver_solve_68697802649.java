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
import java.lang.IllegalArgumentException;
import static org.apache.commons.math.analysis.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class BrentSolver_solve_68697802649 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9557;

    public BrentSolver_solve_68697802649() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9557 = newInstance(Class.forName("org.apache.commons.math.analysis.BrentSolver"));
        setBooleanField(term9557, term9557.getClass(), "resultComputed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.BrentSolver");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = 1.0072180669138739E205;
        args[1] = 1.007210412408701E205;
        try {
            callMethod(klass, "solve", argTypes, term9557, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


