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
import java.lang.Integer;

public class MultiStartUnivariateRealOptimizer_setMaxEvaluations_55079800315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71;
     Object term79;

    public MultiStartUnivariateRealOptimizer_setMaxEvaluations_55079800315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer"));
        Object[] term75 = (Object[]) newArray("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", 1);
        Object term76 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        setField(term71, term71.getClass(), "optimizer", null);
        setIntField(term71, term71.getClass(), "maxEvaluations", -883034806);
        setIntField(term71, term71.getClass(), "totalEvaluations", 1585847225);
        setIntField(term71, term71.getClass(), "starts", 597278769);
        setField(term71, term71.getClass(), "generator", null);
        setDoubleField(term76, term76.getClass(), "point", 0.2852810965221698);
        setDoubleField(term76, term76.getClass(), "value", 0.6300849762307866);
        setElement(term75, 0, term76);
        setField(term71, term71.getClass(), "optima", term75);
        term79 = new Integer(-1685132342);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term79;
        try {
            callMethod(klass, "setMaxEvaluations", argTypes, term71, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


