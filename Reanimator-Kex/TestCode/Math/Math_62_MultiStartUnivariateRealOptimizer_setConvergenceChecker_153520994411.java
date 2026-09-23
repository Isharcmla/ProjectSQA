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
import java.lang.NullPointerException;
import static org.apache.commons.math.optimization.univariate.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MultiStartUnivariateRealOptimizer_setConvergenceChecker_153520994411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3;

    public MultiStartUnivariateRealOptimizer_setConvergenceChecker_153520994411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer"));
        Object[] term7 = (Object[]) newArray("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", 5);
        Object term8 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        Object term11 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        Object term14 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        Object term17 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        Object term20 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        setField(term3, term3.getClass(), "optimizer", null);
        setIntField(term3, term3.getClass(), "maxEvaluations", 1162663216);
        setIntField(term3, term3.getClass(), "totalEvaluations", 1484323161);
        setIntField(term3, term3.getClass(), "starts", 391863371);
        setField(term3, term3.getClass(), "generator", null);
        setDoubleField(term8, term8.getClass(), "point", 0.13238746331190498);
        setDoubleField(term8, term8.getClass(), "value", 0.3455959125047594);
        setElement(term7, 0, term8);
        setDoubleField(term11, term11.getClass(), "point", 0.5523635872663106);
        setDoubleField(term11, term11.getClass(), "value", 0.544608645520025);
        setElement(term7, 1, term11);
        setDoubleField(term14, term14.getClass(), "point", 0.28570734989730284);
        setDoubleField(term14, term14.getClass(), "value", 0.40176586625454525);
        setElement(term7, 2, term14);
        setDoubleField(term17, term17.getClass(), "point", 0.2641345529914265);
        setDoubleField(term17, term17.getClass(), "value", 0.36923381893433327);
        setElement(term7, 3, term17);
        setDoubleField(term20, term20.getClass(), "point", 0.6076495596892013);
        setDoubleField(term20, term20.getClass(), "value", 0.37773193782763337);
        setElement(term7, 4, term20);
        setField(term3, term3.getClass(), "optima", term7);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.ConvergenceChecker");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "setConvergenceChecker", argTypes, term3, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


