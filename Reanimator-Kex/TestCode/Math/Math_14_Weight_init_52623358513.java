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
import org.apache.commons.math3.linear.NonSquareMatrixException;
import static org.apache.commons.math3.optim.nonlinear.vector.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Weight_init_52623358513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3743;

    public Weight_init_52623358513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term3633 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.vector.Weight"));
        term3743 = newInstance(Class.forName("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        Object[] term3505 = (Object[]) newArray("[D", 105);
        setField(term3743, term3743.getClass(), "data", term3505);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.Weight");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Object[] args = new Object[1];
        args[0] = term3743;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NonSquareMatrixException e) {
        }

    }

};


