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
import java.lang.NullPointerException;
import static org.apache.commons.math3.optimization.univariate.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class BrentOptimizer_doOptimize_71048296827 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19076;

    public BrentOptimizer_doOptimize_71048296827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term19765 = Class.forName((String) "org.apache.commons.math3.optimization.GoalType");
        Field term19764 = ((Class) term19765).getDeclaredField((String) "MINIMIZE");
        ((Field) term19764).setAccessible(true);
        Object enum10 = ((Field) term19764).get((Object) null);
        term19076 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer"));
        setField(term19076, term19076.getClass(), "goal", enum10);
        setDoubleField(term19076, term19076.getClass(), "searchMin", -4.2502630944892145E18);
        setDoubleField(term19076, term19076.getClass(), "searchStart", 0.0);
        setDoubleField(term19076, term19076.getClass(), "searchMax", -6.840677373839273E18);
        setField(term19076, term19076.getClass(), "checker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "doOptimize", argTypes, term19076, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


