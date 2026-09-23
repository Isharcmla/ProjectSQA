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

public class BrentOptimizer_doOptimize_71048296842 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63191;

    public BrentOptimizer_doOptimize_71048296842() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term63525 = Class.forName((String) "org.apache.commons.math3.optimization.GoalType");
        Field term63524 = ((Class) term63525).getDeclaredField((String) "MAXIMIZE");
        ((Field) term63524).setAccessible(true);
        Object enum27 = ((Field) term63524).get((Object) null);
        term63191 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer"));
        Object term63415 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term63523 = newInstance(Class.forName("org.apache.commons.math3.analysis.function.Constant"));
        setField(term63191, term63191.getClass(), "goal", enum27);
        setDoubleField(term63191, term63191.getClass(), "searchMin", 2.9167583383497344E17);
        setDoubleField(term63191, term63191.getClass(), "searchStart", 0.0);
        setDoubleField(term63191, term63191.getClass(), "searchMax", 2.9061267452993843E17);
        setField(term63191, term63191.getClass(), "checker", null);
        setIntField(term63415, term63415.getClass(), "count", 2147483646);
        setIntField(term63415, term63415.getClass(), "maximalCount", 2147483647);
        setField(term63191, term63191.getClass(), "evaluations", term63415);
        setField(term63191, term63191.getClass(), "function", term63523);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "doOptimize", argTypes, term63191, args);
    }

};


