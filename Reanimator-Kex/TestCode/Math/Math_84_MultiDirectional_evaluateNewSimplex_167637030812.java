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
import static org.apache.commons.math.optimization.direct.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;

public class MultiDirectional_evaluateNewSimplex_167637030812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3757;
     Object term3539;

    public MultiDirectional_evaluateNewSimplex_167637030812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3757 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        setField(term3757, term3757.getClass(), "simplex", null);
        term3539 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 2);
        Object term3873 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term3543 = (double[]) newDoubleArray(3);
        Object term3989 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        setField(term3873, term3873.getClass(), "point", term3543);
        setElement(term3539, 0, term3873);
        setField(term3989, term3989.getClass(), "point", term3543);
        setElement(term3539, 1, term3989);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"), 0).getClass();
        argTypes[1] = double.class;
        argTypes[2] = Class.forName("java.util.Comparator");
        Object[] args = new Object[3];
        args[0] = term3539;
        args[1] = Double.NaN;
        args[2] = null;
        callMethod(klass, "evaluateNewSimplex", argTypes, term3757, args);
    }

};


