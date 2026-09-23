package org.apache.commons.math.optimization.direct;

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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.math.optimization.direct.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;

public class MultiDirectional_evaluateNewSimplex_167637030825 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11563;
     Object term10757;

    public MultiDirectional_evaluateNewSimplex_167637030825() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11563 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        setField(term11563, term11563.getClass(), "simplex", null);
        term10757 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 12);
        Object term11679 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term10761 = (double[]) newDoubleArray(260);
        Object term11795 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term11023 = (double[]) newDoubleArray(24);
        setField(term11679, term11679.getClass(), "point", term10761);
        setElement(term10757, 0, term11679);
        setField(term11795, term11795.getClass(), "point", term11023);
        setElement(term10757, 1, term11795);
        setElement(term10757, 2, term11679);
        setElement(term10757, 3, term11679);
        setElement(term10757, 4, term11679);
        setElement(term10757, 5, term11679);
        setElement(term10757, 6, term11679);
        setElement(term10757, 7, term11679);
        setElement(term10757, 8, term11679);
        setElement(term10757, 9, term11679);
        setElement(term10757, 10, term11679);
        setElement(term10757, 11, term11679);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"), 0).getClass();
        argTypes[1] = double.class;
        argTypes[2] = Class.forName("java.util.Comparator");
        Object[] args = new Object[3];
        args[0] = term10757;
        args[1] = Double.NaN;
        args[2] = null;
        try {
            callMethod(klass, "evaluateNewSimplex", argTypes, term11563, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


