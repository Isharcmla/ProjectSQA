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
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class BrentOptimizer_best_3192767427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term316;
     Object term338;
     Object term341;
     Object term344;
     Object term3722;
     Object term3728;
     Object term3729;
     Object term3690;

    public BrentOptimizer_best_3192767427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3731 = Class.forName((String) "org.apache.commons.math3.optimization.GoalType");
        Field term3730 = ((Class) term3731).getDeclaredField((String) "MAXIMIZE");
        ((Field) term3730).setAccessible(true);
        Object enum4 = ((Field) term3730).get((Object) null);
        term316 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer"));
        Object term319 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term322 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor$1"));
        setDoubleField(term316, term316.getClass(), "relativeThreshold", 0.37773193782763337);
        setDoubleField(term316, term316.getClass(), "absoluteThreshold", 0.8474802076607362);
        setField(term316, term316.getClass(), "checker", null);
        setIntField(term319, term319.getClass(), "maximalCount", 1484323161);
        setIntField(term319, term319.getClass(), "count", 391863371);
        setField(term319, term319.getClass(), "maxCountCallback", term322);
        setField(term316, term316.getClass(), "evaluations", term319);
        setField(term316, term316.getClass(), "goal", enum4);
        setDoubleField(term316, term316.getClass(), "searchMin", 0.5183269973490326);
        setDoubleField(term316, term316.getClass(), "searchMax", 0.7655020693602768);
        setDoubleField(term316, term316.getClass(), "searchStart", 0.1374549299694151);
        setField(term316, term316.getClass(), "function", null);
        term338 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair"));
        setDoubleField(term338, term338.getClass(), "point", 0.7031006357544823);
        setDoubleField(term338, term338.getClass(), "value", 0.9527281779865117);
        term341 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair"));
        setDoubleField(term341, term341.getClass(), "point", 0.9828442029246764);
        setDoubleField(term341, term341.getClass(), "value", 0.2779719046761513);
        term344 = new Boolean(false);
        Class<? extends Object> term3992 = Class.forName((String) "org.apache.commons.math3.optimization.GoalType");
        Field term3991 = ((Class) term3992).getDeclaredField((String) "MAXIMIZE");
        ((Field) term3991).setAccessible(true);
        Object enum5 = ((Field) term3991).get((Object) null);
        term3722 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer"));
        Object term3723 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term3724 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor$1"));
        setDoubleField(term3722, term3722.getClass(), "relativeThreshold", 0.37773193782763337);
        setDoubleField(term3722, term3722.getClass(), "absoluteThreshold", 0.8474802076607362);
        setField(term3722, term3722.getClass(), "checker", null);
        setIntField(term3723, term3723.getClass(), "maximalCount", 1484323161);
        setIntField(term3723, term3723.getClass(), "count", 391863371);
        setField(term3723, term3723.getClass(), "maxCountCallback", term3724);
        setField(term3722, term3722.getClass(), "evaluations", term3723);
        setField(term3722, term3722.getClass(), "goal", enum5);
        setDoubleField(term3722, term3722.getClass(), "searchMin", 0.5183269973490326);
        setDoubleField(term3722, term3722.getClass(), "searchMax", 0.7655020693602768);
        setDoubleField(term3722, term3722.getClass(), "searchStart", 0.1374549299694151);
        setField(term3722, term3722.getClass(), "function", null);
        term3728 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair"));
        setDoubleField(term3728, term3728.getClass(), "point", 0.7031006357544823);
        setDoubleField(term3728, term3728.getClass(), "value", 0.9527281779865117);
        term3729 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair"));
        setDoubleField(term3729, term3729.getClass(), "point", 0.9828442029246764);
        setDoubleField(term3729, term3729.getClass(), "value", 0.2779719046761513);
        term3690 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair"));
        setDoubleField(term3690, term3690.getClass(), "point", 0.7031006357544823);
        setDoubleField(term3690, term3690.getClass(), "value", 0.9527281779865117);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair");
        argTypes[1] = Class.forName("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term338;
        args[1] = term341;
        args[2] = term344;
        Object retValue = callMethod(klass, "best", argTypes, term316, args);
        assertTrue(recursiveEquals(term316, term3722));
        assertTrue(recursiveEquals(term338, term3728));
        assertTrue(recursiveEquals(term341, term3729));
        assertTrue(recursiveEquals(term344, false));
        assertTrue(recursiveEquals(retValue, term3690));
    }

};


