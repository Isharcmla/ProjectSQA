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

public class BrentOptimizer_doOptimize_71048296843 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47844;

    public BrentOptimizer_doOptimize_71048296843() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term48162 = Class.forName((String) "org.apache.commons.math3.optimization.GoalType");
        Field term48161 = ((Class) term48162).getDeclaredField((String) "MAXIMIZE");
        ((Field) term48161).setAccessible(true);
        Object enum25 = ((Field) term48161).get((Object) null);
        term47844 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer"));
        Object term48068 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term48160 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor$1"));
        setField(term47844, term47844.getClass(), "goal", enum25);
        setDoubleField(term47844, term47844.getClass(), "searchMin", 2.3781821131463168E18);
        setDoubleField(term47844, term47844.getClass(), "searchStart", 0.0);
        setDoubleField(term47844, term47844.getClass(), "searchMax", -4.46067468897378E18);
        setField(term47844, term47844.getClass(), "checker", null);
        setIntField(term48068, term48068.getClass(), "count", 2147483646);
        setIntField(term48068, term48068.getClass(), "maximalCount", 2147483646);
        setField(term48068, term48068.getClass(), "maxCountCallback", term48160);
        setField(term47844, term47844.getClass(), "evaluations", term48068);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "doOptimize", argTypes, term47844, args);
    }

};


