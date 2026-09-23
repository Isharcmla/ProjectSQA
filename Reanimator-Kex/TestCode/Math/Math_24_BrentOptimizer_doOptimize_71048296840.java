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

public class BrentOptimizer_doOptimize_71048296840 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44180;

    public BrentOptimizer_doOptimize_71048296840() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term44504 = Class.forName((String) "org.apache.commons.math3.optimization.GoalType");
        Field term44503 = ((Class) term44504).getDeclaredField((String) "MAXIMIZE");
        ((Field) term44503).setAccessible(true);
        Object enum22 = ((Field) term44503).get((Object) null);
        term44180 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer"));
        Object term44404 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term44502 = newInstance(Class.forName("org.apache.commons.math3.analysis.function.Abs"));
        setField(term44180, term44180.getClass(), "goal", enum22);
        setDoubleField(term44180, term44180.getClass(), "searchMin", 5.281244621447381E18);
        setDoubleField(term44180, term44180.getClass(), "searchStart", 0.0);
        setDoubleField(term44180, term44180.getClass(), "searchMax", 1.33830796123102003E18);
        setField(term44180, term44180.getClass(), "checker", null);
        setIntField(term44404, term44404.getClass(), "count", 2147483646);
        setIntField(term44404, term44404.getClass(), "maximalCount", 2147483647);
        setField(term44180, term44180.getClass(), "evaluations", term44404);
        setField(term44180, term44180.getClass(), "function", term44502);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "doOptimize", argTypes, term44180, args);
    }

};


