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

public class BrentOptimizer_doOptimize_71048296842 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45802;

    public BrentOptimizer_doOptimize_71048296842() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term46028 = Class.forName((String) "org.apache.commons.math3.optimization.GoalType");
        Field term46027 = ((Class) term46028).getDeclaredField((String) "MAXIMIZE");
        ((Field) term46027).setAccessible(true);
        Object enum24 = ((Field) term46027).get((Object) null);
        term45802 = newInstance(Class.forName("org.apache.commons.math3.optimization.direct.PowellOptimizer$LineSearch"));
        Object term46026 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        setField(term45802, term45802.getClass(), "goal", enum24);
        setDoubleField(term45802, term45802.getClass(), "searchMin", 1.53580224410825626E18);
        setDoubleField(term45802, term45802.getClass(), "searchStart", 0.0);
        setDoubleField(term45802, term45802.getClass(), "searchMax", -6.1518423235834644E18);
        setField(term45802, term45802.getClass(), "checker", null);
        setField(term45802, term45802.getClass(), "evaluations", term46026);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "doOptimize", argTypes, term45802, args);
    }

};


