package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

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
import static org.apache.commons.math3.optim.nonlinear.scalar.noderiv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class SimplexOptimizer_parseOptimizationData_93696086593 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48931;
     Object term48647;

    public SimplexOptimizer_parseOptimizationData_93696086593() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48931 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        setField(term48931, term48931.getClass(), "start", null);
        setField(term48931, term48931.getClass(), "function", null);
        Class<? extends Object> term49894 = Class.forName((String) "org.apache.commons.math3.optim.nonlinear.scalar.GoalType");
        Field term49893 = ((Class) term49894).getDeclaredField((String) "MAXIMIZE");
        ((Field) term49893).setAccessible(true);
        Object enum26 = ((Field) term49893).get((Object) null);
        term48647 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 6);
        Object term49067 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction"));
        Object term49159 = newInstance(Class.forName("org.apache.commons.math3.optim.SimpleBounds"));
        setField(term49067, term49067.getClass(), "function", null);
        setElement(term48647, 0, term49067);
        setElement(term48647, 1, term49159);
        setElement(term48647, 2, enum26);
        setElement(term48647, 3, term49159);
        setElement(term48647, 4, term49159);
        setElement(term48647, 5, term49159);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.math3.optim.OptimizationData"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term48647;
        try {
            callMethod(klass, "parseOptimizationData", argTypes, term48931, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


