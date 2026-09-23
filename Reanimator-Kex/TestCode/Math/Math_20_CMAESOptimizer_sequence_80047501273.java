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
import org.apache.commons.math3.exception.NoDataException;
import static org.apache.commons.math3.optimization.direct.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Double;

public class CMAESOptimizer_sequence_80047501273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16359;
     Object term16361;
     Object term16363;

    public CMAESOptimizer_sequence_80047501273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16359 = new Double(0.7572808992551947);
        term16361 = new Double(0.34277768712445844);
        term16363 = new Double(0.9807605245238011);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term16359;
        args[1] = term16361;
        args[2] = term16363;
        try {
            callMethod(klass, "sequence", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoDataException e) {
        }

    }

};


