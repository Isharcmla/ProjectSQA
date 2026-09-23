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
import java.lang.String;
import java.lang.Object;

public class BrentOptimizer_doOptimize_71048296845 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84150;

    public BrentOptimizer_doOptimize_71048296845() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term84468 = Class.forName((String) "org.apache.commons.math3.optimization.GoalType");
        Field term84467 = ((Class) term84468).getDeclaredField((String) "MAXIMIZE");
        ((Field) term84467).setAccessible(true);
        Object enum30 = ((Field) term84467).get((Object) null);
        term84150 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer"));
        Object term84374 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term84466 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor$1"));
        setField(term84150, term84150.getClass(), "goal", enum30);
        setDoubleField(term84150, term84150.getClass(), "searchMin", 2.3781821131463168E18);
        setDoubleField(term84150, term84150.getClass(), "searchStart", 0.0);
        setDoubleField(term84150, term84150.getClass(), "searchMax", -4.46067468897378E18);
        setField(term84150, term84150.getClass(), "checker", null);
        setIntField(term84374, term84374.getClass(), "count", 2147483646);
        setIntField(term84374, term84374.getClass(), "maximalCount", 2147483646);
        setField(term84374, term84374.getClass(), "maxCountCallback", term84466);
        setField(term84150, term84150.getClass(), "evaluations", term84374);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "doOptimize", argTypes, term84150, args);
    }

};


