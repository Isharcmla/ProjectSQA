package org.apache.commons.math.optimization.univariate;

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
import static org.apache.commons.math.optimization.univariate.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class BrentOptimizer_optimize_16474075862 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49504;

    public BrentOptimizer_optimize_16474075862() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term49640 = Class.forName((String) "org.apache.commons.math.optimization.GoalType");
        Field term49639 = ((Class) term49640).getDeclaredField((String) "MINIMIZE");
        ((Field) term49639).setAccessible(true);
        Object enum72 = ((Field) term49639).get((Object) null);
        term49504 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setBooleanField(term49504, term49504.getClass(), "resultComputed", false);
        setField(term49504, term49504.getClass(), "goal", enum72);
        setDoubleField(term49504, term49504.getClass(), "relativeAccuracy", 1.8014398509744128E16);
        setDoubleField(term49504, term49504.getClass(), "absoluteAccuracy", 4.503599627370497E15);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        argTypes[1] = Class.forName("org.apache.commons.math.optimization.GoalType");
        argTypes[2] = double.class;
        argTypes[3] = double.class;
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = -3.4561130496E10;
        args[3] = 1.538021359742113E-297;
        callMethod(klass, "optimize", argTypes, term49504, args);
    }

};


