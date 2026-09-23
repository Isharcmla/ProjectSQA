package org.apache.commons.math3.optim.nonlinear.vector;

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
import static org.apache.commons.math3.optim.nonlinear.vector.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.optim.nonlinear.vector.EqualityUtils.*;
import java.lang.Object;

public class Weight_init_111688338411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3254;
     Object term3489;
     Object term3494;

    public Weight_init_111688338411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term3413 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.vector.Weight"));
        setField(term3413, term3413.getClass(), "weightMatrix", null);
        term3254 = (double[]) newDoubleArray(2);
        term3489 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.vector.Weight"));
        Object term3490 = newInstance(Class.forName("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        Object[] term3491 = (Object[]) newArray("[D", 2);
        double[] term3492 = (double[]) newDoubleArray(2);
        double[] term3493 = (double[]) newDoubleArray(2);
        setElement(term3491, 0, term3492);
        setElement(term3491, 1, term3493);
        setField(term3490, term3490.getClass(), "data", term3491);
        setField(term3489, term3489.getClass(), "weightMatrix", term3490);
        term3494 = (double[]) newDoubleArray(2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.Weight");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term3254;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term3489));
        assertTrue(recursiveEquals(term3254, term3494));
    }

};


