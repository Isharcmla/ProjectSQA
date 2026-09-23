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

public class BrentOptimizer_doOptimize_71048296841 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44990;

    public BrentOptimizer_doOptimize_71048296841() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term45322 = Class.forName((String) "org.apache.commons.math3.optimization.GoalType");
        Field term45321 = ((Class) term45322).getDeclaredField((String) "MAXIMIZE");
        ((Field) term45321).setAccessible(true);
        Object enum23 = ((Field) term45321).get((Object) null);
        term44990 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer"));
        Object term45214 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term45320 = newInstance(Class.forName("org.apache.commons.math3.analysis.function.Sigmoid"));
        setField(term44990, term44990.getClass(), "goal", enum23);
        setDoubleField(term44990, term44990.getClass(), "searchMin", 1.857890679937952E16);
        setDoubleField(term44990, term44990.getClass(), "searchStart", 1.0);
        setDoubleField(term44990, term44990.getClass(), "searchMax", -6.9124592935764101E18);
        setField(term44990, term44990.getClass(), "checker", null);
        setIntField(term45214, term45214.getClass(), "count", 2147483646);
        setIntField(term45214, term45214.getClass(), "maximalCount", 2147483647);
        setField(term44990, term44990.getClass(), "evaluations", term45214);
        setDoubleField(term45320, term45320.getClass(), "lo", 0.0);
        setDoubleField(term45320, term45320.getClass(), "hi", 0.0);
        setField(term44990, term44990.getClass(), "function", term45320);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "doOptimize", argTypes, term44990, args);
    }

};


