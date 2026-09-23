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
import static org.apache.commons.math.optimization.univariate.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class BrentOptimizer_optimize_16474075832 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27450;

    public BrentOptimizer_optimize_16474075832() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term27586 = Class.forName((String) "org.apache.commons.math.optimization.GoalType");
        Field term27585 = ((Class) term27586).getDeclaredField((String) "MAXIMIZE");
        ((Field) term27585).setAccessible(true);
        Object enum40 = ((Field) term27585).get((Object) null);
        term27450 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setBooleanField(term27450, term27450.getClass(), "resultComputed", false);
        setField(term27450, term27450.getClass(), "goal", enum40);
        setDoubleField(term27450, term27450.getClass(), "relativeAccuracy", 7.2057602627862528E16);
        setDoubleField(term27450, term27450.getClass(), "absoluteAccuracy", 4.503599627370497E15);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        argTypes[1] = Class.forName("org.apache.commons.math.optimization.GoalType");
        argTypes[2] = double.class;
        argTypes[3] = double.class;
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = -1.1179643196537585E-274;
        args[3] = -1.1179643196537585E-274;
        callMethod(klass, "optimize", argTypes, term27450, args);
    }

};


