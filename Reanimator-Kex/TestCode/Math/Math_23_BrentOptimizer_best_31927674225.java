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

public class BrentOptimizer_best_31927674225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13206;
     Object term13358;
     Object term13510;
     Object term13531;
     Object term13532;
     Object term13533;
     Object term13519;

    public BrentOptimizer_best_31927674225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13206 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer"));
        term13358 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair"));
        setDoubleField(term13358, term13358.getClass(), "value", 4.948120815076606E18);
        term13510 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair"));
        setDoubleField(term13510, term13510.getClass(), "value", 4.4902478733348045E17);
        term13531 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer"));
        setDoubleField(term13531, term13531.getClass(), "relativeThreshold", 0.0);
        setDoubleField(term13531, term13531.getClass(), "absoluteThreshold", 0.0);
        setField(term13531, term13531.getClass(), "checker", null);
        setField(term13531, term13531.getClass(), "evaluations", null);
        setField(term13531, term13531.getClass(), "goal", null);
        setDoubleField(term13531, term13531.getClass(), "searchMin", 0.0);
        setDoubleField(term13531, term13531.getClass(), "searchMax", 0.0);
        setDoubleField(term13531, term13531.getClass(), "searchStart", 0.0);
        setField(term13531, term13531.getClass(), "function", null);
        term13532 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair"));
        setDoubleField(term13532, term13532.getClass(), "point", 0.0);
        setDoubleField(term13532, term13532.getClass(), "value", 4.948120815076606E18);
        term13533 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair"));
        setDoubleField(term13533, term13533.getClass(), "point", 0.0);
        setDoubleField(term13533, term13533.getClass(), "value", 4.4902478733348045E17);
        term13519 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair"));
        setDoubleField(term13519, term13519.getClass(), "point", 0.0);
        setDoubleField(term13519, term13519.getClass(), "value", 4.4902478733348045E17);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair");
        argTypes[1] = Class.forName("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term13358;
        args[1] = term13510;
        args[2] = true;
        Object retValue = callMethod(klass, "best", argTypes, term13206, args);
        assertTrue(recursiveEquals(term13206, term13531));
        assertTrue(recursiveEquals(term13358, term13532));
        assertTrue(recursiveEquals(term13510, term13533));
        assertTrue(recursiveEquals(retValue, term13519));
    }

};


