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
import java.lang.Double;

public class BrentOptimizer_optimize_16474075854 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43001;

    public BrentOptimizer_optimize_16474075854() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term43137 = Class.forName((String) "org.apache.commons.math.optimization.GoalType");
        Field term43136 = ((Class) term43137).getDeclaredField((String) "MINIMIZE");
        ((Field) term43136).setAccessible(true);
        Object enum64 = ((Field) term43136).get((Object) null);
        term43001 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setBooleanField(term43001, term43001.getClass(), "resultComputed", false);
        setField(term43001, term43001.getClass(), "goal", enum64);
        setDoubleField(term43001, term43001.getClass(), "relativeAccuracy", 4.503599627370497E15);
        setDoubleField(term43001, term43001.getClass(), "absoluteAccuracy", 4.5079976738816E15);
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
        args[2] = Double.NaN;
        args[3] = Double.NaN;
        callMethod(klass, "optimize", argTypes, term43001, args);
    }

};


