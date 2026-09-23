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

public class BrentOptimizer_doOptimize_71048296825 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11734;

    public BrentOptimizer_doOptimize_71048296825() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12432 = Class.forName((String) "org.apache.commons.math3.optimization.GoalType");
        Field term12431 = ((Class) term12432).getDeclaredField((String) "MAXIMIZE");
        ((Field) term12431).setAccessible(true);
        Object enum10 = ((Field) term12431).get((Object) null);
        term11734 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer"));
        setField(term11734, term11734.getClass(), "goal", enum10);
        setDoubleField(term11734, term11734.getClass(), "searchMin", 5.3412870295642573E18);
        setDoubleField(term11734, term11734.getClass(), "searchStart", 0.0);
        setDoubleField(term11734, term11734.getClass(), "searchMax", -3.8820852134491453E18);
        setField(term11734, term11734.getClass(), "checker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "doOptimize", argTypes, term11734, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


