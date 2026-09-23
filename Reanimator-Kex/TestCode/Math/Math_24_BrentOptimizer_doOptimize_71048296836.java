package org.apache.commons.math3.optimization.univariate;

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
import static org.apache.commons.math3.optimization.univariate.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class BrentOptimizer_doOptimize_71048296836 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33155;

    public BrentOptimizer_doOptimize_71048296836() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term33487 = Class.forName((String) "org.apache.commons.math3.optimization.GoalType");
        Field term33486 = ((Class) term33487).getDeclaredField((String) "MAXIMIZE");
        ((Field) term33486).setAccessible(true);
        Object enum18 = ((Field) term33486).get((Object) null);
        term33155 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer"));
        Object term33379 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term33485 = newInstance(Class.forName("org.apache.commons.math3.analysis.function.Sigmoid"));
        setField(term33155, term33155.getClass(), "goal", enum18);
        setDoubleField(term33155, term33155.getClass(), "searchMin", 2.9167583383497344E17);
        setDoubleField(term33155, term33155.getClass(), "searchStart", 0.0);
        setDoubleField(term33155, term33155.getClass(), "searchMax", 2.9061267452993843E17);
        setField(term33155, term33155.getClass(), "checker", null);
        setIntField(term33379, term33379.getClass(), "count", 2147483646);
        setIntField(term33379, term33379.getClass(), "maximalCount", 2147483647);
        setField(term33155, term33155.getClass(), "evaluations", term33379);
        setField(term33155, term33155.getClass(), "function", term33485);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "doOptimize", argTypes, term33155, args);
    }

};


