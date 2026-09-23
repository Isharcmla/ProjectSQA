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

public class BrentOptimizer_doOptimize_71048296835 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30384;

    public BrentOptimizer_doOptimize_71048296835() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term31169 = Class.forName((String) "org.apache.commons.math3.optimization.GoalType");
        Field term31168 = ((Class) term31169).getDeclaredField((String) "MAXIMIZE");
        ((Field) term31168).setAccessible(true);
        Object enum16 = ((Field) term31168).get((Object) null);
        term30384 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer"));
        Object term30608 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        setField(term30384, term30384.getClass(), "goal", enum16);
        setDoubleField(term30384, term30384.getClass(), "searchMin", -6.3208013401497272E18);
        setDoubleField(term30384, term30384.getClass(), "searchStart", 0.0);
        setDoubleField(term30384, term30384.getClass(), "searchMax", -8.0276658992426516E18);
        setField(term30384, term30384.getClass(), "checker", null);
        setIntField(term30608, term30608.getClass(), "count", 2147483646);
        setIntField(term30608, term30608.getClass(), "maximalCount", 2147483647);
        setField(term30384, term30384.getClass(), "evaluations", term30608);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "doOptimize", argTypes, term30384, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


