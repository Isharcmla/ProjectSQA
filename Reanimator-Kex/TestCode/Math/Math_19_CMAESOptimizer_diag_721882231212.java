package org.apache.commons.math3.optimization.direct;

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
import org.apache.commons.math3.exception.OutOfRangeException;
import static org.apache.commons.math3.optimization.direct.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CMAESOptimizer_diag_721882231212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103437;

    public CMAESOptimizer_diag_721882231212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103437 = newInstance(Class.forName("org.apache.commons.math3.linear.BlockRealMatrix"));
        setIntField(term103437, term103437.getClass(), "columns", 2);
        setIntField(term103437, term103437.getClass(), "rows", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Object[] args = new Object[1];
        args[0] = term103437;
        try {
            callMethod(klass, "diag", argTypes, null, args);
            assertTrue(false);
        }
        catch (OutOfRangeException e) {
        }

    }

};


