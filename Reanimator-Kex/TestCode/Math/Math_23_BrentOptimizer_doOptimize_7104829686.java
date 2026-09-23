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
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import static org.apache.commons.math3.optimization.univariate.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class BrentOptimizer_doOptimize_7104829686 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9;

    public BrentOptimizer_doOptimize_7104829686() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3165 = Class.forName((String) "org.apache.commons.math3.optimization.GoalType");
        Field term3164 = ((Class) term3165).getDeclaredField((String) "MAXIMIZE");
        ((Field) term3164).setAccessible(true);
        Object enum2 = ((Field) term3164).get((Object) null);
        term9 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer"));
        Object term12 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term15 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor$1"));
        setDoubleField(term9, term9.getClass(), "relativeThreshold", 0.28570734989730284);
        setDoubleField(term9, term9.getClass(), "absoluteThreshold", 0.40176586625454525);
        setField(term9, term9.getClass(), "checker", null);
        setIntField(term12, term12.getClass(), "maximalCount", 568599855);
        setIntField(term12, term12.getClass(), "count", 1162663216);
        setField(term12, term12.getClass(), "maxCountCallback", term15);
        setField(term9, term9.getClass(), "evaluations", term12);
        setField(term9, term9.getClass(), "goal", enum2);
        setDoubleField(term9, term9.getClass(), "searchMin", 0.2641345529914265);
        setDoubleField(term9, term9.getClass(), "searchMax", 0.36923381893433327);
        setDoubleField(term9, term9.getClass(), "searchStart", 0.6076495596892013);
        setField(term9, term9.getClass(), "function", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "doOptimize", argTypes, term9, args);
            assertTrue(false);
        }
        catch (TooManyEvaluationsException e) {
        }

    }

};


