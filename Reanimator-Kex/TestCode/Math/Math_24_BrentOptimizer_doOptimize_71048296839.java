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

public class BrentOptimizer_doOptimize_71048296839 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33961;

    public BrentOptimizer_doOptimize_71048296839() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term40853 = Class.forName((String) "org.apache.commons.math3.optimization.GoalType");
        Field term40852 = ((Class) term40853).getDeclaredField((String) "MAXIMIZE");
        ((Field) term40852).setAccessible(true);
        Object enum20 = ((Field) term40852).get((Object) null);
        term33961 = newInstance(Class.forName("org.apache.commons.math3.optimization.direct.PowellOptimizer$LineSearch"));
        setField(term33961, term33961.getClass(), "goal", enum20);
        setDoubleField(term33961, term33961.getClass(), "searchMin", -1.15287240166761715E18);
        setDoubleField(term33961, term33961.getClass(), "searchStart", 0.0);
        setDoubleField(term33961, term33961.getClass(), "searchMax", 5.7691258472449997E18);
        setField(term33961, term33961.getClass(), "checker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "doOptimize", argTypes, term33961, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


