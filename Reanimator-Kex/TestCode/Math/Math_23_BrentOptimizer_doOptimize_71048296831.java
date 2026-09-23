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

public class BrentOptimizer_doOptimize_71048296831 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33968;

    public BrentOptimizer_doOptimize_71048296831() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term34657 = Class.forName((String) "org.apache.commons.math3.optimization.GoalType");
        Field term34656 = ((Class) term34657).getDeclaredField((String) "MAXIMIZE");
        ((Field) term34656).setAccessible(true);
        Object enum13 = ((Field) term34656).get((Object) null);
        term33968 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer"));
        setField(term33968, term33968.getClass(), "goal", enum13);
        setDoubleField(term33968, term33968.getClass(), "searchMin", 5.3412870295642573E18);
        setDoubleField(term33968, term33968.getClass(), "searchStart", 0.0);
        setDoubleField(term33968, term33968.getClass(), "searchMax", -3.8820852134491453E18);
        setField(term33968, term33968.getClass(), "checker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "doOptimize", argTypes, term33968, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


