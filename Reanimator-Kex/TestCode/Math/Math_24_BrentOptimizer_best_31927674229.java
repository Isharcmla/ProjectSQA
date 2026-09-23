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
import static org.apache.commons.math3.optimization.univariate.EqualityUtils.*;

public class BrentOptimizer_best_31927674229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14594;
     Object term14746;
     Object term14898;
     Object term15563;
     Object term15564;
     Object term15565;
     Object term15547;

    public BrentOptimizer_best_31927674229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14594 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer"));
        term14746 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair"));
        setDoubleField(term14746, term14746.getClass(), "value", -9.0431576823404872E18);
        term14898 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair"));
        setDoubleField(term14898, term14898.getClass(), "value", 4.0602799901261824E16);
        term15563 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer"));
        setDoubleField(term15563, term15563.getClass(), "relativeThreshold", 0.0);
        setDoubleField(term15563, term15563.getClass(), "absoluteThreshold", 0.0);
        setField(term15563, term15563.getClass(), "checker", null);
        setField(term15563, term15563.getClass(), "evaluations", null);
        setField(term15563, term15563.getClass(), "goal", null);
        setDoubleField(term15563, term15563.getClass(), "searchMin", 0.0);
        setDoubleField(term15563, term15563.getClass(), "searchMax", 0.0);
        setDoubleField(term15563, term15563.getClass(), "searchStart", 0.0);
        setField(term15563, term15563.getClass(), "function", null);
        term15564 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair"));
        setDoubleField(term15564, term15564.getClass(), "point", 0.0);
        setDoubleField(term15564, term15564.getClass(), "value", -9.0431576823404872E18);
        term15565 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair"));
        setDoubleField(term15565, term15565.getClass(), "point", 0.0);
        setDoubleField(term15565, term15565.getClass(), "value", 4.0602799901261824E16);
        term15547 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair"));
        setDoubleField(term15547, term15547.getClass(), "point", 0.0);
        setDoubleField(term15547, term15547.getClass(), "value", -9.0431576823404872E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair");
        argTypes[1] = Class.forName("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term14746;
        args[1] = term14898;
        args[2] = true;
        Object retValue = callMethod(klass, "best", argTypes, term14594, args);
        assertTrue(recursiveEquals(term14594, term15563));
        assertTrue(recursiveEquals(term14746, term15564));
        assertTrue(recursiveEquals(term14898, term15565));
        assertTrue(recursiveEquals(retValue, term15547));
    }

};


